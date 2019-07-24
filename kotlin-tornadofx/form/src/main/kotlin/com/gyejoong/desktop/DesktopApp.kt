package com.gyejoong.desktop

import tornadofx.App
import tornadofx.launch

class DesktopApp : App(CustomerView::class, Styles::class)

fun main(args: Array<String>) {
    launch<DesktopApp>()
}