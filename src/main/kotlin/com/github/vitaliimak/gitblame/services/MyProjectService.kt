package com.github.vitaliimak.gitblame.services

import com.intellij.openapi.project.Project
import com.github.vitaliimak.gitblame.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
