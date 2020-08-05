import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class WordDictionary {

    WordDictionary[] children;
    boolean isEndOfWord;

    public WordDictionary() {
    	children = new WordDictionary[26];
    	isEndOfWord=false;
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        WordDictionary cur=this;
        for(char c:word.toCharArray())
        {
        	if(cur.children[c-'a']==null)
        		cur.children[c-'a'] = new WordDictionary();
        	cur=cur.children[c-'a'];
        	
        }
        cur.isEndOfWord=true;
    }
    
  
    public boolean search(String word) {
    	WordDictionary cur= this;
    	for( int i=0;i<word.length();++i)
    	{
    		char c=word.charAt(i);
    		if(c=='.')
    		{
    			for(WordDictionary child:cur.children)
    			
    				if(child!=null && child.search(word.substring(i+1))) return true;
    				return false;
    			
    		}
    		
    			if(cur.children[c-'a']==null)
    				return false;
    			cur=cur.children[c-'a'];
    		
    	}
        return (cur!=null && cur.isEndOfWord);
    }
}




// regular Expression approach

class WordDictionary {

    HashSet<String> list;
	/** Initialize your data structure here. */
    public WordDictionary1() {
        this.list = new HashSet<String>();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        if(!list.contains(word))
        	list.add(word);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
    	boolean flag=false;
    	if(this.list.contains(word))
    		flag=true;
    	else {
    		for(String i:list)
   		{
    			if(i.matches(word))
    				flag=true;
   		}
    
    	}
    	
    	return flag;
        
    }
}

