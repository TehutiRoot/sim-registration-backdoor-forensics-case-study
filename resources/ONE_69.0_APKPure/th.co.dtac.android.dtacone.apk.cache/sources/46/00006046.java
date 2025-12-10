package androidx.compose.p003ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 */
/* loaded from: classes2.dex */
public final class Rgb$eotf$1 extends Lambda implements Function1<Double, Double> {
    final /* synthetic */ Rgb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }

    @NotNull
    public final Double invoke(double d) {
        float f;
        float f2;
        DoubleFunction eotfOrig$ui_graphics_release = this.this$0.getEotfOrig$ui_graphics_release();
        f = this.this$0.f29371e;
        double d2 = f;
        f2 = this.this$0.f29372f;
        return Double.valueOf(eotfOrig$ui_graphics_release.invoke(AbstractC11695c.coerceIn(d, d2, f2)));
    }
}