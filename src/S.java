public class S {
    public  static  void main(String[] kk){
        int[] a= new int[]{12,34,41,23,1,2};
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1; i++){
                if( a[j] > a[j+1]){
                    int k=a[j];
                    a[j] = a[j+1];
                    a[j+1]=k;
                }
            }
        }
        System.out.println(a);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]+" ");
        }
    }
}
