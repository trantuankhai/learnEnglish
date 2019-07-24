'use strict'
var userSite = angular.module('userSiteApp', ['ngRoute','mainContentService']);
userSite.run( function($rootScope,$window,$http){
		$rootScope.link = "http://localhost:8010/";
	var token = $window.localStorage.getItem('token');
	if(token!=null)
	{
		$http.defaults.headers.common['Authorization'] = 'Bearer ' +token;
	}else
	{
		$window.location.href = "../Login";
	}
});
userSite.config(function($routeProvider) {
	$routeProvider.when("/", {
		controller : 'mainContentContrller',
   		templateUrl : 'view/maincontent/_mainContent.html'
	});
	//.when("/login", {
	// 	templateUrl : 'view/login/_login.html',
	// 	controller : 'loginController'
	// }).when("/register", {
	// 	templateUrl : 'view/register/_register.html',
	// 	controller : 'registerController'
	// }).otherwise({
	// 	templateUrl : "index.html"
});