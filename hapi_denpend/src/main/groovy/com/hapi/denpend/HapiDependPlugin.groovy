package com.hapi.denpend

import org.gradle.api.Plugin
import org.gradle.api.Project

public class HapiDependPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.extensions.create("depend", DependsComp)
    }
}