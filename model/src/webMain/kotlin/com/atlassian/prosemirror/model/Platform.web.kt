package com.atlassian.prosemirror.model

import com.fleeksoft.ksoup.nodes.Element

class WebPlatform : Platform {
    override val name: String = "Web"
}

actual fun getPlatform(): Platform = WebPlatform()

actual fun evaluateXpathNode(s: String, dom: Element): Element {
    // TODO implement properly
//    val xPath = XPathFactory.newInstance().newXPath()
//    xPath.evaluate(contentElement.s, dom, XPathConstants.NODE) as Element
    return dom
}
