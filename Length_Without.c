#include<stdio.h>
int main()
{
	char str[100],length=0;
	int i;                                                                                                                                                                                                                             
	printf("Enter a String\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		length++;
	}
	printf("the length of the string is %d\n",length);
	return 0;
	
}