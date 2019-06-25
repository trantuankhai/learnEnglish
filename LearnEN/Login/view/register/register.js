loginApp.controller('registerController',  function($scope,$rootScope,$http){
	$rootScope.link = "http://localhost:8010/";
	$scope.register = function(email , fullName , passWord , username)
	{
		var data =  $.param({
					email:email,
					fullname:fullName,
					passWord:passWord,
					username:username
				});
		$http.post($rootScope.link+"acount/register?"+data).then
	}
});