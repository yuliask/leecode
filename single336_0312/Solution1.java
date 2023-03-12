class Solution {
	public boolean gk(char ab) {
    	char[] aa= {'a','e','i','o','u'};
    	for(int i=0;i<5;i++)if(ab==aa[i])return true;
    	return false;
	}
    public int vowelStrings(String[] words, int left, int right) {
    	int ret=0;
    	for(int i=left;i<=right;i++) {
    		if(gk(words[i].charAt(0))&&gk(words[i].charAt(words[i].length()-1)))ret++;
    		
    		
    	}
    	return ret;
    }    
    
    
}