# 深度优先遍历

前序遍历
中序遍历
后序遍历（重要）

引申：
    回溯算法
    剪枝

递归写法：
```
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if(root==null){
        return allResults;
    }
    travel(root,0,allResults);
    return allResults;
}

private void travel(TreeNode root,int level,List<List<Integer>> results){
    if(result.size()==level){
        results.add(new ArrayList<Integer>());
    }
    results.get(level).add(root.val);
    if(root.left!=null) travel(root.left,level+1,results);
    if(root.right!=null) travel(root.right,level+1,results);
}
```
