import static java.lang.Math.*;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {

        float y = 0;

       
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число х: ");
        float x = in.nextFloat();

        if(x<=-1/2){
            y = (float) ((-pow(x,5)) + log(abs((pow(3,x)) - pow(abs(x),-x))));
        }

        else if ((x<1/2)&(x>(-1/2))){
            y = (float) tan(x/1-pow(x,2));
        }

        else{
            y = (float) acos((1/4*x));
        }
        System.out.println(y);
    }
}