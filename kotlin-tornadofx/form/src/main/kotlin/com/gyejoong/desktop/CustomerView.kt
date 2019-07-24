package com.gyejoong.desktop

import com.gyejoong.desktop.Styles.Companion.zip
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon.HOME
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon.USER
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView
import org.controlsfx.control.Notifications
import tornadofx.*

/**
 * Created by 00700mm@gmail.com on 2019-07-24
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
class CustomerView : View("Register Customer") {
    val model: CustomerModel by inject()

    override val root = form {
        fieldset("개인 정보", FontAwesomeIconView(USER)) {
            field("Name") {
                textfield(model.name).required()
            }

            field("Birthday") {
                datepicker(model.birthday)
            }
        }

        fieldset("주소", FontAwesomeIconView(HOME)) {
            field("Street") {
                textfield(model.street).required()
            }

            field("Zip / City") {
                textfield(model.zip) {
                    addClass(zip)
                    required()
                }
                textfield(model.city).required()
            }
        }

        button("저장") {
            action {
                model.commit {
                    Notifications.create()
                            .title("성공적으로 저장 되었습니다.")
                            .owner(this)
                            .showInformation()
                }
            }
            enableWhen(model.valid)
        }
        
    }

}