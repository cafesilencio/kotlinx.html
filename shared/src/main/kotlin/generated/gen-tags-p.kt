package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class P(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("p", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class PARAM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("param", consumer, initialAttributes), CoreAttributeGroupFacade {
    var name : String
        get()  = attributeString_ffbab22b.get(this, "name")
        set(newValue) {attributeString_ffbab22b.set(this, "name", newValue)}

    var value : String
        get()  = attributeString_ffbab22b.get(this, "value")
        set(newValue) {attributeString_ffbab22b.set(this, "value", newValue)}


}

public class PRE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("pre", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class PROGRESS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("progress", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var value : String
        get()  = attributeString_ffbab22b.get(this, "value")
        set(newValue) {attributeString_ffbab22b.set(this, "value", newValue)}

    var max : String
        get()  = attributeString_ffbab22b.get(this, "max")
        set(newValue) {attributeString_ffbab22b.set(this, "max", newValue)}


}

