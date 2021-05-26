public class MAin {
    public static void main(String[]args){
       final int weght=45;
       final int height=165;

       int F=height-110;
       if(weght<F){
           System.out.println("Набрать вес:"+(F-weght));
       }else {
           System.out.println("Сбросить вес:"+(weght-F));
       }
    }
}
