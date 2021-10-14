
class Fattoriale{

    public static int fatt(int n){
        int f; 
        if (n == 0){
           f = 1;
        }else{
            f = n * fatt(n-1);
        }
        return f;
    }
    public static void main(String[] args){
        System.out.println(Integer.toString(fatt(3)));
    }
}