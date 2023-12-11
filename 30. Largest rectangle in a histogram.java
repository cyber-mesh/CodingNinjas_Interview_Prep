import java.util.ArrayList;

public class Solution {
  public static int largestRectangle(ArrayList < Integer > heights) {
    int area, max=0;
    for(int i=0; i< heights.size(); i++)
    {
      int c=0;
      area=1;
      for(int j=i+1; j< heights.size(); j++)
      {
        if(heights.get(j) >= heights.get(i))
          c++;
        else
          break;
      }
      for(int j=i; j>=0; j--)
      {
        if(heights.get(j) >= heights.get(i))
          c++;
        else
          break;
      }
      area= heights.get(i) * c;
      if(area> max)
        max=area; 
    }
    return max;
  }
}
