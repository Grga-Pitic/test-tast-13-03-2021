import com.company.task1.Node;
import com.company.task1.Task1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1Test {

    Node emptyTree;
    Node nodeWithHeight3;

    @Before
    public void init() {
        emptyTree = new Node();
        nodeWithHeight3 = (new Node()).addChild(new Node()).addChild(new Node());
        nodeWithHeight3.addChild(new Node()).addChild(new Node());
    }

    @Test
    public void getChildsMaxHeight_emptyTree() {
        int height = Task1.getTreeHeight(emptyTree);

        Assert.assertEquals(1, height);
    }

    @Test
    public void getChildsMaxHeight_nodeWithHeight3() {
        int height = Task1.getTreeHeight(nodeWithHeight3);

        Assert.assertEquals(3, height);
    }

    @Test(expected = NullPointerException.class)
    public void getChildsMaxHeight_null() {
        Task1.getTreeHeight(null);
    }

}
