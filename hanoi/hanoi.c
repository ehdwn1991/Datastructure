#include <stdio.h>

char pillar[3][3] = {{'1','2','3'}, {' ',' ',' '}, {' ',' ',' '}};

void print_pillar()
{
  int i, j;
  for (i = 0; i < 3; i++)
    {
      for (j = 0; j < 3; j++)
	printf("%c ", pillar[i][j]);
      printf("\t");
    }
  printf("\n");
}

void relocate_pillar(char a, char c)
{
  int i, j;
  for (i = 0; i < 3; i++)
    if (pillar[a][i] != ' ') break;
	
  for (j = 0; j < 3; j++)
    if (pillar[c][j] != ' ') break;

  if (j != 0) j--;

  pillar[c][j] = pillar[a][i];
  pillar[a][i] = ' ';
}

int hanoi(int n, char a, char b, char c)
{
  int i,j;
  if (n == 1)
    {
      relocate_pillar(a,c);
      print_pillar();
    } 
  else
    {
      hanoi(n-1, a, c, b);
      relocate_pillar(a,c);
      print_pillar();
      hanoi(n-1, b, a, c);
    }
}

int main(void)
{
  print_pillar();
  hanoi(3, 0, 1, 2);
  return 0;
}
