
public class Sigmoid {
  public static void main(String args[]) {
	  double a[] = {0.4,0.2,0.3,0.8,0.7,0.4,1,0.1,-0.1,-0.3,0.9,0.8};
	  for (int i = 0; i < a.length; i ++) {
	  System.out.println(a[i] + ",,,," + (1/( 1 + Math.pow(Math.E,(-1 * a[i])))));
	  }
  }
}
