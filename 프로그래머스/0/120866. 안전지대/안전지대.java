class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] nonsafe = new int[board.length][board.length];
        for(int i=0; i < board.length; i++){
            for(int k=0; k < board[i].length; k++){
                if(board[i][k] == 1){
                    nonsafe[i][k] = 1;
                    if(i-1 >= 0 && k-1 >= 0) nonsafe[i-1][k-1] = 1;
                    if(i-1 >= 0) nonsafe[i-1][k] = 1;
                    if(i-1 >= 0 && k+1 < board.length) nonsafe[i-1][k+1] = 1;
                    if(k-1 >= 0) nonsafe[i][k-1] = 1;
                    if(k+1 < board.length) nonsafe[i][k+1] = 1;
                    if(i+1 < board.length && k-1 >= 0) nonsafe[i+1][k-1] = 1;
                    if(i+1 < board.length) nonsafe[i+1][k] = 1;
                    if(i+1 < board.length && k+1 < board.length) nonsafe[i+1][k+1] = 1;
                }
            }
        }
        for(int[] arr : nonsafe){
            for(int value : arr)
                if(value == 0)
                    answer++;
        }
        return answer;
    }
}