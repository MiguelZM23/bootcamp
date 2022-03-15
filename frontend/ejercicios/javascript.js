console.log("*****Practicando JavaScript*****");

function numAleatorio (a,b) {
    let c = Math.random(a,b);
    return a+b;
}
function ejercicio0(max, min) {
//let min = parseFloat(prompt("Introduce el intervalo inferior"));
//let max = parseFloat(prompt("Introduce el intervalo superior"));

let numAleatorio =(Math.floor(Math.random()*(max-min))+min);

return numAleatorio;

//alert(`El nº aleatorio es $(x)`);

}

function juegoAcertarNumero(){
    
    let numAleatorio = ejercicio0(0,100);
    let exito = false;
    let mensaje = "";
    for (let i = 0; i<10; i++ ){
        let numero = parseFloat(prompt("Introduce un nº del 0 al 100" + " " + `intento $(i)`));
        console.log(numero);
        console.log(numAleatorio);30
        if(numero === numAleatorio) {
            exito = true;
            break;
        }else if (numero > numAleatorio){
            alert("El numero es menor");
        }else if (numero < numAleatorio){
            alert("El numero es mayor");
        }
        if (exito === true) break;
    }    
    if(exito === true) mensaje = "Acertaste! Muy bien!";
    else mensaje = "Lo siento, has perdido";

    return mensaje;
    


}





function dameValores(){
    return [1,2,3];
}