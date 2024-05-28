public class Method{
    void Add(){
        int a =10 ,b =20;
        System.out.println(a+b);
    }

    public static void main(String[] args){
        Method obj = new Method();
        obj.Add();
        obj.dis();

        
    }

    void dis(){
        System.out.println("Welcome to  nsti Dehradun");
    }
}