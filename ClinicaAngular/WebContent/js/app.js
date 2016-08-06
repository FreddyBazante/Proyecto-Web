var aplicacion = angular.module("moduloAplicacion", ["ngRoute","ngAnimate","ngCookies"]);

aplicacion.config(function($routeProvider){
	 $routeProvider
			 .when("/", {
		         controller: "inicioCtrl",
		         controllerAs: "vm",
		         templateUrl: "bienvenido.html"
			 })
			 .when("/admin", {
		         controller: "loginController",
		         controllerAs: "vm",
		         templateUrl: "LoginAdministrador.html"
			 })
			 .when("/odonto", {
		         controller: "loginController",
		         controllerAs: "vm",
		         templateUrl: "LoginOdontologo.html"
			 })
			 .when("/pac", {
		         controller: "loginController",
		         controllerAs: "vm",
		         templateUrl: "LoginPaciente.html"
			 })
		 	 .when("/home", {
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
aplicacion.factory("auth", function($cookies,$cookieStore,$location)
		{
		    return{
		        login : function(nomreUsr, passwordUsr)
		        {
		            //creamos la cookie con el nombre que nos han pasado
		            $cookies.nomreUsr = nomreUsr,
		            $cookies.passwordUsr = passwordUsr;
		            //mandamos a la home
		            $location.path("/administrador");
		        },
		        logout : function()
		        {
		            //al hacer logout eliminamos la cookie con $cookieStore.remove
		            $cookieStore.remove("nomreUsr"),
		            $cookieStore.remove("passwordUsr");
		            //mandamos al login
		            $location.path("/admin");
		        },
		        checkStatus : function()
		        {
		            //creamos un array con las rutas que queremos controlar
		            var rutasPrivadas = ["/administrador","/dashboard","/admin"];
		            if(this.in_array($location.path(),rutasPrivadas) && typeof($cookies.nomreUsr) == "undefined")
		            {
		                $location.path("/admin");
		            }
		            //en el caso de que intente acceder al login y ya haya iniciado sesión lo mandamos a la home
		            if(this.in_array("/admin",rutasPrivadas) && typeof($cookies.nomreUsr) != "undefined")
		            {
		                $location.path("/administrador");
		            }
		        },
		        in_array : function(needle, haystack)
		        {
		            var key = '';
		            for(key in haystack)
		            {
		                if(haystack[key] == needle)
		                {
		                    return true;
		                }
		            }
		            return false;
		        }
		    }
		});
		 
		//creamos el controlador pasando $scope y $http, así los tendremos disponibles
		app.controller('loginController', function($scope,auth) 
		{
		    //la función login que llamamos en la vista llama a la función
		    //login de la factoria auth pasando lo que contiene el campo
		    //de texto del formulario
		    $scope.login = function()
		    {
		        auth.login($scope.username, $scope.password);
		    }
		 
		});