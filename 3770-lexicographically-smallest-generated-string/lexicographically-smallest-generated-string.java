class Solution {
    public String generateString(String str1, String str2) {
        StringBuilder s=new StringBuilder();
        int n=str1.length();
        int m=str2.length();
        int[] free=new int[m+n-1];
        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='T') s.replace(i,i+m,str2);
            else{
                if(s.length()==i) {
                    s.append('a');
                    free[i]=1;
                }

            }
        }
        int k=s.length();
        for(int i=k;i<m+n-1;i++) {
            free[i]=1;
            s.append('a');
            
        }
        if(!check(s,str1,str2,free)) return "";
        return s.toString();
    }

    public boolean check(StringBuilder s, String s2, String s3, int[] free){
        int m=s3.length();
        for(int i=0;i<s2.length();i++){
            boolean curr=s.substring(i, i+m).toString().equals(s3);
            if(s2.charAt(i)=='T'){
                if(curr) continue;
                else return false;
            }
            else{
                if(!curr) continue;
                else{
                    int fixed=0;
                    for(int j=i+m-1;j>=i;j--){
                        if(free[j]==1){
                            s.replace(j, j+1, s.charAt(j)=='a'?"b":"a");
                            fixed=1;
                            break;
                        }
                    }
                    if(fixed==0) return false;
                }   
            }     
        }
        return true;
    }
}