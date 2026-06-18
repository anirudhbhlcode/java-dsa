# String and Regex basics
1. Strings are immutable :
    ```java
        String s = "Hello World";
        s = s + "!";
    ```
    Output is "Hello World!" but a new string is created.

2. StringBuilder strings are mutable and preferred for frequent changes :
    ```java
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
    ```
    Output is HelloWorld and sb is the one getting appended.

    ```java
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" ");
        sb.append("Programming");
        String res = sb.toString()
        System.out.println(res);
    ```
    Output is "Java Programming" but res is immutable and sb remains mutable.
    
3. StringBuffer strings are mutable and ensures thread-safety.

# String Operations

-> Points to note :
    - s1 == s2 compares references and not the strings.
    - use s1.equals(s2) or s1.equalsIgnoreCase(s2)
    - compareTo() compare the strings lexicographically
        String a = "apple";
        String b = "banana";
        System.out.println(a.compareTo(b));

        Output : -1

        Reason : It checks character by character for :
            - (<0) : First string smaller than second
            - (=) : if both are equal
            - (>0) : First string larger than second
            - ASCII value for a is 97 and b is 98 so, 97-98 = -1. Stop just return when encountered.
            - compareTo() stops immediately when it finds the first different character.
    
