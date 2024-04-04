## 프디아 백엔드 과제1
> 자바의 다형성 예제 실습
#### 목표
- 사람이 상점에서 핸드폰을 구매합니다. 
- 쏘니가 삼성핸드폰을 샀습니다. 
- 베컴은 애플핸드폰을 샀습니다.
- 쏘니가 핸드폰을 켰습니다. -> "야 내 핸드폰 켜볼게" 사람이 외침 -> "삐비빅" (핸드폰이 내는 소리)
- 베컴도 핸드폰을 켰습니다. -> "turn on" => 'bbeep"(핸드폰을 내는 소리)

## Responsibility
- Account: 계좌 / 돈을 가지고 있는 객체
- AccountService: 이체 관련 서비스
- ElectronicStore: 여러 디바이스를 판매하는 스토어
- Deviceable: 디바이스라면 무조건 지니고 있어야 되는 기본적인 기능
- Mobile: Deviceable를 상속한 추상 클래스
- AppleMobile: 애플폰 구현체
- SamsungMobile: 삼성폰 구현체
- MobileFactory: 핸드폰을 만드는 공장
- Person: 사람, 계좌 / 생각 / 폰을 가지고 있을 수 있다.