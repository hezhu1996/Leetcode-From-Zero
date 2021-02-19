# Java基础

## 1.自增变量

* ++在后先赋值再运算，++在前先运算再赋值

```java
public class Test{
    public static void main(){
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
            
    }
}
//A. i=4, j=1, k=11
//B. i=4, j=2, k=19  
//C. i=5, j=3, k=19
//D. i=5, j=3, k=20
//E. i=1, j=2, k=11
```

