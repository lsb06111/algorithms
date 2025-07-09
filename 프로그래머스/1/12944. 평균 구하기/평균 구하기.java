class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int ele : arr)
            sum += ele;
        answer = sum / arr.length;
        return answer;
    }
}