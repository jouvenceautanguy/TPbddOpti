package com.exo1.exo1.controller;

import com.exo1.exo1.entity.ProjectTaskCount;
import com.exo1.exo1.service.ProjectTaskCountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/project-task-counts")
@AllArgsConstructor
public class ProjectTaskCountController {
    private final ProjectTaskCountService projectTaskCountService;

    @GetMapping
    public List<ProjectTaskCount> getProjectTaskCounts() {
        return projectTaskCountService.getProjectTaskCounts();
    }

    @PostMapping("/refresh")
    public void refreshMaterializedView() {
        projectTaskCountService.refreshMaterializedView();
    }
}