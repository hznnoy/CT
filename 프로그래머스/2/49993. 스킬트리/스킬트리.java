class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String skill_tree : skill_trees){
            boolean isMin = true; // idx보다 작은 nextIdx 있는지 확인하는 변수
            boolean isContain = false;
            
            for(int i=0; i<skill.length()-1; i++){
                char c = skill.charAt(i);
                int idx = skill_tree.indexOf(c);
                if(idx!=-1){
                    for(int j=i+1; j<skill.length(); j++){
                        char nextC = skill.charAt(j);
                        int nextIdx = skill_tree.indexOf(nextC);
                        if(nextIdx!=-1){
                            if(idx>nextIdx) {
                                isMin = false; 
                                break;
                            }
                        }
                    }
                }else if(idx==-1){ // 첫번째 스킬이 트리에 없는 경우
                    for(int j=i+1; j<skill.length(); j++){
                        char nextC = skill.charAt(j);
                        int nextIdx = skill_tree.indexOf(nextC);
                        if(nextIdx!=-1){
                            isContain = true;
                            break;
                        }
                    }
                    if(isContain){ // 첫번째 스킬 이후의 스킬이 존재하는 경우 false
                        isMin = false;
                    }
                }
            
            }
            if(isMin) answer++; // 가능한 스킬트리인 경우 ++
        }
            
        return answer;
    }
}