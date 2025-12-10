package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTooltipLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/res/TypedArray;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/res/TypedArray;", "attributes", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTooltipLayout */
/* loaded from: classes7.dex */
public final class OneTooltipLayout extends FrameLayout {
    public static final int $stable = 8;

    /* renamed from: a */
    public final LayoutInflater f82975a;

    /* renamed from: b */
    public final TypedArray f82976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTooltipLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f82975a = (LayoutInflater) systemService;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneTooltipLayout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…yleable.OneTooltipLayout)");
        this.f82976b = obtainStyledAttributes;
        m20025a();
    }

    /* renamed from: a */
    public final void m20025a() {
        addView(this.f82975a.inflate(R.layout.one_tooltip_layout, (ViewGroup) null));
        View findViewById = findViewById(R.id.tvTooltipText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvTooltipText)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.ivArrowDown);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.ivArrowDown)");
        ImageView imageView = (ImageView) findViewById2;
        CharSequence text = this.f82976b.getText(R.styleable.OneTooltipLayout_value_text);
        if (text != null) {
            textView.setText(text);
        }
        textView.setBackgroundResource(this.f82976b.getResourceId(R.styleable.OneTooltipLayout_background_text, R.drawable.bg_red7_corner_radius));
        imageView.setColorFilter(ContextCompat.getColor(getContext(), this.f82976b.getResourceId(R.styleable.OneTooltipLayout_tint_down_arrow, R.color.red7)));
        CharSequence text2 = this.f82976b.getText(R.styleable.OneTooltipLayout_max_line);
        if (text2 != null) {
            textView.setMaxLines(Integer.parseInt(text2.toString()));
        }
    }
}