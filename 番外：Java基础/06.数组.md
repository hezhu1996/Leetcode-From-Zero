# 数组

1. **概念**：一种容器，可以同时存放多个数据值 
2. **特点**：
   1. 数组是一种引用数据类型
   2. 数组当中的多个数据，类型必须统一
   3. 数组的长度在程序运行期间不可改变 
3. **初始化**：
   1. 动态初始化（指定长度）
      * 数据类型\[\] 数组名称 = new 数据类型\[数组长度\]
      * `int[] arrayA = new int[300];`
   2. 静态初始化（指定内容）
      * 数据类型\[\] 数组名称 = new 数据类型\[\]{element1, element2, ...}
      * `int[] arrayA = new int[] {1, 2, 3, 4, 5};`
      * `省略：int[] arrayA = {1, 2, 3, 4, 5};`
4. **注意**：
   * 所有引用类型变量，都可以赋值为null 
5. 获取数组长度
   * `int len = array.length;`
   * 数组的长度在程序运行期间不可改变

![Java&#x4E2D;&#x5185;&#x5B58;&#x5212;&#x5206;](../.gitbook/assets/01java-zhong-de-nei-cun-hua-fen-.png)

![&#x53EA;&#x6709;&#x4E00;&#x4E2A;&#x6570;&#x7EC4;&#x7684;&#x5185;&#x5B58;&#x56FE;](../.gitbook/assets/02-zhi-you-yi-ge-shu-zu-de-nei-cun-tu-.png)

