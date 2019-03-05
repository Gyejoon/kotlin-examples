# kotlin-tutorial

아래의 튜토리얼 문서는 공식 코틀린 사이트를 번역하였습니다.

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
