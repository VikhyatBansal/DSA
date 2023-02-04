public class addition {
    public int add(int c,int d){
        c = c + d ;
        System.out.println("the addition is:" +c );
        return c;      
    }
    public static void main (String[] args){
        addition java = new addition();
        java.add(3,4);
        
    }
}
