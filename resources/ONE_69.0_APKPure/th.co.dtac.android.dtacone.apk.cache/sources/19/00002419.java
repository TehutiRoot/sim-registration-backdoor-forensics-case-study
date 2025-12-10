package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ScrollState$scrollableState$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ ScrollState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }

    @NotNull
    public final Float invoke(float f) {
        float f2;
        f2 = this.this$0.f13002e;
        float value = this.this$0.getValue() + f + f2;
        float coerceIn = AbstractC11695c.coerceIn(value, 0.0f, this.this$0.getMaxValue());
        boolean z = !(value == coerceIn);
        float value2 = coerceIn - this.this$0.getValue();
        int roundToInt = AbstractC22237sr0.roundToInt(value2);
        ScrollState scrollState = this.this$0;
        scrollState.m61489a(scrollState.getValue() + roundToInt);
        this.this$0.f13002e = value2 - roundToInt;
        if (z) {
            f = value2;
        }
        return Float.valueOf(f);
    }
}