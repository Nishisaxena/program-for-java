class Solution {
    public int largestAltitude(int[] gain) {
      int ar[] = new int [gain.length+1];
      ar [0]= 0;
      for (int i = 1; i<ar.length;i++)
         ar[i] = ar[i-1]+  gain[i-1];
       int max = 0;
       for( int i= 1;i<ar.length;i++)
       {
           if(max<ar[i])
            max=ar[i];
       }
       return max;
    }
}