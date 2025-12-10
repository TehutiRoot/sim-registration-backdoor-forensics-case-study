package androidx.compose.animation;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m29142d2 = {"", "friction", "density", PDPageLabelRange.STYLE_LETTERS_LOWER, "(FF)F", "F", "DecelerationRate", "animation_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FlingCalculatorKt {

    /* renamed from: a */
    public static final float f12472a = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: a */
    public static final float m61674a(float f, float f2) {
        return f2 * 386.0878f * 160.0f * f;
    }
}