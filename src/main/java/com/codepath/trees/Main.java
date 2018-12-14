package main.java.com.codepath.trees;

import main.java.com.codepath.objects.TreeNode;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TreeProblems treeProblems = new TreeProblems();

        TreeNode<Integer> root = new TreeNode<Integer>(5);
        TreeNode<Integer> three = new TreeNode<Integer>(3);
        TreeNode<Integer> eight = new TreeNode<Integer>(8);
        TreeNode<Integer> two = new TreeNode<Integer>(2);
        TreeNode<Integer> four = new TreeNode<Integer>(4);
        TreeNode<Integer> seven = new TreeNode<Integer>(7);

        root.setLeft(three);
        root.setRight(eight);

        three.setLeft(two);
        three.setRight(four);

        eight.setLeft(seven);

        TreeNode<Integer> twenty = new TreeNode<Integer>(20);
        TreeNode<Integer> ten = new TreeNode<Integer>(10);
        TreeNode<Integer> twentyfive = new TreeNode<Integer>(25);

        eight.setRight(twenty);

        twenty.setLeft(ten);
        twenty.setRight(twentyfive);

        TreeNode<Integer> zero = new TreeNode<Integer>(0);

//        System.out.print("Inorder traversal using stack: "); treeProblems.inOrderIterTraversal(root);
//        System.out.println();
//        System.out.println("Answer for isBstInOrderPrevious: " + treeProblems.isBstInOrderPrevious(root));
//        System.out.println("Answer for isBstInOrderList: " + treeProblems.isBstInOrderList(root));
//        System.out.println("Answer for isBstIterInOrderStack: " + treeProblems.IsBstInOrderIterStack(root));

//        System.out.print("Pre Order Traversal Recursively: ");
//        treeProblems.preOrderRecTraversal(root);
//        System.out.println();
//        System.out.print("Pre Order Traversal Iteratively: ");
//        treeProblems.preOrderRecTraversal(root);


        System.out.print("Post Order Traversal Recursively: ");
        treeProblems.postOrderRecTraversal(root);
        System.out.println();
        System.out.print("Post Order Traversal Iteratively: ");
        treeProblems.postOrderIterTraversal2Stacks(root);
        System.out.println();

//        System.out.print("in order traversal: ");
//        treeProblems.inOrderRecTraversal(root);
//
//        System.out.println("Kth Smallest: " + treeProblems.findKthSmallest(root, 5));

//        int[] a = {2, 3, 4, 5, 7, 8, 20};
//        TreeNode<Integer> result = treeProblems.buildBst(a);
//        System.out.print("Convert array to Bst: ");
//        treeProblems.inOrderRecTraversal(result);
//        System.out.println();
//
//        int[] a1 = {1, 2, 3};
//        TreeNode<Integer> result1 = treeProblems.buildBst(a1);
//        System.out.print("Convert array to Bst: ");
//        treeProblems.inOrderRecTraversal(result1);
//        System.out.println();


//        TreeNode<Integer> root1 = new TreeNode<Integer>(5);
//        TreeNode<Integer> three1 = new TreeNode<Integer>(3);
//        TreeNode<Integer> six1 = new TreeNode<Integer>(6);
//        TreeNode<Integer> two1 = new TreeNode<Integer>(2);
//        TreeNode<Integer> four1 = new TreeNode<Integer>(4);
//
//        root1.setLeft(three1);
//        root1.setRight(six1);
//
//        three1.setLeft(two1);
//        three1.setRight(four1);
//
//        TreeNode<Integer> root2 = new TreeNode<Integer>(5);
//        TreeNode<Integer> three2 = new TreeNode<Integer>(3);
//        TreeNode<Integer> seven2 = new TreeNode<Integer>(7);
//        TreeNode<Integer> two2 = new TreeNode<Integer>(2);
//        TreeNode<Integer> four2 = new TreeNode<Integer>(4);
//
//        TreeNode<Integer> six2 = new TreeNode<Integer>(6);
//
//        root2.setLeft(three2);
//        root2.setRight(seven2);
//
//        three2.setLeft(two2);
//        three2.setRight(four2);
//
//        seven2.setLeft(six2);
//
//        System.out.println(treeProblems.isBst())
////
////        System.out.println(treeProblems.compareTrees(root, root1));
////        System.out.println(treeProblems.compareTrees(root, root2));
////
////        /* Path Sum */
//        TreeNode<Integer> psRoot5 = new TreeNode<Integer>(5);
//        TreeNode<Integer> psRoot4 = new TreeNode<Integer>(4);
//        TreeNode<Integer> psRoot8 = new TreeNode<Integer>(8);
//        TreeNode<Integer> psRoot11 = new TreeNode<Integer>(11);
//        TreeNode<Integer> psRoot13= new TreeNode<Integer>(13);
//        TreeNode<Integer> psRootOther4= new TreeNode<Integer>(4);
//        TreeNode<Integer> psRoot7= new TreeNode<Integer>(7);
//        TreeNode<Integer> psRoot2= new TreeNode<Integer>(2);
//        TreeNode<Integer> psRootOther5 = new TreeNode<Integer>(5);
//        TreeNode<Integer> psRoot1= new TreeNode<Integer>(1);
//
//        psRoot5.setLeft(psRoot4);
//        psRoot5.setRight(psRoot8);
//
//        psRoot4.setLeft(psRoot11);
//
//        psRoot8.setLeft(psRoot13);
//        psRoot8.setRight(psRootOther4);
//
//        psRoot11.setLeft(psRoot7);
//        psRoot11.setRight(psRoot2);
//
//        psRootOther4.setLeft(psRootOther5);
//        psRootOther4.setRight(psRoot1);
//
//        //System.out.println("PathSum="+treeProblems.findPathsThatSumWithBFS(psRoot5, 22));
//        //System.out.println("PathSum="+treeProblems.pathSumWithDfs(psRoot5, 22));
//        //System.out.println(treeProblems.findPathsThatSumWithDfs(psRoot5, 22));
//        ArrayList<ArrayList<TreeProblems.TreeCell>> output = treeProblems.findPathsThatSumWithBFS(psRoot5, 22);
//
//        System.out.println(output);
//
//        /* Path Sum */
////        TreeNode<Integer> lvRoot5 = new TreeNode<Integer>(5);
////        TreeNode<Integer> lvRoot4 = new TreeNode<Integer>(4);
////        TreeNode<Integer> lvRoot4_1 = new TreeNode<Integer>(4);
////        TreeNode<Integer> lvRoot4_2 = new TreeNode<Integer>(4);
////        TreeNode<Integer> lvRoot5_1 = new TreeNode<Integer>(5);
////        TreeNode<Integer> lvRoot5_2 = new TreeNode<Integer>(5);
////        TreeNode<Integer> lvRoot5_3 = new TreeNode<Integer>(5);
////        TreeNode<Integer> lvRoot5_4 = new TreeNode<Integer>(5);
////
////        lvRoot5.setLeft(lvRoot4);
////        lvRoot5.setRight(lvRoot5_1);
////
////        lvRoot4.setLeft(lvRoot4_1);
////        lvRoot4.setRight(lvRoot4_2);
////
////
////        lvRoot5_1.setRight(lvRoot5_2);
////
////        lvRoot5_2.setLeft(lvRoot5_3);
////        lvRoot5_2.setRight(lvRoot5_4);
//
//
//
////        System.out.println(treeProblems.longestUniValue(lvRoot5));
////
////        System.out.println(treeProblems.findLongestPath(lvRoot5));
////
////        System.out.println(treeProblems.leetCodeSolution(lvRoot5));
//
//
////        ArrayList<TreeNode<Integer>> original = new ArrayList<>();
////        original.add(new TreeNode<>(4, lvRoot4, lvRoot4_2));
////        original.add(new TreeNode<>(5, lvRoot5_3, lvRoot5_4));
////
////        ArrayList<TreeNode<Integer>> copy = (ArrayList<TreeNode<Integer>>) original.clone();
//
////        System.out.println("original = " + original);
////
////        System.out.println("copy = "+copy);
////
////        original.remove(original.size() - 1);
////        System.out.println("original = " + original);
////        System.out.println("copy = "+ copy);
//
////        copy.get(0).setValue(new Integer(77));
////        System.out.println("copy = "+copy);
////        System.out.println("original = " + original);









    }
}
