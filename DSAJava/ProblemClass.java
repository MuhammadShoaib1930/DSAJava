package DSAJava;

import java.util.HashSet;

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
    public void  reverse(String str,int index){
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverse(str, index-1);
    }//Using recursion
    //Find the 1st & last occurrence of an element in string
    public int first = -1;
    public int last = -1;
    public void findFirstAndLastStringIndex(String str,int index, char element){
        if(index == str.length()){
            System.out.println(first+" "+last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first ==-1){
                first = index;
            }else{
                last = index;
            }
        }
        findFirstAndLastStringIndex(str, index+1, element);
    }
    //Check if an array is sorted (Strictly Increasing)
    // 12345 true
    // 12344 false
    public boolean isSorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return isSorted(arr, index+1);
        }else{
            return false;
        }
    }
    //Move all 'x' to the end of the string
    public void movingXToEnd(String str, int index, int count, String newString){
        if(index == str.length()){
            for(int i= 0; i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar= str.charAt(index);
        if(currChar=='x'){
            count++;
            movingXToEnd(str, index+1, count, newString);
        }else{
            newString += currChar;
            movingXToEnd(str, index+1, count, newString);
        }
    }
    //Remove duplicates in a string
    public static boolean[] map=new boolean[26];
    public void removingDuplicatesChar(String str,int index,String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar-'a']==true){
            removingDuplicatesChar(str, index+1, newString);
        }else{
            newString +=currChar;
            map[currChar-'a']= true;
            removingDuplicatesChar(str, index+1, newString);
        }
    }
    //Print all the subsequences of a string 
    // subsequences means take any character but the order will same 
    // like abcde --> ace , ab,bc,de,abe
    public void printingSubsequences(String str,int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        printingSubsequences(str, index+1, newString+currChar);
        printingSubsequences(str, index+1, newString);
    }
    /*Print all the unique subsequences of a string
    using set
    HashSet<String> set = new HashSet<>();
    */
    public void printingUniqueSubsequences(String str,int index,String newString,HashSet<String> set){

        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(index);
        printingUniqueSubsequences(str, index+1, newString+currChar,set);
        printingUniqueSubsequences(str, index+1, newString,set);
        
    }
    /*
     * Print keypad combination
     * the old mobile keypad like 
     */
    public static String[]  keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public void printKeypadCombination(String str,int index,String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar-'0'];
        for(int i = 0; i<mapping.length();i++){
            printKeypadCombination(str, index+1, combination+mapping.charAt(i));
        }
    }
    public void indexOfFirstAndLast(String str,int index, char element){
        if(index == str.length()|| str.charAt(index)==element){
            System.out.println(index+" "+(str.length()-1));
            return;
        }
        indexOfFirstAndLast(str, index+1, element);
    }
    public void indexOFFAndL(String str, int index, String newStr, int count){
        if(index == str.length()){
            for(int i= 0 ;i < count;i++){
                newStr = newStr+'x';
            }
            System.out.println(newStr);
            return;
        }
        if(str.charAt(index)=='x'){
            count=count+1;
        }else{
            newStr = newStr+str.charAt(index);
        }
        indexOFFAndL(str, index+1, newStr, count);
    }
    // Print all Permutations of a String 
    // all possible combination of letters
    // example of abc -> abc , acb ,bac , bca,cab,cab
    public void permutationsString(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr= str.substring(0, i)+str.substring(i+1);
            permutationsString(newStr,permutation+currChar );
        }
    }
    //Count total paths in a maze to move from (0,0) to (n,m)
    public int countPath(int i , int j , int n, int m){
        if(i ==n || j==m){
            return 0;
        }
        if(i==n-1 && j == m-1){
            return 1;
        }
        int downPath = countPath(i+1, j, n, m);
        int rightPath = countPath(i, j+1, n, m);
        return downPath+rightPath;
    }
    public void backTracing(String str,int index , char ch,boolean isTrue){
        if(index == str.length()){
            return;
        }
        char currChar = str.charAt(index);
        System.out.print(currChar+" ");
        if(currChar == ch && isTrue == false){
            backTracing(str, 0, ch, true);
        }
        backTracing(str, index+1, ch, isTrue);
    }
    public int gCD(int a, int b){
        if(a==0){
            return b;
        }if(b == 0){
            return a;
        }
        if(a<b){
            return gCD(a, b-a);
        }else{
            return gCD(a-b, b);
        }
    }
    public static void main(String[] args) {
        ProblemClass obj = new ProblemClass();
        HashSet<String> set = new HashSet<>();
        System.out.println(obj.gCD(20, 10));
        // obj.towerOfHanoi(3,"S","H","D");
        // obj.towerOfHanoi(2,"S","H","D");
        // obj.towerOfHanoi(1,"S","H","D");
    }
}