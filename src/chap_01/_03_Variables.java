package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // 정수 = int, long
        // 실수 = float, double
        // 문자 = char
        // 문자열 = String
        // 논리 = boolean

        String name = "Kamja44";
        int time = 15;

        System.out.println(name + "님, 배송이 시작됩니다. "+time+"시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        // char 형은 작은 따옴표로
        char grade = 'A';
        name = "Kamja";
        System.out.println(name+"님의 평균 점수는 "+score+"점 입니다.");
        System.out.println("학점은 "+grade+"입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? "+pass);
        double d = 3.14123456789;
        // float 형을 사용하기 위해선 값 뒤에 f or F를 붙인다.
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);
        // long 형을 사용하기 위해선 값 뒤에 l or L을 붙인다.
        long l = 1000000000000L;
        // 1000000000000 == 1_000_000_000_000
        l = 1_000_000_000_000L;
        System.out.println(l);

    }
}
