public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m;
        int mcd;
        int mab=min(a,b);
        if(c<d) mcd=c;
        else mcd=d;
        if(mcd<mab) m=mcd;
        else m=mab;
        return(m);
    }

    public static int min(int a, int b) {
        int m;
        if(a<b) m=a;
        else m=b;
        return(m);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1,2,3,4));
    }
}