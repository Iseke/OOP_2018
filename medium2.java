import static java.lang.System.*;
class medium2{
    void checkPrime(int... a){
        for(int i=0;i<a.length;i++){

            if(isPrime(a[i])){
                System.out.print(a[i]+" ");

            }

        }
        System.out.println("");
    }
    boolean isPrime(int a){
        boolean prime = true;
        if(a<2) {
            prime = false;
            return prime;
        }
        for(int i = 2;i<=a/2;i++){
            if(a%i==0){
                prime = false;
                return prime;
            }
        }
        return prime;

    }
}