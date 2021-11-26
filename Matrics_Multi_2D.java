public class Matrics_Multi_2D {
	public static void Matrics_multi(int[][] A, int[][] B) {
		int[][] sum =new  int[3][3];
		System.out.println("Matric A");
	for(int i = 0 ; i<A.length ; i++) {
		for(int j = 0; j<A[i].length; j++) {
		System.out.print(""+A[i][j]+" "); }
		System.out.println("\n"); }
		System.out.println("Matric B");
	for(int i = 0 ; i<B.length ; i++) {
		for(int j = 0; j<B[i].length; j++) {
		System.out.print(""+B[i][j]+" "); }
		System.out.println("\n"); }
		System.out.println("Matric A*B");
		for(int i = 0 ; i<2 ; i++) {	//Control Row
		for(int j = 0; j<2; j++) {      //Control Col
		for(int k = 0  ; k< 3 ; k++) {  //Changer
		sum[i][j] += A[i][k] * B[k][j]; }
		System.out.print(""+sum[i][j]+" "); }
		System.out.println("\n"); }
	}
	public static void main(String[] args) {
		int [][] A ={ {2 , 12 , 4},
			      {6 , 8 , 5},  };
		int [][] B = { {4 , 8},
			       {3 , 5},
			       {7 , 6}  };
		Matrics_multi(A,B); }
	}
