#include<stdio.h>
int main()
{
	int i,j=0;
	char str1[50],str2[50],str3[50];
	printf("Enter 1st String:\n");
	gets(str1);
	printf("Enter 2nd string:\n");
	gets(str2);
	for(i=0;str1[i]!='\0';i++)
	{
		str3[j]	= str1[i];
		j++;
	}
	for(i=0;str2[i]!='\0';i++)
	{
		str3[j]	= str2[i];
		j++;
	}
	str3[j] = '\0';
	printf("The concatenated string is %s \n",str3);
	return 0;
}