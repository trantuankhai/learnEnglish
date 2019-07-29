'use strict'
angular.module('vocabularyService',[]).factory('serviceVerb', ['$http','$rootScope', function($http,$rootScope){
	var services =
	{
		getVerb : getVerb,
		getQuiz : getQuiz


	};
	return services;
	function getVerb(){

	};
	function getQuiz(){

	};
}]);
