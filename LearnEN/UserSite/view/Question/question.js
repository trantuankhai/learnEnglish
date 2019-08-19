userSite.controller('questionController', function($http,$scope,$rootScope,$routeParams){
	$http.get($rootScope.link+"question/"+$routeParams.idLesionDetail+"/"+$routeParams.idType+"/"+$routeParams.order).then(function(res){
	$scope.question = res.data;
		$http.get($rootScope.link+"questionQuiz/"+res.data.id_question, {}).then(function(res){
			$scope.listAnswer = res.data;
			console.log($scope.listAnswer);
		}, function(error){

		});
			console.log(res.data);
		}, function(error){

		});
$scope.nextQuestion = function(order){
		var orderLearn = Number(order)+1;
	$http.get($rootScope.link+"question/"+$routeParams.idLesionDetail+"/"+$routeParams.idType+"/"+orderLearn).then(function(res){
	$scope.question = res.data;
		$http.get($rootScope.link+"questionQuiz/"+res.data.id_question, {}).then(function(res){
			$scope.listAnswer = res.data;
		}, function(error){

		});
	}, function(error){

	})
};
$scope.prevQuestion = function(order){
		var orderLearn = Number(order)-1;
		if(orderLearn <=0){
			$scope.isDisable = true;
		}else{
		$scope.isDisable = false;
	$http.get($rootScope.link+"question/"+$routeParams.idLesionDetail+"/"+$routeParams.idType+"/"+orderLearn).then(function(res){
	$scope.question = res.data;
	$http.get($rootScope.link+"questionQuiz/"+res.data.id_question, {}).then(function(res){
			$scope.listAnswer = res.data;
		}, function(error){

		});
	}, function(error){

	})
		}
	
};
$scope.checkAnswerCorrect = function(id_question,index){
	$http.get('http://localhost:8010/checkAnswerCorrect/'+id_question).then(function(res){
		console.log(index);
		if(res.data == 0){
			alert('Bạn đã trả lời sai');
			$('.button-next')[0].click(function(event) {
				/* Act on the event */
			});
		} else{
			alert('Bạn trả lời đúng');
		}
	}, function(error){
		console.log(error);
	})
}
	// $scope.checkAnswerCorrect = function(){
	// 	console.log('q');
	// 	$(this).addClass('guessing-choice-item choice-true');
	// }
});