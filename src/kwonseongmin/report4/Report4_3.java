package kwonseongmin.report4;
//5-3. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.
class Exercise5_3{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("sum="+sum);
    }
}//예상 결과 : sum=150