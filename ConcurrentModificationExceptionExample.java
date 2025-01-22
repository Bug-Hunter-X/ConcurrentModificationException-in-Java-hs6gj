public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        for (String str : list) {
            if (str.equals("b")) {
                list.remove(str);
            }
        }
    }
}