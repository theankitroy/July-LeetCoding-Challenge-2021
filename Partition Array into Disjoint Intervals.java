    class Solution {
        public int partitionDisjoint(int[] nums) {
            int[] arr=new int[nums.length];
            arr[nums.length-1]=nums[nums.length-1];

            for(int i=nums.length-2;i>=0;i--){
                int temp=Math.min(arr[i+1],nums[i]);
                    arr[i]=temp;
            }

            int omax=Integer.MIN_VALUE;

            for(int i=0;i<nums.length-1;i++){
                omax=Math.max(omax,nums[i]);
                if(omax<=arr[i+1]) return i+1;
            }
            return 0;
        }
    }
