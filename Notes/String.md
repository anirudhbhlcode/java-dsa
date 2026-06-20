# Strings Notes

## 1. Strings are immutable

```java
String s = "Hello World";
s = s + "!";
```

**Output:** `"Hello World!"` but a new string is created (original remains unchanged)

---

## 2. StringBuilder - Mutable alternative

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append("World");
```

**Output:** `HelloWorld` - the same `sb` object is modified

### Example: Building strings with StringBuilder

```java
StringBuilder sb = new StringBuilder();
sb.append("Java");
sb.append(" ");
sb.append("Programming");
String res = sb.toString();
System.out.println(res);
```

**Output:** `"Java Programming"` - `res` is immutable, but `sb` remains mutable

---

## 3. StringBuffer - Thread-safe alternative

StringBuffer is similar to StringBuilder but ensures thread-safety for multi-threaded environments

# String Operations

## Points to note

- `s1 == s2` compares references and not the strings
- Use `s1.equals(s2)` or `s1.equalsIgnoreCase(s2)` for string content comparison
- `compareTo()` compares strings lexicographically (character by character until first difference)

### compareTo() Example

```java
String a = "apple";
String b = "banana";
System.out.println(a.compareTo(b));  // Output: -1
```

**How it works:**
- Checks character by character
- `'a'` vs `'b'` → first difference found
- `'a'` < `'b'` (97 < 98) → returns negative (-1)
- **Stops immediately** when first different character is encountered

**Return values:**
- `< 0` : First string smaller than second
- `= 0` : Both strings are equal
- `> 0` : First string larger than second
    
# Basic Regex Patterns

| Pattern | Meaning | Example |
|---------|---------|---------|
| `.` | any character | `a.c` matches `abc`, `adc` |
| `*` | 0 or more | `ab*c` matches `ac`, `abc`, `abbc` |
| `+` | 1 or more | `ab+c` matches `abc`, `abbc` |
| `?` | 0 or 1 | `ab?c` matches `ac`, `abc` |
| `[abc]` | any of a, b, c | `[abc]` matches `a` or `b` or `c` |
| `[0-9]` | any digit | `[0-9]` matches `0` to `9` |
| `[a-z]` | any lowercase letter | `[a-z]` matches `a` to `z` |
| `^` | start of string | `^a` starts with `a` |
| `$` | end of string | `z$` ends with `z` |
| `\d` | any digit | same as `[0-9]` |
| `\w` | any word character | letters, digits, underscore |
| `\s` | any whitespace | space, tab, newline |