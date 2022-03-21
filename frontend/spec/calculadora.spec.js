describe('Pruebas de la calculadora', () => {
    let calculadora;
    let pantallaPrincipal = { textContent: 10 };

    beforeEach(function () {

        calculadora = new Calculadora(1, "Calculadora", pantallaPrincipal);
    });



    it("Crea calculadora", () => {
        expect(new Calculadora(1, "Calculadora", pantallaPrincipal)).toBeDefined()
    })


    describe('Calculadora', () => {

        describe('Sumar1 OK', () => {
            it('Sumar', () => {

                let num = calculadora.sumar(1, 100);

                expect(num).toEqual(101);
            })
        })
    });

    describe('Probar Calculadora suma', () => {
        describe('Sumar OK', () => {

            [[0, 1, '1.00'], [-2, 5, '3.00'], [-2, -10, '-12.00']].forEach(caso => {

                it("Suma: " + caso, () => expect(calculadora.sumar(caso[0], caso[1])).toEqual(caso[2]))
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