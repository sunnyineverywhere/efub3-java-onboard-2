# 자바 핵심 개념 정리 2
<details>
<summary>JAVA의 접근 제어자의 종류와 특징에 대해 설명해주세요.</summary>
<div markdown="1">
JAVA의 접근 제어자에는 public, private, protected, default가 있다.
public은 클래스와 멤버에 선언할 수 있다. 패키지에 상관없이 어느 클래스에서든 public 클래스를 이용할 수 있다. public 멤버 또한 어느 패키지에 속해 있는지 상관없이 어디서든 public 멤버에 접근할 수 있다.
private는 멤버에 선언될 수 있고 클래스 내의 멤버들만 private 멤버에 접근 가능하다.
protected는 멤버에 선언될 수 있다. 같은 패키지의 모든 클래스와 다른 패키지의 자식 클래스는 protected 멤버에 접근할 수 있다.
default는 클래스와 멤버에 선언할 수 있다. 같은 패키지 안에 있는 클래스들만 default 클래스를 이용할 수 있고, 같은 패키지 안에 있는 클래스들만 default 멤버에 접근할 수 있다.
</div>
</details>
<br>

<details>
<summary>OOP의 5대 원칙 (SOLID)에 대해 설명해주세요.</summary>
<div markdown="1">
OOP의 5대 원칙은 SRP, OCP, LSP, ISP, DIP이다. SRP(Single Responsibility Principle)는 단일 책임 원칙으로 하나의 클래스는 하나의 책임만 가져야 함을 의미한다. OCP(Open-Closed Principle)는 개방-폐쇄 원칙으로 확장에는 열려 있으나 변경에는 닫혀 있어야 함을 의미한다. LSP(Liskov’s Substitution Principle)는 리스코프 치환 법칙으로 프로그램의 객체는 프로그램의 정확성을 해치지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 함을 의미한다. ISP(Interface Segregation Principle)는 클라이언트가 자신이 이용하지 않는 메서드에 의존하지 않아야 함을 의미한다. 즉, 클라이언트를 기준으로 인터페이스가 나눠져야 한다는 것이다. DIP(Dependency Inversion Principle)는 의존관계 역전 원칙으로 상위 모듈이 하위 모듈에 의존하면 안 되고, 추상적인 적은 구체적인 것에 의존하면 안 되고 구체적인 것이 추상적인 것에 의존해야 함을 의미한다.
</div>
</details>
<br>

<details>
<summary>non-static 멤버와 static 멤버의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
non-static 멤버는 객체마다 별도로 존재하므로 인스턴스 멤버라고 불린다. non-static 멤버는 객체 내에 각각 공간을 차지하면서 공유되지 않는다. static 멤버는 클래스당 하나만 생성된다. static 멤버는 동일한 클래스의 모든 객체들이 공유하므로 클래스 멤버라고 불린다.
non-static 멤버는 객체가 생성될 때 같이 생성되고 객체가 사라질 때 같이 사라진다. static 멤버는 프로그램이 시작될 때나 클래스가 로딩될 때 생성된다. 객체를 생성하기 전에도 static 멤버를 사용할 수 있다. 생성된 객체가 소멸된 후에도 static 멤버는 공간을 계속 차지하고, 프로그램이 종료할 때 함께 소멸된다.
</div>
</details>
<br>

<details>
<summary>클래스, 객체, 인스턴스의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
클래스는 객체를 만들기 위한 틀로 필드와 메서드로 구성된다.
객체는 클래스라는 틀로 구현된 대상을 의미한다.
객체가 소프트웨어에 구현된 것을 인스턴스라고 한다. 객체가 메모리에 할당되면 인스턴스가 된다.
</div>
</details>
<br>

<details>
<summary>⭐️ 프로세스, 스레드, 멀티프로세스, 멀티스레드에 대해 설명해주세요.</summary>
<div markdown="1">
프로세스는 메모리 상에서 실행되고 있는 프로그램이고 Code, Data, Stack, Heap 구조의 독립된 메모리 영역을 할당받는다.
스레드는 프로세스 안에서 실행되는 흐름의 단위이다.
멀티프로세스는 하나의 응용프로그램을 여러 개의 프로세스로 나누고 각 프로세스가 작업을 하나씩 맡아 처리하도록 할 때 이용된다.
멀티스레드는 하나의 응용 프로그램을 여러 개의 스레드로 나누고 각 스레드가 작업을 처리하도록 할 때 이용된다.
멀티스레드에서 스레드는 프로세스 안의 메모리를 공유하기 때문에 멀티프로세스보다 자원을 효율적으로 이용할 수 있다. 또한, 멀티프로세스는 프로세스끼리의 통신이 복잡하지만 멀티스레드에서의 스레드들의 통신은 부담이 적다.
</div>
</details>
<br>
