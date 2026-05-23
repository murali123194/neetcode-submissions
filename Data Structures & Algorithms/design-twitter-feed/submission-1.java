class Twitter {
    int count = 0;
    Map<Integer, Set<Integer>> follows;
    Map<Integer, List<int[]>> tweets;

    public Twitter() {
        follows = new HashMap<>();
        tweets = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (!tweets.containsKey(userId)) {
            tweets.put(userId, new ArrayList<>());
        }
        int[] A = new int[2];
        A[0] = count++;
        A[1] = tweetId;
        tweets.get(userId).add(A);
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        // FIX 1
        if (!follows.containsKey(userId)) {
            follows.put(userId, new HashSet<>());
        }

        for (int followees : follows.get(userId)) {
            // FIX 2
            if (!tweets.containsKey(followees)) continue;
            for (int[] A : tweets.get(followees)) {
                pq.add(A);
            }
        }

        // FIX 3
        if (tweets.containsKey(userId)) {
            for (int[] tweet : tweets.get(userId)) {
                pq.add(tweet);
            }
        }

        List<Integer> res = new LinkedList<>();
        int i = 10;
        while (!pq.isEmpty() && i > 0) {
            res.add(pq.poll()[1]);
            i--;
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId)return;
        if (!follows.containsKey(followerId)) {
            follows.put(followerId, new HashSet<>());
        }
        follows.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        // FIX 4
        if(followerId==followeeId)return;
        if (!follows.containsKey(followerId)) return;
        follows.get(followerId).remove(followeeId);
    }
}
