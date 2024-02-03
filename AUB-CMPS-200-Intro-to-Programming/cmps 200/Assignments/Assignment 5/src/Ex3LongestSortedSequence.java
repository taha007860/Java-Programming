public class Ex3LongestSortedSequence {
    public static void main(String[] args){
        int [] b= {2, 5, 9, 9, 4, 11, -1, 10, 23, 23, 87, 11};
        System.out.println(longestSorted(b));
    } public static int longestSorted(int[] a){
int n=0;
int c=1;
boolean b=true;
int temp=Integer.MIN_VALUE;
if(a.length==0){return 0;}
if(a.length==1){return 1;}
for(int i=n;i<a.length-1;i++){
if(a[i]<=a[i+1]){c++;n=i+1;if(c>temp){temp=c;}}
else{c=1;}}
for(int i=0;i<a.length-1;i++){if(a[i]<a[i+1]){b=false;}}
if(b==true){return 1;}
return temp;}
}
