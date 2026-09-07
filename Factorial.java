class Factorial{
    public static long factorial(long n){
        long result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args){
        long n=5;
        long ans=factorial(n);
        System.out.println(ans);
    }
}