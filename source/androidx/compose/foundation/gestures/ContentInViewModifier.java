package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.OnPlacedModifier;
import androidx.compose.p003ui.layout.OnRemeasuredModifier;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001TB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b&\u0010 J%\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\n*\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J%\u0010.\u001a\u00020-2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020#2\u0006\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020#2\u0006\u0010(\u001a\u00020#H\u0002¢\u0006\u0004\b2\u00103J\"\u00106\u001a\u000205*\u00020\u001a2\u0006\u00104\u001a\u00020\u001aH\u0082\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107J\"\u00109\u001a\u000205*\u0002082\u0006\u00104\u001a\u000208H\u0082\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010?R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010AR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010ER\u0016\u0010G\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010?R\u001f\u0010J\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010?R\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010MR\u0017\u0010S\u001a\u00020O8\u0006¢\u0006\f\n\u0004\b.\u0010P\u001a\u0004\bQ\u0010R\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, m28850d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollState", "", "reverseDirection", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "Landroidx/compose/ui/geometry/Rect;", "localRect", "calculateRectForParent", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Lkotlin/Function0;", "", "bringChildIntoView", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", OperatorName.CLOSE_PATH, "()Landroidx/compose/ui/geometry/Rect;", OperatorName.NON_STROKING_CMYK, "()V", "", OperatorName.CURVE_TO, "()F", OperatorName.NON_STROKING_GRAY, "childBounds", "containerSize", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "i", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Landroidx/compose/ui/geometry/Offset;", OperatorName.MOVE_TO, "(Landroidx/compose/ui/geometry/Rect;J)J", "leadingEdge", "trailingEdge", OperatorName.LINE_TO, "(FFF)F", "other", "", "d", "(JJ)I", "Landroidx/compose/ui/geometry/Size;", "e", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/CoroutineScope;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Z", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "bringIntoViewRequests", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "Landroidx/compose/ui/geometry/Rect;", "focusedChildBoundsFromPreviousRemeasure", "trackingFocusedChild", OperatorName.SET_LINE_JOINSTYLE, OperatorName.SET_LINE_CAPSTYLE, "viewportSize", "isAnimationRunning", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "animationState", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Request", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n314#2,11:428\n1#3:439\n106#4,2:440\n108#4:453\n492#5,11:442\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n*L\n129#1:428,11\n326#1:440,2\n326#1:453\n326#1:442,11\n*E\n"})
/* loaded from: classes.dex */
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {

    /* renamed from: a */
    public final CoroutineScope f12930a;

    /* renamed from: b */
    public final Orientation f12931b;

    /* renamed from: c */
    public final ScrollableState f12932c;

    /* renamed from: d */
    public final boolean f12933d;

    /* renamed from: e */
    public final BringIntoViewRequestPriorityQueue f12934e;

    /* renamed from: f */
    public LayoutCoordinates f12935f;

    /* renamed from: g */
    public LayoutCoordinates f12936g;

    /* renamed from: h */
    public Rect f12937h;

    /* renamed from: i */
    public boolean f12938i;

    /* renamed from: j */
    public long f12939j;

    /* renamed from: k */
    public boolean f12940k;

    /* renamed from: l */
    public final UpdatableAnimationState f12941l;

    /* renamed from: m */
    public final Modifier f12942m;

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier$Request;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function0;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1#2:428\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Request {

        /* renamed from: a */
        public final Function0 f12943a;

        /* renamed from: b */
        public final CancellableContinuation f12944b;

        public Request(@NotNull Function0<Rect> currentBounds, @NotNull CancellableContinuation<? super Unit> continuation) {
            Intrinsics.checkNotNullParameter(currentBounds, "currentBounds");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f12943a = currentBounds;
            this.f12944b = continuation;
        }

        @NotNull
        public final CancellableContinuation<Unit> getContinuation() {
            return this.f12944b;
        }

        @NotNull
        public final Function0<Rect> getCurrentBounds() {
            return this.f12943a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
            if (r0 == null) goto L11;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                kotlinx.coroutines.CancellableContinuation r0 = r4.f12944b
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                kotlinx.coroutines.CoroutineName$Key r1 = kotlinx.coroutines.CoroutineName.Key
                kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
                kotlinx.coroutines.CoroutineName r0 = (kotlinx.coroutines.CoroutineName) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.getName()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.AbstractC12026a.checkRadix(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L51
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L53
            L51:
                java.lang.String r0 = "("
            L53:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                kotlin.jvm.functions.Function0 r0 = r4.f12943a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                kotlinx.coroutines.CancellableContinuation r0 = r4.f12944b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewModifier.Request.toString():java.lang.String");
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewModifier(@NotNull CoroutineScope scope, @NotNull Orientation orientation, @NotNull ScrollableState scrollState, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.f12930a = scope;
        this.f12931b = orientation;
        this.f12932c = scrollState;
        this.f12933d = z;
        this.f12934e = new BringIntoViewRequestPriorityQueue();
        this.f12939j = IntSize.Companion.m73823getZeroYbymL2g();
        this.f12941l = new UpdatableAnimationState();
        this.f12942m = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new ContentInViewModifier$modifier$1(this)), this);
    }

    /* renamed from: j */
    public static /* synthetic */ boolean m61516j(ContentInViewModifier contentInViewModifier, Rect rect, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewModifier.f12939j;
        }
        return contentInViewModifier.m61517i(rect, j);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringChildIntoView(@NotNull Function0<Rect> function0, @NotNull Continuation<? super Unit> continuation) {
        Rect invoke = function0.invoke();
        if (invoke != null && !m61516j(this, invoke, 0L, 1, null)) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            if (this.f12934e.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.f12940k) {
                m61515k();
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
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final float m61523c() {
        if (IntSize.m73816equalsimpl0(this.f12939j, IntSize.Companion.m73823getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect m61519g = m61519g();
        if (m61519g == null) {
            if (this.f12938i) {
                m61519g = m61518h();
            } else {
                m61519g = null;
            }
            if (m61519g == null) {
                return 0.0f;
            }
        }
        long m73828toSizeozmzZPI = IntSizeKt.m73828toSizeozmzZPI(this.f12939j);
        int i = WhenMappings.$EnumSwitchMapping$0[this.f12931b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return m61514l(m61519g.getLeft(), m61519g.getRight(), Size.m71571getWidthimpl(m73828toSizeozmzZPI));
            }
            throw new NoWhenBranchMatchedException();
        }
        return m61514l(m61519g.getTop(), m61519g.getBottom(), Size.m71568getHeightimpl(m73828toSizeozmzZPI));
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect calculateRectForParent(@NotNull Rect localRect) {
        Intrinsics.checkNotNullParameter(localRect, "localRect");
        if (!IntSize.m73816equalsimpl0(this.f12939j, IntSize.Companion.m73823getZeroYbymL2g())) {
            return m61520f(localRect, this.f12939j);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    /* renamed from: d */
    public final int m61522d(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.f12931b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Intrinsics.compare(IntSize.m73818getWidthimpl(j), IntSize.m73818getWidthimpl(j2));
            }
            throw new NoWhenBranchMatchedException();
        }
        return Intrinsics.compare(IntSize.m73817getHeightimpl(j), IntSize.m73817getHeightimpl(j2));
    }

    /* renamed from: e */
    public final int m61521e(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.f12931b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Float.compare(Size.m71571getWidthimpl(j), Size.m71571getWidthimpl(j2));
            }
            throw new NoWhenBranchMatchedException();
        }
        return Float.compare(Size.m71568getHeightimpl(j), Size.m71568getHeightimpl(j2));
    }

    /* renamed from: f */
    public final Rect m61520f(Rect rect, long j) {
        return rect.m71539translatek4lQ0M(Offset.m71511unaryMinusF1C5BW0(m61513m(rect, j)));
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30960c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30959d(this, obj, function2);
    }

    /* renamed from: g */
    public final Rect m61519g() {
        MutableVector mutableVector = this.f12934e.f12929a;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect invoke = ((Request) content[i]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (m61521e(invoke.m71535getSizeNHjbRc(), IntSizeKt.m73828toSizeozmzZPI(this.f12939j)) <= 0) {
                        rect = invoke;
                    } else {
                        return rect;
                    }
                }
                i--;
            } while (i >= 0);
            return rect;
        }
        return rect;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.f12942m;
    }

    /* renamed from: h */
    public final Rect m61518h() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.f12935f;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.f12936g) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m61517i(Rect rect, long j) {
        return Offset.m71499equalsimpl0(m61513m(rect, j), Offset.Companion.m71518getZeroF1C5BW0());
    }

    /* renamed from: k */
    public final void m61515k() {
        if (!this.f12940k) {
            AbstractC1552Vc.m65753e(this.f12930a, null, CoroutineStart.UNDISPATCHED, new ContentInViewModifier$launchAnimation$1(this, null), 1, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: l */
    public final float m61514l(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        if (Math.abs(f) >= Math.abs(f4)) {
            return f4;
        }
        return f;
    }

    /* renamed from: m */
    public final long m61513m(Rect rect, long j) {
        long m73828toSizeozmzZPI = IntSizeKt.m73828toSizeozmzZPI(j);
        int i = WhenMappings.$EnumSwitchMapping$0[this.f12931b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return OffsetKt.Offset(m61514l(rect.getLeft(), rect.getRight(), Size.m71571getWidthimpl(m73828toSizeozmzZPI)), 0.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        return OffsetKt.Offset(0.0f, m61514l(rect.getTop(), rect.getBottom(), Size.m71568getHeightimpl(m73828toSizeozmzZPI)));
    }

    @Override // androidx.compose.p003ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f12935f = coordinates;
    }

    @Override // androidx.compose.p003ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void mo69383onRemeasuredozmzZPI(long j) {
        Rect m61518h;
        long j2 = this.f12939j;
        this.f12939j = j;
        if (m61522d(j, j2) < 0 && (m61518h = m61518h()) != null) {
            Rect rect = this.f12937h;
            if (rect == null) {
                rect = m61518h;
            }
            if (!this.f12940k && !this.f12938i && m61517i(rect, j2) && !m61517i(m61518h, j)) {
                this.f12938i = true;
                m61515k();
            }
            this.f12937h = m61518h;
        }
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }
}
