public class Main {

    public static void main(String[] args) {
        Integer a=Integer.valueOf(args[0]);
        Integer b=Integer.valueOf(args[1]);
        Integer c=Integer.valueOf(args[2]);
        Integer d=Integer.valueOf(args[3]);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        Double g=4*Math.PI*(a*a/(b*(c+d)));
        System.out.println(g);
    }

}

