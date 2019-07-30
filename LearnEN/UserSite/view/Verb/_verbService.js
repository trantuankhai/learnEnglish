'use strict'
angular.module('vocabularyService',[]).factory('serviceVerb', ['$http','$rootScope', function($http,$rootScope){
	var services =
	{
		getVerb : getVerb,
		getQuiz : getQuiz


	};
	return services;
	function getVerb(id_theme){

		return $http.get($rootScope.link+"lesson/idTheme?idTheme="+id_theme);

	};
	function getQuiz(){

	};
}]);
