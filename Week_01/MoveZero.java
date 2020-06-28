/**
 * Project: algorithm011-class01
 * File created at 2020/6/28 22:17
 */

/**
 * 功能描述
 *
 * @author huangbo
 * @version 1.0
 * @type MoveZero
 * @date 2020/6/28 22:17
 */
public class MoveZero {
    public void moveZero1(int[] nums) {
        if (nums == null || nums.length ==0) return;
        int inertPos = 0;
        for (int num : nums) {
            if(num != 0){
                nums[inertPos++] = num;
            }
        }
        while (inertPos < nums.length) {
            nums[inertPos++] = 0;
        }
    }
}
