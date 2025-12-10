package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.primitives.Longs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001aN\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!\"\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#\"\u0014\u0010%\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&\"\u0014\u0010)\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*\"\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*\"\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*\"\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*\"\u0014\u00103\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*\"\u0014\u00105\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010*\"\u001a\u00109\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u00108\"\u0014\u0010;\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010*\"\u0014\u0010=\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010*\"\u0014\u0010?\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010*\"\u0014\u0010A\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010*\"\u0014\u0010C\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010*\"\u0014\u0010E\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010*\"\u0014\u0010G\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010*¨\u0006H"}, m28850d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlin/reflect/KFunction2;", "", "Lkotlinx/coroutines/channels/ChannelSegment;", "createSegmentFunction", "()Lkotlin/reflect/KFunction;", "id", "prev", OperatorName.CURVE_TO, "(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", "T", "Lkotlinx/coroutines/CancellableContinuation;", "value", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "onCancellation", "", "e", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "", "capacity", "d", "(I)J", "counter", "closeStatus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JI)J", "pauseEB", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JZ)J", "", "Lkotlinx/coroutines/channels/ChannelSegment;", "NULL_SEGMENT", "SEGMENT_SIZE", "I", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Lkotlinx/coroutines/internal/Symbol;", "BUFFERED", "Lkotlinx/coroutines/internal/Symbol;", "IN_BUFFER", "RESUMING_BY_RCV", "RESUMING_BY_EB", OperatorName.FILL_NON_ZERO, "POISONED", OperatorName.NON_STROKING_GRAY, "DONE_RCV", OperatorName.CLOSE_PATH, "INTERRUPTED_SEND", "i", "INTERRUPTED_RCV", OperatorName.SET_LINE_JOINSTYLE, "getCHANNEL_CLOSED", "()Lkotlinx/coroutines/internal/Symbol;", "CHANNEL_CLOSED", OperatorName.NON_STROKING_CMYK, "SUSPEND", OperatorName.LINE_TO, "SUSPEND_NO_WAITER", OperatorName.MOVE_TO, Constant.QueryTransactionStatus.FAILED, OperatorName.ENDPATH, "NO_RECEIVE_RESULT", "o", "CLOSE_HANDLER_CLOSED", "p", "CLOSE_HANDLER_INVOKED", OperatorName.SAVE, "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BufferedChannelKt {
    @JvmField
    @NotNull
    public static final Symbol BUFFERED;
    @JvmField
    public static final int SEGMENT_SIZE;

    /* renamed from: a */
    public static final ChannelSegment f70673a = new ChannelSegment(-1, null, null, 0);

    /* renamed from: b */
    public static final int f70674b;

    /* renamed from: c */
    public static final Symbol f70675c;

    /* renamed from: d */
    public static final Symbol f70676d;

    /* renamed from: e */
    public static final Symbol f70677e;

    /* renamed from: f */
    public static final Symbol f70678f;

    /* renamed from: g */
    public static final Symbol f70679g;

    /* renamed from: h */
    public static final Symbol f70680h;

    /* renamed from: i */
    public static final Symbol f70681i;

    /* renamed from: j */
    public static final Symbol f70682j;

    /* renamed from: k */
    public static final Symbol f70683k;

    /* renamed from: l */
    public static final Symbol f70684l;

    /* renamed from: m */
    public static final Symbol f70685m;

    /* renamed from: n */
    public static final Symbol f70686n;

    /* renamed from: o */
    public static final Symbol f70687o;

    /* renamed from: p */
    public static final Symbol f70688p;

    /* renamed from: q */
    public static final Symbol f70689q;

    static {
        int m1271e;
        int m1271e2;
        m1271e = AbstractC22446uQ1.m1271e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        SEGMENT_SIZE = m1271e;
        m1271e2 = AbstractC22446uQ1.m1271e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f70674b = m1271e2;
        BUFFERED = new Symbol("BUFFERED");
        f70675c = new Symbol("SHOULD_BUFFER");
        f70676d = new Symbol("S_RESUMING_BY_RCV");
        f70677e = new Symbol("RESUMING_BY_EB");
        f70678f = new Symbol("POISONED");
        f70679g = new Symbol("DONE_RCV");
        f70680h = new Symbol("INTERRUPTED_SEND");
        f70681i = new Symbol("INTERRUPTED_RCV");
        f70682j = new Symbol("CHANNEL_CLOSED");
        f70683k = new Symbol("SUSPEND");
        f70684l = new Symbol("SUSPEND_NO_WAITER");
        f70685m = new Symbol(Constant.QueryTransactionStatus.FAILED);
        f70686n = new Symbol("NO_RECEIVE_RESULT");
        f70687o = new Symbol("CLOSE_HANDLER_CLOSED");
        f70688p = new Symbol("CLOSE_HANDLER_INVOKED");
        f70689q = new Symbol("NO_CLOSE_CAUSE");
    }

    /* renamed from: a */
    public static final long m27211a(long j, boolean z) {
        return (z ? Longs.MAX_POWER_OF_TWO : 0L) + j;
    }

    /* renamed from: b */
    public static final long m27210b(long j, int i) {
        return (i << 60) + j;
    }

    /* renamed from: c */
    public static final ChannelSegment m27209c(long j, ChannelSegment channelSegment) {
        return new ChannelSegment(j, channelSegment, channelSegment.getChannel(), 0);
    }

    @NotNull
    public static final <E> KFunction<ChannelSegment<E>> createSegmentFunction() {
        return BufferedChannelKt$createSegmentFunction$1.INSTANCE;
    }

    /* renamed from: d */
    public static final long m27208d(int i) {
        if (i != 0) {
            if (i != Integer.MAX_VALUE) {
                return i;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* renamed from: e */
    public static final boolean m27207e(CancellableContinuation cancellableContinuation, Object obj, Function1 function1) {
        Object tryResume = cancellableContinuation.tryResume(obj, null, function1);
        if (tryResume != null) {
            cancellableContinuation.completeResume(tryResume);
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m27206f(CancellableContinuation cancellableContinuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return m27207e(cancellableContinuation, obj, function1);
    }

    @NotNull
    public static final Symbol getCHANNEL_CLOSED() {
        return f70682j;
    }
}
