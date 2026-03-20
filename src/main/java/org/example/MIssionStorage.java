package org.example;

import java.util.ArrayList;
import java.util.List;

public class MIssionStorage {
    private static MIssionStorage instance;
    private List<Mission> missions;

    private MIssionStorage() {
        missions = new ArrayList<>();
    }

    public static MIssionStorage getInstance() {
        if (instance == null) {
            instance = new MIssionStorage();
        }
        return instance;
    }

    public void addMission(Mission mission) {
        missions.add(mission);
    }

    public List<Mission> getAllMissions() {
        return missions;
    }
}