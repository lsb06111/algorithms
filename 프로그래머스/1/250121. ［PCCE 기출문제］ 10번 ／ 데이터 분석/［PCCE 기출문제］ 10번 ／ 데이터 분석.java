import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        HashMap<String,Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        ArrayList<int[]> arr = new ArrayList<>();
        for(int[] row : data){
            if(row[map.get(ext)] < val_ext){
                arr.add(row);
            }
        }
        Collections.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return p1[map.get(sort_by)] - p2[map.get(sort_by)]; 
            }
        });
        int[][] answer = new int[arr.size()][4];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}