
#include <stdio.h>
int main()
{
	int year, month, day;
	int sum_day = 0, leaf = 0;
	int m,d;


	printf("년 월 일 입력 : ");
	scanf("%d %d %d", &year, &month, &day);
	leaf = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	for (m = 1; m < month; m++)
	{
		switch (m)
		{
		case 2:
			d = 28 + leaf;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			d = 31;
			break;
		default:
			d = 30;
		}
		sum_day = sum_day + d;
	}
	sum_day = sum_day + day;

	printf("%d년 %d월 %d일은 %d번째 날입니다.\n", year, month, day, sum_day);
}
