package com.github.balalals.bugtalk.services

import com.github.balalals.bugtalk.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
