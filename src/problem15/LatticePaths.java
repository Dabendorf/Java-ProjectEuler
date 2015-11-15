package problem15;

public class LatticePaths {

	public static void main(String[] args) {
		int x=20,y=x;
		long[][] zellen = new long[x+1][y+1];
		 
		for(int i=0;i<x;i++) {
		    zellen[i][x] = 1;
		    zellen[x][i] = 1;
		}
		for(int i=x-1;i>=0;i--) {
		    for(int j=y-1;j>=0;j--) {
		        zellen[i][j] = zellen[i+1][j] + zellen[i][j+1];
		    }
		}
		System.out.println(zellen[0][0]);
	}
	//Antwort: 137846528820
}