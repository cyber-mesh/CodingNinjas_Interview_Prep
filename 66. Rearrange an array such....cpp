#include <bits/stdc++.h> 
#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n]={0};
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    for(int i=1; i<n-1; i+=2)
    {
        int t=arr[i];
        arr[i]= arr[i+1];
        arr[i+1]=t;
    }
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}
