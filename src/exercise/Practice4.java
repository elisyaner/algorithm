package src.exercise;

import src.datastruct.SingleListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice4 {

    private static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        SingleListNode n1 = new SingleListNode(1);
        SingleListNode n2 = new SingleListNode(2);
        n1.setNext(n2);
        ArrayList<Integer> integers = printByInsertHead(n1);
        System.out.println(Arrays.toString(integers.toArray()));
    }

    public static ArrayList<Integer> printByInsertHead(SingleListNode node) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        SingleListNode head = node;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
//        Collections.reverse(list);
        //翻转函数
        reverse(list);
        return list;
    }

    private static void reverse(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            swap(i, j, list);
            i++;
            j--;
        }
    }

    private static void swap(int i, int j, ArrayList<Integer> list) {
        int tmp = 0;
        tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

    public static ArrayList<Integer> printByRecur(SingleListNode singleListNode) {
        if (singleListNode != null) {
            ArrayList<Integer> list = printByRecur(singleListNode.next);
            list.add(singleListNode.val);
        }
        return list;
    }
}
