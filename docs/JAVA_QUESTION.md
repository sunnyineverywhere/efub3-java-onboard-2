# 자바 핵심 개념 정리 2
<details>
<summary>JAVA의 접근 제어자의 종류와 특징에 대해 설명해주세요.</summary>
<div markdown="1">
1. private<br>
private이 붙은 변수, 메소드는 해당 클래스에서만 접근이 가능하다<br>
2. default<br>
접근 제어자를 별도로 설정하지 않는다면 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능하다<br>
3. protected<br>
protected가 붙은 변수, 메소드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근이 가능하다<br>
4. public<br>
어떠한 클래스에서라도 접근이 가능하다
</div>
</details>
<br>

<details>
<summary>OOP의 5대 원칙 (SOLID)에 대해 설명해주세요.</summary>
<div markdown="1">
1. SRP(Single Responsibility Principle) : 단일 책임의 원칙<br>
한 모듈은 여러 대상 또는 액터들에 대해 책임을 가져서는 안되고, 오직 하나의 액터에 대해서만 책임을 져야 한다. 변경이 필요할 때 수정할 대상이 명확해진다.<br>
2. OCP(Open-Closed Principle) : 개방 폐쇄 원칙<br>
확장에 대해 열려있고 수정에 대해서는 닫혀 있어야 한다. 추상화를 통해 변하는 것들은 숨기고 변하지 않는 것들에 의존해야 한다.<br>
3. LSP(Liskov Substitution Principle) : 리스코프 치환 법칙<br>
하위 타입은 상위 타입을 대체할 수 있어야 한다. 클라이언트는 상위 타입이 하위 타입으로 대체되어도 이를 인지하지 못한 채 상위 타입의 퍼블릭 인터페이스를 통해 서브 클래스를 사용할 수 있어야 한다.<br>
4. ISP(Interface Segregation Principle) : 인터페이스 분리 원칙<br>
클라이언트의 목적과 용도에 적합한 인터페이스만을 제공. 불필요한 간섭을 최소화할 수 있다.<br>
5. DIP(Dependency Inversion Principle) : 의존 역전 원칙<br>
고수준 모듈은 저수준 모듈의 구현에 의존해서는 안되며, 저수준 모듈이 고수준 모듈에 의존해야 한다.
</div>
</details>
<br>

<details>
<summary>non-static 멤버와 static 멤버의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
non-static 멤버는 인스턴스 멤버로 객체마다 별도로 존재한다. 객체 생성 시에 멤버가 생성된다. 공유되지 않는다.<br>
static 멤버는 클래스 멤버로 멤버는 클래스당 하나가 생성된다. 클래스 로딩 시에 멤버가 생성된다. 동일한 클래스의 모든 객체 들에 의해 공유된다.
</div>
</details>
<br>

<details>
<summary>클래스, 객체, 인스턴스의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
클래스: 객체를 위한 설계도, 붕어빵 틀<br>
객체: 클래스로 구현된 대상, 메모리를 차지하지 않음, 붕어빵 틀로 만들 대상<br>
인스턴스: 소프트웨어 세계에 구현된 실체, 메모리에 할당됨, 실제로 만든 붕어빵

</div>
</details>
<br>

<details>
<summary>⭐️ 프로세스, 스레드, 멀티프로세스, 멀티스레드에 대해 설명해주세요.</summary>
<div markdown="1">
프로세스: 운영체제로부터 자원을 할당받은 작업의 단위<br>
code, data, stack, heap의 형식으로 메모리 영역을 할당받음<br>
스레드: 프로세스 내에서 프로세스가 할당받은 자원을 이용하는 실행 흐름의 단위<br>
한 프로세스 내에서 code, data, heap의 영역을 공유한다<br>
멀티프로세스: 하나의 프로그램을 여러 개의 프로세스로 구성하여 각 프로세스가 하나의 작업을 처리<br>
멀티스레드: 하나의 프로그램을 여러 개의 스레드로 구성하고, 각 스레드가 하나의 작업을 처리
</div>
</details>
<br>
