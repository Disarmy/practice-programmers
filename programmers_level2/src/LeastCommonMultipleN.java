public class LeastCommonMultipleN {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = LCM(answer, arr[i]);
        }

        return answer;
    }

    public int GCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
