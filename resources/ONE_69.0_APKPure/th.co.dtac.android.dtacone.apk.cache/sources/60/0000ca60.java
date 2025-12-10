package io.fotoapparat.hardware.metering;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, m29142d2 = {"Lio/fotoapparat/hardware/metering/PointF;", "", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Lio/fotoapparat/hardware/metering/PointF;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getX", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getY", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PointF {

    /* renamed from: a */
    public final float f63048a;

    /* renamed from: b */
    public final float f63049b;

    public PointF(float f, float f2) {
        this.f63048a = f;
        this.f63049b = f2;
    }

    public static /* synthetic */ PointF copy$default(PointF pointF, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pointF.f63048a;
        }
        if ((i & 2) != 0) {
            f2 = pointF.f63049b;
        }
        return pointF.copy(f, f2);
    }

    public final float component1() {
        return this.f63048a;
    }

    public final float component2() {
        return this.f63049b;
    }

    @NotNull
    public final PointF copy(float f, float f2) {
        return new PointF(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointF) {
            PointF pointF = (PointF) obj;
            return Float.compare(this.f63048a, pointF.f63048a) == 0 && Float.compare(this.f63049b, pointF.f63049b) == 0;
        }
        return false;
    }

    public final float getX() {
        return this.f63048a;
    }

    public final float getY() {
        return this.f63049b;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f63048a) * 31) + Float.floatToIntBits(this.f63049b);
    }

    @NotNull
    public String toString() {
        float f = this.f63048a;
        float f2 = this.f63049b;
        return "PointF(x=" + f + ", y=" + f2 + ")";
    }
}