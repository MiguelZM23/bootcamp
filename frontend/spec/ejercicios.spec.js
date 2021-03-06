describe('Pruebas de los ejercicios', () => {
    describe('Ejercicio 1', ()=>{
        describe('OK', () =>{
            it('Genera aleatorio', ()=> {
                let spy = spyOn(Math, "random").and.returnValue(0.49);
                let num = ejercicio0(1, 100);
                expect(spy).toHaveBeenCalled();
                //expect(num).toBeGreaterThanOrEqual(1)
                //expect(num).toBeLessThanOrEqual(100)
            })
        })
    });
    
    describe('KO', ()=>{
        it('falta parámetro', ()=> {
            expect(() => ejercicio0(1, 100)).toThrow(); 
            pending('esto es por lo que está pendiente');
    });
    });

    describe('Ejercicio 2', () => {
        it('Pendiente')
    });

    describe('Ejercicio 5', () => {
        describe('NIF OK', () => {
            ['12345678z', '12345678Z', '1234S', '4g'].forEach(caso => {
                it(`NIF: ${caso}`, () => expect(esNIF(caso).toBeTrue())
            })
        });
    
        describe('NIF KO', () => {
            ['1234J', '12345678', 'Z', 'Z12345678'].forEach(caso => {
                it(`NIF: ${caso}`, () => expect(esNIF(caso)).toBeFalse())
            })
        });
    });
})