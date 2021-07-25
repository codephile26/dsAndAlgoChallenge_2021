class SortArray {
    public int[] sortArray(int[] nums) {
       ArrayList<Integer> numList = new ArrayList<>();
       for (int i = 0; i < nums.length; i++){
           numList.add(nums[i]);
       }
       sortHelper(numList);
       int [] result = new int[nums.length];
       int index = 0;
       for(int num:numList){
          result[index++] = num;
       }
       return result;
    }
    
    private void sortHelper(List<Integer> nums){
        if (nums.size() == 1){
            return;
        }
        int lastIndex = nums.size() - 1;
        int lastElement = nums.remove(lastIndex);
        sortHelper(nums);
        insert(nums,lastElement);
    }
    
    private void insert(List<Integer> nums, int temp){
        if (nums.size() == 0 || nums.get(nums.size() - 1) <= temp){
            nums.add(temp);
            return;
        }
        int lastIndex = nums.size() - 1;
        int lastElement = nums.remove(lastIndex);
        insert(nums,temp);
        nums.add(lastElement);
    }
}