/*Tree Creation, Inorder , preorder and postorder with levelorder and the topview in java.
CODING : */
import java.util.*;
class Node
{
 int data;
 Node left,right;
 public Node (int val)
 {
  data = val;
  left = right= null;
 }
}
class tree1
{
 Node create(int data)
 {
  return new Node(data);
 }
 Node insert(Node root,int val)
 {
  if(root == null)
  {
   return create(val);
  }
  if(val < root.data)
  {
   root.left = insert(root.left, val);
  }
  else
  {
   root.right = insert(root.right, val);
  }
  return root;
 }
 public void preorder(Node root)
 {
  if(root != null)
  {
   System.out.print(root.data+ " ");
   preorder(root.left);
   preorder(root.right);
  }
 }
 public void inorder(Node root)
 {
  if(root != null)
  {
   preorder(root.left);
   System.out.print(root.data+ " ");
   preorder(root.right);
  }
 }
 public void postorder(Node root)
 {
  if(root != null)
  {
   preorder(root.left);
   preorder(root.right);
   System.out.print(root.data+ " ");
  }
 }
 public void levelorder(Node root)
 {
  if(root==null)
  {
   System.out.println("tree is empty");
  }
  Queue<Node> queue = new LinkedList<>();
  queue.add(root);
  while(!queue.isEmpty())
  {
   Node cur = queue.poll();
   System.out.print(cur.data+" ");
   if(cur.left!=null)
   {
    queue.add(cur.left);
   }
   if(cur.right!=null)
   {
    queue.add(cur.right);
   }
  }
 }
 public void topview(Node root)
 {
  Node temp = root;  
  System.out.print(root.data+" ");
  while(root.left!=null)
  {
   System.out.print(root.left.data+" ");
   root = root.left; 
  }
  while(temp.right!=null)
  {
   System.out.print(temp.right.data+" ");
   temp = temp.right; 
  }
 }
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  tree1 t1 = new tree1();
  int k = ob.nextInt();
  Node root = t1.create(k);
  while (true)
  {
   int val = ob.nextInt();
   if(val == -1)
   {
    break;
   }
   t1.insert(root,val);
  }
 System.out.println("prerorder");
  t1.preorder(root);
   System.out.println();
  System.out.println("inorder");
   t1.inorder(root);
   System.out.println();
   System.out.println("postorder");
   t1.postorder(root);
   System.out.println();
   t1.levelorder(root);
   System.out.println();
  t1.topview(root);
  ob.close();
 }
}
