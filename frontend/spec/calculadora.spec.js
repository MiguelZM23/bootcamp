describe('Pruebas de la calculadora', () => {
 /*   let calculadora;

    beforeEach(function() {
        calculadora = new Calculadora(1, "hola",  document.querySelector("#pantalla"));
    });
   */ 
    
        
    
    
    
    describe('Calculadora', ()=>{
    
        describe('Sumar1 OK', () => {
            it('Sumar', () => {
                let num = sumar(1, 100);

                expect(num).toBeEqual(101);
            })
        })
    });




    
        describe('Probar Calculadora suma', () =>{
            describe('Sumar OK', ()=> {
                
                ['0,1', '-2,5', '-2,-10'].forEach(caso =>{
                    it("Suma: " + caso, () => expect(sumar(caso).toBeEqual(parseFloat(caso.charAt(0)) + parseFloat(caso.charAt(2)))));
                //expect(num).toBeGreaterThanOrEqual(1)
                //expect(num).toBeLessThanOrEqual(100)
                    })
            })
        });

/*
    
    describe('Sumar KO', ()=>{
        it('falta parámetro', ()=> {
            expect(() => sumar(1, 100)).toThrow(); 
            pending('esto es por lo que está pendiente');
    });
    });

    describe('Ejercicio 2', () => {
        it('Pendiente')
    });
/*
    describe('Ejercicio 5', () => {
        describe('Sumar OK', () => {
            ['12345678z', '12345678Z', '1234S', '4g'].forEach(caso => {
                it(`Suma: ${caso}`, () => expect(suma(caso)).toBeTrue())
            })
        });
    
        describe('NIF KO', () => {
            ['1234J', '12345678', 'Z', 'Z12345678'].forEach(caso => {
                it(`NIF: ${caso}`, () => expect(esNIF(caso)).toBeFalse())
            })
        });
    });
*/
})