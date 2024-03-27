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
    public int factorial(int n){
        int fac = n;
        if(n==1){
            return 1;
        }
        fac*= factorial(n-1);
        return fac;
    }
    public int iFib=0,jFib=0;
    public void fibonacci(int n){
        if(jFib > n)return;
        System.out.print(jFib+" ");
        int temp = iFib+jFib;
        iFib = jFib;
        jFib = temp;
        if(jFib == 0) jFib=1;
        fibonacci(n);
    }
    public int powerOfN(int n, int x){
        if(x==1){
            return n;
        }else if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }
        return n*powerOfN(n, x-1);
    }
    public int powerOFNEven(int n , int x){
        if(n==0)return 0;
        else if(x == 1) return n;
        else if(n== 1) return 1;
        if(x%2 == 0){
            return powerOFNEven(n, x/2)*powerOFNEven(n, x/2);
        }else{
            return powerOFNEven(n, x/2)*powerOFNEven(n, x/2)*n;
        }

    }//Using recursion
    public void towerOfHanoi(int n , String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+ n +" from " + src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+ n +" from " + src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }//Using recursion
    public String reverse(String str,int index){

        return "";
    }//Using recursion
    //Find the 1st & last occurrence of an element in string

    public void findFirstAndLastStringIndex(String str){
        
    }
    //Check if an array is sorted (Strictly Increasing)
    // 12345 true
    // 12344 false
    public boolean isSorted(int[] arr,int size){
        
        return true;
    }
    //Move all 'x' to the end of the string
    public void movingXToEnd(String str){

    }
    //Remove duplicates in a string
    public String removingDuplicatesChar(String str){
        return "";
    }
    //Print all the subsequences of a string 
    // subsequences means take any character but the order will same 
    // like abcde --> ace , ab,bc,de,abe
    public void printingSubsequences(String str){
    }
    /*Print all the unique subsequences of a string
    using set
    HashSet<String> set = new HashSet<>();
    */
    public void printingUniqueSubsequences(String str){

    }
    /*
     * Print keypad combination
     * the old mobile keypad like 
     */
    public void printKeypadCombination(String str){

    }
    public void recurs(int n){
    }
    public static void main(String[] args) {
        ProblemClass obj = new ProblemClass();
        // obj.towerOfHanoi(3,"S","H","D");
        // obj.towerOfHanoi(2,"S","H","D");
        // obj.towerOfHanoi(1,"S","H","D");
    }
}