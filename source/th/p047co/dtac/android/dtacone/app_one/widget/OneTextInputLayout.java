package th.p047co.dtac.android.dtacone.app_one.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.MultiLanguageUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r0", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayout */
/* loaded from: classes7.dex */
public class OneTextInputLayout extends TextInputLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextInputLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m19884r0(context);
    }

    /* renamed from: r0 */
    public final void m19884r0(Context context) {
        setTypeface(ResourcesCompat.getFont(context, R.font.one_font_style));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public OneTextInputLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Typeface font;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m19884r0(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneFontTextView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.OneFontTextView)");
        try {
            int i = obtainStyledAttributes.getInt(R.styleable.OneFontTextView_android_textStyle, 0);
            if (i == 0) {
                font = ResourcesCompat.getFont(context, R.font.better_together_regular);
            } else if (i != 1) {
                font = ResourcesCompat.getFont(context, R.font.one_font_style);
            } else {
                font = ResourcesCompat.getFont(context, R.font.better_together_medium);
            }
            setTypeface(font);
            MultiLanguageUtil.setLanguageToView(obtainStyledAttributes, this);
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextInputLayout(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m19884r0(context);
    }
}
