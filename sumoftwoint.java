
public class sumoftwoint {
    public static void main(String[] args)
    {
        int x=15;
        int y=10;
        int sum= x+y;
        int prd=x*y;
        int v1=x/y;
        int v2=y/x;
        int v3=x%y;
        int exp=prd/sum;
        int exp2=(int)Math.pow(2,3);

        System.out.println("Sum of " +x+" and "+y+" is "+sum);
        System.out.println("Product of " +x+" and "+y+" is "+prd);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        //exp xy/x+y
        System.out.println(exp);
        System.out.println("The third power of 2 is "+exp2);;
    }
}
