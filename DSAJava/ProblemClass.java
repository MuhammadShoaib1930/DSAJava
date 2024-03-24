package DSAJava;
/**
 * ProblemClass
 */
public class ProblemClass {
    public void countDisbanding(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        countDisbanding(n-1);
    }
    public void countAscending(int n){
        if(n==0){
            return;
        }
        countAscending(n-1);
        System.out.print(n+" ");
    }
    public int sumOfNaturalNumber(int n){
        int sum = n;
        if(n==0){
            return n; 
        }
        sum += sumOfNaturalNumber(n-1);
        return sum;
    }
}