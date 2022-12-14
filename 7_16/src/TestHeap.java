import java.util.Arrays;

/**
 * @Author 12629
 * @Description：
 */
public class TestHeap {

    public int[] elem;
    public int usedSize;//当前堆当中的有效的元素的数据个数

    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    public TestHeap(int[] arr) {
        elem = arr;
        usedSize = arr.length;
    }


    public void initArray(int[] array) {
        elem = Arrays.copyOf(array,array.length);
        usedSize = elem.length;
    }

    /**
     * 建堆:【大根堆】
     * 时间复杂度：O(n)
     */

    public void createHeap() {
        for (int parent = (usedSize-1-1) / 2; parent >= 0 ; parent--) {
            shiftDown(parent,usedSize);
        }
    }

    /**
     * 实现 向下调整
     * @param parent 每棵子树的根节点的下标
     * @param len 每棵子树的结束位置
     */

    private void shiftDown(int parent ,int len) {
        int child = 2 * parent + 1;
        //最起码是有左孩子
        while (child < len) {
            //判断 左孩子 和 右孩子  谁最大,前提是  必须有  右孩子
            if(child+1 < len && elem[child] < elem[child+1]) {
                child++;//此时 保存了最大值的下标
            }
            if(elem[child] > elem[parent]) {
                swap(elem,child,parent);
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    private void shiftUp(int child) {
        int parent = (child-1) / 2;
        while (child > 0) {
            if(elem[child] > elem[parent]) {
                swap(elem,child,parent);
                child = parent;
                parent = (child-1) / 2;
            }else {
                break;
            }
        }
    }
    private void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * 入队
     * @param x
     */
    public void offer(int x) {
        if(isFull()) {
            elem = Arrays.copyOf(elem,elem.length*2);
        }
        this.elem[usedSize] = x;
        usedSize++;
        shiftUp(usedSize-1);
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    /**
     * 出队
     */
    public int poll() {
        if(isEmpty()) {
            return -1;
        }
        int old = elem[0];
        swap(elem,0,usedSize-1);
        usedSize--;
        shiftDown(0,usedSize);
        return old;
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }
    public static void main(String[] args) {
        int[] arr= {9, 1, 5, 3, 4, 8, 6, 0};
        TestHeap myHeap = new TestHeap(arr);
        System.out.println(Arrays.toString(myHeap.elem));
        myHeap.createHeap();
        System.out.println(Arrays.toString(myHeap.elem));
    }

}