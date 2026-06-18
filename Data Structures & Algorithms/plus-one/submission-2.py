class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        st=0
        for i in digits:
            st*=10;
            st+=i;
        st+=1
        st=str(st)
        l=list(st)
        ans=[]
        for i in l:
            ans.append(int(i))
        return ans
        # for i in range(len(digits)):
        #     digits[i]+=1
        # return digits