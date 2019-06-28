'use strict'
angular.module('registerServices',[]).factory('serviceRegister',['$http','$rootScope', function($http,$rootScope){
 		var services = {register:register};
		return services;
	function register (email , fullName , passWord , userName ){
				var data =  $.param({
					userName:userName,
					passWord:passWord,
					email:email,
					fullName:fullName

				});
			var url =$rootScope.link+"acount/register?"+data;	
	return  $http.post(url,data,{});
	}
}])
