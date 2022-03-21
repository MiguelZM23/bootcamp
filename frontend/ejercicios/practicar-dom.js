(function() {
    let titulo = document.querySelector('#titulo-principal');
let botonHola = window.document.getElementById('#boton-hola');
let botonTitulo = window.document.querySelector('#boton-titulo');

console.log(document);
console.log(document.head);
console.log(document.body);
console.log(document.documentElement);
console.log(document.doctype);
console.log(document.charset);
console.log(document.title);
console.log(document.links);
console.log(document.images);
console.log(document.forms);
console.log(document.styleSheets);
console.log(document.scripts);
//establece un tiempo antes de ejecutar la instrucción:
setTimeout(()=>{
    //Obtiene el texto seleccionado
    console.log(document.getSelection().toString());
}, 3000);
document.write("<h2>Hola desde el DOM</h2>");









botonHola.addEventListener('click', function(ev) {
    titulo.innerHTML = "Hola Mundo";    
})
botonTitulo.addEventListener('click', function(ev) {
    titulo.innerHTML = "Practicando Javascript y el Dom";    
})

})();
