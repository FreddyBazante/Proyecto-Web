var app = angular.module("moduloAplicacion");

app.service('AdminLoginService',function($htpp){
	this.iniciarSesionAdministrador = function(nomreUsr,passwordUsr,exito,error) {
		$http.get("http://localhost:8080/ClinicaAngular/rest/ServicioLogin/iniciarSesion?nomreUsr=" + 
				nomreUsr+"&S?passwordUsr="+passwordUsr).then(
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
});