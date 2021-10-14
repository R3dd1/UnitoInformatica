
class Esp{

    public static int som(int x, int y){
        int s = x;
        for (int i = y; i>0; i--){
                s = s+1;
        }
        return s; 
    }

    public static int mol(int x, int y){
        int m = 0;
        for (int i = y; i>0; i--){
                m = som(m,x);
        }
        return m; 
    }

    public static int elevato(int x, int y){
        int e = 1;
        for (int i = y; i>0; i--){
                e = mol(e,x);
        }
        return e; 
    }
    public static void main(String[] args){
        System.out.println(Integer.toString(elevato(2,3)));
    }
}