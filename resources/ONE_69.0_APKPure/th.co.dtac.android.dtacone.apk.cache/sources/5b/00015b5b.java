package th.p047co.dtac.android.dtacone.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Landroid/content/res/TypedArray;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.TextViewTopLabelView$typedArray$2 */
/* loaded from: classes9.dex */
public final class TextViewTopLabelView$typedArray$2 extends Lambda implements Function0<TypedArray> {
    final /* synthetic */ AttributeSet $attributes;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewTopLabelView$typedArray$2(Context context, AttributeSet attributeSet) {
        super(0);
        this.$context = context;
        this.$attributes = attributeSet;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final TypedArray invoke() {
        TypedArray obtainStyledAttributes = this.$context.obtainStyledAttributes(this.$attributes, R.styleable.TextViewTopLabelView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…xtViewTopLabelView, 0, 0)");
        return obtainStyledAttributes;
    }
}