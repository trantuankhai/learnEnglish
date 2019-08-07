'use strict'
angular.module('basicGrammarService',[]).factory('serviceBasicGrammar', ['$http','$rootScope', function($http,$rootScope){
	var services =
	{
		getBasicGrammar : getBasicGrammar,
		getQuiz : getQuiz,
		getBasicGrammarDetail:getBasicGrammarDetail


	};
	return services;
	function getBasicGrammar(){

		return $http.get($rootScope.link+"basicGrammar");

	};
	function getQuiz(){

	};
	function getBasicGrammarDetail (id_Grammar) {
		return $http.get($rootScope.link+"basicGrammarDetail/"+id_Grammar); 
	}
}]);
