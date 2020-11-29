![image-20201129162559539](pic/image-20201129162559539.png)

# 自顶而下(Top-down)模板套路

1. 首先访问根节点root，对其进行一些操作或返回某些值。
2. 将返回的值传递到其左右子树中。
3. 是另一种形式的**前序遍历**

#### 模板套路

```java
//1.访问根节点
if(root == null){
    ...
    //返回某值
    return;
}
//2.更新result

//3.递归左右子树
left_answer = top_down(root.left, left_params);
right_answer = top_down(root.right, right_params);

//4.如果需要，返回ans
return answer;
    
```

相关练习：

1. [二叉树的最大深度](05.二叉树的最大深度.md)

























