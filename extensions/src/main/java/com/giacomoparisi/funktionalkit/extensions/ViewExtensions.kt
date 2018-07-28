package com.giacomoparisi.funktionalkit.extensions

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE


/**
 * Created by Giacomo Parisi on 17/07/18.
 * https://github.com/giacomoParisi
 */
object ViewUtils {

    fun dpTiPx(context: Context, dp: Float): Float {
        val res = context.resources
        return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dp,
                res.displayMetrics
        )
    }
}

var View.visibleOrGone: Boolean
    get() = visibility == VISIBLE
    set(value) {
        this.visibility = if (value) VISIBLE else GONE
    }
