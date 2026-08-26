class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> st1 = new HashMap<>();
        HashMap<Character,Character> st2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(st1.containsKey(a) && st1.get(a)!=b){
                return false;
            }
            if(st2.containsKey(b) && st2.get(b)!=a){
                return false;
            }
            st1.put(a,b);
            st2.put(b,a);
        }
        return true;
    }
}