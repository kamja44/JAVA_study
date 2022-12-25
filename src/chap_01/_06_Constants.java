package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; // 국가 번호
        // KR_COUNTRY_CODE = "8282"; <- 상수는 값의 재할당이 불가능함
        System.out.println(KR_COUNTRY_CODE);
        // 상수 이름 지을 때 모든 글자는 대문자, 단어는 _로 구분
        final double PI = 3.141592; // 원주율
        final String DATE_OF_BIRTHJ = "2022-12-25"; // 생년월일
    }
}
