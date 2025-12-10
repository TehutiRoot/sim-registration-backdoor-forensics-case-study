package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006#"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", TextBundle.TEXT_ENTRY, "", "setText", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "setTextLabel", "getTextLabel", "textHint", "setTextHint", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "isShowIconRight", "(Z)V", "", TypedValues.Custom.S_COLOR, "setTextLabelTextColor", "(Landroid/content/Context;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Landroid/content/res/TypedArray;", "Landroid/content/res/TypedArray;", "attributes", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "inflater", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextLayoutView */
/* loaded from: classes7.dex */
public final class OneTextLayoutView extends FrameLayout {
    public static final int $stable = 8;

    /* renamed from: a */
    public TypedArray f82881a;

    /* renamed from: b */
    public final LayoutInflater f82882b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextLayoutView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneTextLayoutView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…leable.OneTextLayoutView)");
        this.f82881a = obtainStyledAttributes;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f82882b = (LayoutInflater) systemService;
        m19851a();
    }

    /* renamed from: a */
    public final void m19851a() {
        addView(this.f82882b.inflate(R.layout.one_text_layout, (ViewGroup) null));
        View findViewById = findViewById(R.id.labelName);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.labelName)");
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById;
        View findViewById2 = findViewById(R.id.labelValue);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.labelValue)");
        OneFontTextView oneFontTextView2 = (OneFontTextView) findViewById2;
        View findViewById3 = findViewById(R.id.btnRight);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.btnRight)");
        ImageView imageView = (ImageView) findViewById3;
        if (this.f82881a.hasValue(R.styleable.OneTextLayoutView_android_text)) {
            TypedArray typedArray = this.f82881a;
            oneFontTextView2.setText(typedArray.getText(typedArray.getResourceId(R.styleable.OneTextLayoutView_android_text, 0)));
        }
        if (this.f82881a.hasValue(R.styleable.OneTextLayoutView_android_textSize)) {
            oneFontTextView2.setTextSize(this.f82881a.getDimension(R.styleable.OneTextLayoutView_android_textSize, 0.0f));
        }
        if (this.f82881a.hasValue(R.styleable.OneTextLayoutView_label_text)) {
            setTextLabel(this.f82881a.getText(R.styleable.OneTextLayoutView_label_text).toString());
        }
        if (this.f82881a.hasValue(R.styleable.OneTextLayoutView_label_text_size)) {
            oneFontTextView.setTextSize(this.f82881a.getDimension(R.styleable.OneTextLayoutView_label_text_size, 0.0f));
        }
        if (this.f82881a.hasValue(R.styleable.OneTextLayoutView_isShowIconRight)) {
            if (this.f82881a.getBoolean(R.styleable.OneTextLayoutView_isShowIconRight, false)) {
                ViewVisibleExtKt.toVisible(imageView);
            } else {
                ViewVisibleExtKt.toGone(imageView);
            }
        }
    }

    @NotNull
    public final String getText() {
        View findViewById = findViewById(R.id.labelValue);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.labelValue)");
        String obj = ((OneFontTextView) findViewById).getText().toString();
        if (obj == null) {
            return "";
        }
        return obj;
    }

    @NotNull
    public final String getTextLabel() {
        View findViewById = findViewById(R.id.labelValue);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.labelValue)");
        return ((OneFontTextView) findViewById).getText().toString();
    }

    public final void isShowIconRight(boolean z) {
        View findViewById = findViewById(R.id.btnRight);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.btnRight)");
        ImageView imageView = (ImageView) findViewById;
        if (z) {
            ViewVisibleExtKt.toVisible(imageView);
        } else {
            ViewVisibleExtKt.toGone(imageView);
        }
    }

    public final void setText(@Nullable String str) {
        View findViewById = findViewById(R.id.labelValue);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.labelValue)");
        ((OneFontTextView) findViewById).setText(StringExtKt.toDisplayEmpty(str));
    }

    public final void setTextHint(@NotNull String textHint) {
        Intrinsics.checkNotNullParameter(textHint, "textHint");
        View findViewById = findViewById(R.id.labelValue);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.labelValue)");
        ((OneFontTextView) findViewById).setHint(textHint);
    }

    public final void setTextLabel(@Nullable String str) {
        View findViewById = findViewById(R.id.labelName);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.labelName)");
        ((OneFontTextView) findViewById).setText(StringExtKt.toDisplayEmpty(str));
    }

    public final void setTextLabelTextColor(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        View findViewById = findViewById(R.id.labelName);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.labelName)");
        ((OneFontTextView) findViewById).setTextColor(ContextCompat.getColor(context, i));
    }
}
