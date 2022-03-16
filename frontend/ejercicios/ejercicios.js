console.log("*****Practicando JavaScript*****");

function numAleatorio(a, b) {
    let c = Math.random(a, b);
    return a + b;
}
function ejercicio0(max, min) {
    //let min = parseFloat(prompt("Introduce el intervalo inferior"));
    //let max = parseFloat(prompt("Introduce el intervalo superior"));

    let numAleatorio = (Math.floor(Math.random() * (max - min)) + min);

    return numAleatorio;

    //alert(`El nº aleatorio es $(x)`);

}

function juegoAcertarNumero() {

    let numAleatorio = ejercicio0(0, 100);
    let exito = false;
    let mensaje = "";
    for (let i = 0; i < 10; i++) {
        let numero = parseFloat(prompt("Introduce un nº del 0 al 100" + " " + "intento " + (i + 1)));
        if (numero === numAleatorio) {
            exito = true;
            break;
        } else if (numero > numAleatorio) {
            alert("El numero es menor");
        } else if (numero < numAleatorio) {
            alert("El numero es mayor");
        }
        if (exito === true) break;
    }
    if (exito === true) mensaje = "Acertaste! Muy bien!";
    else mensaje = "Lo siento, has perdido";

    return mensaje;



}

function dameArray(i, j) {
    let miArray = [];
    for (let h = 0; h < i; h++) {
        miArray[h] = j;
    }

    return miArray;
}


function dameNumerosPrimos(cantidad) {
    let numerosPrimos = [];
    let i = 2;
    let contador = 0;
    while (numerosPrimos.length < cantidad) {
        if (esPrimo(i)) {
            numerosPrimos[contador] = i;
            contador += 1;
        }
        i = i + 1;

    }
    return numerosPrimos;
}



function esPrimo(a) {
    for (let i = 2; i < a; i++) {

        if (a % i === 0) {
            return false;
        }
    }
    return true;
}

function esNif(nif){
    let numero;
    let letra;
    let expresionRegular = /^[XYZ]?\d{5,8}[A-Z]$/;

    nif = nif.toUpperCase();

    if (expresionRegular.test(nif)){
        numero = nif.substr(0,nif.length-1);
        numero = numero.replace('X', 0);
        numero = numero.replace('Y', 1);
        numero = numero.replace('Z', 2);
        let = nif.substr(nif.length-1, 1);
        numero = numero % 23;
        letra = 'TRWAGMYFPDXBNJZSQVHLCKET';
        letra = letra.substring(numero, numero+1);
        if (letra != let) {
            //alert('Dni erroneo, la letra del NIF no se corresponde');
            return false;
        }else{
            //alert('Dni correcto');
            return true;
        }
    }else{
        //alert('Dni erroneo, formato no válido');
        return false;
    }
}

function esPalindromo(cadena){
    cadena = cadena.toUpperCase();
    // \s: selecciona espacios en blanco, tabulaciones y saltos de linea.
    // +: en conjunto con \s sirve para tomar espacios consecutivos, de esta forma si hay 1 o mas espacios seguidos se eliminaran en conjunto.
    // g: permite repetir el proceso a lo largo del string o cadena, de otra forma solo se eliminaría el primer espacio encontrado
    cadena = cadena.replace(/\s+/g,'');
    const strReversed = cadena.split("").reverse().join("");
    return strReversed === cadena ? "es palindromo" : "no es palindromo";
    }


/********
 * Función constructora adivina el número
 ********/

 function JuegoDelNumero(id, nombre) {
    this.id = id;
    this.nombre = nombre;
    this.numeroBuscado = (Math.floor(Math.random() * (100 - 1)) + 1);
    this.intentos = 0;
    this.encontrado = false;
    this.resultado = "Pendiente de empezar";
    this.getNombre= function() {return "Mi nombre es " + this.nombre};
    console.log("Inicializado");   
}

/********
 * Clase del juego Adivina el número
 ********/
class JuegoDelNumero1 {
    constructor(id,nombre){
        this.nombre = nombre;
        this.id = id;
        this.numeroBuscado = (Math.floor(Math.random() * (100 - 1)) + 1);
        this.intentos = 0;
        this.encontrado = false;
        this.resultado = "Pendiente de empezar";
        console.log("Inicializado");   
    }

    getNombre(){return "Mi nombre es " + this.nombre}

    jugar(){
        let intentos;
        let integer;
        let numeroIntroducido;
        let numeroBuscado;
        let encontrado;
        do {
            try {
                intentos += 1;
                this.numeroIntroducido = prompt("Dame tu número del 1 al 100 (" + this.intentos + " de 10): ");
    //				System.out.print("[" + numeroBuscado + "]: ");
                //this.numeroIntroducido = Integer.parseInt(teclado.nextLine());
                if (this.numeroBuscado == this.numeroIntroducido) {
                    encontrado = true;
                } else if (this.numeroBuscado > this.numeroIntroducido) {
                    console.log("Mi número es mayor.");
                } else {
                    console.log("Mi número es menor.");
                }
    
            } catch (error) {
                console.error(error);
            }
        } while (this.intentos < 10 && !this.encontrado);
        if (this.encontrado) {
            console.log("Bieeen!!! Acertaste.");
        } else {
            console.log("Upsss! Se acabaron los intentos, el número era el " + numeroBuscado);
        }
    
    }
    
}




