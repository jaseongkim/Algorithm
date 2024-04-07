class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i<=right; i++) {
            int cnt = 0;
            
            for(int j = 1; j * j<= i; j++ ) {
                if(j * j == i) {
                    cnt += 1;
                } else if( i % j == 0) {
                    cnt += 2;
                }
            }
            
            if(cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}