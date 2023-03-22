# 자바 핵심 개념 정리 2
<details>
<summary>JAVA의 접근 제어자의 종류와 특징에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>public : 외부 클래스도 사용할 수 있다.</li>
<li>protected : 같은 패키지 또는 자식 클래스에서 사용할 수 있다.</li>
<li>default : 같은 패키지에서만 사용할 수 있다.</li>
<li>private : 내부에서만 사용할 수 있다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>OOP의 5대 원칙 (SOLID)에 대해 설명해주세요.</summary>
<div markdown="1">
<h2>SRP(단일책임원칙)</h2>
<ul>
<li>한 클래스는 하나의 책임만 가져야 한다.</li>
<li>‘변경’을 기준으로 삼음 → 변경 있을 때 파급효과가 적으면 잘 따른 것</li>
</ul>
<h2>OCP(개방-폐쇄원칙)</h2>
<ul>
<li>확장에는 열려있으나 변경에는 닫혀있어야 한다.</li>
<li>다형성을 이용한다. <pre><code class="language-java">public class MemberService { 
//private MemberRepository = new MemoryMemberRepository(); 
private MemberRepository = new JdbcMemberRepository(); 
}</code></pre>
</li>
<li>위의 코드의 한계: 다형성을 활용했으나 구현 객체를 변경하기 위해서는 클라이언트 코드를 변경해야하기 때문에 OCP원칙을 지킬 수 없음</li>
<li>해결책: 객체를 생성하고 연관 관계를 맺어주는 별도의 조립, 설정자 이용(스프링 컨테이너를 사용하면 됨)</li>
</ul>
<h2>LSP(리스코프 치환 원칙</h2>
<ul>
<li>다형성에서 하위 클래스는 인터페이스 규약을 모두 지켜야 한다.</li>
</ul>
<h2>ISP(인터페이스 분리 원칙)</h2>
<ul>
<li>특정 클라이언트를 위한 인터페이스 여러 개가 하나의 범용 인터페이스보다 낫다.</li>
<li>이유 : 인터페이스가 명확해지고, 대체 가능성을 높이기 때문</li>
</ul>
<h2>DIP(의존관계 역전 원칙)</h2>
<ul>
<li>추상화에 의존해야지 구체화에 의존하면 안 된다.</li>
<li>= 인터페이스에 의존해야지 구현 클래스에 의존하면 안 된다.</li>
<li>=역할에 의존하게 해야 한다.</li>
</ul>
</div>
</details>
<br>

<details>
<summary>non-static 멤버와 static 멤버의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>static<ul>
<li>meathod area의 공간에 메모리 할당되어 직접 접근이 가능하다.</li>
<li>final static을 이용하면 절대적으로 변하지 않도록 할 수 있다.</li>
</ul>
</li>
<li>non-static<ul>
<li>method area에 할당되지 않기 때문에 객체를 만들어 접근해야 한다.</li>
<li>객체를 만들면 인스턴스 heap 영역 메모리에 생성됩니다.</li>
<li>객체 사용이 끝나면 GC에 의해 정리된다.</li>
</ul>
</li>
</ul>
</div>
</details>
<br>

<details>
<summary>클래스, 객체, 인스턴스의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li>클래스<ul>
<li>객체를 만들어 내기 위한 설계도 또는 틀    </li>
</ul>
</li>
<li>객체<ul>
<li>클래스의 인스턴스</li>
</ul>
</li>
<li>인스턴스<ul>
<li>설계도를 바탕으로 구현된 실체</li>
<li>new 연산자를 통해 생성자를 호출해서 메모리에 올라온 객체의 상태</li>
</ul>
</li>
</ul>
</div>
</details>
<br>

<details>
<summary>⭐️ 프로세스, 스레드, 멀티프로세스, 멀티스레드에 대해 설명해주세요.</summary>
<div markdown="1">
<ul>
<li><p>프로세스</p>
<ul>
<li>운영체제로부터 자원을 할당받는 작업의 단위</li>
<li>각각 독립된 메모리 영역을 할당 받는다.</li>
</ul>
</li>
<li><p>스레드</p>
<ul>
<li>프로세스가 할당받는 자원을 이용하는 실행의 단위</li>
<li>프로세스 내에서 각각 stack만 따로 할당받고 Code,Data,Heap 영역은 공유한다.</li>
<li>Java에서는 Runnable 인터페이스를 구현하거나 Thread 클래스를 상속 받아 구현한다.</li>
</ul>
</li>
<li><p>멀티프로세스</p>
<ul>
<li>하나의 응용프로그램을 여러 개의 프로세스로 구성하여 각 프로세스가 하나의 작업을 처리하게한다.</li>
<li>하나의 프로세스가 죽더라도 다른 프로세스에 영향을 주지 않는다.</li>
</ul>
</li>
<li><p>멀티스레드</p>
<ul>
<li>하나의 프로세스에 여러 스레드로 자원을 공유하면서 작업을 수행한다.</li>
<li>멀티 프로세스 보다 적은 메모리 공간을 차지한다.</li>
</ul>
</li>
</ul></div>
</details>
<br>
