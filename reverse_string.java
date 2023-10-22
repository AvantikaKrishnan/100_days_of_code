class Solution {
    public String reverseWords(String s) {
          s = s.trim();
       s = s.replaceAll("  +" ," ");
       String arr[] = s.split(" ");

       int low = 0;
       int high =  arr.length-1;
       while(low<=high)
       {
           String temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           low++;
           high--;
       }

       String newstr = String.join(" ", arr);
       return (newstr);


        
    }
}
