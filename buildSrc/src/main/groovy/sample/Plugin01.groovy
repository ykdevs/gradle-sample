/*
 * http://gradle.monochromeroad.com/docs/userguide/custom_plugins.html
 */
package sample

import org.gradle.api.Project
import org.gradle.api.Plugin

class Plugin01 implements Plugin<Project> {

    void apply(Project project) {
        project.task('task101') {
            doFirst {
                println("task101!!")
            }
        }
    }
}