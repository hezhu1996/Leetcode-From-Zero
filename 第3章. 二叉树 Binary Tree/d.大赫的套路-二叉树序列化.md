# 二叉树的序列化与反序列化

* **所谓的序列化不过就是把结构化的数据「打平」，其实就是在考察二叉树的遍历方式**

## 1. 前序遍历的Serialize

* 将二叉树打平到List中

```java
LinkedList<Integer> res;
void traverse(TreeNode root) {
    if (root == null) {
        // 暂且用数字 -1 代表空指针 null
        res.addLast(-1);
        return;
    }

    /****** 前序遍历位置 ******/
    res.addLast(root.val);
    /***********************/

    traverse(root.left);
    traverse(root.right);
}
```

![img](https://mmbiz.qpic.cn/sz_mmbiz_jpg/gibkIz0MVqdFJlkkg2icueWtNAuPtHuQ6vmOfpGWptTgHonJR8qH2TdSltf8jQ5mNMkQxm7gxicib8a9HBIibEibicL2Q/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

* 将二叉树打平到String中

```java
String SEP = ",";
String NULL = "#";

/* 主函数，将二叉树序列化为字符串 */
String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    serialize(root, sb);
    return sb.toString();
}

/* 辅助函数，将二叉树存入 StringBuilder */
void serialize(TreeNode root, StringBuilder sb) {
    if (root == null) {
        sb.append(NULL).append(SEP);
        return;
    }

    /****** 前序遍历位置 ******/
    sb.append(root.val).append(SEP);
    /***********************/

    serialize(root.left, sb);
    serialize(root.right, sb);
}
```

## 1.1 前序遍历的Deserialize

* 首先我们可以把字符串转化成列表

```java
String data = "1,2,#,4,#,#,3,#,#,";
String[] nodes = data.split(",");
```

问题转化为：如何通过二叉树的前序遍历结果还原一棵二叉树？

* 因为node列表中**包含null**指针，所以**可以还原**二叉树

```java
/* 主函数，将字符串反序列化为二叉树结构 */
TreeNode deserialize(String data) {
    // 将字符串转化成列表
    LinkedList<String> nodes = new LinkedList<>();
    for (String s : data.split(SEP)) {
        nodes.addLast(s);
    }
    return deserialize(nodes);
}

/* 辅助函数，通过 nodes 列表构造二叉树 */
TreeNode deserialize(LinkedList<String> nodes) {
    if (nodes.isEmpty()) return null;

    /****** 前序遍历位置 ******/
    // 列表最左侧就是根节点
    String first = nodes.removeFirst();
    if (first.equals(NULL)) return null;
    TreeNode root = new TreeNode(Integer.parseInt(first));
    /***********************/
	
    //先解析左子树，再解析右子树（左子树会全部解析完 - "#"全部被remove了表示左子树结束）
    root.left = deserialize(nodes);
    root.right = deserialize(nodes);

    return root;
}
```

* `Integer.parseInt(String s)`：将括号中的参数转化成int



























