loginApp.controller('registerController',  function($scope,$rootScope,$http){
	$rootScope.link = "http://localhost:8010/";
	$scope.register = function()
	{
		var data =  $.param({
					email:$scope.email,
					fullname:$scope.fullName,
					passWord:$scope.passWord,
					username:$scope.userName
				});
		$http.post($rootScope.link+"acount/register?"+data).then(
			 function(res){
				console.log(res.data);
			}
			,  function(error){
				console.log(error);
				alert('that bai');
			})
	}
});