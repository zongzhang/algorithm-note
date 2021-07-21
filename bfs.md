# 广度优先遍历

联想：水波扩散

依赖数据结构：队列

应用：无权图找最短路径

```java
public void TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  
  TreeNode(int val){
    this.val=val;
  }
}

public List<List<Integer>> levelOrder(TreeNode root){
  List<List<Integer>> allResults = new ArrayList<>();
  if(root==null){
    return allResults;
  }
  Queue<TreeNode> nodes = new LinkedList<>();
  nodes.add(root);
  while(!nodes.isEmpty()){
    int size = nodes.size();
    List<Integer> results = new ArrayList<>();
    for(int i=0;i<size;i++){
      TreeNode node = nodes.poll();
      results.add(node.val);
      if(node.left!=null){
        nodes.add(node.left);
      }
      if(node.right !=null){
        nodes.add(node.right);
      }
    }
    allResults.add(results);
  }
  return allResults;
}
```





