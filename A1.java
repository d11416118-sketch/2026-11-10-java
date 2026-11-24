public class A1 {

    /**
     * 主程式：把同一個數字 x 拆位後放進 a、b 兩個陣列，呼叫 compare() 比對，結果為 1 時印出訊息。
     */
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
        /**
         * 把四位數 x 拆成各位數字存入陣列：
         * a[0] 千位、a[1] 百位、a[2] 十位、a[3] 個位。
         */
        public static void cut(int x,int[] a) {
            a[3]=x%10;
            a[2]=(x/10)%10;
            a[1]=(x/100)%10;
            a[0]=(x/1000)%10;
        }
   
        /**
         * 逐位比較兩個陣列「相同位置」的數字，只要有任一位相同就回傳 1，否則回傳 0。
         */
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