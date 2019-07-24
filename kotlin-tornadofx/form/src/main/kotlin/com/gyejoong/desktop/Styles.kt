package com.gyejoong.desktop

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
        val zip by cssclass()
    }

    init {
        s(form) {
            padding = box(25.px)
            prefWidth = 450.px

            s(zip) {
                maxWidth = 60.px
                minWidth = maxWidth
            }

        }
    }
}