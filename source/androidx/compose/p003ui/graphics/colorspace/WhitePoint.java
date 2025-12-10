package androidx.compose.p003ui.graphics.colorspace;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bB)\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, m28850d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(FF)V", "z", "(FFF)V", "sum", "(FFFF)V", "", "toXyz$ui_graphics_release", "()[F", "toXyz", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getX", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getY", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.colorspace.WhitePoint */
/* loaded from: classes2.dex */
public final class WhitePoint {

    /* renamed from: a */
    public final float f29304a;

    /* renamed from: b */
    public final float f29305b;

    public WhitePoint(float f, float f2) {
        this.f29304a = f;
        this.f29305b = f2;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = whitePoint.f29304a;
        }
        if ((i & 2) != 0) {
            f2 = whitePoint.f29305b;
        }
        return whitePoint.copy(f, f2);
    }

    public final float component1() {
        return this.f29304a;
    }

    public final float component2() {
        return this.f29305b;
    }

    @NotNull
    public final WhitePoint copy(float f, float f2) {
        return new WhitePoint(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WhitePoint) {
            WhitePoint whitePoint = (WhitePoint) obj;
            return Float.compare(this.f29304a, whitePoint.f29304a) == 0 && Float.compare(this.f29305b, whitePoint.f29305b) == 0;
        }
        return false;
    }

    public final float getX() {
        return this.f29304a;
    }

    public final float getY() {
        return this.f29305b;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f29304a) * 31) + Float.floatToIntBits(this.f29305b);
    }

    @NotNull
    public String toString() {
        return "WhitePoint(x=" + this.f29304a + ", y=" + this.f29305b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @NotNull
    public final float[] toXyz$ui_graphics_release() {
        float f = this.f29304a;
        float f2 = this.f29305b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public WhitePoint(float f, float f2, float f3) {
        this(f, f2, f3, f + f2 + f3);
    }

    public WhitePoint(float f, float f2, float f3, float f4) {
        this(f / f4, f2 / f4);
    }
}
