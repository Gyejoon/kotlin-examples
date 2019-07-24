package com.gyejoong.login

import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

/**
 * Created by 00700mm@gmail.com on 2019-07-24
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
class Styles : Stylesheet() {
    companion object {
        val loginScreen by cssclass()
    }

    init {
        loginScreen {
            padding = box(15.px)
            vgap = 7.px
            hgap = 10.px
        }
    }
}