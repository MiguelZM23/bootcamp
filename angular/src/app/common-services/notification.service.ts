import { Injectable } from '@angular/core';
import { LoggerService } from 'src/lib/my-core';
import { Subject } from 'rxjs';


export enum NotificationType { error, warn, info, log }

export class Notification {
  constructor(private id: number, private message: string,
    private type: NotificationType) { }
  public get Id() { return this.id; }
  public get Message() { return this.message; }
  public get Type() { return this.type; }
}

@Injectable({
  providedIn: 'root'
})
export class NotificationService {
  constructor(private out: LoggerService) { }

  private notificacion$ = new Subject<Notification>();

  public readonly NotificationType = NotificationType;
  private listado: Array<Notification> = [];

  public get Listado() { return Object.assign([], this.listado); }
  public get HayNotificaciones() { return this.listado.length > 0; }
  public get Notificacion() { return this.notificacion$; }


  public add(msg: string, type: NotificationType = NotificationType.error) {
    let ide = 0;
    const m = new Notification(ide, msg, type);
    this.listado.push(m);
    this.notificacion$.next(m);


    if (!msg || msg === '') {
      this.out.error('Falta el mensaje de notificación.');
      return;
    }
    const id = this.HayNotificaciones ?
      (this.listado[this.listado.length - 1].Id + 1) : 1;
    const n = new Notification(id, msg, type);
    this.listado.push(n);
    // Redundancia: Los errores también se muestran en consola
    if (type === NotificationType.error) {
      this.out.error(`NOTIFICATION: ${msg}`);
    }
  }

  public remove(index: number) {
    if (index < 0 || index >= this.listado.length) {
      this.out.error('Index out of range.');
      return;
    }
    this.listado.splice(index, 1);
  }

  public clear() {
    if (this.HayNotificaciones) {
      this.listado.splice(0);
    }
  }


}
