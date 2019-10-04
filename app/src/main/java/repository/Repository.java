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
        oldfriends.add(new SnapStory("shadslattery", ""));
        oldfriends.add(new SnapStory("troytaylor", ""));
        oldfriends.add(new SnapStory("thissucks", ""));
    }
}

