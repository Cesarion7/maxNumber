
class max{
 
    public static int Intgr(int[] i){
        int a=i[0];
        for (int j=1; j<i.length;j++){
            if (a<i[j]){
                a=i[j];    
            }
        }
        return a;    
    }
}
