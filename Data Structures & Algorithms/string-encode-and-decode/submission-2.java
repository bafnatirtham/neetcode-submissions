class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded=new StringBuilder();
        for(String s: strs){
            encoded.append(Integer.toString(s.length()));
            encoded.append('#');
            encoded.append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {

        char[] text=str.toCharArray();
        List<String> decoded = new ArrayList<>();

        int i=0;
        int n=0;
        while(i<str.length()){
            StringBuilder len=new StringBuilder();

            while(text[i] != '#'){
                len.append(text[i]);
                i++;
            }
            if(text[i]=='#'){
                n=Integer.parseInt(len.toString());}
            
            String s=str.substring(i+1,i+1+n);
            decoded.add(s);

            i+=(n+1);
            
        }
        return decoded;

    }
}
