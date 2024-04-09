
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) {
        System.out.println("hello there");
        List<Integer> listToSort;
        listToSort = List.of(4, 5, 2, 47, 0, 1, 2, 11, 9, 12, 14, 10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedArrayListFuture = executorService.submit(new ListSorter(listToSort, executorService));
        try {
            List<Integer> sortedArrayList = sortedArrayListFuture.get();
            for (int i : sortedArrayList) {
                System.out.print(i + " ");
            }
            executorService.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("sorting completed");
        System.out.println("Hi there");
    }
}