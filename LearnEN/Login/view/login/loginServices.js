'use strict'
angular.module('loginServices',[]).factory('serviceLogin',['$http','$rootScope', function($http,$rootScope){
 		var services = {login:login,
 			resolveToken:resolveToken};
		return services;
	function login ( passWord , userName ){
				var data =  $.param({
					passWord:passWord,
					userName:userName
				});
			var url =$rootScope.link+"acount/login?"+data;	
	return  $http.get(url,{headers: {'Accept': 'text/plain'}});
	};
	function resolveToken(token)
	{
		var url =$rootScope.link+"acount/resolveToken";
		return $http.get(url);
	};
}])
