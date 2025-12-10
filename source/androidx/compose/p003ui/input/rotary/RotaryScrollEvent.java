package androidx.compose.p003ui.input.rotary;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m28850d2 = {"Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "", "verticalScrollPixels", "horizontalScrollPixels", "", "uptimeMillis", "<init>", "(FFJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getVerticalScrollPixels", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getHorizontalScrollPixels", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getUptimeMillis", "()J", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRotaryScrollEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* renamed from: androidx.compose.ui.input.rotary.RotaryScrollEvent */
/* loaded from: classes2.dex */
public final class RotaryScrollEvent {
    public static final int $stable = 0;

    /* renamed from: a */
    public final float f30036a;

    /* renamed from: b */
    public final float f30037b;

    /* renamed from: c */
    public final long f30038c;

    public RotaryScrollEvent(float f, float f2, long j) {
        this.f30036a = f;
        this.f30037b = f2;
        this.f30038c = j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof RotaryScrollEvent) {
            RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
            if (rotaryScrollEvent.f30036a == this.f30036a && rotaryScrollEvent.f30037b == this.f30037b && rotaryScrollEvent.f30038c == this.f30038c) {
                return true;
            }
        }
        return false;
    }

    public final float getHorizontalScrollPixels() {
        return this.f30037b;
    }

    public final long getUptimeMillis() {
        return this.f30038c;
    }

    public final float getVerticalScrollPixels() {
        return this.f30036a;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f30036a) * 31) + Float.floatToIntBits(this.f30037b)) * 31) + AbstractC17792Ig1.m67882a(this.f30038c);
    }

    @NotNull
    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f30036a + ",horizontalScrollPixels=" + this.f30037b + ",uptimeMillis=" + this.f30038c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
