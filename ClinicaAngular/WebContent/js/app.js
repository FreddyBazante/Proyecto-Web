var aplicacion = angular.module("moduloAplicacion", ["ngRoute"]);

aplicacion.config(function($routeProvider){
	 $routeProvider
           .when("/", {
               controller: "administradorControlador",
               controllerAs: "vm",
               templateUrl: "vistasAdministrador/home.html"
           })
           .when("/administrador", {
               controller: "administradorControlador",
               controllerAs: "vm",
               templateUrl: "Administrador.html"
           })
           .when("/horario", {
               controller: "administradorControlador",
               controllerAs: "vm",
               templateUrl: "vistasAdministrador/horario.html"
           })
           .when("/especialidad", {
               controller: "administradorControlador",
               controllerAs: "vm",
               templateUrl: "vistasAdministrador/especialidad.html"
           })
           .when("/registroAdministrador", {
               controller: "administradorControlador",
               controllerAs: "vm",
               templateUrl: "vistasAdministrador/registroAdministrador.html"
           })
           .when("/registroOdontologo", {
               controller: "administradorControlador",
               controllerAs: "vm",
               templateUrl: "vistasAdministrador/registroOdontologo.html"
           })
           .when("/registroPaciente", {
               controller: "administradorControlador",
               controllerAs: "vm",
               templateUrl: "vistasAdministrador/registroPaciente.html"
           })
			.otherwise({
				redirectTo: '/'
			});
});