'use strict' 
var loginApp = angular.module('appLogin', ['ngRoute','registerServices','loginServices']);
loginApp.run( function($rootScope,$http,$window){
		$rootScope.link = "http://localhost:8010/";
	var token = $window.localStorage.getItem('token');
	if(token != null){
		$http.get($rootScope.link+"acount/resolveToken",{headers: {'Authorization': 'Bearer '+ token}}).then(function(res){
			if(res.data.role == "USER"){
				$window.location.href = "../UserSite";
			}else{
			console.log('chuyen den admin');
				//$window.location.href = "../UserSite";
			}
		},function(error){
			$window.localStorage.removeItem('token');
			$window.location.href = "../Login";
		})
	}else{
		console.log('token not  avalible');
	}

});
loginApp.config(function($routeProvider) {
	$routeProvider.when("/", {
		controller : 'loginController',
   		templateUrl : 'view/login/_login.html'
	}).when("/login", {
		templateUrl : 'view/login/_login.html',
		controller : 'loginController'
	}).when("/register", {
		templateUrl : 'view/register/_register.html',
		controller : 'registerController'
	}).otherwise({
		templateUrl : "index.html"
	});
});