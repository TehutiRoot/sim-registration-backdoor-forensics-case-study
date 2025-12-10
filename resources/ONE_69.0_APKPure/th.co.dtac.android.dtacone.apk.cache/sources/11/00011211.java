package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
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

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneSelectLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getValueText", "()Ljava/lang/String;", TextBundle.TEXT_ENTRY, "", "setValueText", "(Ljava/lang/String;)V", "", "lines", "setMaxLine", "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/res/TypedArray;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/res/TypedArray;", "attributes", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneSelectLayout */
/* loaded from: classes7.dex */
public final class OneSelectLayout extends FrameLayout {
    public static final int $stable = 8;

    /* renamed from: a */
    public final LayoutInflater f82930a;

    /* renamed from: b */
    public final TypedArray f82931b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSelectLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f82930a = (LayoutInflater) systemService;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneSelectLayout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.OneSelectLayout)");
        this.f82931b = obtainStyledAttributes;
        m20061a();
    }

    public static /* synthetic */ void setMaxLine$default(OneSelectLayout oneSelectLayout, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        oneSelectLayout.setMaxLine(i);
    }

    /* renamed from: a */
    public final void m20061a() {
        addView(this.f82930a.inflate(R.layout.one_select_layout, (ViewGroup) null));
        View findViewById = findViewById(R.id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvTitle)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.tvValue);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.tvValue)");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.tvHint);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.tvHint)");
        TextView textView3 = (TextView) findViewById3;
        CharSequence text = this.f82931b.getText(R.styleable.OneSelectLayout_title_text);
        if (text != null) {
            textView.setText(text);
        }
        CharSequence text2 = this.f82931b.getText(R.styleable.OneSelectLayout_hint_text);
        if (text2 != null) {
            textView3.setText(text2);
        }
        CharSequence text3 = this.f82931b.getText(R.styleable.OneSelectLayout_max_line);
        if (text3 != null) {
            textView2.setMaxLines(Integer.parseInt(text3.toString()));
        }
    }

    @NotNull
    public final String getValueText() {
        View findViewById = findViewById(R.id.tvValue);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvValue)");
        return ((TextView) findViewById).getText().toString();
    }

    public final void setMaxLine(int i) {
        View findViewById = findViewById(R.id.tvValue);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvValue)");
        ((TextView) findViewById).setMaxLines(i);
    }

    public final void setValueText(@Nullable String str) {
        View findViewById = findViewById(R.id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvTitle)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.tvValue);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.tvValue)");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.tvHint);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.tvHint)");
        TextView textView3 = (TextView) findViewById3;
        if (str != null && str.length() != 0) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
            textView3.setVisibility(8);
            textView2.setText(StringExtKt.toDisplayEmpty(str));
            return;
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
        textView3.setVisibility(0);
    }
}