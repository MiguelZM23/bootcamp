class Calculadora {

    constructor(id, nombre, pantalla) {
        this.id = id;
        this.nombre = nombre;
        this.pantalla = pantalla;
    }


    dameArray(i, j) {
        let miArray = [];
        for (let h = 0; h < i; h++) {
            miArray[h] = j;
        }

        return miArray;
    }
    sonido() {
        //let audio = new Audio('click.mp3');
        //audio.play();
    }

    imprimir(value) {
        
        this.sonido();
        if (typeof (value) === String && value.charAt(0) === '.') this.pantalla.textContent += ',';
        else this.pantalla.textContent += value;
    }
    limpiar() {
        this.pantalla.textContent = "";
    }

    calcular(value) {
        console.log(value);
        let numero = "";
        let arrayNumeros = [];

        let cont = 0;
        let cont2 = 0;
        let operacion = this.dameArray(1, 0);
        let resultado = 0;
        let resultadoAcumulado = 0;

        this.limpiar();
        while (value !== "") {
            for (let i = 0; i < value.length; i++) {
                if (parseInt(value.charAt(i)) < 10 && parseInt(value.charAt(i)) >= 0 || value.charAt(i) === "." || value.charAt(0) === "-" && numero === "") { numero += value.charAt(i); cont += 1 }
                else break
            }
            arrayNumeros[cont2] = numero;
            numero = "";
            operacion[cont2] = value.charAt(cont);

            cont += 1;

            cont2 += 1;
            value = value.substring(cont);
            numero = "";
            cont = 0;
        }
        resultadoAcumulado = parseFloat(arrayNumeros[0]);
        for (let i = 0; i < operacion.length; i++) {

            switch (operacion[i]) {
                case '+':
                    resultado = this.sumar(resultadoAcumulado, arrayNumeros[i + 1]);
                    break;
                case '-':
                    resultado = this.restar(resultadoAcumulado, arrayNumeros[i + 1]);
                    break;
                case '/':
                    resultado = this.dividir(resultadoAcumulado, arrayNumeros[i + 1]);
                    break;
                case '*':
                    resultado = this.multiplicar(resultadoAcumulado, arrayNumeros[i + 1]);
                    break;
                case '':
                    resultado = resultadoAcumulado;
                    break;
                default:
                    console.log("Operación no conocida");
            }
            resultadoAcumulado = resultado;
        }
        this.imprimir(resultadoAcumulado);
    }

    sumar(a, b) {
        a = parseFloat(a);
        b = parseFloat(b);
        return (a + b).toFixed(2);
    }

    restar(a, b) {
        a = parseFloat(a);
        b = parseFloat(b);
        return (a - b).toFixed(2);
    }

    multiplicar(a, b) {
        a = parseFloat(a);
        b = parseFloat(b);
        return (a * b).toFixed(2);
    }

    dividir(a, b) {

        a = parseFloat(a);
        b = parseFloat(b);
        return (a / b).toFixed(2);
    }

    resto(a, b) {
        a = parseFloat(a);
        b = parseFloat(b);
        return (a % b).toFixed(2);
    }

    getNombre() {
        return "Mi nombre es " + this.nombre;
    }

}



