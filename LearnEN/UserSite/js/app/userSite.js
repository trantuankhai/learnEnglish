'use strict'
var userSite = angular.module('userSiteApp', ['ngRoute','mainContentService','vocabularyService']);
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
	})
	.when('1000-tu-vung-theo-chu-de', {
	 	templateUrl : 'view/Verb/_verb.html',
	 	controller : 'verbController'
	 });
	// .when("/register", {
	// 	templateUrl : 'view/register/_register.html',
	// 	controller : 'registerController'
	// }).otherwise({
	// 	templateUrl : "index.html"
});