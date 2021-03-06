package hanoi;

public class ha {


	char pillar[][] = {{'1','2','3'}, {' ',' ',' '}, {' ',' ',' '}};

	void print_pillar()
	{
	  int i, j;
	  for (i = 0; i < 3; i++)
	    {
	      for (j = 0; j < 3; j++)
	    	  System.out.print(pillar[i][j]+" ");
	    }
	  System.out.println();
	}

	void relocate_pillar(int a, int c)
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

	void hanoi(int n, int a, int b, int c)
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

	


}
