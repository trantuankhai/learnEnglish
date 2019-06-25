'use strict' 
var loginApp = angular.module('appLogin', ['ngRoute']);
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