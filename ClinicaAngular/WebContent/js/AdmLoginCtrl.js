var app = angular.module("moduloAplicacion");

app.controller("loginController", function($scope,auth){
	 $scope.login = function()
	    {
	        auth.login($scope.nomreUsr, $scope.passwordUsr);
	    }
});