public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if((nums[i]+nums[j]+nums[k]+nums[l]) == target){
                            List<Integer> a = new ArrayList<>();
                            a.add(nums[i]);
                            a.add(nums[j]);
                            a.add(nums[k]);
                            a.add(nums[l]);
                            Collections.sort(a);
                            if(!set.contains(a)){
                                set.add(a);
                                list.add(a);
                            }
                        }
                    }
                }
            }
        }
        
        return list;
    }
