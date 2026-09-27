class Utils{
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public static int min(int a, int b){
        if(a>b){
            return b;
        }
        return a;
    }

    public static String trimAndUpperClass(String str){
        if(str!=null){
            return str.trim().toUpperCase();
        }else{
            return " ";
        }
    }
}
public class StaticKeyword{
    public static void main(String[] args) {
        System.out.println(Utils.max(1,22));
        System.out.println(Utils.min(2,3));
        Utils.trimAndUpperClass("Hello");
    }
    
}