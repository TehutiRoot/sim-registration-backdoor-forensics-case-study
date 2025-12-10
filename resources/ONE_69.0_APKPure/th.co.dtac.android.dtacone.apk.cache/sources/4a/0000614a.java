package androidx.compose.p003ui.input.pointer.util;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010!¨\u0006\""}, m29142d2 = {"Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "", "time", "", "dataPoint", "<init>", "(JF)V", "component1", "()J", "component2", "()F", "copy", "(JF)Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getTime", "setTime", "(J)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getDataPoint", "setDataPoint", "(F)V", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.util.DataPointAtTime */
/* loaded from: classes2.dex */
public final class DataPointAtTime {

    /* renamed from: a */
    public long f30109a;

    /* renamed from: b */
    public float f30110b;

    public DataPointAtTime(long j, float f) {
        this.f30109a = j;
        this.f30110b = f;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dataPointAtTime.f30109a;
        }
        if ((i & 2) != 0) {
            f = dataPointAtTime.f30110b;
        }
        return dataPointAtTime.copy(j, f);
    }

    public final long component1() {
        return this.f30109a;
    }

    public final float component2() {
        return this.f30110b;
    }

    @NotNull
    public final DataPointAtTime copy(long j, float f) {
        return new DataPointAtTime(j, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataPointAtTime) {
            DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
            return this.f30109a == dataPointAtTime.f30109a && Float.compare(this.f30110b, dataPointAtTime.f30110b) == 0;
        }
        return false;
    }

    public final float getDataPoint() {
        return this.f30110b;
    }

    public final long getTime() {
        return this.f30109a;
    }

    public int hashCode() {
        return (AbstractC17631Fh1.m68395a(this.f30109a) * 31) + Float.floatToIntBits(this.f30110b);
    }

    public final void setDataPoint(float f) {
        this.f30110b = f;
    }

    public final void setTime(long j) {
        this.f30109a = j;
    }

    @NotNull
    public String toString() {
        return "DataPointAtTime(time=" + this.f30109a + ", dataPoint=" + this.f30110b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}