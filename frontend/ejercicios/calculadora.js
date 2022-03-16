class Calculadora{
    
    constructor(id, nombre){
        this.id = id;
        this.nombre = nombre;
    }
    inicializar(){
        run();
        
    }
    run(){
        let operacion = prompt("introduce operación");
        let primerNumero = prompt("Introduce primer número:");
        let segundoNumero = prompt("Introduce segundo número:");
        if(operacion === '+') console.log(this.sumar(primerNumero, segundoNumero));
        if(operacion === '-') console.log(this.restar(primerNumero, segundoNumero));;
        if(operacion === '*') console.log(this.multiplicar(primerNumero, segundoNumero));
        if(operacion === '/') console.log(this.dividir(primerNumero, segundoNumero));
        if(operacion === '%') console.log(this.resto(primerNumero, segundoNumero));
    }
    
    sumar(a,b){
        a = parseFloat(a);
        b = parseFloat(b);
        return a+b;
    }
    
    restar(a, b){
        a = parseFloat(a);
        b = parseFloat(b);
        return a-b;
    }
    
    multiplicar(a,b){
        a = parseFloat(a);
        b = parseFloat(b);
        return a*b;
    }
    
    dividir(a,b){
        a = parseFloat(a);
        b = parseFloat(b);
        return a/b;
    }
    
    resto(a,b){
        a = parseFloat(a);
        b = parseFloat(b);
        return a%b;
    }
    
    getNombre(){
        return "Mi nombre es " + this.nombre;
    }
    operacion(a,b){

    }

}



