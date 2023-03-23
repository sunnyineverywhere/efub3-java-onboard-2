# 자바 핵심 개념 정리 2
<details>
<summary>JAVA의 접근 제어자의 종류와 특징에 대해 설명해주세요.</summary>
<div markdown="1">
 private -> default -> protected -> public 순으로 많은 접근을 허용함.

1) private  
   접근제어자가 private으로 설정되었다면 private 이 붙은 변수, 메서드는 해당 클래스에서만 접근이 가능.
2) default  
   접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수, 메서드는 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능
3) protected  
   접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 메서드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근이 가능
4) public  
   접근제어자가 public으로 설정되었다면 public 접근제어자가 붙은 변수, 메서드는 어떤 클래스에서라도 접근이 가능
</div>
</details>
<br>

<details>
<summary>OOP의 5대 원칙 (SOLID)에 대해 설명해주세요.</summary>
<div markdown="1">

1) 단일 책임 원칙(Single Responsibility Principle)  
   모든 클래스는 각각 하나의 책임만 가져야 한다. 클래스는 그 책임을 완전히 캡슐화해야 함을 말한다.   

2) 개방 폐쇄 원칙(Open Closed Principle)  
   확장에는 열려있고 수정에는 닫혀있어야 한다는 원칙. 기존의 코드를 변경하지 않으면서, 기능을 추가할 수 있도록 설계가 되어 있어야 한다는 원칙이다. 
3) 리스코프 치환 원칙(Liskov Substitution Principle)  
   자식 클래스는 언제나 자신의 부모 클래스를 대체할 수 있다는 원칙. 부모 클래스가 들어갈 자리에 자식 클래스를 넣어도 계획대로 잘 동작해야 한다. 
4) 인터페이스 분리 원칙(Interface Segregation Principle)  
   한 클래스는 자신이 사용하지 않는 인터페이스는 구현하지 않아야 한다. 
5) 의존 역전 원칙(Dependency Inversion Principle)  
   의존 관계를 맺을 때 변화하기 쉬운 것 또는 자주 변화하는 것보다는 변화하기 어려운 것, 거의 변화가 없는 것에 의존하라는 원칙.
   구체적인 클래스보다 인터페이스나 추상 클래스와 관계를 맺으라는 원칙.
  
   
</div>
</details>
<br>

<details>
<summary>non-static 멤버와 static 멤버의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
static 멤버는 클래스 멤버이고, non-static 멤버는 object 멤버이다. 

<b>static</b>: static은 JVM Runtime Data Area의 Method Area에 위치하며 Class Variable로 분류됩니다. class파일이 JVM에 의해 ClassLoader에 들어오면 Loading 이후에 Linking 과정 중 Prepare에서 static 변수에 메모리를 할당하고 초기값을 가집니다. Linking 이후 Initialization에서, 모든 static 변수들은 자신이 가지고 있는 해당 값이 할당됩니다.  

<b>non-static</b>:  non-static의 특징은 Method Area에 할당되지 않으며, 메모리에 있지 않기 때문에 객체를 만들어서 접근해야 합니다. 객체를 만드는 순간 해당 인스턴스가 Heap 영역 메모리에 생성됩니다. 따라서 객체가 생성될 때부터 사용이 가능하며, 객체 사용이 끝나면 GC에 의해서 소멸되므로 메모리 관리가 편합니다  

static 메서드를 만든경우, 지역변수를 가지거나 같은 static 변수(클래스 변수)를 사용할 수 있지만,
인스턴스 변수를 사용할 수 없습니다. 왜냐하면 static 은 메모리에 할당이 되어 있으나 인스턴스 변수는 메모리에 할당되어 있는지 확인할 수 없기 때문입니다.

[출처 https://escapefromcoding.tistory.com/136](https://escapefromcoding.tistory.com/136)
<br><br><br><br>


<table>
<th>Points</th>
<th>Static 함수</th>
<th>Non-static 함수</th>
<tr>
<td>정의</td>
<td>static 함수는 하나의 클래스에 속하는 메소드이다. 하지만 그 함수의 인스턴스에 속하지 않고 클래스의 인스턴스나 객체 없이 호출될 수 있다.</td>
<td>자바의 모든 함수는 static 키워드가 없다면 디폴트로 non-static이다. 
모든 static 메소드는 클래스의 객체를 사용하지 않고 
다른 static 메소드와 변수에 접근할 수 있다.</td>
</tr>
<tr>
<td>멤버와 함수 접근</td>
<td>static 함수는 다른 클래스의 자기 클래스의 static data 멤버와 static 함수에만 접근할 수 있고, non-static 함수와 변수에는 접근할 수 없다. </td>
<td>non-static 함수는 다른 클래스나 자기 클래스의 static 함수, 변수와 non-static 함수, 변수에 접근할 수 있다.</td>
</tr>
<tr>
<td>Binding Process</td>
<td>static 함수는 compile-time 또는 early binding을 사용한다. </td>
<td>non-static 함수는 runtime 또는 dynamic binding을 사용한다.</td>
</tr>
<tr>
<td>오버라이딩</td>
<td>static method는 early binding되기 때문에 override할 수 없다.</td>
<td>run-time binding이기 때문에 override할 수 있다. </td>
</tr>
<tr>
<td>메모리 할당</td>
<td>static 함수는 그 함수를 위한 static keyword가 ram에 
고정되어 메모리 할당이 한 번만 일어나기 때문에 실행 시간에 
비교적 적은 메모리를 사용한다.
<td>함수가 호출될 때마다 메모리가 할당되기 때문에 실행 시에 비교적 많은 메모리를 사용한다. </td>
</tr>
</table>
</div>
</details>
<br>

<details>
<summary>클래스, 객체, 인스턴스의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
<b>클래스</b>: 객체를 만들어 내기 위한 설계도 혹은 틀, 연관되어 있는 변수와 메서드의 집합  

<b>객체</b>: 소프트웨어 세계에 구현할 대상, 클래스에 선언된 모양 그대로 생성된 실체, '클래스의 인스턴스'  
객체는 모든 인스턴스를 포함하는 포괄적인 의미를 갖는다. 

<b>인스턴스</b>: 설계도를 바탕으로 소프트웨어 세계에 구현된 구체적인 실체  
추상적인 개념(또는 명세)과 구체적인 객체 사이의 관계 에 초점을 맞출 경우에 사용한다.
- 객체는 클래스의 인스턴스이다.
- 객체 간의 링크는 클래스 간의 연관 관계의 인스턴스이다.
- 실행 프로세스는 프로그램의 인스턴스이다. 
인스턴스는 어떤 원본(추상적인 개념)으로부터 ‘생성된 복제본’을 의미한다.

oop의 관점에서 클래스의 타입으로 선언되었을 때 '객체', 객체가 매모리에 할당되어 실체 사용될 때 '인스턴스'라고 부른다.  

[출처 https://gmlwjd9405.github.io/2018/09/17/class-object-instance.html](https://gmlwjd9405.github.io/2018/09/17/class-object-instance.html)

</div>
</details>
<br>

<details>
<summary>⭐️ 프로세스, 스레드, 멀티프로세스, 멀티스레드에 대해 설명해주세요.</summary>
<div markdown="1">
<b>프로세스</b>는 운영체제로부터 <b>자원을 할당받는 작업의 단위</b> 

<b>스레드</b>는 프로세스가 할당받은 자원으르 이용하는 <b>실행의 단위</b>

<h4>멀티 스레드 vs 멀티 프로세스</h4>
멀티 스레드는 멀티 프로세스보다 적은 메모리 공간을 차지하고 Context Switching이 빠른 장점이 있지만, 동기화 문제와 하나의 스레드 장애로 전체 스레드가 종료 될 위험을 갖고 있다.
멀티 프로세스는 하나의 프로세스가 죽더라도 다른 프로세스에 영향을 주지 않아 안정성이 높지만, 멀티 스레드보다 많은 메모리공간과 CPU 시간을 차지하는 단점이 있다.  

멀티 프로세스로 실행되는 작업을 멀티 스레드로 실행할 경우, 프로세스를 생성하여 자원을 할당하는 시스템 콜이 줄어들어 자원을 효율적으로 관리할 수 있다.  

또한, 프로세스 간의 통신보다 스레드 간의 통신 비용이 적으므로 작업들 간 통신의 부담이 줄어든다.  

스레드를 활용하면 자원의 효율성이 증가하기도 하지만, 스레드 간의 자원 공유는 전역 변수를 이용하므로 동기화 문제가 발생 할 수 있으므로 프로그래머의 주의가 필요하다.  

[출처 https://wooody92.github.io/os/멀티-프로세스와-멀티-스레드/](https://wooody92.github.io/os/%EB%A9%80%ED%8B%B0-%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4%EC%99%80-%EB%A9%80%ED%8B%B0-%EC%8A%A4%EB%A0%88%EB%93%9C/)
</div>
</details>
<br>
