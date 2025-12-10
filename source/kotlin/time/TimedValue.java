package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.9")
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\u0082\u0002\u0004\n\u0002\b!¨\u0006 "}, m28850d2 = {"Lkotlin/time/TimedValue;", "T", "", "value", "Lkotlin/time/Duration;", TypedValues.TransitionType.S_DURATION, "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/Object;", "component2-UwyO8pc", "()J", "component2", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getValue", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getDuration-UwyO8pc", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes6.dex */
public final class TimedValue<T> {

    /* renamed from: a */
    public final Object f70570a;

    /* renamed from: b */
    public final long f70571b;

    public /* synthetic */ TimedValue(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-RFiDyg4$default  reason: not valid java name */
    public static /* synthetic */ TimedValue m74654copyRFiDyg4$default(TimedValue timedValue, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = timedValue.f70570a;
        }
        if ((i & 2) != 0) {
            j = timedValue.f70571b;
        }
        return timedValue.m74656copyRFiDyg4(obj, j);
    }

    public final T component1() {
        return (T) this.f70570a;
    }

    /* renamed from: component2-UwyO8pc  reason: not valid java name */
    public final long m74655component2UwyO8pc() {
        return this.f70571b;
    }

    @NotNull
    /* renamed from: copy-RFiDyg4  reason: not valid java name */
    public final TimedValue<T> m74656copyRFiDyg4(T t, long j) {
        return new TimedValue<>(t, j, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimedValue) {
            TimedValue timedValue = (TimedValue) obj;
            return Intrinsics.areEqual(this.f70570a, timedValue.f70570a) && Duration.m74534equalsimpl0(this.f70571b, timedValue.f70571b);
        }
        return false;
    }

    /* renamed from: getDuration-UwyO8pc  reason: not valid java name */
    public final long m74657getDurationUwyO8pc() {
        return this.f70571b;
    }

    public final T getValue() {
        return (T) this.f70570a;
    }

    public int hashCode() {
        Object obj = this.f70570a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + Duration.m74554hashCodeimpl(this.f70571b);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.f70570a + ", duration=" + ((Object) Duration.m74573toStringimpl(this.f70571b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TimedValue(Object obj, long j) {
        this.f70570a = obj;
        this.f70571b = j;
    }
}
