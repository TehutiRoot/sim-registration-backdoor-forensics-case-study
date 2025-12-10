package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.geometry.Offset;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00020\u0001Bf\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u0006HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u0019\u0010\u001d\u001a\u00020\u0006HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\rHÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u0006HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0017J\u0080\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0006HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u0010#J\u001a\u00103\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\u0017R \u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010!R \u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010#R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010\u001fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010'R \u0010\u0013\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\bM\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006N"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptime", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", "position", "", "down", "", "pressure", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "issuesEnterExit", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "scrollDelta", "<init>", "(JJJJZFIZLjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-J3iCeTQ", "()J", "component1", "component2", "component3-F1C5BW0", "component3", "component4-F1C5BW0", "component4", "component5", "()Z", "component6", "()F", "component7-T8wyACA", "()I", "component7", "component8", "component9", "()Ljava/util/List;", "component10-F1C5BW0", "component10", "copy-gYeeOSc", "(JJJJZFIZLjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getId-J3iCeTQ", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUptime", OperatorName.CURVE_TO, "getPositionOnScreen-F1C5BW0", "d", "getPosition-F1C5BW0", "e", "Z", "getDown", OperatorName.FILL_NON_ZERO, "F", "getPressure", OperatorName.NON_STROKING_GRAY, "I", "getType-T8wyACA", OperatorName.CLOSE_PATH, "getIssuesEnterExit", "i", "Ljava/util/List;", "getHistorical", OperatorName.SET_LINE_JOINSTYLE, "getScrollDelta-F1C5BW0", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.PointerInputEventData */
/* loaded from: classes2.dex */
public final class PointerInputEventData {

    /* renamed from: a */
    public final long f29971a;

    /* renamed from: b */
    public final long f29972b;

    /* renamed from: c */
    public final long f29973c;

    /* renamed from: d */
    public final long f29974d;

    /* renamed from: e */
    public final boolean f29975e;

    /* renamed from: f */
    public final float f29976f;

    /* renamed from: g */
    public final int f29977g;

    /* renamed from: h */
    public final boolean f29978h;

    /* renamed from: i */
    public final List f29979i;

    /* renamed from: j */
    public final long f29980j;

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5);
    }

    /* renamed from: component1-J3iCeTQ  reason: not valid java name */
    public final long m72719component1J3iCeTQ() {
        return this.f29971a;
    }

    /* renamed from: component10-F1C5BW0  reason: not valid java name */
    public final long m72720component10F1C5BW0() {
        return this.f29980j;
    }

    public final long component2() {
        return this.f29972b;
    }

    /* renamed from: component3-F1C5BW0  reason: not valid java name */
    public final long m72721component3F1C5BW0() {
        return this.f29973c;
    }

    /* renamed from: component4-F1C5BW0  reason: not valid java name */
    public final long m72722component4F1C5BW0() {
        return this.f29974d;
    }

    public final boolean component5() {
        return this.f29975e;
    }

    public final float component6() {
        return this.f29976f;
    }

    /* renamed from: component7-T8wyACA  reason: not valid java name */
    public final int m72723component7T8wyACA() {
        return this.f29977g;
    }

    public final boolean component8() {
        return this.f29978h;
    }

    @NotNull
    public final List<HistoricalChange> component9() {
        return this.f29979i;
    }

    @NotNull
    /* renamed from: copy-gYeeOSc  reason: not valid java name */
    public final PointerInputEventData m72724copygYeeOSc(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, @NotNull List<HistoricalChange> historical, long j5) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        return new PointerInputEventData(j, j2, j3, j4, z, f, i, z2, historical, j5, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerInputEventData) {
            PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
            return PointerId.m72697equalsimpl0(this.f29971a, pointerInputEventData.f29971a) && this.f29972b == pointerInputEventData.f29972b && Offset.m71499equalsimpl0(this.f29973c, pointerInputEventData.f29973c) && Offset.m71499equalsimpl0(this.f29974d, pointerInputEventData.f29974d) && this.f29975e == pointerInputEventData.f29975e && Float.compare(this.f29976f, pointerInputEventData.f29976f) == 0 && PointerType.m72768equalsimpl0(this.f29977g, pointerInputEventData.f29977g) && this.f29978h == pointerInputEventData.f29978h && Intrinsics.areEqual(this.f29979i, pointerInputEventData.f29979i) && Offset.m71499equalsimpl0(this.f29980j, pointerInputEventData.f29980j);
        }
        return false;
    }

    public final boolean getDown() {
        return this.f29975e;
    }

    @NotNull
    public final List<HistoricalChange> getHistorical() {
        return this.f29979i;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m72725getIdJ3iCeTQ() {
        return this.f29971a;
    }

    public final boolean getIssuesEnterExit() {
        return this.f29978h;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m72726getPositionF1C5BW0() {
        return this.f29974d;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
    public final long m72727getPositionOnScreenF1C5BW0() {
        return this.f29973c;
    }

    public final float getPressure() {
        return this.f29976f;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m72728getScrollDeltaF1C5BW0() {
        return this.f29980j;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m72729getTypeT8wyACA() {
        return this.f29977g;
    }

    public final long getUptime() {
        return this.f29972b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m72698hashCodeimpl = ((((((PointerId.m72698hashCodeimpl(this.f29971a) * 31) + AbstractC17792Ig1.m67882a(this.f29972b)) * 31) + Offset.m71504hashCodeimpl(this.f29973c)) * 31) + Offset.m71504hashCodeimpl(this.f29974d)) * 31;
        boolean z = this.f29975e;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int floatToIntBits = (((((m72698hashCodeimpl + i2) * 31) + Float.floatToIntBits(this.f29976f)) * 31) + PointerType.m72769hashCodeimpl(this.f29977g)) * 31;
        boolean z2 = this.f29978h;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((((floatToIntBits + i) * 31) + this.f29979i.hashCode()) * 31) + Offset.m71504hashCodeimpl(this.f29980j);
    }

    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m72699toStringimpl(this.f29971a)) + ", uptime=" + this.f29972b + ", positionOnScreen=" + ((Object) Offset.m71510toStringimpl(this.f29973c)) + ", position=" + ((Object) Offset.m71510toStringimpl(this.f29974d)) + ", down=" + this.f29975e + ", pressure=" + this.f29976f + ", type=" + ((Object) PointerType.m72770toStringimpl(this.f29977g)) + ", issuesEnterExit=" + this.f29978h + ", historical=" + this.f29979i + ", scrollDelta=" + ((Object) Offset.m71510toStringimpl(this.f29980j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List historical, long j5) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        this.f29971a = j;
        this.f29972b = j2;
        this.f29973c = j3;
        this.f29974d = j4;
        this.f29975e = z;
        this.f29976f = f;
        this.f29977g = i;
        this.f29978h = z2;
        this.f29979i = historical;
        this.f29980j = j5;
    }

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? new ArrayList() : list, (i2 & 512) != 0 ? Offset.Companion.m71518getZeroF1C5BW0() : j5, null);
    }
}
