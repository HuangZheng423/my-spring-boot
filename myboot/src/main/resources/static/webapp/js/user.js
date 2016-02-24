
function findOne($scope, $http) {
    $http.get('/users/findOne?userName=b').
        success(function(data) {
            $scope.user = data;
        });
}

function insertUser($scope, $http){


        $scope.insert = function (){
         $http({
                    method:'post',
                    url:'/users/insertUser',
                    data:$scope.user,
                    }).
                    success(function(data) {
                        alert(data);
                });
        };


}
function findAll($scope,$http){
    $http.get('/users/list').success(function(data){
        $scope.user = data;
    })
}