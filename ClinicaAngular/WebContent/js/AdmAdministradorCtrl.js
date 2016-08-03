var app = angular.module("moduloAplicacion");

app.controller("administradorControlador", function($scope,AdminAdministradorSrv){
	$scope.valorDeBusqueda="";
	$scope.criterioOrdenH="idHorario";
	$scope.errorMsg="Resultado";
	
	//HORARIOS
	//CREAR
    $scope.registrarHorarios = function (){
    	AdminAdministradorSrv.registrarHorarios($scope.horario,
    	   function(mensajeExito){
    		   $scope.mensaje=mensajeExito;
    	   },
    	   function(mensajeError){
    		   $scope.mensaje=mensajeError;
    	   }
    	);
    };
	//BUSCAR
	$scope.buscarHorarios = function(){
		AdminAdministradorSrv.buscarHorarios($scope.valorDeBusqueda,
				function(horariosEncontrados){
					console.log("Ctrl exito " + horariosEncontrados);
					$scope.horarios = horariosEncontrados;
				},			   
				function(mensajeError){
					$scope.errorMsg = mensajeError;
				});
	};
	//ACTUALIZAR
	  $scope.actualizarHorarios = function (){
	    	AdminAdministradorSrv.actualizarHorario($scope.horario,
	    	   function(mensajeExito){
	    		   $scope.mensaje=mensajeExito;
	    	   },
	    	   function(mensajeError){
	    		   $scope.mensaje=mensajeError;
	    	   }
	    	);
	    };
	
	//ESPECIALIDADES
	$scope.criterioOrdenE="nombreEspecialidad";
	$scope.buscarEspecialidades = function(){
		AdminAdministradorSrv.buscarEspecialidades($scope.valorDeBusqueda,
				function(especialidadesEncontradas){
					console.log("Ctrl exito " + especialidadesEncontradas);
					$scope.especialidades = especialidadesEncontradas;
				},
				function(mensajeError){
					$scope.errorMsg = mensajeError;
				});
	};
});