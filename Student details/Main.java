#include<iostream>
#include <algorithm>
using namespace std;
struct student
{
  char name[30];
  char department[20];
  int yr;
  float cgpa;
};
string convertToString(char* a, int size) 
{ 
    int i;
    string s = ""; 
    for (i = 0; i < size; i++) { 
        s = s + a[i]; 
    } 
    return s; 
}
bool comparator(student a, student b){
    int a_size = sizeof(a.name) / sizeof(char); 
    int b_size = sizeof(b.name) / sizeof(char); 
    string s_a = convertToString(a.name, a_size); 
    string s_b = convertToString(b.name, b_size);
    return s_a<s_b;
}
int main()
{
  int n;
  cout<<"Enter the number of students";
  cin>>n;
  student stu[n];
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of student "<<i+1<<endl;
    cout<<"Enter name\n";
    cin>>stu[i].name;
    cout<<"Enter department\n";
	cin>>stu[i].department;
    cout<<"Enter year of study\n";
    cin>>stu[i].yr;
    cout<<"Enter cgpa";
    cin>>stu[i].cgpa;
  }
  sort(stu, stu + n, comparator);
  //for(int i=1;i<n;i++)
    cout<<"\nDetails of students\n";
    for(int i=0;i<n;i++)
    {
      cout<<"Student "<<i+1<<endl;
      cout<<"Name:"<<stu[i].name<<endl;
      cout<<"Department:"<<stu[i].department<<endl;
      cout<<"Year of study:"<<stu[i].yr<<endl;
      cout<<"CGPA:"<<stu[i].cgpa<<endl;
    }
    return 0;
}
