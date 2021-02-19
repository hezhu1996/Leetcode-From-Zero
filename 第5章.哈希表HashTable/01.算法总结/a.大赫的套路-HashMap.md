# HashMap套路

## 提供更多信息

```java
ReturnType aggregateByKey_hashmap(List<Type>& keys) {
    Map<Type, InfoType> hashmap = new HashMap<>();
    //遍历集合
    for (Type key : keys) {
        //如果hashmap中存在key
        if (hashmap.containsKey(key)) {
            //如果key对应的value满足条件
            if (hashmap.get(key) satisfies the requirement) {
                //返回该条件
                return needed_information;
            }
        }
        //value可以放入任何信息(比如index)
        hashmap.put(key, value);    
    }
    return needed_information;
}
```

## 按键聚合

```java
ReturnType aggregateByKey_hashmap(List<Type>& keys) {
    // Replace Type and InfoType with actual type of your key and value
    Map<Type, InfoType> hashmap = new HashMap<>();
    for (Type key : keys) {
        if (hashmap.containsKey(key)) {
            hashmap.put(key, updated_information);
        }
        // Value can be any information you needed (e.g. index)
        hashmap.put(key, value);    
    }
    return needed_information;
}
```

