
public class Array5 {
    public static void main(String[] args) {
        String str = "Programming is fun!Right?";
        char[] charArr = str.toCharArray(); // 문자열 str 문자배열변환
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            // System.out.println(charArr[i]);
            if (charArr[i] == 'R' || charArr[i] == 'r') {
                count++;
            }
        }
        System.out.println(str);
        System.out.printf("=> R(r)의 갯수 : %d", count);

    }
}
