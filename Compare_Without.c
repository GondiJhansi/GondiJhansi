#include<stdio.h>
int main()
{
	int i,j,flag=0;
	char str1[50],str2[50];
	printf("Enter 1st string:\n");
	gets(str1);
	printf("Enter 2nd string:\n");
	gets(str2);
	for(i=0,j=0;str1[i]!='\0' && str2[i]!='\0';i++,j++)
	{
		if(str1[i] != str2[i])
		{
			flag++;
			break;
		}		
	}
	if(flag==0)
		printf("Two strings are equal\n");
	else
		printf("Two strings are not equal\n");
	return 0;
	
}