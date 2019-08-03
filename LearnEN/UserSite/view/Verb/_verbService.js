'use strict'
angular.module('vocabularyService',[]).factory('serviceVerb', ['$http','$rootScope', function($http,$rootScope){
	var services =
	{
		getVerb : getVerb,
		getQuiz : getQuiz,
		getVocabularyDetail:getVocabularyDetail


	};
	return services;
	function getVerb(){

		return $http.get($rootScope.link+"vocabulary");

	};
	function getQuiz(){

	};
	function getVocabularyDetail (id_vocabulary) {
		return $http.get($rootScope.link+"vocabularyDetail/"+id_vocabulary); 
	}
}]);
