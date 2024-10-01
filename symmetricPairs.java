
public class symmetricPairs {
    //given an array of pairs, return the pairs that have symmetric pairs
    public static void findSymPairs(int arr[][]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int sec = arr[i][1];

            Integer val = hm.get(sec);

            if (val != null && val == first) {
                System.out.println(sec + " " + first);
            } else {
                hm.put(first, sec);
            }
        }
    }
}
