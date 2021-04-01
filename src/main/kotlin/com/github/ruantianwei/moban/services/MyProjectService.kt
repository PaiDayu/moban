package com.github.ruantianwei.moban.services

import com.github.ruantianwei.moban.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
