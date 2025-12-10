package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001TB3\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ-\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u000eJB\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\"Ro\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t2'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t8\u0016@VX\u0096\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\fR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000301R\u00020\u0000008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000301R\u00020\u0000008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0018\u00108\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010.R\u001f\u0010;\u001a\u00020\u00168\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001d\u0010P\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001d\u0010S\u001a\u00020Q8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u0010O\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "pointerInputHandler", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "onDetach", "()V", "onDensityChange", "onViewConfigurationChange", "resetPointerInputHandler", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "value", OperatorName.ENDPATH, "Lkotlin/jvm/functions/Function2;", "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "setPointerInputHandler", "Lkotlinx/coroutines/Job;", "o", "Lkotlinx/coroutines/Job;", "pointerInputJob", "p", "Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", OperatorName.SAVE, "Landroidx/compose/runtime/collection/MutableVector;", "pointerHandlers", PDPageLabelRange.STYLE_ROMAN_LOWER, "dispatchingPointerHandlers", OperatorName.CLOSE_AND_STROKE, "lastPointerEvent", "t", OperatorName.SET_LINE_CAPSTYLE, "boundsSize", "", "u", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "PointerEventHandlerCoroutine", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,775:1\n519#1:806\n520#1:808\n522#1,4:810\n528#1:825\n531#1,3:837\n1182#2:776\n1161#2,2:777\n1182#2:779\n1161#2,2:780\n34#3:782\n34#3:807\n34#3:879\n146#4:783\n460#4,11:784\n492#4,11:795\n146#4:809\n460#4,11:814\n492#4,11:826\n728#4,2:880\n86#5,2:840\n33#5,6:842\n88#5:848\n86#5,2:849\n33#5,6:851\n88#5:857\n33#5,4:861\n38#5:868\n135#6,3:858\n138#6:865\n139#6:867\n140#6:869\n1#7:866\n314#8,9:870\n323#8,2:882\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n543#1:806\n543#1:808\n543#1:810,4\n543#1:825\n543#1:837,3\n435#1:776\n435#1:777,2\n444#1:779\n444#1:780,2\n519#1:782\n543#1:807\n611#1:879\n520#1:783\n525#1:784,11\n528#1:795,11\n543#1:809\n543#1:814,11\n543#1:826,11\n612#1:880,2\n569#1:840,2\n569#1:842,6\n569#1:848\n579#1:849,2\n579#1:851,6\n579#1:857\n582#1:861,4\n582#1:868\n582#1:858,3\n582#1:865\n582#1:867\n582#1:869\n582#1:866\n609#1:870,9\n609#1:882,2\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl */
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {

    /* renamed from: n */
    public Function2 f30007n;

    /* renamed from: o */
    public Job f30008o;

    /* renamed from: p */
    public PointerEvent f30009p;

    /* renamed from: q */
    public final MutableVector f30010q;

    /* renamed from: r */
    public final MutableVector f30011r;

    /* renamed from: s */
    public PointerEvent f30012s;

    /* renamed from: t */
    public long f30013t;

    /* renamed from: u */
    public boolean f30014u;

    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine */
    /* loaded from: classes2.dex */
    public final class PointerEventHandlerCoroutine implements AwaitPointerEventScope, Density, Continuation {

        /* renamed from: a */
        public final Continuation f30015a;

        /* renamed from: b */
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f30016b;

        /* renamed from: c */
        public CancellableContinuation f30017c;

        /* renamed from: d */
        public PointerEventPass f30018d;

        /* renamed from: e */
        public final CoroutineContext f30019e;

        /* renamed from: f */
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f30020f;

        public PointerEventHandlerCoroutine(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, Continuation completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            this.f30020f = suspendingPointerInputModifierNodeImpl;
            this.f30015a = completion;
            this.f30016b = suspendingPointerInputModifierNodeImpl;
            this.f30018d = PointerEventPass.Main;
            this.f30019e = EmptyCoroutineContext.INSTANCE;
        }

        @Override // androidx.compose.p003ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, Continuation continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.f30018d = pointerEventPass;
            this.f30017c = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        /* renamed from: d */
        public final void m59595d(Throwable th2) {
            CancellableContinuation cancellableContinuation = this.f30017c;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(th2);
            }
            this.f30017c = null;
        }

        /* renamed from: e */
        public final void m59594e(PointerEvent event, PointerEventPass pass) {
            CancellableContinuation cancellableContinuation;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(pass, "pass");
            if (pass == this.f30018d && (cancellableContinuation = this.f30017c) != null) {
                this.f30017c = null;
                cancellableContinuation.resumeWith(Result.m74087constructorimpl(event));
            }
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.f30019e;
        }

        @Override // androidx.compose.p003ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return this.f30020f.f30009p;
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getDensity() {
            return this.f30016b.getDensity();
        }

        @Override // androidx.compose.p003ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo72631getExtendedTouchPaddingNHjbRc() {
            return this.f30020f.mo72734getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getFontScale() {
            return this.f30016b.getFontScale();
        }

        @Override // androidx.compose.p003ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo72632getSizeYbymL2g() {
            return this.f30020f.f30013t;
        }

        @Override // androidx.compose.p003ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return this.f30020f.getViewConfiguration();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            MutableVector mutableVector = this.f30020f.f30010q;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f30020f;
            synchronized (mutableVector) {
                suspendingPointerInputModifierNodeImpl.f30010q.remove(this);
                Unit unit = Unit.INSTANCE;
            }
            this.f30015a.resumeWith(obj);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo69431roundToPxR2X_6o(long j) {
            return this.f30016b.mo69431roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo69432roundToPx0680j_4(float f) {
            return this.f30016b.mo69432roundToPx0680j_4(f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-GaN1DYA */
        public float mo69433toDpGaN1DYA(long j) {
            return this.f30016b.mo69433toDpGaN1DYA(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo69434toDpu2uoSUM(float f) {
            return this.f30016b.mo69434toDpu2uoSUM(f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo69436toDpSizekrfVVM(long j) {
            return this.f30016b.mo69436toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo69437toPxR2X_6o(long j) {
            return this.f30016b.mo69437toPxR2X_6o(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo69438toPx0680j_4(float f) {
            return this.f30016b.mo69438toPx0680j_4(f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            Intrinsics.checkNotNullParameter(dpRect, "<this>");
            return this.f30016b.toRect(dpRect);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo69439toSizeXkaWNTQ(long j) {
            return this.f30016b.mo69439toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-0xMU5do */
        public long mo69440toSp0xMU5do(float f) {
            return this.f30016b.mo69440toSp0xMU5do(f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo69441toSpkPz2Gy4(float f) {
            return this.f30016b.mo69441toSpkPz2Gy4(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // androidx.compose.p003ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object withTimeout(long r11, kotlin.jvm.functions.Function2 r13, kotlin.coroutines.Continuation r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.p003ui.input.pointer.C3487x647a7347
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.p003ui.input.pointer.C3487x647a7347) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.L$0
                kotlinx.coroutines.Job r11 = (kotlinx.coroutines.Job) r11
                kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                kotlin.ResultKt.throwOnFailure(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                kotlinx.coroutines.CancellableContinuation r14 = r10.f30017c
                if (r14 == 0) goto L56
                kotlin.Result$Companion r2 = kotlin.Result.Companion
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
                java.lang.Object r2 = kotlin.Result.m74087constructorimpl(r2)
                r14.resumeWith(r2)
            L56:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r14 = r10.f30020f
                kotlinx.coroutines.CoroutineScope r4 = r14.getCoroutineScope()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.Job r11 = kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r11     // Catch: java.lang.Throwable -> L2d
                r0.label = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.p003ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r12)
                return r14
            L7b:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.p003ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        @Override // androidx.compose.p003ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object withTimeoutOrNull(long r5, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.p003ui.input.pointer.C3489x2677a771
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.p003ui.input.pointer.C3489x2677a771) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: androidx.compose.p003ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.ResultKt.throwOnFailure(r8)
                r0.label = r3     // Catch: androidx.compose.p003ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.p003ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo69435toDpu2uoSUM(int i) {
            return this.f30016b.mo69435toDpu2uoSUM(i);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo69442toSpkPz2Gy4(int i) {
            return this.f30016b.mo69442toSpkPz2Gy4(i);
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(@NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> pointerInputHandler) {
        PointerEvent pointerEvent;
        Intrinsics.checkNotNullParameter(pointerInputHandler, "pointerInputHandler");
        this.f30007n = pointerInputHandler;
        pointerEvent = SuspendingPointerInputFilterKt.f30006a;
        this.f30009p = pointerEvent;
        this.f30010q = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.f30011r = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.f30013t = IntSize.Companion.m73823getZeroYbymL2g();
    }

    /* renamed from: a */
    public final void m59599a(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        MutableVector mutableVector;
        int size;
        synchronized (this.f30010q) {
            MutableVector mutableVector2 = this.f30011r;
            mutableVector2.addAll(mutableVector2.getSize(), this.f30010q);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3 && (size = (mutableVector = this.f30011r).getSize()) > 0) {
                    int i2 = size - 1;
                    Object[] content = mutableVector.getContent();
                    do {
                        ((PointerEventHandlerCoroutine) content[i2]).m59594e(pointerEvent, pointerEventPass);
                        i2--;
                    } while (i2 >= 0);
                }
            } else {
                MutableVector mutableVector3 = this.f30011r;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    Object[] content2 = mutableVector3.getContent();
                    int i3 = 0;
                    do {
                        ((PointerEventHandlerCoroutine) content2[i3]).m59594e(pointerEvent, pointerEventPass);
                        i3++;
                    } while (i3 < size2);
                }
            }
        } finally {
            this.f30011r.clear();
        }
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputScope
    @Nullable
    public <R> Object awaitPointerEventScope(@NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, cancellableContinuationImpl);
        synchronized (this.f30010q) {
            this.f30010q.add(pointerEventHandlerCoroutine);
            Continuation<Unit> createCoroutine = ContinuationKt.createCoroutine(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.Companion companion = Result.Companion;
            createCoroutine.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
        }
        cancellableContinuationImpl.invokeOnCancellation(new C3490x5824cdb5(pointerEventHandlerCoroutine));
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo72734getExtendedTouchPaddingNHjbRc() {
        long mo69439toSizeXkaWNTQ = mo69439toSizeXkaWNTQ(getViewConfiguration().mo72913getMinimumTouchTargetSizeMYxV2XQ());
        long mo72735getSizeYbymL2g = mo72735getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m71571getWidthimpl(mo69439toSizeXkaWNTQ) - IntSize.m73818getWidthimpl(mo72735getSizeYbymL2g)) / 2.0f, Math.max(0.0f, Size.m71568getHeightimpl(mo69439toSizeXkaWNTQ) - IntSize.m73817getHeightimpl(mo72735getSizeYbymL2g)) / 2.0f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.f30014u;
    }

    @Override // androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNode
    @NotNull
    public Function2<PointerInputScope, Continuation<? super Unit>, Object> getPointerInputHandler() {
        return this.f30007n;
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g */
    public long mo72735getSizeYbymL2g() {
        return this.f30013t;
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputScope
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return AbstractC18188Ok1.m66987a(this);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.f30012s;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!(!changes.get(i).getPressed())) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = changes2.get(i2);
                    long m72713getIdJ3iCeTQ = pointerInputChange.m72713getIdJ3iCeTQ();
                    long m72714getPositionF1C5BW0 = pointerInputChange.m72714getPositionF1C5BW0();
                    arrayList.add(new PointerInputChange(m72713getIdJ3iCeTQ, pointerInputChange.getUptimeMillis(), m72714getPositionF1C5BW0, false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m72714getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (DefaultConstructorMarker) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.f30009p = pointerEvent2;
                m59599a(pointerEvent2, PointerEventPass.Initial);
                m59599a(pointerEvent2, PointerEventPass.Main);
                m59599a(pointerEvent2, PointerEventPass.Final);
                this.f30012s = null;
                return;
            }
        }
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo69310onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long j) {
        Job m65753e;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f30013t = j;
        if (pass == PointerEventPass.Initial) {
            this.f30009p = pointerEvent;
        }
        if (this.f30008o == null) {
            m65753e = AbstractC1552Vc.m65753e(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
            this.f30008o = m65753e;
        }
        m59599a(pointerEvent, pass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i))) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!(!z)) {
            pointerEvent = null;
        }
        this.f30012s = pointerEvent;
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        Job job = this.f30008o;
        if (job != null) {
            job.cancel((CancellationException) new PointerInputResetException());
            this.f30008o = null;
        }
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo69431roundToPxR2X_6o(long j) {
        return AbstractC11522jG.m29253a(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo69432roundToPx0680j_4(float f) {
        return AbstractC11522jG.m29252b(this, f);
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.f30014u = z;
    }

    @Override // androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(@NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        resetPointerInputHandler();
        this.f30007n = value;
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return AbstractC18188Ok1.m66984d(this);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo69433toDpGaN1DYA(long j) {
        return AbstractC11522jG.m29251c(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69434toDpu2uoSUM(float f) {
        return AbstractC11522jG.m29250d(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo69436toDpSizekrfVVM(long j) {
        return AbstractC11522jG.m29248f(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo69437toPxR2X_6o(long j) {
        return AbstractC11522jG.m29247g(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo69438toPx0680j_4(float f) {
        return AbstractC11522jG.m29246h(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return AbstractC11522jG.m29245i(this, dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo69439toSizeXkaWNTQ(long j) {
        return AbstractC11522jG.m29244j(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo69440toSp0xMU5do(float f) {
        return AbstractC11522jG.m29243k(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69441toSpkPz2Gy4(float f) {
        return AbstractC11522jG.m29242l(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69435toDpu2uoSUM(int i) {
        return AbstractC11522jG.m29249e(this, i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69442toSpkPz2Gy4(int i) {
        return AbstractC11522jG.m29241m(this, i);
    }
}
