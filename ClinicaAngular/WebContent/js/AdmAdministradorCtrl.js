var app = angular.module("moduloAplicacion");

app.controller("administradorControlador", function($scope,$location,AdminAdministradorSrv){
	$scope.valorDeBusqueda="";
	$scope.criterioOrdenH="idHorario";
	$scope.errorMsg="Resultado";
	$scope.param = $location.search();
	//HORARIOS
	//CREAR
    $scope.registrarHorarios = function (){
    	AdminAdministradorSrv.registrarHorarios($scope.horario,
    	   function(mensajeExito){
    			console.log("Ctrl exito " + $scope.horario);
    			$scope.mensaje=mensajeExito;
    	   },
    	   function(mensajeError){
    		   console.log("Ctrl error " + $scope.horario);
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
	//ELIMINAR
	    $scope.eliminarHorarios = function (){
	    	AdminAdministradorSrv.eliminarHorario($scope.horario,
	    	   function(mensajeExito){
	    		   $scope.mensaje=mensajeExito;
	    	   },
	    	   function(mensajeError){
	    		   $scope.mensaje=mensajeError;
	    	   }
	    	);
	    	//$location.url("/administrador");
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