var app = angular.module("moduloAplicacion");

app.service('AdminAdministradorSrv', function($http){
	//HORARIOS
	//CREAR
	this.registrarHorarios=function(horario,exito,error){
		$http.post("http://localhost:8080/ClinicaAngular/rest/ServicioAdministrador/registarHorario",
				horario).then(
		    function (response){
		    	console.log("Exito" + response);
		    	exito(response.data);
		    }				  
	     ,
		    function (response){
		    	console.log("Error " + response);
		    	error("Error al invocar el servicio");
		    }				  
	     )  
	}
	//BUSCAR
	this.buscarHorarios = function(nombreBusqueda,exito,error) {
		$http.get("http://localhost:8080/ClinicaAngular/rest/ServicioAdministrador/buscarHorario?nombreBusqueda=" + 
				nombreBusqueda).then(
		    function (response){
		    	console.log("Exito" + response);
		    	exito(response.data);
		    }				  
 	     ,
		    function (response){
		    	console.log("Error " + response);
		    	error(response.statusText);
		    }				  
 	     );  
	//ACTUALIZAR
	this.actualizarHorario = function (horario,exito,error){
		$http.post("http://localhost:8080/ClinicaAngular/rest/ServicioAdministrador/actualizarHorario",
				horario).then(
		    function (response){
		    	console.log("Exito" + response);
		    	exito(response.data);
		    }				  
	     ,
		    function (response){
		    	console.log("Error " + response);
		    	error("Error al invocar el servicio");
		    }				  
	     )  
	};
	//ELIMINAR
	this.eliminarHorario = function (horario,exito,error){
		$http.post("http://localhost:8080/ClinicaAngular/rest/ServicioAdministrador/eliminarHorario",
				horario).then(
		    function (response){
		    	console.log("Exito" + response);
		    	exito(response.data);
		    }				  
	     ,
		    function (response){
		    	console.log("Error " + response);
		    	error("Error al invocar el servicio");
		    }				  
	     )  
	};
 	 //ESPECIALIDADES
	//BUSCAR
 	 this.buscarEspecialidades = function(nombreBusqueda,exito,error) {
		$http.get("http://localhost:8080/ClinicaAngular/rest/ServicioAdministrador/buscarEspecialidad?nombreBusqueda=" + 
				nombreBusqueda).then(
		    function (response){
		    	console.log("Exito" + response);
		    	exito(response.data);
		    }				  
 	     ,
		    function (response){
		    	console.log("Error " + response);
		    	error(response.statusText);
		    }				  
 	     )
		};
		
 	
	}
});