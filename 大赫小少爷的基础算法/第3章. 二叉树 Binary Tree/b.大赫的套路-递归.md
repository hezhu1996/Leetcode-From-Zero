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

![image-20201130101416359](pic/image-20201130101416359.png)

# 自下而上(Bottom-up)模板套路



1. 首先计算左右子树的结果，通过**返回的结果**以及**当前节点**进行一些计算操作来得到答案。
2. 可以看做是一种**后序遍历**：左右根

#### 套路模板

```java
//递归出口条件
if(root == null){
    return;
}
//计算左右子树
left_answer = bottom_up(root.left);
right_answer = bottom_up(root.right);

//利用左右子树的值，返回本节点的结果
return operation(left_answer, right_answer);
```

相关练习：

1. [二叉树的最大深度](05.二叉树的最大深度.md)

















