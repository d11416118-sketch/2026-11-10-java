public class A1 {

    public static void main(String[] args) {
        int[] a=new int[4];
        int[] b=new int[4];
        int x=5319,y=9345;
        int flag ;
        cut(x,a);
        cut(x,b);
       
        flag=compare(a, b);
        if (flag==1) 
         System.out.printf("flag=%d is repated\n",flag,x ) ;
    } 
        public static void cut(int x,int[] a) {
            a[3]=x%10;
            a[2]=(x/10)%10;
            a[1]=(x/100)%10;
            a[0]=(x/1000)%10;
        }
   
        public static int compare(int[] a,int[] b) {
            int flag=0;
            for(int i=0;i<a.length;i++){ 
                for(int j=0;j<b.length;j++){
                    if(i==j){
                        if(a[i]==b[j]){
                            flag = 1 ;
                        }
                    
                    }
                }
            }
            return flag;
        }

    
}