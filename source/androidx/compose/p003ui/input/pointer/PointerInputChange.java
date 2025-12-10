package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001Bf\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014B`\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0015BV\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0018Br\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J}\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0089\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bE\u00107R \u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u00107R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bH\u0010=\u001a\u0004\bI\u0010?R \u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bO\u00107R$\u0010S\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bP\u0010Q\u0012\u0004\bR\u0010\u001fR*\u0010\u0017\u001a\u00020\u00162\u0006\u0010T\u001a\u00020\u00168\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010\u001f\u001a\u0004\bW\u0010XR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010\u001f\u001a\u0004\bZ\u0010[R\u0017\u0010]\u001a\u00020\b8F¢\u0006\f\u0012\u0004\b^\u0010\u001f\u001a\u0004\b]\u0010?\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/pointer/ConsumedData;", "consumed", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "(JJJZFJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "consume", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-Tn9QgHE", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getId-J3iCeTQ", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUptimeMillis", OperatorName.CURVE_TO, "getPosition-F1C5BW0", "d", "Z", "getPressed", "()Z", "e", "F", "getPressure", "()F", OperatorName.FILL_NON_ZERO, "getPreviousUptimeMillis", OperatorName.NON_STROKING_GRAY, "getPreviousPosition-F1C5BW0", OperatorName.CLOSE_PATH, "getPreviousPressed", "i", "I", "getType-T8wyACA", "()I", OperatorName.SET_LINE_JOINSTYLE, "getScrollDelta-F1C5BW0", OperatorName.NON_STROKING_CMYK, "Ljava/util/List;", "get_historical$annotations", "_historical", "<set-?>", OperatorName.LINE_TO, "Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed$annotations", "getHistorical", "()Ljava/util/List;", "getHistorical$annotations", "isConsumed", "isConsumed$annotations", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.PointerInputChange */
/* loaded from: classes2.dex */
public final class PointerInputChange {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f29956a;

    /* renamed from: b */
    public final long f29957b;

    /* renamed from: c */
    public final long f29958c;

    /* renamed from: d */
    public final boolean f29959d;

    /* renamed from: e */
    public final float f29960e;

    /* renamed from: f */
    public final long f29961f;

    /* renamed from: g */
    public final long f29962g;

    /* renamed from: h */
    public final boolean f29963h;

    /* renamed from: i */
    public final int f29964i;

    /* renamed from: j */
    public final long f29965j;

    /* renamed from: k */
    public List f29966k;

    /* renamed from: l */
    public ConsumedData f29967l;

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    /* renamed from: copy-0GkPj7c$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m72701copy0GkPj7c$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = pointerInputChange.f29956a;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = pointerInputChange.f29957b;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = pointerInputChange.f29958c;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.f29959d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j10 = pointerInputChange.f29961f;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            j11 = pointerInputChange.f29962g;
        } else {
            j11 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = pointerInputChange.f29963h;
        } else {
            z4 = z2;
        }
        if ((i2 & 256) != 0) {
            i3 = pointerInputChange.f29964i;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 512) != 0) {
            j12 = pointerInputChange.f29965j;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m72707copy0GkPj7c(j7, j8, j9, z3, j10, j11, z4, consumedData, i4, j12);
    }

    /* renamed from: copy-Ezr-O64$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m72702copyEzrO64$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, int i2, Object obj) {
        long j6;
        long j7;
        long j8;
        boolean z3;
        long j9;
        long j10;
        boolean z4;
        ConsumedData consumedData2;
        int i3;
        if ((i2 & 1) != 0) {
            j6 = pointerInputChange.f29956a;
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = pointerInputChange.f29957b;
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = pointerInputChange.f29958c;
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.f29959d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j9 = pointerInputChange.f29961f;
        } else {
            j9 = j4;
        }
        if ((i2 & 32) != 0) {
            j10 = pointerInputChange.f29962g;
        } else {
            j10 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = pointerInputChange.f29963h;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            consumedData2 = pointerInputChange.f29967l;
        } else {
            consumedData2 = consumedData;
        }
        if ((i2 & 256) != 0) {
            i3 = pointerInputChange.f29964i;
        } else {
            i3 = i;
        }
        return pointerInputChange.m72708copyEzrO64(j6, j7, j8, z3, j9, j10, z4, consumedData2, i3);
    }

    /* renamed from: copy-JKmWfYY$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m72703copyJKmWfYY$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = pointerInputChange.f29956a;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = pointerInputChange.f29957b;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = pointerInputChange.f29958c;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.f29959d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j10 = pointerInputChange.f29961f;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            j11 = pointerInputChange.f29962g;
        } else {
            j11 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = pointerInputChange.f29963h;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            i3 = pointerInputChange.f29964i;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 256) != 0) {
            j12 = pointerInputChange.f29965j;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m72709copyJKmWfYY(j7, j8, j9, z3, j10, j11, z4, i4, j12);
    }

    /* renamed from: copy-OHpmEuE$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m72704copyOHpmEuE$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = pointerInputChange.f29956a;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = pointerInputChange.f29957b;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = pointerInputChange.f29958c;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.f29959d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j10 = pointerInputChange.f29961f;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            j11 = pointerInputChange.f29962g;
        } else {
            j11 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = pointerInputChange.f29963h;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            i3 = pointerInputChange.f29964i;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 512) != 0) {
            j12 = pointerInputChange.f29965j;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m72710copyOHpmEuE(j7, j8, j9, z3, j10, j11, z4, i4, list, j12);
    }

    /* renamed from: copy-Tn9QgHE$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m72705copyTn9QgHE$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        float f2;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = pointerInputChange.f29956a;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = pointerInputChange.f29957b;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = pointerInputChange.f29958c;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.f29959d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            f2 = pointerInputChange.f29960e;
        } else {
            f2 = f;
        }
        if ((i2 & 32) != 0) {
            j10 = pointerInputChange.f29961f;
        } else {
            j10 = j4;
        }
        if ((i2 & 64) != 0) {
            j11 = pointerInputChange.f29962g;
        } else {
            j11 = j5;
        }
        if ((i2 & 128) != 0) {
            z4 = pointerInputChange.f29963h;
        } else {
            z4 = z2;
        }
        if ((i2 & 256) != 0) {
            i3 = pointerInputChange.f29964i;
        } else {
            i3 = i;
        }
        boolean z5 = z4;
        int i4 = i3;
        if ((i2 & 512) != 0) {
            j12 = pointerInputChange.f29965j;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m72711copyTn9QgHE(j7, j8, j9, z3, f2, j10, j11, z5, i4, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-wbzehF4$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m72706copywbzehF4$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        float f2;
        long j10;
        long j11;
        boolean z4;
        int i3;
        List<HistoricalChange> list2;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = pointerInputChange.f29956a;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = pointerInputChange.f29957b;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = pointerInputChange.f29958c;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = pointerInputChange.f29959d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            f2 = pointerInputChange.f29960e;
        } else {
            f2 = f;
        }
        if ((i2 & 32) != 0) {
            j10 = pointerInputChange.f29961f;
        } else {
            j10 = j4;
        }
        if ((i2 & 64) != 0) {
            j11 = pointerInputChange.f29962g;
        } else {
            j11 = j5;
        }
        if ((i2 & 128) != 0) {
            z4 = pointerInputChange.f29963h;
        } else {
            z4 = z2;
        }
        if ((i2 & 256) != 0) {
            i3 = pointerInputChange.f29964i;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 512) != 0) {
            list2 = pointerInputChange.getHistorical();
        } else {
            list2 = list;
        }
        boolean z5 = z4;
        List<HistoricalChange> list3 = list2;
        if ((i2 & 1024) != 0) {
            j12 = pointerInputChange.f29965j;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m72712copywbzehF4(j7, j8, j9, z3, f2, j10, j11, z5, i4, list3, j12);
    }

    @Deprecated(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    public final void consume() {
        this.f29967l.setDownChange(true);
        this.f29967l.setPositionChange(true);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @ReplaceWith(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @NotNull
    /* renamed from: copy-0GkPj7c  reason: not valid java name */
    public final PointerInputChange m72707copy0GkPj7c(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, @NotNull ConsumedData consumed, int i, long j6) {
        boolean z3;
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        float f = this.f29960e;
        if (!consumed.getDownChange() && !consumed.getPositionChange()) {
            z3 = false;
        } else {
            z3 = true;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, z3, i, getHistorical(), j6, (DefaultConstructorMarker) null);
        this.f29967l = consumed;
        return pointerInputChange;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* renamed from: copy-Ezr-O64  reason: not valid java name */
    public final /* synthetic */ PointerInputChange m72708copyEzrO64(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumed, int i) {
        boolean z3;
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        float f = this.f29960e;
        if (!consumed.getDownChange() && !consumed.getPositionChange()) {
            z3 = false;
        } else {
            z3 = true;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, z3, i, getHistorical(), this.f29965j, (DefaultConstructorMarker) null);
        this.f29967l = consumed;
        return pointerInputChange;
    }

    @NotNull
    /* renamed from: copy-JKmWfYY  reason: not valid java name */
    public final PointerInputChange m72709copyJKmWfYY(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6) {
        return m72712copywbzehF4(j, j2, j3, z, this.f29960e, j4, j5, z2, i, getHistorical(), j6);
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* renamed from: copy-OHpmEuE  reason: not valid java name */
    public final PointerInputChange m72710copyOHpmEuE(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, @NotNull List<HistoricalChange> historical, long j6) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        return m72712copywbzehF4(j, j2, j3, z, this.f29960e, j4, j5, z2, i, historical, j6);
    }

    @NotNull
    /* renamed from: copy-Tn9QgHE  reason: not valid java name */
    public final PointerInputChange m72711copyTn9QgHE(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, long j6) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, (List) getHistorical(), j6, (DefaultConstructorMarker) null);
        pointerInputChange.f29967l = this.f29967l;
        return pointerInputChange;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* renamed from: copy-wbzehF4  reason: not valid java name */
    public final PointerInputChange m72712copywbzehF4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, @NotNull List<HistoricalChange> historical, long j6) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, (List) historical, j6, (DefaultConstructorMarker) null);
        pointerInputChange.f29967l = this.f29967l;
        return pointerInputChange;
    }

    @NotNull
    public final ConsumedData getConsumed() {
        return this.f29967l;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this.f29966k;
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return list;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m72713getIdJ3iCeTQ() {
        return this.f29956a;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m72714getPositionF1C5BW0() {
        return this.f29958c;
    }

    public final boolean getPressed() {
        return this.f29959d;
    }

    public final float getPressure() {
        return this.f29960e;
    }

    /* renamed from: getPreviousPosition-F1C5BW0  reason: not valid java name */
    public final long m72715getPreviousPositionF1C5BW0() {
        return this.f29962g;
    }

    public final boolean getPreviousPressed() {
        return this.f29963h;
    }

    public final long getPreviousUptimeMillis() {
        return this.f29961f;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m72716getScrollDeltaF1C5BW0() {
        return this.f29965j;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m72717getTypeT8wyACA() {
        return this.f29964i;
    }

    public final long getUptimeMillis() {
        return this.f29957b;
    }

    public final boolean isConsumed() {
        if (!this.f29967l.getDownChange() && !this.f29967l.getPositionChange()) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m72699toStringimpl(this.f29956a)) + ", uptimeMillis=" + this.f29957b + ", position=" + ((Object) Offset.m71510toStringimpl(this.f29958c)) + ", pressed=" + this.f29959d + ", pressure=" + this.f29960e + ", previousUptimeMillis=" + this.f29961f + ", previousPosition=" + ((Object) Offset.m71510toStringimpl(this.f29962g)) + ", previousPressed=" + this.f29963h + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m72770toStringimpl(this.f29964i)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m71510toStringimpl(this.f29965j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, list, j6);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, i);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    public PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f29956a = j;
        this.f29957b = j2;
        this.f29958c = j3;
        this.f29959d = z;
        this.f29960e = f;
        this.f29961f = j4;
        this.f29962g = j5;
        this.f29963h = z2;
        this.f29964i = i;
        this.f29965j = j6;
        this.f29967l = new ConsumedData(z3, z3);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? PointerType.Companion.m72775getTouchT8wyACA() : i, (i2 & 1024) != 0 ? Offset.Companion.m71518getZeroF1C5BW0() : j6, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & 256) != 0 ? PointerType.Companion.m72775getTouchT8wyACA() : i, (i2 & 512) != 0 ? Offset.Companion.m71518getZeroF1C5BW0() : j6, (DefaultConstructorMarker) null);
    }

    public PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, (i2 & 256) != 0 ? PointerType.Companion.m72775getTouchT8wyACA() : i, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumed, int i) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, consumed.getDownChange() || consumed.getPositionChange(), i, Offset.Companion.m71518getZeroF1C5BW0(), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(consumed, "consumed");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List historical, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(historical, "historical");
        this.f29966k = historical;
    }
}
