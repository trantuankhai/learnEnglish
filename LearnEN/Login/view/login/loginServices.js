'use strict'
angular.module('loginServices',[]).factory('serviceLogin',['$http','$rootScope', function($http,$rootScope){
 		var services = {login:login};
		return services;
	function login ( passWord , userName ){
				var data =  $.param({
					passWord:passWord,
					userName:userName
				});
			var url =$rootScope.link+"acount/login?"+data;	
	return  $http.get(url,{headers: {'Accept': 'text/plain'}});
	}
}])
