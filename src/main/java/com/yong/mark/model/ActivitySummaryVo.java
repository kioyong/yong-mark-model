package com.yong.mark.model;

import lombok.Data;

import java.util.List;

@Data
public class ActivitySummaryVo {
    private String id;
    private Long opener;
    private Long credit;
    private Long fill;
    private List<ActivitySession> activitySessions;
}
