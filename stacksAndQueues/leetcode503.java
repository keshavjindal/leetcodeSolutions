import java.util.Stack;

public class leetcode503 {
    
    public int[] nextGreaterElements(int[] arr){

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        int n = arr.length;

        int[] result = new int[arr.length];

        for(int i=1; i<2*arr.length; i++){

            while(stack.size() > 0 && arr[i % n] > arr[stack.peek()]){
                result[stack.peek()] = arr[i % n];
                stack.pop();
            }

            if(i < n) stack.push(i);
        }

        while(stack.size() > 0){
            result[stack.peek()] = -1;
            stack.pop();
        }

        return result;
    }

}