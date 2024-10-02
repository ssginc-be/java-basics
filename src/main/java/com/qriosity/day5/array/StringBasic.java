package com.qriosity.day5.array;

/**
 * @author Queue-ri
 */
public class StringBasic {
    public static void main(String[] args) {
        String s1 = "012345678";
        String s2 = "9012345";

        // concatenate
        System.out.println(s1 + s2);

        // find character index
        char c2 = s2.charAt(4); // char로 반환됨. String 아님
        System.out.println(c2);

        // check if ends with ~
        System.out.println(s1.endsWith("!"));
        System.out.println(s2.endsWith("!"));

        // check if contains ~
        System.out.println(s1.contains("!"));
        System.out.println(s2.contains("!"));

        // substring
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2, 8)); // 반닫힘구간

        // find specific index
        System.out.println(s2.indexOf("7")); // 실무에선 lastIndexOf를 더 많이 쓴다고 함.

        // example
        String email = "qriositylog@gmail.com";
        int idx = email.indexOf("@");
        System.out.println(email.substring(0, idx));

        // email 문자열 대문자로 변경 + email의 글자 수 출력하기
        // 비파괴함수임.
        System.out.println(email.toUpperCase());
        // com --> net 으로 변경
        // RAM에 있는 데이터 fetch 해서 CPU가 변경함 (RAM 데이터는 그대로임)
        // RAM 데이터까지 변경하고 싶으면 해당 문자열 참조변수에 재할당하면 됨
        System.out.println(email.replace("com", "net"));
        // 전체 글자수 출력
        System.out.println(email.length());

        // 공백 제거
        String s3 = " a s d f ";
        System.out.println(s3.trim());
        System.out.println(s3.trim().replaceAll(" ", ""));

        // 파싱해서 분리 저장하기
        String s4 = "감자,고구마,양파";
        String[] sArr = s4.split(","); // {"감자", "고구마", "양파"}
        for (String s : sArr) {
            System.out.println(s);
        }
        
        // 한글자씩 분리 저장하기
        String s5 = "ABC";
        char[] cArr = s5.toCharArray(); // {'A', 'B', 'C'}
        for (char ch : cArr) {
            System.out.println(ch);
        }

        // 문자열 비교
        String s33 = s3.trim().replaceAll(" ", "");
        System.out.println(s33.equals("asdf")); // 기본형 아니므로 == 사용 금지

    }
}
