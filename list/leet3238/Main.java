package list.leet3238;

public class Main {

    public static void main(String[] args) {
        int[] ints = {0};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(ints);
        System.out.println(maxConsecutiveOnes);
    }

    static public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int newCount = 0;

        for (int num : nums) {
            if (num == 1) {
                if (count < ++newCount) {
                    count = newCount;
                }
                continue;
            }

            newCount = 0;
        }

        return count;
    }
}
