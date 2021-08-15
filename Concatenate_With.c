#include<stdio.h>
#include<string.h>
int main()
{
	char str1[10]="Jhansi",str2[10]="Jhansi";
	int result;
	result=strcmp(str1,str2);
	if(result==0)
		printf("Two strings are equal\n");
	else
		printf("Two strings are not equal\n");
	return 0;
	
	
}