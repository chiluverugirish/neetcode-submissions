class Solution:
    def firstUniqChar(self, s: str) -> int:
        st={}
        for i in range(len(s)):
            c=st.get(s[i],0)
            st[s[i]]=c+1
        for k,v in st.items():
            if v==1:
                return s.index(k)
        return -1
        