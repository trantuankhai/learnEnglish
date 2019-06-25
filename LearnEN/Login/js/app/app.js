'use strict' 
var loginApp = angular.module('appLogin', ['ngRoute','registerServices']);
loginApp.run( function($rootScope){
		$rootScope.link = "http://localhost:8010/";
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