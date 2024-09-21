# `<? super T>`의 의미와 사용

## `<? super T>`의 의미

`<? super T>`는 **"T 또는 그 상위 타입을 허용하는 박스"**라는 뜻입니다. 예를 들어, `<? super Toy>`라고 하면, Toy 또는 Toy의 부모 클래스들을 허용하는 타입을 의미합니다.

Toy의 부모 타입은 Object가 될 수 있겠죠. 즉, `<? super Toy>`는 `Box<Toy>`, `Box<Object>` 등을 가리킬 수 있습니다.

## 왜 `set()`은 허용될까?

`Box<? super Toy>`는 Toy 또는 그 상위 클래스를 허용하는 박스입니다. 즉, Toy와 그 하위 클래스는 모두 안전하게 박스에 넣을 수 있습니다.

```java
Box<? super Toy> box = new Box<>();
box.set(new Toy());  // OK, Toy는 넣을 수 있음
box.set(new CarToy());  // OK, CarToy는 Toy의 하위 클래스이므로 넣을 수 있음

## 왜 `get()`은 제한될까?

반면, get()을 사용할 때는 문제가 다릅니다. `Box<? super Toy>`는 Toy와 그 상위 클래스를 허용하는 박스이기 때문에,
 컴파일러는 이 박스가 정확히 어떤 타입의 객체를 반환할지 알 수 없습니다.

```java
Box<? super Toy> box = new Box<>();
Object obj = box.get();  // OK
Toy t = box.get();  // 컴파일 에러

컴파일러는 box.get()이 어떤 타입의 객체를 반환할지 정확히 알 수 없기 때문에, 부모 클래스인 Object로는 받을 수 있지만, 더 구체적인 Toy 타입으로는 받을 수 없습니다.
박스가 실제로 **Box<Object>**일 수도 있고, 그러면 반환되는 값이 Object 타입일 수 있기 때문에, 이를 Toy로 받을 수는 없습니다. 타입 불일치 문제가 생기죠.
box.get()으로 반환되는 객체가 Toy일지, Object일지 모호하기 때문에 컴파일러는 읽기 작업을 제한합니다.