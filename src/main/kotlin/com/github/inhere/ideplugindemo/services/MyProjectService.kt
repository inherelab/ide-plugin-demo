package com.github.inhere.ideplugindemo.services

import com.intellij.openapi.project.Project
import com.github.inhere.ideplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
