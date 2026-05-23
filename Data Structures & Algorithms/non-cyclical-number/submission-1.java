class Solution {
    Set<Integer> set=new HashSet<>();
    public boolean isHappy(int n) {
        if(set.contains(n))return false;
        if(n==1)return true;
        int sum=0;
        int num=n;
        while(num!=0){
            sum+=(num%10)*(num%10);
            num=num/10;
        }
        set.add(n);
        return isHappy(sum);

        
    }
}
