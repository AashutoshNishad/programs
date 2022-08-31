#include<iostream>
 using namespace std;


int solve(int n , int arr[]){

if(n == 1){
    return 0;
}
else if(n == 2){
    return 2;
}
if(arr[n] > -1 ){
    return arr[n];
}
int sol = solve(n-1 , arr);
arr[n] = sol;
int sol2 = solve(n-2 , arr);
arr[n-1] = sol2;
cout<<2*(sol - sol2) + sol<<endl;0.

return 2*(sol - sol2) + sol;
}


int main(){
      int n = 3;
int arr[n] = {-1};
cout<<solve(n , arr);
 return 0;
}