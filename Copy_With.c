#include<stdio.h>
#include<string.h>
int main()
{
	
	char str1[10],str2[10];
	printf("Enter a string:\n");
	gets(str1);
	strcpy(str2,str1);
	printf("Copied String is %s\n",str2);
	return 0;
}