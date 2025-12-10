package androidx.compose.p003ui.node;

import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001VB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u001f\u0010\u0017\u001a\u00020\r2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0005J'\u0010)\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u001aJ!\u0010.\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\u0010J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u0016\u00105\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010D\u001a\u00020>2\u0006\u0010?\u001a\u00020>8F@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010<R!\u0010H\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b.\u0010GR\u0016\u0010L\u001a\u0004\u0018\u00010I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0011\u0010O\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0018\u0010S\u001a\u00020\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010RR\u0018\u0010T\u001a\u00020\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010RR\u0018\u0010U\u001a\u00020\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010R\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006W"}, m28850d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "updateRootConstraints-BRTryo0", "(J)V", "updateRootConstraints", "layoutNode", "", "forced", "requestLookaheadRemeasure", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "requestRemeasure", "requestLookaheadRelayout", "requestRelayout", "requestOnPositionedCallback", "Lkotlin/Function0;", "onLayout", "measureAndLayout", "(Lkotlin/jvm/functions/Function0;)Z", "measureOnly", "()V", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "affectsLookahead", "forceMeasureTheSubtree", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "forceDispatch", "dispatchOnPositionedCallbacks", "(Z)V", "node", "onNodeDetached", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/Constraints;)Z", OperatorName.CURVE_TO, OperatorName.NON_STROKING_GRAY, PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_PATH, OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "Z", "duringMeasureLayout", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "d", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "onPositionedDispatcher", "Landroidx/compose/runtime/collection/MutableVector;", "e", "Landroidx/compose/runtime/collection/MutableVector;", "onLayoutCompletedListeners", "", "<set-?>", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, "getMeasureIteration", "()J", "measureIteration", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "Landroidx/compose/ui/unit/Constraints;", "rootConstraints", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "i", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "consistencyChecker", "getHasPendingMeasureOrLayout", "()Z", "hasPendingMeasureOrLayout", "getHasPendingOnPositionedCallbacks", "hasPendingOnPositionedCallbacks", "(Landroidx/compose/ui/node/LayoutNode;)Z", "measureAffectsParent", "canAffectParent", "canAffectParentInLookahead", "PostponedRequest", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,592:1\n404#1,8:599\n413#1,5:614\n404#1,14:619\n404#1,14:645\n1182#2:593\n1161#2,2:594\n1182#2:596\n1161#2,2:597\n175#3,2:607\n177#3,4:610\n100#4:609\n197#5:633\n197#5:683\n460#6,11:634\n728#6,2:659\n460#6,11:661\n460#6,11:672\n460#6,11:684\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n341#1:599,8\n341#1:614,5\n361#1:619,14\n384#1:645,14\n68#1:593\n68#1:594,2\n89#1:596\n89#1:597,2\n343#1:607,2\n343#1:610,4\n343#1:609\n373#1:633\n531#1:683\n373#1:634,11\n420#1:659,2\n424#1:661,11\n476#1:672,11\n531#1:684,11\n*E\n"})
/* renamed from: androidx.compose.ui.node.MeasureAndLayoutDelegate */
/* loaded from: classes2.dex */
public final class MeasureAndLayoutDelegate {

    /* renamed from: a */
    public final LayoutNode f30351a;

    /* renamed from: b */
    public final DepthSortedSetsForDifferentPasses f30352b;

    /* renamed from: c */
    public boolean f30353c;

    /* renamed from: d */
    public final OnPositionedDispatcher f30354d;

    /* renamed from: e */
    public final MutableVector f30355e;

    /* renamed from: f */
    public long f30356f;

    /* renamed from: g */
    public final MutableVector f30357g;

    /* renamed from: h */
    public Constraints f30358h;

    /* renamed from: i */
    public final LayoutTreeConsistencyChecker f30359i;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/node/LayoutNode;", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "()Z", OperatorName.CURVE_TO, "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest */
    /* loaded from: classes2.dex */
    public static final class PostponedRequest {
        public static final int $stable = 8;

        /* renamed from: a */
        public final LayoutNode f30360a;

        /* renamed from: b */
        public final boolean f30361b;

        /* renamed from: c */
        public final boolean f30362c;

        public PostponedRequest(@NotNull LayoutNode node, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f30360a = node;
            this.f30361b = z;
            this.f30362c = z2;
        }

        @NotNull
        public final LayoutNode getNode() {
            return this.f30360a;
        }

        public final boolean isForced() {
            return this.f30362c;
        }

        public final boolean isLookahead() {
            return this.f30361b;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.MeasureAndLayoutDelegate$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(@NotNull LayoutNode root) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker;
        Intrinsics.checkNotNullParameter(root, "root");
        this.f30351a = root;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.f30352b = depthSortedSetsForDifferentPasses;
        this.f30354d = new OnPositionedDispatcher();
        this.f30355e = new MutableVector(new Owner.OnLayoutCompletedListener[16], 0);
        this.f30356f = 1L;
        MutableVector mutableVector = new MutableVector(new PostponedRequest[16], 0);
        this.f30357g = mutableVector;
        if (companion.getEnableExtraAssertions()) {
            layoutTreeConsistencyChecker = new LayoutTreeConsistencyChecker(root, depthSortedSetsForDifferentPasses, mutableVector.asMutableList());
        } else {
            layoutTreeConsistencyChecker = null;
        }
        this.f30359i = layoutTreeConsistencyChecker;
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m59442i(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return measureAndLayoutDelegate.m59443h(layoutNode, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    /* renamed from: a */
    public final void m59450a() {
        MutableVector mutableVector = this.f30355e;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((Owner.OnLayoutCompletedListener) content[i]).onLayoutComplete();
                i++;
            } while (i < size);
            this.f30355e.clear();
        }
        this.f30355e.clear();
    }

    /* renamed from: b */
    public final boolean m59449b(LayoutNode layoutNode, Constraints constraints) {
        boolean m72907lookaheadRemeasure_Sx5XlM$ui_release$default;
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        if (constraints != null) {
            m72907lookaheadRemeasure_Sx5XlM$ui_release$default = layoutNode.m72911lookaheadRemeasure_Sx5XlM$ui_release(constraints);
        } else {
            m72907lookaheadRemeasure_Sx5XlM$ui_release$default = LayoutNode.m72907lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m72907lookaheadRemeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m72907lookaheadRemeasure_Sx5XlM$ui_release$default;
    }

    /* renamed from: c */
    public final boolean m59448c(LayoutNode layoutNode, Constraints constraints) {
        boolean m72908remeasure_Sx5XlM$ui_release$default;
        if (constraints != null) {
            m72908remeasure_Sx5XlM$ui_release$default = layoutNode.m72912remeasure_Sx5XlM$ui_release(constraints);
        } else {
            m72908remeasure_Sx5XlM$ui_release$default = LayoutNode.m72908remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m72908remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m72908remeasure_Sx5XlM$ui_release$default;
    }

    /* renamed from: d */
    public final boolean m59447d(LayoutNode layoutNode) {
        if (layoutNode.getMeasurePending$ui_release() && m59445f(layoutNode)) {
            return true;
        }
        return false;
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if (z) {
            this.f30354d.onRootNodePositioned(this.f30351a);
        }
        this.f30354d.dispatch();
    }

    /* renamed from: e */
    public final boolean m59446e(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (layoutNode.getLookaheadMeasurePending$ui_release()) {
            if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                return true;
            }
            AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
            if (lookaheadAlignmentLinesOwner$ui_release != null && (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) != null && alignmentLines.getRequired$ui_release()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m59445f(LayoutNode layoutNode) {
        if (layoutNode.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InMeasureBlock && !layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return false;
        }
        return true;
    }

    public final void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.f30352b.isEmpty()) {
            return;
        }
        if (this.f30353c) {
            MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1 measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1 = new MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1(z);
            if (!measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode).booleanValue()) {
                MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = content[i];
                        if (measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode2).booleanValue() && this.f30352b.remove(layoutNode2, z)) {
                            m59443h(layoutNode2, z);
                        }
                        if (!measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode2).booleanValue()) {
                            forceMeasureTheSubtree(layoutNode2, z);
                        }
                        i++;
                    } while (i < size);
                    if (!measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode).booleanValue() && this.f30352b.remove(layoutNode, z)) {
                        m59442i(this, layoutNode, false, 2, null);
                        return;
                    }
                    return;
                } else if (!measureAndLayoutDelegate$forceMeasureTheSubtree$pending$1.invoke((MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1) layoutNode).booleanValue()) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: g */
    public final void m59444g(LayoutNode layoutNode) {
        m59441j(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = content[i];
                if (m59445f(layoutNode2)) {
                    m59444g(layoutNode2);
                }
                i++;
            } while (i < size);
            m59441j(layoutNode);
        }
        m59441j(layoutNode);
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.f30352b.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.f30354d.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (this.f30353c) {
            return this.f30356f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    /* renamed from: h */
    public final boolean m59443h(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        boolean z2;
        boolean m59448c;
        int i = 0;
        if (!layoutNode.isPlaced() && !m59447d(layoutNode) && !Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !m59446e(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (!layoutNode.getLookaheadMeasurePending$ui_release() && !layoutNode.getMeasurePending$ui_release()) {
            m59448c = false;
            z2 = false;
        } else {
            if (layoutNode == this.f30351a) {
                constraints = this.f30358h;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release() && z) {
                z2 = m59449b(layoutNode, constraints);
            } else {
                z2 = false;
            }
            m59448c = m59448c(layoutNode, constraints);
        }
        if ((z2 || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && z) {
            layoutNode.lookaheadReplace$ui_release();
        }
        if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
            if (layoutNode == this.f30351a) {
                layoutNode.place$ui_release(0, 0);
            } else {
                layoutNode.replace$ui_release();
            }
            this.f30354d.onNodePositioned(layoutNode);
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f30359i;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        if (this.f30357g.isNotEmpty()) {
            MutableVector mutableVector = this.f30357g;
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                do {
                    PostponedRequest postponedRequest = (PostponedRequest) content[i];
                    if (postponedRequest.getNode().isAttached()) {
                        if (!postponedRequest.isLookahead()) {
                            requestRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                        } else {
                            requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                        }
                    }
                    i++;
                } while (i < size);
                this.f30357g.clear();
            } else {
                this.f30357g.clear();
            }
        }
        return m59448c;
    }

    /* renamed from: j */
    public final void m59441j(LayoutNode layoutNode) {
        Constraints constraints;
        if (!layoutNode.getMeasurePending$ui_release() && !layoutNode.getLookaheadMeasurePending$ui_release()) {
            return;
        }
        if (layoutNode == this.f30351a) {
            constraints = this.f30358h;
            Intrinsics.checkNotNull(constraints);
        } else {
            constraints = null;
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release()) {
            m59449b(layoutNode, constraints);
        }
        m59448c(layoutNode, constraints);
    }

    public final boolean measureAndLayout(@Nullable Function0<Unit> function0) {
        boolean z;
        if (this.f30351a.isAttached()) {
            if (this.f30351a.isPlaced()) {
                if (!this.f30353c) {
                    boolean z2 = false;
                    if (this.f30358h != null) {
                        this.f30353c = true;
                        try {
                            if (this.f30352b.isNotEmpty()) {
                                DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f30352b;
                                z = false;
                                while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                                    boolean z3 = !depthSortedSetsForDifferentPasses.f30218a.isEmpty();
                                    LayoutNode pop = (z3 ? depthSortedSetsForDifferentPasses.f30218a : depthSortedSetsForDifferentPasses.f30219b).pop();
                                    boolean m59443h = m59443h(pop, z3);
                                    if (pop == this.f30351a && m59443h) {
                                        z = true;
                                    }
                                }
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            } else {
                                z = false;
                            }
                            this.f30353c = false;
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f30359i;
                            if (layoutTreeConsistencyChecker != null) {
                                layoutTreeConsistencyChecker.assertConsistent();
                            }
                            z2 = z;
                        } catch (Throwable th2) {
                            this.f30353c = false;
                            throw th2;
                        }
                    }
                    m59450a();
                    return z2;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0075  */
    /* renamed from: measureAndLayout-0kLqBqw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m72930measureAndLayout0kLqBqw(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.node.LayoutNode r4, long r5) {
        /*
            r3 = this;
            java.lang.String r0 = "layoutNode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.ui.node.LayoutNode r0 = r3.f30351a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Failed requirement."
            if (r0 == 0) goto L9e
            androidx.compose.ui.node.LayoutNode r0 = r3.f30351a
            boolean r0 = r0.isAttached()
            if (r0 == 0) goto L94
            androidx.compose.ui.node.LayoutNode r0 = r3.f30351a
            boolean r0 = r0.isPlaced()
            if (r0 == 0) goto L8a
            boolean r0 = r3.f30353c
            r0 = r0 ^ r1
            if (r0 == 0) goto L80
            androidx.compose.ui.unit.Constraints r0 = r3.f30358h
            if (r0 == 0) goto L7c
            r3.f30353c = r1
            r0 = 0
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r1 = r3.f30352b     // Catch: java.lang.Throwable -> L4a
            r1.remove(r4)     // Catch: java.lang.Throwable -> L4a
            androidx.compose.ui.unit.Constraints r1 = androidx.compose.p003ui.unit.Constraints.m73615boximpl(r5)     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r3.m59449b(r4, r1)     // Catch: java.lang.Throwable -> L4a
            androidx.compose.ui.unit.Constraints r5 = androidx.compose.p003ui.unit.Constraints.m73615boximpl(r5)     // Catch: java.lang.Throwable -> L4a
            r3.m59448c(r4, r5)     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L4c
            boolean r5 = r4.getLookaheadLayoutPending$ui_release()     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L5b
            goto L4c
        L4a:
            r4 = move-exception
            goto L79
        L4c:
            java.lang.Boolean r5 = r4.isPlacedInLookahead()     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L5b
            r4.lookaheadReplace$ui_release()     // Catch: java.lang.Throwable -> L4a
        L5b:
            boolean r5 = r4.getLayoutPending$ui_release()     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L6f
            boolean r5 = r4.isPlaced()     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L6f
            r4.replace$ui_release()     // Catch: java.lang.Throwable -> L4a
            androidx.compose.ui.node.OnPositionedDispatcher r5 = r3.f30354d     // Catch: java.lang.Throwable -> L4a
            r5.onNodePositioned(r4)     // Catch: java.lang.Throwable -> L4a
        L6f:
            r3.f30353c = r0
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r4 = r3.f30359i
            if (r4 == 0) goto L7c
            r4.assertConsistent()
            goto L7c
        L79:
            r3.f30353c = r0
            throw r4
        L7c:
            r3.m59450a()
            return
        L80:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L8a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L94:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L9e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.node.MeasureAndLayoutDelegate.m72930measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode, long):void");
    }

    public final void measureOnly() {
        if (this.f30351a.isAttached()) {
            if (this.f30351a.isPlaced()) {
                if (!this.f30353c) {
                    if (this.f30358h != null) {
                        this.f30353c = true;
                        try {
                            m59444g(this.f30351a);
                            this.f30353c = false;
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f30359i;
                            if (layoutTreeConsistencyChecker != null) {
                                layoutTreeConsistencyChecker.assertConsistent();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            this.f30353c = false;
                            throw th2;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void onNodeDetached(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f30352b.remove(node);
    }

    public final void registerOnLayoutCompletedListener(@NotNull Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30355e.add(listener);
    }

    public final boolean requestLookaheadRelayout(@NotNull LayoutNode layoutNode, boolean z) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !z) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f30359i;
                if (layoutTreeConsistencyChecker == null) {
                    return false;
                }
                layoutTreeConsistencyChecker.assertConsistent();
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.f30352b.add(layoutNode, true);
            }
            if (this.f30353c) {
                return false;
            }
            return true;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.f30359i;
        if (layoutTreeConsistencyChecker2 == null) {
            return false;
        }
        layoutTreeConsistencyChecker2.assertConsistent();
        return false;
    }

    public final boolean requestLookaheadRemeasure(@NotNull LayoutNode layoutNode, boolean z) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    if (layoutNode.getLookaheadMeasurePending$ui_release() && !z) {
                        return false;
                    }
                    layoutNode.markLookaheadMeasurePending$ui_release();
                    layoutNode.markMeasurePending$ui_release();
                    if ((Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || m59446e(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                        this.f30352b.add(layoutNode, true);
                    }
                    if (this.f30353c) {
                        return false;
                    }
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.f30357g.add(new PostponedRequest(layoutNode, true, z));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f30359i;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    public final void requestOnPositionedCallback(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30354d.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(@NotNull LayoutNode layoutNode, boolean z) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                if (!z && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f30359i;
                    if (layoutTreeConsistencyChecker == null) {
                        return false;
                    }
                    layoutTreeConsistencyChecker.assertConsistent();
                    return false;
                }
                layoutNode.markLayoutPending$ui_release();
                if (layoutNode.isPlaced() && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                    this.f30352b.add(layoutNode, false);
                }
                if (this.f30353c) {
                    return false;
                }
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.f30359i;
        if (layoutTreeConsistencyChecker2 == null) {
            return false;
        }
        layoutTreeConsistencyChecker2.assertConsistent();
        return false;
    }

    public final boolean requestRemeasure(@NotNull LayoutNode layoutNode, boolean z) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    if (!layoutNode.getMeasurePending$ui_release() || z) {
                        layoutNode.markMeasurePending$ui_release();
                        if ((layoutNode.isPlaced() || m59447d(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getMeasurePending$ui_release())) {
                            this.f30352b.add(layoutNode, false);
                        }
                        if (!this.f30353c) {
                            return true;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                this.f30357g.add(new PostponedRequest(layoutNode, false, z));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f30359i;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
        }
        return false;
    }

    /* renamed from: updateRootConstraints-BRTryo0 */
    public final void m72931updateRootConstraintsBRTryo0(long j) {
        boolean m73620equalsimpl0;
        Constraints constraints = this.f30358h;
        boolean z = false;
        if (constraints == null) {
            m73620equalsimpl0 = false;
        } else {
            m73620equalsimpl0 = Constraints.m73620equalsimpl0(constraints.m73632unboximpl(), j);
        }
        if (!m73620equalsimpl0) {
            if (!this.f30353c) {
                this.f30358h = Constraints.m73615boximpl(j);
                if (this.f30351a.getLookaheadRoot$ui_release() != null) {
                    this.f30351a.markLookaheadMeasurePending$ui_release();
                }
                this.f30351a.markMeasurePending$ui_release();
                DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f30352b;
                LayoutNode layoutNode = this.f30351a;
                if (layoutNode.getLookaheadRoot$ui_release() != null) {
                    z = true;
                }
                depthSortedSetsForDifferentPasses.add(layoutNode, z);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
