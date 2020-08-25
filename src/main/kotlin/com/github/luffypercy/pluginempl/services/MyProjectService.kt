package com.github.luffypercy.pluginempl.services

import com.intellij.openapi.project.Project
import com.github.luffypercy.pluginempl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
