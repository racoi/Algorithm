class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < skill_trees[i].length(); j++) {	
                char ch = skill_trees[i].charAt(j);
                
                if (skill.contains(ch + "")) sb.append(ch);
            }
            if(skill.indexOf(sb.toString()) == 0) answer++;
        }
        return answer;
    }
}