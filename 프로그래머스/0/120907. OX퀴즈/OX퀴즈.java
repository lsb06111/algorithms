class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[][] spl = new String[quiz.length][];
        for(int i=0; i < quiz.length; i++){
            spl[i] = quiz[i].split(" ");
        }
        
        int index = 0;
        for(String[] sp : spl){
            
            int x = Integer.parseInt(sp[0]);
            String ex = sp[1];
            int y = Integer.parseInt(sp[2]);
            int z = Integer.parseInt(sp[4]);
            
            switch(ex){
                case "-":
                    answer[index] = (x-y==z) ? "O" : "X";
                    break;
                case "+":
                    answer[index] = (x+y==z) ? "O" : "X";
            }
            
            index++;
        }
            
        return answer;
    }
}