
package com.ashwini.campusflow;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

    public Map<String, String> getStatus() {
        Map<String, String> status = new HashMap<>();

        status.put("application", "CampusFlow");
        status.put("status", "UP");

        return status;
    }
}
