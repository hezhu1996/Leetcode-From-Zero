# 二叉搜索树

## 1. 特性

1. 对于 BST 的每一个节点`node`，左子树节点的值都比`node`的值要小，右子树节点的值都比`node`的值大
2. 对于 BST 的每一个节点`node`，它的左侧子树和右侧子树都是 BST
3. 可以提供 **logN 级别**的增删查改效率

## 2. 中序遍历：升序

* BST 的**中序遍历**结果是**有序的**（**升序**）

```java
void traverse(TreeNode root) {
    if (root == null) return;
    traverse(root.left);
    // 中序遍历代码位置
    print(root.val);
    traverse(root.right);
}
```

#### 相关练习：中序遍历

[1.二叉搜索树中第K小的元素](3.3二叉搜索树/1.二叉搜索树中第K小的元素.md)

[2.把二叉搜索树转换为累加树](3.3二叉搜索树/2.把二叉搜索树转换为累加树.md)

## 3. 判断 BST 的合法性

![image-20201202170319429](https://raw.githubusercontent.com/TWDH/Leetcode-From-Zero/pictures/img/image-20201202170319429.png)



* 对右子树设定最小值min，当前节点右子树的所有值**均不可小于**min。比如，`root.right.left`这里计算时的min并没有变化
* 同理，左子树设定最大值max，左子树所有节点不可大于max

```java
boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
}

/* 限定以 root 为根的子树节点必须满足 max.val > root.val > min.val */
boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
    // base case
    if (root == null) return true;
    // 若 root.val 不符合 max 和 min 的限制，说明不是合法 BST
    if (min != null && root.val <= min.val) return false;
    if (max != null && root.val >= max.val) return false;
    // 限定左子树的最大值是 root.val，右子树的最小值是 root.val
    return isValidBST(root.left, min, root) 
        && isValidBST(root.right, root, max);
}
```

## 4. BST遍历框架 + 搜索一个数

#### BST 遍历框架

```java
void BST(TreeNode root, int target) {
    //找到目标, 目标 = 当前值
    if (root.val == target)
    //右子树，目标 > 当前值
    if (root.val < target) 
        BST(root.right, target);
    //左子树，目标 < 当前值
    if (root.val > target)
        BST(root.left, target);
}
```

#### 搜索一个数

* 穷举所有点(低效)

```java
boolean isInBST(TreeNode root, int target) {
    if (root == null) return false;
    if (root.val == target) return true;
    // 当前节点没找到就递归地去左右子树寻找
    return isInBST(root.left, target)
        || isInBST(root.right, target);
}
```

* 使用框架遍历

```java
boolean isInBST(TreeNode root, int target) {
    if (root == null) return false;
    //目标 = 当前值
    if (root.val == target)
        return true;
    //右子树，目标 > 当前值
    if (root.val < target) 
        return isInBST(root.right, target);
    //左子树，目标 < 当前值
    if (root.val > target)
        return isInBST(root.left, target);
}
```



















