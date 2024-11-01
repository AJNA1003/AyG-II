package si;

/**
 *
 * @author ABRAHAM
 */
import java.util.Scanner;
import java.lang.Math;
public class SI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int Terminar = 1;
        int n;
        int b;
        System.out.println("Bienvenido");
        while(Terminar == 1){
            System.out.println("Ingrese el numero del programa a probar:");
            int np = lea.nextInt();
            if(np == 1){
                System.out.println("Ingrese el numero: ");
                n = lea.nextInt();
                int signo = signo(n);
                System.out.println("Resultado: "+signo);
            }
            if(np == 2){
                System.out.println("Ingrese el numero de estudiantes: ");
                int Tv = lea.nextInt();
                int v[] = new int[Tv];
                for (int i = 0; i < Tv; i++) {
                    System.out.println("Ingrese la nota del alunmo "+(i+1)+": ");
                    int nota = lea.nextInt();
                    v[i] = nota;
                }
                calificaciones(v,Tv);
            }
            if(np == 3){
                System.out.println("Ingrese el angulo en radianes: ");
                double rad = lea.nextDouble();
                System.out.println("Ingrese la cantidad de terminos de la serie: ");
                int nt = lea.nextInt();
                seno(rad,nt);
            }
            if(np == 4){
                System.out.println("Ingrese el numero: ");
                Long cn = lea.nextLong();
                System.out.println("El numero tiene: "+cifras(cn)+" cifras");
            }
            
            System.out.println("Desea probar otro programa? Ingrese '1' para si, ingrese '0' para deterner el programa:");
            Terminar = lea.nextInt();
        }
    }
    
    
    
    public static int signo(int n){
        int signo = 0;
        if(n > 0){
            signo = 1;
        }
        if(n < 0){
            signo = -1;
        }
        return signo;
    }
    public static void calificaciones(int v[],int Tv){
        int aca,acb,acc,acd;
        aca = acb = acc = acd = 0;
        for (int i = 0; i < Tv; i++) {
            if(v[i]<50){
                aca = aca+1;
            }
            if(v[i]>= 50 && v[i]<70){
                acb = acb+1;
            }
            if(v[i]>=70 && v[i]<80) {
                acc = acc+1;
            }
            if(v[i]>=80){
                acd = acd+1;
            }
        }
        System.out.println("Alunmos con menos de 50: "+aca);
        System.out.println("Alunmos con almenos de 50 y menos de 70: "+acb);
        System.out.println("Alunmos con menos de 80 y almenos 70: "+acc);
        System.out.println("Alunmos con almenos 80: "+acd);
    } 
    public static void seno(double rad,int nt){
        double acangulo = 0;
        for (int i = 0; i < nt; i++) {
            int ti = 1+(i*2);
            acangulo = acangulo + ((Math.pow(-1,i)) * ((Math.pow(rad,ti))/factorial(ti)));
            System.out.println(acangulo);
            System.out.println(factorial(ti));
        }
        System.out.println("Seno aproximado del angulo es: "+acangulo);
    }
    public static long factorial(int nf){
            long fact = 1;
            for (int i = 1; i <= nf; i++) {
                fact = fact * i;
            }
            return fact;
    }
    public static int cifras(Long n){
            int nc = 1;
            boolean proceso = true;
            while(proceso){
                if(n >= 10){
                    n = n / 10;
                    nc = nc + 1;
                }else{
                    proceso = false;
                }
            }
            return nc;
    }
}   
