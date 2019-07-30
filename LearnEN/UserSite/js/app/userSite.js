'use strict'
var userSite = angular.module('userSiteApp', ['ngRoute','mainContentService','vocabularyService']);
userSite.run( function($rootScope,$window,$http,$interval){
		$rootScope.link = "http://localhost:8010/";
	var token = $window.localStorage.getItem('token');
	if(token!=null)
	{
		$http.defaults.headers.common['Authorization'] = 'Bearer ' +token;
	}else
	{
		$window.location.href = "../Login";
	}
function checkTimeOut(){
	$http.get($rootScope.link+"acount/resolveToken").then(function(data){
	},function(error){
		$window.localStorage.removeItem('token');
		$window.location.href = "../Login";
	});
}
 var checkSession = setInterval(checkTimeOut,60000);
});
userSite.config(function($routeProvider) {
	$routeProvider.when("/", {
		controller : 'mainContentContrller',
   		templateUrl : 'view/maincontent/_mainContent.html'
	})
	.when("/tu-vung-theo-chu-de"	, {
	 	controller : 'verbController',		
	 	templateUrl : 'view/Verb/_verb.html'
	 }).when("/tieng-anh-giao-tiep", {
	 	templateUrl : 'view/register/_register.html',
	 	controller : 'registerController'
	})
	  .when("/ngu-phap-co-ban", {
	 	templateUrl : 'view/register/_register.html',
	 	controller : 'registerController'
	})
	   .when("/hoc-tieng-anh-qua-video", {
	 	templateUrl : 'view/register/_register.html',
	 	controller : 'registerController'
	}).otherwise({
	 	templateUrl : 'view/maincontent/_mainContent.html'
	 });
});