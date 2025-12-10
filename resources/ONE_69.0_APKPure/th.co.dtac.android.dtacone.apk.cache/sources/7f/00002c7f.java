package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m29142d2 = {"Landroidx/compose/material/SwipeProgress;", "T", "", "from", TypedValues.TransitionType.S_TO, "", "fraction", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getFrom", "()Ljava/lang/Object;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTo", OperatorName.CURVE_TO, "F", "getFraction", "()F", "material_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class SwipeProgress<T> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final Object f14718a;

    /* renamed from: b */
    public final Object f14719b;

    /* renamed from: c */
    public final float f14720c;

    public SwipeProgress(T t, T t2, float f) {
        this.f14718a = t;
        this.f14719b = t2;
        this.f14720c = f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) obj;
        if (Intrinsics.areEqual(this.f14718a, swipeProgress.f14718a) && Intrinsics.areEqual(this.f14719b, swipeProgress.f14719b) && this.f14720c == swipeProgress.f14720c) {
            return true;
        }
        return false;
    }

    public final float getFraction() {
        return this.f14720c;
    }

    public final T getFrom() {
        return (T) this.f14718a;
    }

    public final T getTo() {
        return (T) this.f14719b;
    }

    public int hashCode() {
        int i;
        Object obj = this.f14718a;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.f14719b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.floatToIntBits(this.f14720c);
    }

    @NotNull
    public String toString() {
        return "SwipeProgress(from=" + this.f14718a + ", to=" + this.f14719b + ", fraction=" + this.f14720c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}