import java.util.Scanner;
class Mintic2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println ("Por favor introduzca numero de animaciones");
    int A= Integer.parseInt(entrada.nextLine());
    int N=2*A+4;
    double P1=0.2*(3*A+4);
    int P= (int) P1;
    System.out.println(A+" "+N+" "+P);
    boolean a=true;

    if(P<=20 && a){
      System.out.println("uno");
      a=false;
    }
    if(P<=30 && a){
      System.out.println("dos");
      a=false;
    }
    if(P<=50 && a){
      System.out.println("tres");
      a=false;
    }
    if(P>50 && a){
      System.out.println("cuatro");
      a=false;
    }
  }
}
