#include<stdio.h>
int main()
{
	int i;
	char str1[50],str2[50];
	printf("Enter tthe string:\n");
	gets(str1);
	for(i=0;str1[i]!='\0';i++)
	{	
		str2[i]=str1[i];
	}
	str2[i]	= '\0';
	printf("Copieed string is %s\n",str2);
	return 0;
}