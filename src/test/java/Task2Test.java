import com.company.task2.Task2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task2Test {

    private List<Integer> listEmpty;
    private List<Integer> list3inARowReps;
    private List<Integer> listReps;

    @Before
    public void init() {
        listEmpty = new LinkedList<Integer>();
        list3inARowReps = new LinkedList<Integer>(Arrays.asList(3, 3, 3, 4, 5, 5, 5, 5, 2, 1, 1, 1, 1));
        listReps = new LinkedList<Integer>(Arrays.asList(3, 2, 3, 4, 5, 4, 6, 5, 2, 1, 6, 2, 1));
    }

    @Test
    public void remove3andMoreNumberInARow_listEmpty() {
        Task2.remove3andMoreNumberInARow(listEmpty);
        List<Integer> listExpected = new LinkedList<Integer>();

        Assert.assertEquals(listExpected, listEmpty);

    }

    @Test
    public void remove3andMoreNumberInARow_list3inARowReps() {

        Task2.remove3andMoreNumberInARow(list3inARowReps);
        List<Integer> listExpected = Arrays.asList(4, 2);

        Assert.assertEquals(listExpected, list3inARowReps);

    }

    @Test
    public void remove3andMoreNumberInARow_listReps() {

        Task2.remove3andMoreNumber(listReps);
        List<Integer> listExpected = Arrays.asList(3, 3, 4, 5, 4, 6, 5, 1, 6, 1);

        Assert.assertEquals(listExpected, listReps);

    }

}
