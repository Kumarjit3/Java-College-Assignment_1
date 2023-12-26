public class Question10 
{
    public static void main(String[] args)
    {
        int data1=6;
        int i1 = 3;
        //Integer wraper class methods
        System.out.print("\nMax value in between("+data1+","+i1+") is : "+Integer.max(data1,i1));
        System.out.print("\nMin value in between("+data1+","+i1+") is : "+Integer.min(data1,i1));
        System.out.print("\nCompareing "+data1+" and "+i1+" : "+Integer.compare(10,10));
        Integer.toString(data1);
        System.out.print("\nSum of "+data1+" and "+i1+" = "+Integer.sum(data1,i1)+"\n\n");


        char c = 'k';
        char c1 = 'C';
        //Character wraper class methods
        System.out.print("\nConverting "+c+" into uppercase : "+Character.toUpperCase(c));
        System.out.print("\nConverting "+c1+" into lowercase : "+Character.toLowerCase(c1));
        System.out.print("\nCompareing "+c+" and "+c1+" : "+Character.compare(c,c1));
        System.out.print("\n"+c+" is digit or not : "+Character.isDigit(c)+"\n\n");


        boolean b = true;
        boolean b1 = false;
        //Boolean wraper class methods
        System.out.print("\nCompareing "+b+" and "+b1+" : "+Boolean.compare(b,b1));
        System.out.print("\nConverting string \"true\" into boolean : " +Boolean.parseBoolean("true")+"\n\n");


        double d = 20.23456;
        double d1 = 13.3334534;
        //Double wraper class methods
        System.out.print("\nConverting string \"kumar\" into Double : " +Double.parseDouble("kumar"));
        System.out.print("\nMax value in between("+d+","+d1+") is : "+Double.max(d,d1));
        System.out.print("\nMin value in between("+d+","+d1+") is : "+Double.min(d,d1));
        System.out.print("\nSum of "+d+" and "+d1+" = "+Double.sum(d,d1));
        System.out.print("\nCompareing "+d+" and "+d1+" : "+Double.compare(d1,d));


        float f = 2.3f;
        float f1 = 3.35f;
        //Float wraper class methods
        System.out.print("\nConverting string \"123\" into Float : " +Float.parseFloat("123"));
        System.out.print("\nSum of "+f+" and "+f1+" = "+Float.sum(f,f1));
        System.out.print("\nCompareing "+f1+" and "+f+" : "+Float.compare(f1,f));
        System.out.print("\nMax value in between("+d+","+d1+") is : "+Float.max(f,f1));
        System.out.print("\nMin value in between("+d+","+d1+") is : "+Float.min(f,f1)+"\n\n");

    }
}

