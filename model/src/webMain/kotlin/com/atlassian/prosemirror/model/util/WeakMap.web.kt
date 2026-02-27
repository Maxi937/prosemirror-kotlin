package com.atlassian.prosemirror.model.util

import js.core.JsAny
import js.reflect.upcast
import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.js
import kotlin.js.unsafeCast
import js.collections.WeakMap

@OptIn(ExperimentalWasmJsInterop::class)
class WebWeakMap<K : Any, V> : com.atlassian.prosemirror.model.util.WeakMap<K, V> {

    private val map = WeakMap<JsAny, JsAny?>()

    override fun get(key: K): V? {
        return map.get(key.toJsReference()) as V?
    }

    override fun put(key: K, value: V) {
        map.set(
            key.toJsReference(),
            value?.toJsReference()
        )
    }
}

actual fun <K : Any, V : Any?> mutableWeakMapOf(): com.atlassian.prosemirror.model.util.WeakMap<K, V> = WebWeakMap()

