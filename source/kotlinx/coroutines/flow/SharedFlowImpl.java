package kotlinx.coroutines.flow;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00019B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001e2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0015J\u0019\u00102\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u00010\u001a2\u0006\u00106\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J3\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001e2\u0014\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001eH\u0002¢\u0006\u0004\b=\u0010>J!\u0010B\u001a\u00020A2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0096@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bD\u0010\u0011J\u001b\u0010E\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\bE\u0010%J\u000f\u0010H\u001a\u00020\u0016H\u0000¢\u0006\u0004\bF\u0010GJ%\u0010L\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001e2\u0006\u0010I\u001a\u00020\u0016H\u0000¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020\u0003H\u0014¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010O\u001a\u00020\u0007H\u0014¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010\u0015J-\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000V2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010XR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010YR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010]\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\\R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010^R\u0016\u0010`\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010^R\u0016\u0010b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR\u0016\u0010d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010YR\u0014\u0010e\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010GR\u0014\u0010h\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0014\u0010k\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010GR\u0014\u0010m\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010GR\u001a\u0010q\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bp\u0010\u0015\u001a\u0004\bn\u0010oR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006v"}, m28850d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "", "replay", "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "value", "", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Ljava/lang/Object;)Z", OperatorName.CLOSE_AND_STROKE, "", OperatorName.FILL_NON_ZERO, "()V", "", "newHead", "e", "(J)V", "", "item", "i", "(Ljava/lang/Object;)V", "", "curBuffer", "curSize", "newSize", OperatorName.SAVE, "([Ljava/lang/Object;II)[Ljava/lang/Object;", OperatorName.CLOSE_PATH, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "emitter", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlinx/coroutines/flow/SharedFlowImpl$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(JJJJ)V", OperatorName.CURVE_TO, "slot", "u", "(Lkotlinx/coroutines/flow/SharedFlowSlot;)Ljava/lang/Object;", "t", "(Lkotlinx/coroutines/flow/SharedFlowSlot;)J", FirebaseAnalytics.Param.INDEX, OperatorName.MOVE_TO, "(J)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", OperatorName.SET_LINE_JOINSTYLE, "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmit", "emit", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "()J", "updateNewCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateCollectorIndexLocked", "createSlot", "()Lkotlinx/coroutines/flow/SharedFlowSlot;", "size", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "resetReplayCache", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "capacity", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "I", OperatorName.NON_STROKING_GRAY, "Lkotlinx/coroutines/channels/BufferOverflow;", "[Ljava/lang/Object;", "buffer", OperatorName.SET_LINE_CAPSTYLE, "replayIndex", "minCollectorIndex", OperatorName.NON_STROKING_CMYK, "bufferSize", OperatorName.LINE_TO, "queueSize", HeaderTable.TAG, "o", "()I", "replaySize", "p", "totalSize", "bufferEndIndex", OperatorName.ENDPATH, "queueEndIndex", "getLastReplayedLocked", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,731:1\n28#2,4:732\n28#2,4:738\n28#2,4:760\n28#2,4:767\n28#2,4:779\n28#2,4:793\n28#2,4:807\n20#3:736\n20#3:742\n20#3:764\n20#3:771\n20#3:783\n20#3:797\n20#3:811\n329#4:737\n1#5:743\n94#6,2:744\n96#6,2:747\n98#6:750\n94#6,2:772\n96#6,2:775\n98#6:778\n94#6,2:800\n96#6,2:803\n98#6:806\n13579#7:746\n13580#7:749\n13579#7:774\n13580#7:777\n13579#7:802\n13580#7:805\n314#8,9:751\n323#8,2:765\n314#8,9:784\n323#8,2:798\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n351#1:732,4\n391#1:738,4\n485#1:760,4\n506#1:767,4\n626#1:779,4\n661#1:793,4\n689#1:807,4\n351#1:736\n391#1:742\n485#1:764\n506#1:771\n626#1:783\n661#1:797\n689#1:811\n373#1:737\n453#1:744,2\n453#1:747,2\n453#1:750\n529#1:772,2\n529#1:775,2\n529#1:778\n676#1:800,2\n676#1:803,2\n676#1:806\n453#1:746\n453#1:749\n529#1:774\n529#1:777\n676#1:802\n676#1:805\n483#1:751,9\n483#1:765,2\n660#1:784,9\n660#1:798,2\n*E\n"})
/* loaded from: classes6.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: e */
    public final int f70915e;

    /* renamed from: f */
    public final int f70916f;

    /* renamed from: g */
    public final BufferOverflow f70917g;

    /* renamed from: h */
    public Object[] f70918h;

    /* renamed from: i */
    public long f70919i;

    /* renamed from: j */
    public long f70920j;

    /* renamed from: k */
    public int f70921k;

    /* renamed from: l */
    public int f70922l;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$a */
    /* loaded from: classes6.dex */
    public static final class C12139a implements DisposableHandle {

        /* renamed from: a */
        public final SharedFlowImpl f70923a;

        /* renamed from: b */
        public long f70924b;

        /* renamed from: c */
        public final Object f70925c;

        /* renamed from: d */
        public final Continuation f70926d;

        public C12139a(SharedFlowImpl sharedFlowImpl, long j, Object obj, Continuation continuation) {
            this.f70923a = sharedFlowImpl;
            this.f70924b = j;
            this.f70925c = obj;
            this.f70926d = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.f70923a.m26898b(this);
        }
    }

    public SharedFlowImpl(int i, int i2, @NotNull BufferOverflow bufferOverflow) {
        this.f70915e = i;
        this.f70916f = i2;
        this.f70917g = bufferOverflow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1 A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m26896d(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.m26896d(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: g */
    public static /* synthetic */ Object m26893g(SharedFlowImpl sharedFlowImpl, Object obj, Continuation continuation) {
        if (sharedFlowImpl.tryEmit(obj)) {
            return Unit.INSTANCE;
        }
        Object m26892h = sharedFlowImpl.m26892h(obj, continuation);
        if (m26892h == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m26892h;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    /* renamed from: a */
    public final Object m26899a(SharedFlowSlot sharedFlowSlot, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (m26880t(sharedFlowSlot) < 0) {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                } else {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final void m26898b(C12139a c12139a) {
        Object m26877a;
        synchronized (this) {
            if (c12139a.f70924b < m26888l()) {
                return;
            }
            Object[] objArr = this.f70918h;
            Intrinsics.checkNotNull(objArr);
            m26877a = SharedFlowKt.m26877a(objArr, c12139a.f70924b);
            if (m26877a == c12139a) {
                SharedFlowKt.m26876b(objArr, c12139a.f70924b, SharedFlowKt.NO_VALUE);
                m26897c();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: c */
    public final void m26897c() {
        Object m26877a;
        if (this.f70916f == 0 && this.f70922l <= 1) {
            return;
        }
        Object[] objArr = this.f70918h;
        Intrinsics.checkNotNull(objArr);
        while (this.f70922l > 0) {
            m26877a = SharedFlowKt.m26877a(objArr, (m26888l() + m26884p()) - 1);
            if (m26877a == SharedFlowKt.NO_VALUE) {
                this.f70922l--;
                SharedFlowKt.m26876b(objArr, m26888l() + m26884p(), null);
            } else {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<?> continuation) {
        return m26896d(this, flowCollector, continuation);
    }

    /* renamed from: e */
    public final void m26895e(long j) {
        AbstractSharedFlowSlot[] access$getSlots;
        if (AbstractSharedFlow.access$getNCollectors(this) != 0 && (access$getSlots = AbstractSharedFlow.access$getSlots(this)) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : access$getSlots) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j2 = sharedFlowSlot.index;
                    if (j2 >= 0 && j2 < j) {
                        sharedFlowSlot.index = j;
                    }
                }
            }
        }
        this.f70920j = j;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        return m26893g(this, t, continuation);
    }

    /* renamed from: f */
    public final void m26894f() {
        Object[] objArr = this.f70918h;
        Intrinsics.checkNotNull(objArr);
        SharedFlowKt.m26876b(objArr, m26888l(), null);
        this.f70921k--;
        long m26888l = m26888l() + 1;
        if (this.f70919i < m26888l) {
            this.f70919i = m26888l;
        }
        if (this.f70920j < m26888l) {
            m26895e(m26888l);
        }
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @NotNull
    public Flow<T> fuse(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext, i, bufferOverflow);
    }

    public final T getLastReplayedLocked() {
        Object m26877a;
        Object[] objArr = this.f70918h;
        Intrinsics.checkNotNull(objArr);
        m26877a = SharedFlowKt.m26877a(objArr, (this.f70919i + m26885o()) - 1);
        return (T) m26877a;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    @NotNull
    public List<T> getReplayCache() {
        Object m26877a;
        synchronized (this) {
            int m26885o = m26885o();
            if (m26885o == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(m26885o);
            Object[] objArr = this.f70918h;
            Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < m26885o; i++) {
                m26877a = SharedFlowKt.m26877a(objArr, this.f70919i + i);
                arrayList.add(m26877a);
            }
            return arrayList;
        }
    }

    /* renamed from: h */
    public final Object m26892h(Object obj, Continuation continuation) {
        Continuation<Unit>[] continuationArr;
        C12139a c12139a;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Continuation<Unit>[] continuationArr2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (m26882r(obj)) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
                    continuationArr = m26890j(continuationArr2);
                    c12139a = null;
                } else {
                    C12139a c12139a2 = new C12139a(this, m26884p() + m26888l(), obj, cancellableContinuationImpl);
                    m26891i(c12139a2);
                    this.f70922l++;
                    if (this.f70916f == 0) {
                        continuationArr2 = m26890j(continuationArr2);
                    }
                    continuationArr = continuationArr2;
                    c12139a = c12139a2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c12139a != null) {
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, c12139a);
        }
        for (Continuation<Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public final void m26891i(Object obj) {
        int m26884p = m26884p();
        Object[] objArr = this.f70918h;
        if (objArr == null) {
            objArr = m26883q(null, 0, 2);
        } else if (m26884p >= objArr.length) {
            objArr = m26883q(objArr, m26884p, objArr.length * 2);
        }
        SharedFlowKt.m26876b(objArr, m26888l() + m26884p, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: j */
    public final Continuation[] m26890j(Continuation[] continuationArr) {
        AbstractSharedFlowSlot[] access$getSlots;
        SharedFlowSlot sharedFlowSlot;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        if (AbstractSharedFlow.access$getNCollectors(this) != 0 && (access$getSlots = AbstractSharedFlow.access$getSlots(this)) != null) {
            int length2 = access$getSlots.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = access$getSlots[i];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && m26880t(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    /* renamed from: k */
    public final long m26889k() {
        return m26888l() + this.f70921k;
    }

    /* renamed from: l */
    public final long m26888l() {
        return Math.min(this.f70920j, this.f70919i);
    }

    /* renamed from: m */
    public final Object m26887m(long j) {
        Object m26877a;
        Object[] objArr = this.f70918h;
        Intrinsics.checkNotNull(objArr);
        m26877a = SharedFlowKt.m26877a(objArr, j);
        if (m26877a instanceof C12139a) {
            return ((C12139a) m26877a).f70925c;
        }
        return m26877a;
    }

    /* renamed from: n */
    public final long m26886n() {
        return m26888l() + this.f70921k + this.f70922l;
    }

    /* renamed from: o */
    public final int m26885o() {
        return (int) ((m26888l() + this.f70921k) - this.f70919i);
    }

    /* renamed from: p */
    public final int m26884p() {
        return this.f70921k + this.f70922l;
    }

    /* renamed from: q */
    public final Object[] m26883q(Object[] objArr, int i, int i2) {
        Object m26877a;
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f70918h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m26888l = m26888l();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + m26888l;
                m26877a = SharedFlowKt.m26877a(objArr, j);
                SharedFlowKt.m26876b(objArr2, j, m26877a);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: r */
    public final boolean m26882r(Object obj) {
        if (getNCollectors() == 0) {
            return m26881s(obj);
        }
        if (this.f70921k >= this.f70916f && this.f70920j <= this.f70919i) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.f70917g.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        m26891i(obj);
        int i2 = this.f70921k + 1;
        this.f70921k = i2;
        if (i2 > this.f70916f) {
            m26894f();
        }
        if (m26885o() > this.f70915e) {
            m26878v(this.f70919i + 1, this.f70920j, m26889k(), m26886n());
        }
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            m26878v(m26889k(), this.f70920j, m26889k(), m26886n());
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: s */
    public final boolean m26881s(Object obj) {
        if (this.f70915e == 0) {
            return true;
        }
        m26891i(obj);
        int i = this.f70921k + 1;
        this.f70921k = i;
        if (i > this.f70915e) {
            m26894f();
        }
        this.f70920j = m26888l() + this.f70921k;
        return true;
    }

    /* renamed from: t */
    public final long m26880t(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.index;
        if (j < m26889k()) {
            return j;
        }
        if (this.f70916f > 0 || j > m26888l() || this.f70922l == 0) {
            return -1L;
        }
        return j;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (m26882r(t)) {
                continuationArr = m26890j(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    /* renamed from: u */
    public final Object m26879u(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long m26880t = m26880t(sharedFlowSlot);
                if (m26880t < 0) {
                    obj = SharedFlowKt.NO_VALUE;
                } else {
                    long j = sharedFlowSlot.index;
                    Object m26887m = m26887m(m26880t);
                    sharedFlowSlot.index = m26880t + 1;
                    continuationArr = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                    obj = m26887m;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    @NotNull
    public final Continuation<Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        Object m26877a;
        Object m26877a2;
        long j5;
        AbstractSharedFlowSlot[] access$getSlots;
        if (j > this.f70920j) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long m26888l = m26888l();
        long j6 = this.f70921k + m26888l;
        if (this.f70916f == 0 && this.f70922l > 0) {
            j6++;
        }
        if (AbstractSharedFlow.access$getNCollectors(this) != 0 && (access$getSlots = AbstractSharedFlow.access$getSlots(this)) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : access$getSlots) {
                if (abstractSharedFlowSlot != null) {
                    long j7 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.f70920j) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long m26889k = m26889k();
        if (getNCollectors() > 0) {
            i = Math.min(this.f70922l, this.f70916f - ((int) (m26889k - j6)));
        } else {
            i = this.f70922l;
        }
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j8 = this.f70922l + m26889k;
        if (i > 0) {
            continuationArr = new Continuation[i];
            Object[] objArr = this.f70918h;
            Intrinsics.checkNotNull(objArr);
            long j9 = m26889k;
            int i2 = 0;
            while (true) {
                if (m26889k < j8) {
                    m26877a2 = SharedFlowKt.m26877a(objArr, m26889k);
                    j2 = j6;
                    Symbol symbol = SharedFlowKt.NO_VALUE;
                    if (m26877a2 != symbol) {
                        Intrinsics.checkNotNull(m26877a2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        C12139a c12139a = (C12139a) m26877a2;
                        int i3 = i2 + 1;
                        j3 = j8;
                        continuationArr[i2] = c12139a.f70926d;
                        SharedFlowKt.m26876b(objArr, m26889k, symbol);
                        SharedFlowKt.m26876b(objArr, j9, c12139a.f70925c);
                        j5 = 1;
                        j9++;
                        if (i3 >= i) {
                            break;
                        }
                        i2 = i3;
                    } else {
                        j3 = j8;
                        j5 = 1;
                    }
                    m26889k += j5;
                    j6 = j2;
                    j8 = j3;
                } else {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
            }
            m26889k = j9;
        } else {
            j2 = j6;
            j3 = j8;
        }
        int i4 = (int) (m26889k - m26888l);
        if (getNCollectors() == 0) {
            j4 = m26889k;
        } else {
            j4 = j2;
        }
        long max = Math.max(this.f70919i, m26889k - Math.min(this.f70915e, i4));
        if (this.f70916f == 0 && max < j3) {
            Object[] objArr2 = this.f70918h;
            Intrinsics.checkNotNull(objArr2);
            m26877a = SharedFlowKt.m26877a(objArr2, max);
            if (Intrinsics.areEqual(m26877a, SharedFlowKt.NO_VALUE)) {
                m26889k++;
                max++;
            }
        }
        m26878v(max, j4, m26889k, j3);
        m26897c();
        if (continuationArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return m26890j(continuationArr);
        }
        return continuationArr;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.f70919i;
        if (j < this.f70920j) {
            this.f70920j = j;
        }
        return j;
    }

    /* renamed from: v */
    public final void m26878v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long m26888l = m26888l(); m26888l < min; m26888l++) {
            Object[] objArr = this.f70918h;
            Intrinsics.checkNotNull(objArr);
            SharedFlowKt.m26876b(objArr, m26888l, null);
        }
        this.f70919i = j;
        this.f70920j = j2;
        this.f70921k = (int) (j3 - min);
        this.f70922l = (int) (j4 - j3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    @NotNull
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    @NotNull
    public SharedFlowSlot[] createSlotArray(int i) {
        return new SharedFlowSlot[i];
    }
}
