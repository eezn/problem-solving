
## 자바 STDIN 처리 
### 1. Scanner
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```
- `sc.next()` : 화이트 스페이스를 기준으로 한 단어를 받음
- `sc.next().charAt(0)` : **단일 문자를 입력받을 경우 사용**
- `sc.nextLine()` : 개행을 기준으로 한 줄 입력 
- `sc.nextInt()`, `sc.nextDouble()`, `sc.nextBigInteger()`, ... : 받은 값을 자료형에 맞게 리턴
- `sc.close()`

- 그 외 : `sc.token(), sc.hasNext()`, `sc.hasNextInt()`, `sc.hasNextBigInterger()`, 등등

### 2. BufferedReader
입력받은 데이터를 바로 전달하지 않고 버퍼를 거쳐서 전달, 데이터 처리 효율성이 높음 (**속도 빠름**)
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```

- `br.newline()` : 개행을 기준으로 한 라인을 `String` 으로 반환
- 사용할 때, **`IOexception` 처리 해줘야 함**

### 3. StringTokenizer
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String str = "Example String";
        
        st = new StringTokenizer(str, " ");
        String chunk1 = st.nextToken();
        String chunk2 = st.nextToken();
        
        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens())
            st.nextToken();
    }
}
```
- 문자열을 설정한 구분 문자(Delimiter)를 기준으로 쪼개서(Split) 호출될 때 마다 한 조각(Chunk)씩 반환

---
## 자바 STDOUT
### 1. System.out
```java
System.out.print();
System.out.println();
```

### 2. BufferedWriter
```java
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
```
- `bw.write()`
- `bw.flush()`
- `bw.close()`

```java
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Example {
    
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = "Example";
        String str2 = "String";

        bw.write(str1 + "\n");
        bw.flush();

        bw.append(str1).append(str2);
        bw.newLine();

        bw.close();
    }
}
```

---
## 문자열 처리
### 1-1. String 문자열을 C 스타일 문자열로
- `toCharArray()` 인덱스 접근 가능
```java
String str = "example";

char[] cStr = str.toCharArray();
```

### 1-2. C 스타일 문자열을 String 문자열로
- `String.valueOf()`
```java
char[] cStr = {'e', 'x', 'a', 'm', 'p', 'l', 'e'};

String str = String.valueOf(cStr);
```
### 3. man ascii, 알파벳 숫자 등등
### 4. StringBuffer, StringBuilder
- String (불변)
  - `str1 + str2` 문자열 연산은 그 때 그 때 새로운 객체가 생성됨
  - 연산이 많아지면 GC가 할 일 이 많이 생김
- StringBuffer, **StringBuilder** (가변)
  - 메모리(버퍼)에서 문자열 처리 후 객체 반환 
  - 문자열 추가, 수정, 삭제가 빈번하게 일어날 때 이득
  - StringBuffer vs. StringBuilder (동기화 지원 여부)
    - StringBuffer : thread-safe YES
    - **StringBuilder** : thread-safe NO (but, 단일 스레드에서 성능이 더 좋음)


```java
// 문자열 뒤집기
StringBuilder sb = new StringBuilder("reverse");
String str = sb.reverse().toString();

System.out.println(sb);
System.out.println(str);
```

### 5. Character Wrapper Method
- `Character.isDigit()`  
- `Character.isAlphabetic()`  
- `Character.isLowerCase()` or `Character.isUpperCase()`

### 6. 문자열 비교
- `str1.compareTo(str2)`
- `str1.compareToIgnoreCase(str2)` : 대소문자 구분없이 비교
- `str1.equalsIgnoreCase(str2)` : 대소문자 구분없이 비교

### 7. str.replace
- `str.replace(Char oldChar, Char newChar)`
- `str.replaceAll(String regex, String replacement)`

---
## 진법 변환
- 정수형을 해당되는 base의 문자열로 반환
  - `Integer.toBinaryString(num)`
  - `Integer.toOctalString(num)`
  - `Integer.toHexString(num)`
- n진수로 표현된 문자열을 int형태로 반환
  - `Integer.parseInt(str, n)`
