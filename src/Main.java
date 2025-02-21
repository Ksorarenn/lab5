import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = in.nextDouble();
        System.out.println("Введите b: ");
        double b = in.nextDouble();
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        Calculations s = new Calculations(a,b,x);
        Calculations v = new Calculations(a,b,x);
        Calculations z = new Calculations(a,b,x);
        System.out.printf("Значение первого выражения = %f \n", s.Calc1(x));
        System.out.printf("Значение первого выражения = %f \n", v.Calc2(a,b));
        System.out.printf("Значение первого выражения = %d \n", z.Calc3(a,b,x));
    }
}
class Calculations {
    double a;
    double b;
    double x;
    Calculations(double a, double b, double x){
        this.a = a;
        this.b = b;
        this.x = x;
    }
    public double Calc1(double x){
        return 3.0 * x + 5.0;
    }
    public double Calc2(double a, double b){
        if(a - b == 0){
            return -1;
        }
        else {
            return (a + b)/(a - b);
        }
    }
    public int Calc3(double a, double b, double x){
        int y = (int)((a * x) / b);//факториал должен быть целым числом, поэтому использовано явное приведение;
        if (y == 1 || y == 0){
            return 1;
        }
        else if(y < 0){
            return -1;
        }
        else{
            int result = 1;
            for (int i = 1; i <= y; i++) {
                result = result * i;
            }
            return result;
        }
    }
}
