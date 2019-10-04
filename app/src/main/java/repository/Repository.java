package repository;

import com.example.snapchatmvvm.model.SnapStory;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    // Step 1: Private Constructor
    private Repository() {
    }

    // Step 2: static class to hold Instance
    static class InstanceHolder {

        // Step 3: create INSTANCE of object or class
        static Repository INSTANCE = new Repository();
    }

    // Step 4: public static method to get the instance
    public static Repository getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public List<SnapStory> getData() {
        List<SnapStory> oldfriends = new ArrayList<>();
        oldfriends.add(new SnapStory("shadslattery","https://kaboompics.com/cache/e/f/3/4/e/ef34e9818ff86a0bb5ac144a0189be29a1644c54.jpeg?version=v52"));
        oldfriends.add(new SnapStory("troytaylor", "https://kaboompics.com/cache/e/f/3/4/e/ef34e9818ff86a0bb5ac144a0189be29a1644c54.jpeg?version=v52"));
        oldfriends.add(new SnapStory("thissucks", "https://kaboompics.com/cache/e/f/3/4/e/ef34e9818ff86a0bb5ac144a0189be29a1644c54.jpeg?version=v52"));
        return oldfriends;
    }
}

