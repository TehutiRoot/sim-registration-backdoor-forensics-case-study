package th.p047co.dtac.android.dtacone.app_one.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneButtonRed;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", TextBundle.TEXT_ENTRY, "", "setText", "(Ljava/lang/String;)V", "background", "setButtonBackground", "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Landroid/content/res/TypedArray;", "Landroid/content/res/TypedArray;", "attributes", "Landroid/view/LayoutInflater;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/View;", OperatorName.CURVE_TO, "Landroid/view/View;", Promotion.ACTION_VIEW, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "d", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvBtn", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootButton", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SuppressLint({"CustomViewStyleable"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneButtonRed */
/* loaded from: classes7.dex */
public final class OneButtonRed extends FrameLayout {
    public static final int $stable = 8;

    /* renamed from: a */
    public TypedArray f82749a;

    /* renamed from: b */
    public final LayoutInflater f82750b;

    /* renamed from: c */
    public final View f82751c;

    /* renamed from: d */
    public OneFontTextView f82752d;

    /* renamed from: e */
    public ConstraintLayout f82753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneButtonRed(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        this.f82750b = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.one_red_button, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layout.one_red_button, null)");
        this.f82751c = inflate;
        m19909a();
    }

    /* renamed from: a */
    public final void m19909a() {
        View findViewById = this.f82751c.findViewById(R.id.tvBtn);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvBtn)");
        this.f82752d = (OneFontTextView) findViewById;
        View findViewById2 = this.f82751c.findViewById(R.id.rootButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.rootButton)");
        this.f82753e = (ConstraintLayout) findViewById2;
        TypedArray typedArray = this.f82749a;
        TypedArray typedArray2 = null;
        if (typedArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("attributes");
            typedArray = null;
        }
        if (typedArray.hasValue(R.styleable.OneButton_android_text)) {
            OneFontTextView oneFontTextView = this.f82752d;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvBtn");
                oneFontTextView = null;
            }
            Context context = getContext();
            TypedArray typedArray3 = this.f82749a;
            if (typedArray3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attributes");
                typedArray3 = null;
            }
            oneFontTextView.setText(context.getText(typedArray3.getResourceId(R.styleable.OneButton_android_text, 0)));
        }
        TypedArray typedArray4 = this.f82749a;
        if (typedArray4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("attributes");
            typedArray4 = null;
        }
        if (typedArray4.hasValue(R.styleable.OneButton_android_textSize)) {
            OneFontTextView oneFontTextView2 = this.f82752d;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvBtn");
                oneFontTextView2 = null;
            }
            TypedArray typedArray5 = this.f82749a;
            if (typedArray5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attributes");
                typedArray5 = null;
            }
            oneFontTextView2.setTextSize(typedArray5.getDimension(R.styleable.OneButton_android_textSize, 0.0f));
        }
        TypedArray typedArray6 = this.f82749a;
        if (typedArray6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("attributes");
            typedArray6 = null;
        }
        if (typedArray6.hasValue(R.styleable.OneButton_android_textColor)) {
            OneFontTextView oneFontTextView3 = this.f82752d;
            if (oneFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvBtn");
                oneFontTextView3 = null;
            }
            TypedArray typedArray7 = this.f82749a;
            if (typedArray7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attributes");
            } else {
                typedArray2 = typedArray7;
            }
            oneFontTextView3.setTextColor(typedArray2.getColor(R.styleable.OneButton_android_textColor, 0));
        }
        addView(this.f82751c);
    }

    public final void setButtonBackground(int i) {
        ConstraintLayout constraintLayout = this.f82753e;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootButton");
            constraintLayout = null;
        }
        constraintLayout.setBackgroundResource(i);
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        OneFontTextView oneFontTextView = this.f82752d;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBtn");
            oneFontTextView = null;
        }
        oneFontTextView.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneButtonRed(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Object systemService = getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        this.f82750b = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.one_red_button, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layout.one_red_button, null)");
        this.f82751c = inflate;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneButton);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.OneButton)");
        this.f82749a = obtainStyledAttributes;
        m19909a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneButtonRed(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Object systemService = getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        this.f82750b = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.one_red_button, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layout.one_red_button, null)");
        this.f82751c = inflate;
        m19909a();
    }
}
