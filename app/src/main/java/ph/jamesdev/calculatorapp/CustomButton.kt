package ph.jamesdev.calculatorapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatButton
import android.view.ViewGroup.MarginLayoutParams


class CustomButton : AppCompatButton {

    constructor(context: Context) : super(context) {
        applyCustomStyle()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        applyCustomStyle()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        applyCustomStyle()
    }

    private fun applyCustomStyle() {

        val backgroundDrawable: Drawable? = AppCompatResources.getDrawable(context, R.drawable.custom_button_background)
        background = backgroundDrawable

        val textSize = resources.getDimensionPixelSize(R.dimen.custom_button_text_size).toFloat()
        setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)

        val padding = resources.getDimensionPixelSize(R.dimen.custom_button_padding)
        setPadding(padding, padding, padding, padding)

        // Customize other attributes as needed
    }
}