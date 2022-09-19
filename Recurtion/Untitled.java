public class Untitled {
        public List<Integer> spiralOrder(int[][] matrix) {
            int start_row=0;
            int end_row=matrix.length-1;
            
            int start_column=0;
            int end_column=matrix[0].length-1;
            
            int total=matrix.length*matrix[0].length;
            int count=0;
            
            List<Integer> ans = new LinkedList<>();
            
            while(count<=total)
            {
                
                for(int i=start_column;i<=end_column;i++)
                {    
                    ans.add(matrix[start_row][i]);
                    count++;
                }
                 start_row++;
                
                for(int i=start_row;i<=end_row;i++)
                {
                    ans.add(matrix[i][end_column]);
                    count++;
                }
                end_column--;
                
                for(int i=end_column;i>=start_column;i--)
                {    ans.add(matrix[end_row][i]);
                    count++;
                }
                end_row--;
                
                for(int i=end_row;i>=start_row;i--)
                {
                    ans.add(matrix[i][start_column]);
                    count++;
                }
                start_column++;
            }
            return ans;
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}
