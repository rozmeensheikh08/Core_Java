package Methods;


public class MethodOverloading {
    static class Calculate{
        int add(int a ,int b){
           return a + b ;
    }

    double add( double a , double b){
        return a + b;
        }
        int add(int a , int b, int c){
            return  a + b + c ;

        }
        double add( double a, double b, double c){
            return a + b + c;
        }
    }

    public static void main(String[] args) {

        Calculate result = new Calculate();
        int sum = result.add(5,6);
        System.out.println(sum);

        Calculate result2 = new Calculate();
        double sum2 = result2.add(5.6, 2.5);
        System.out.println(sum2);

        Calculate result3 = new Calculate();
        int sum3 = result3.add(4,3, 2);
        System.out.println(sum3);

        Calculate result4 = new Calculate();
        double sum4 = result4.add(2.5,6.1, 3.2);
        System.out.println(sum4);

    }
}
