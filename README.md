# kotlin-tutorial

아래의 튜토리얼 문서는 공식 코틀린 사이트를 참고 하였습니다.

# kotlin source code organization

## 소스 파일 이름

Kotlin 파일에 하나의 클래스(최상위 선언도 포함될 수 있음)와 이름이 동일하도록
작성합니다. 한 파일에 여러 클래스나 최상위 레벨 선언이 포함된 경우 해당 파일을
설명하는 이름을 작성합니다.
### 주의사항
  - 파일 이름은 대문자 첫글자와 `Camel humps`를 사용합니다. Ex) `ProcessDeclarations.kt`
  - 파일의 이름은 파일의 코드가 수행하는 작업을 설명해야 합니다. 따라서 파일 이름에 `Util`과 같은 이름을 사용하지 않습니다.
   
# kotlin Naming Rules

코틀린은 자바의 네이밍 규칙을 따릅니다.
1. 패키지명을 `Underscore`로 작성하지 않습니다.
2. 여러 단어를 사용하는 것이 권장되지 않지만, 사용 해야할 경우 여러 단어를 붙여쓰거나, camel humps를 사용합니다.
   - Ex) `org.example.myProject`
3. 클래스와 객체의 이름은 대문자로 시작하여 `Camel humps`를 사용합니다.
   - Ex)
   ```
   open class DeclarationProcessor { ... }
   
   object EmptyDeclarationProcessor : DeclarationProcessor() { ... }
   ```  

### 함수 이름 규칙
함수, 속성 및 지역 변수의 이름은 소문자로 시작하며, `Camel humps`를 사용하고 `Underscore`를 사용하지 않습니다.
   - Ex)
   ```
   fun processDeclarations() { ... }
   var declarationCount = ...
   ```

# Variables
Kotlin 에서는 기본적으로 2가지 타입추론 형식을 가지고 있습니다.
  - `val` => immutable
  - `var` => mutable

자바와는 달리 final을 붙이지 않고 val 키워드를 사용하면 immutable 하게 선언할 수 있습니다.

```
var a: String = "intial" // 1
println(a)
val b: Int = 1 // 2
val c = 3 // 3
```

1. String 타입으로 mutable한 변수를 선언 하였습니다.
2. Int 타입으로 immutable한 변수를 선언 하였습니다.
3. immutable한 변수를 선언 하였습니다. 이때, 3으로 초기화 하면서 컴파일러는 Integer로 타입을 추론하게 됩니다.


```
var e: Int // 1
println(e) // 2
```
1. 초기화 없이 변수를 선언하였습니다.
2. 다음과 같은 컴파일 에러가 출력 됩니다 : Variable 'e' must be initialized.


# Null Safety
자바에서 가장 문제가 많이 되는  부분은 바로 `NullPointerException` 일 것입니다.
하지만, Kotlin에서는 이를 해결하기 위해 기본적으로 널이 허용되지 않도록 되어 있습니다.
만약 null이 필요한 경우에는 해당 타입 옆에 `?` 를 붙이면 됩니다.

```
var neverNull: String = "This can't be null"            // 1

neverNull = null                                        // 2

var nullable: String? = "You can keep a null here"      // 3

nullable = null                                         // 4

var inferredNonNull = "The compiler assumes non-null"   // 5

inferredNonNull = null                                  // 6

fun strLength(notNull: String): Int {                   // 7
    return notNull.length
}

strLength(neverNull)                                    // 8
strLength(nullable)                                     // 9
``` 

1. null을 할당할 수 없는 String 변수.
2. null을 할당하려고 하면, 컴파일 에러를 내뿜습니다.
3. null 할당이 가능한 변수
4. 문제 없이 할당이 가능 합니다.
5. null을 할당 할 수 없는 String 변수를 선언함과 동시에 String 값을 초기화.
6. 초기화가 되어있음과 상관없이 null은 할당 될 수 없다는 컴파일 에러가 출력.
7. java의 경우에는 null check를 해야하지만, kotlin에서는 기본적으로 null이 할당 될 수 없으므로
null check 없이 property에 접근이 가능
8. neverNull 변수는 non-nullable 하기 때문에 정상적으로 실행.
9. nullable 변수는 null이 할당된 변수이므로 컴파일 에러를 출력.
