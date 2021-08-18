#include<stdio.h>
#include<string.h>
int main()
{
	char str[10];
	printf("Enter a String:\n");
	gets(str);
	printf("Length of string is %d\n",strlen(str));
	return 0;	
}