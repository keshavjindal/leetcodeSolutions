public class leetcode925 {
    
    public boolean isLongPressedName(String name, String typed) 
    {
        int i = 0;
        int j = 0;
        
        while(i < name.length() && j < typed.length()){
            char ch1 = name.charAt(i);
            char ch2 = typed.charAt(j);
            
            if(ch1 == ch2){
                i++;
                j++;
            }
            else{
                
                if(j - 1 < 0) return false;
                
                char prev = typed.charAt(j - 1);
                
                if(ch2 == prev){
                    j++;
                }
                else{
                    return false;
                }
            }
        }
        
        if(i != name.length()) return false;
        
        while(j < typed.length()){
            if(typed.charAt(j) != typed.charAt(j - 1)){
                return false;
            }
            j++;
        }
        
        return true;
    }
}