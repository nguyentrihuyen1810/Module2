package _12_Java_Collection_Framework.thuc_hanh.cai_dat_cay_tim_kiem;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
}
