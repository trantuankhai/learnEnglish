'use strict'
userSite.controller('verbController',  function($http,serviceVerb,$scope){

	serviceVerb.getVerb().then(function(res) {
		$scope.listLesson = res.data;
	},function(error){
		console.log(error);
	})
});
userSite.controller('vocabularyDetailController',  function($http,serviceVerb,$scope,$routeParams){
console.log($routeParams.idvocabulary);
	serviceVerb.getVocabularyDetail($routeParams.idvocabulary).then(function(res) {
		$scope.listVocabularyDetail = res.data;
	},function(error){
		console.log(error);
	})
});