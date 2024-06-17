public class Java0 {
    public void add(int a,int b){
        int sum=a+b;
        System.out.println("Sum of: "+sum);
    }  

}
class Java1 extends Java0{

    public void add(int a,int b){
        
        System.out.println("Sum of: "+(a+b));
    }
    public static void main(String[] args) {
        System.out.println("starting java code..");
        Java1 j1=new Java1();
        j1.add(10,20);
        Java0 j=new Java0();
        j.add(4, 5);
    }
}
