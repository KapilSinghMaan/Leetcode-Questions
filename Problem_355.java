// 355. Design Twitter

// https://leetcode.com/problems/design-twitter/description/

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Problem_355 {

    public static int timeStamp = 0;

    private Map<Integer, User> userMap;

    private class Tweet {
        public int id;

        public int time;
        public Tweet next;

        public Tweet(int id) {
            this.id = id;
            time = timeStamp;
            timeStamp++;
            next = null;
        }
    }

    public class User {

        public int id;
        public Set<Integer> followed;
        public Tweet tweet_head;

        public User(int id) {
            this.id = id;
            followed = new HashSet<>();
            follow(id);
            tweet_head = null;
        }

        public void follow(int id) {
            followed.add(id);
        }

        public void unfollow(int id) {
            followed.remove(id);
        }

        public void post(int id) {
            Tweet t = new Tweet(id);
            t.next = tweet_head;
            tweet_head = t;
        }
    }

    public Problem_355() // constructor name same as class name
    {
        userMap=new HashMap<Integer,User>();
    }

    public void postTweet(int userId, int tweetId) {
        if (!userMap.containsKey(userId)) {
            User s=new User(userId);
            userMap.put(userId, s);
        }

        userMap.get(userId).post(tweetId);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res =new LinkedList<>();

        if (!userMap.containsKey(userId)) {
            return res;
        }

        Set<Integer> users=userMap.get(userId).followed;

        PriorityQueue<Tweet> q=new PriorityQueue<Tweet>(users.size(), (a,b)-> (b.time-a.time));

        for (int user : users) {
            Tweet t=userMap.get(user).tweet_head;
            if (t!=null) {
                q.add(t);
            }
        }

        int n=0;

        while (!q.isEmpty() && n<10) {
            Tweet t=q.poll();

            res.add(t.id);
            n++;

            if (t.next!=null) {
                q.add(t.next);
            }
        }

        return res;
    }

    public void follow(int followerId, int followeeId) {

        if (!userMap.containsKey(followerId)) {
            User s=new User(followerId);
            userMap.put(followerId, s);
        }

        if (!userMap.containsKey(followeeId)) {
            User s=new User(followeeId);
            userMap.put(followeeId, s);
        }

        userMap.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (!userMap.containsKey(followerId)|| followeeId==followerId) {
            return;
        }

        userMap.get(followerId).unfollow(followeeId);
    }
}
