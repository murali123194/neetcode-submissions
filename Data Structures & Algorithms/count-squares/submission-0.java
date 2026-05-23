class CountSquares {

    Set<int[]> points;
    Map<String, Integer> map;

    public CountSquares() {
        points = new HashSet<>();
        map = new HashMap<>();
    }

    private String key(int x, int y) {
        return x + "," + y;
    }

    public void add(int[] point) {
        String k = key(point[0], point[1]);
        map.put(k, map.getOrDefault(k, 0) + 1);
        points.add(point);
    }

    public int count(int[] point) {
        int res = 0;

        for (int[] p : points) {
            int x = p[0];
            int y = p[1];

            // must form diagonal
            if (Math.abs(x - point[0]) != Math.abs(y - point[1]) ||
                x == point[0] || y == point[1]) {
                continue;
            }

            String p1 = key(x, point[1]);
            String p2 = key(point[0], y);

            if (map.containsKey(p1) && map.containsKey(p2)) {
                res += map.get(p1) * map.get(p2);
            }
        }
        return res;
    }
}
