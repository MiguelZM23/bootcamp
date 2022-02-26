//Call the dataTables jQuery plugin
$(document).ready(function() {
	cargarUsuarios();
	$('#usuarios').DataTable();
	//var oTable = $('#usuarios').dataTable();

	// Filter to rows with 'Webkit' in them, add a background colour and then
	// remove the filter, thus highlighting the 'Webkit' rows only.
	//oTable.fnFilter('Webkit');
	//oTable.$('tr', {"search": "applied"}).css('backgroundColor', 'blue');
	//oTable.fnFilter('');
});

async function cargarUsuarios() {


	// GET request using fetch with async/await
	const request = await fetch('api/usuarios/{id}', {
		method: 'GET',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},

	});
	const usuarios = await request.json();

	let listadoHtml = '';
	for (let usuario of usuarios) {
			let botonEliminar = '<button type="button" onclick="eliminarUsuario('+ usuario.id +')" class="btn btn-warning btn-circle"><i class="fa fa-times"></i></button>';

		let usuarioHtml = '<tr><td>' + usuario.id + '</td><td>'
			+ usuario.nombre + '</td><td>'
			+ usuario.primerApellido + '</td><td>'
			+ usuario.segundoApellido + '</td><td>'+botonEliminar+'</td></tr>';
		listadoHtml += usuarioHtml;
	}


	document.querySelector('#usuarios tbody').outerHTML = listadoHtml;


}

async function eliminarUsuario(id){
	
	if (!confirm('Desea eliminar este usuario?')){
		return;
	}
	const request = await fetch('api/usuarios/' + id, {
		method: 'DELETE',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},

	});
	location.reload();
	
}