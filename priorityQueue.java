import java.util.PriorityQueue;

public class priorityQueue {
    
    //MY CODE:
    //in class exercise
    //numberGame where Alice and Bob take turns removing the min element and adding the removed element to an array
    public int[] numberGame(int[] nums) {
        //initialize returned array
        int[] result = new int[];

        //loop over the array
        for (int i = 0; i < nums.length/2; i++) {

            //collect Alice's number
            int AliceNum = nums.min();
            //remove Alice's number from the array
            nums.remove(AliceNum);

            //collect Bob's number
            int BobNum = nums.min();
            //remove Bob's number from the array
            nums.remove(BobNum);

            //add Bob's number to the result
            result.append(BobNum);
            //add Alice's number to the result
            result.append(AliceNum);
        }

        //return the result
        return result;

    }

    //DR TAN'S CODE:
    public int[] numGame(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] res = new int[arr.length];

        for (int num : arr) {
            queue.add(num);   
        }

        int index = 0;

        while (!queue.isEmpty()) {
            int alice = queue.remove();
            int bob = queue.remove();

            res[index] = bob;
            index++;
            res[index] = alice;
            index++;
        }

        return res;


        //OR:
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }
    }

}
