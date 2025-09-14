import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;

        int maxX = board[0] / 2; // 좌우 한계
        int maxY = board[1] / 2; // 상하 한계

        int[] dx = {0, 0, 1, -1};   // down, up, right, left
        int[] dy = {-1, 1, 0, 0};

        Map<String, Integer> h = new HashMap<>();
        h.put("down", 0);
        h.put("up", 1);
        h.put("right", 2);
        h.put("left", 3);

        for (String s : keyinput) {
            int dir = h.get(s);

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 다음 좌표가 범위를 벗어나는지 체크
            if (Math.abs(nx) <= maxX && Math.abs(ny) <= maxY) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}