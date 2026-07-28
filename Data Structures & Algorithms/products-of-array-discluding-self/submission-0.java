class Solution {
    public int[] productExceptSelf(int[] nums) {

                int len = nums.length;

                    if (len <= 1)
                            return nums;

                                int[] pre = new int[len];
                                    int[] suf = new int[len];

                                        // Prefix products
                                            pre[0] = 1;
                                                int preProduct = 1;

                                                    for (int i = 1; i < len; i++) {
                                                            preProduct *= nums[i - 1];
                                                                    pre[i] = preProduct;
                                                                        }

                                                                            // Suffix products
                                                                                suf[len - 1] = 1;
                                                                                    int sufProduct = 1;

                                                                                        for (int i = len - 2; i >= 0; i--) {
                                                                                                sufProduct *= nums[i + 1];
                                                                                                        suf[i] = sufProduct;
                                                                                                            }

                                                                                                                // Final answer
                                                                                                                    int[] res = new int[len];

                                                                                                                        for (int i = 0; i < len; i++) {
                                                                                                                                res[i] = pre[i] * suf[i];
                                                                                                                                    }

                                                                                                                                        return res;
                                                                                                                                        }
        }
        
