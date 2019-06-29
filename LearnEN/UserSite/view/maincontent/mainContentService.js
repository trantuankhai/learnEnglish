'use strict'
angular.module('mainContentService', []).factory('contentServices', ['$http','$rootScope', function($http,$rootScope){
var	services = {
		getAllContent:getAllContent
	}
	return services;
	function getAllContent(){
		return $http.get($rootScope.link+"theme");
	};
}])