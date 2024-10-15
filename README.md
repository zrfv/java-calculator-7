# java-calculator-precourse

## 필요한 기능
1. 문자열을 입력 받는 기능
2. 문자열에서 구분자를 기준으로 나누는 기능 
3. 커스텀 구분자를 추가하는 기능
4. 문자열의 숫자(양수)를 추출하는 기능
5. 추출한 숫자를 int 형으로 변환하는 기능
6. 숫자를 더하는 기능
7. 잘못된 값이 입력되면 예외 발생 후 종료하는 기능


**잘못된 값의 기준**:
- 구분자가 쉼표(,)와 콜론(:)과 커스텀 구분자가 아닌 경우
- 숫자가 양수가 아닌 경우
- 구분자 사이에 숫자 이외 문자가 있는 경우
- 단, _구분자가 처음과 끝에 위치한 경우_ 는 "" 입력 시 0 이기때문에 문제없음

## MVC 패턴 설계
### Model (데이터, 로직 처리)
2. 문자열에서 구분자를 기준으로 나누는 기능
3. 커스텀 구분자를 추가하는 기능
4. 문자열의 숫자(양수)를 추출하는 기능
5. 추출한 숫자를 int 형으로 변환하는 기능
6. 숫자를 더하는 기능

### View (사용자 인터페이스)
1. 문자열을 입력 받는 기능

### Controller (Model - View 연결)
7. 잘못된 값이 입력되면 예외 발생 후 종료하는 기능