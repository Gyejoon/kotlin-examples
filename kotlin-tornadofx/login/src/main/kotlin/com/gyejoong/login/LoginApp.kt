package com.gyejoong.login

import javafx.stage.Stage
import tornadofx.App
import tornadofx.launch

class DesktopApp : App(LoginScreen::class, Styles::class) {
    val loginController: LoginController by inject()

    override fun start(stage: Stage) {
        super.start(stage)
        loginController.init()
    }
}


fun main(args: Array<String>) {
    launch<DesktopApp>()
}