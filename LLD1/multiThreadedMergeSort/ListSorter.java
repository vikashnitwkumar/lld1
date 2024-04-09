
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ListSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;
    ExecutorService executorService;

    ListSorter(List<Integer> listToSort, ExecutorService executorService) {
        this.listToSort = listToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        int n = listToSort.size();
        if (n <= 1) {
            return listToSort;
        }
        int mid = n / 2;
        List<Integer> beforeMidList = new ArrayList<>(listToSort.subList(0, mid));
        List<Integer> afterMidList = new ArrayList<>(listToSort.subList(mid, n));
        Future<List<Integer>> beforeMidFuture = executorService.submit(new ListSorter(beforeMidList, executorService));
        Future<List<Integer>> afterMidFuture = executorService.submit(new ListSorter(afterMidList, executorService));
        List<Integer> beforeMidSorted = beforeMidFuture.get();
        List<Integer> afterMidSorted = afterMidFuture.get();
        return merge(beforeMidSorted, afterMidSorted);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }
        while (i < left.size()) {
            result.add(left.get(i++));
        }
        while (j < right.size()) {
            result.add(right.get(j++));
        }
        return result;
    }
}