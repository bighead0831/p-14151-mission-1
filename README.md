# TDD로 다항식 계산기 구현 : t1 - t14까지 통과

## Calc 클래스 내부 구조
### 실행(메인) 메서드
- run 메서드 : 실행
### 확인용 메서드
- isAction 메서드 : 무슨 계산을 실행할지 결정 (계산순서: +, -, *순)
### Action 메서드
- actionAdd 메서드 : 덧셈 (재귀)
- actionSub 메서드 : 뺄셈 (재귀)
- actionMul 메서드 : 곱셈
