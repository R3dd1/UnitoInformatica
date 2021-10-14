
class SommaR{

    public static int som(int x,int y){
        int s; 
        if (y == 0){ 
            s = x;
        }else{
           s = som(x, y-1) + 1;
        }
        return s; 
    }
    public static void main(String[] args){
        System.out.println(Integer.toString(som(2,3)));
    }
}