package androidx.compose.material.ripple;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, m29142d2 = {"Landroidx/compose/material/ripple/RippleAlpha;", "", "", "draggedAlpha", "focusedAlpha", "hoveredAlpha", "pressedAlpha", "<init>", "(FFFF)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getDraggedAlpha", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFocusedAlpha", OperatorName.CURVE_TO, "getHoveredAlpha", "d", "getPressedAlpha", "material-ripple_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RippleAlpha {
    public static final int $stable = 0;

    /* renamed from: a */
    public final float f25563a;

    /* renamed from: b */
    public final float f25564b;

    /* renamed from: c */
    public final float f25565c;

    /* renamed from: d */
    public final float f25566d;

    public RippleAlpha(float f, float f2, float f3, float f4) {
        this.f25563a = f;
        this.f25564b = f2;
        this.f25565c = f3;
        this.f25566d = f4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        if (this.f25563a == rippleAlpha.f25563a && this.f25564b == rippleAlpha.f25564b && this.f25565c == rippleAlpha.f25565c && this.f25566d == rippleAlpha.f25566d) {
            return true;
        }
        return false;
    }

    public final float getDraggedAlpha() {
        return this.f25563a;
    }

    public final float getFocusedAlpha() {
        return this.f25564b;
    }

    public final float getHoveredAlpha() {
        return this.f25565c;
    }

    public final float getPressedAlpha() {
        return this.f25566d;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f25563a) * 31) + Float.floatToIntBits(this.f25564b)) * 31) + Float.floatToIntBits(this.f25565c)) * 31) + Float.floatToIntBits(this.f25566d);
    }

    @NotNull
    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f25563a + ", focusedAlpha=" + this.f25564b + ", hoveredAlpha=" + this.f25565c + ", pressedAlpha=" + this.f25566d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}