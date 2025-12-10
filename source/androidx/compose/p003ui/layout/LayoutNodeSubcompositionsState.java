package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.SubcomposeLayoutState;
import androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.LayoutNodeKt;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.platform.Wrapper_androidKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.compose.ComposeNavigator;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u000395>B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001e\u001a\u00020\u001d2\u001d\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017¢\u0006\u0002\b\u001bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010!\u001a\u00020 2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u0016J\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u0016J4\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J<\u00102\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020/2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u00104\u001a\u00020\u0011H\u0002¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0011H\u0002¢\u0006\u0004\b9\u0010:J)\u0010>\u001a\u00020\n2\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\b\b\u0002\u0010=\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010@R$\u0010F\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010\u0005\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010QR\"\u0010S\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010QR\u0018\u0010V\u001a\u00060TR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010UR\u0018\u0010Y\u001a\u00060WR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010XR<\u0010a\u001a\u0019\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017¢\u0006\u0002\b\u001b8\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010QR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010NR\u0016\u0010k\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010NR\u0014\u0010o\u001a\u00020l8\u0002X\u0082D¢\u0006\u0006\n\u0004\bm\u0010nR\u0011\u0010q\u001a\u00020p8F¢\u0006\u0006\u001a\u0004\bq\u0010r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006s"}, m28850d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "startIndex", "disposeOrReuseStartingFromIndex", "(I)V", "makeSureStateIsConsistent", "()V", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren", "disposeCurrentNodes", "node", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;", "nodeState", "e", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;)V", "Landroidx/compose/runtime/Composition;", "existing", "container", "Landroidx/compose/runtime/CompositionContext;", "parent", ComposeNavigator.NAME, OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/runtime/Composition;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", FirebaseAnalytics.Param.INDEX, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)Ljava/lang/Object;", OperatorName.CLOSE_PATH, "(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Landroidx/compose/ui/node/LayoutNode;", "from", TypedValues.TransitionType.S_TO, "count", OperatorName.CURVE_TO, "(III)V", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "value", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "d", "I", "currentIndex", "", "Ljava/util/Map;", "nodeToNodeState", "slotIdToNode", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$c;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$c;", Action.SCOPE_ATTRIBUTE, "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "intermediateMeasureScope", "Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;", "i", "Lkotlin/jvm/functions/Function2;", "getIntermediateMeasurePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "setIntermediateMeasurePolicy$ui_release", "(Lkotlin/jvm/functions/Function2;)V", "intermediateMeasurePolicy", OperatorName.SET_LINE_JOINSTYLE, "precomposeMap", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "reusableSlotIdsSet", OperatorName.LINE_TO, "reusableCount", OperatorName.MOVE_TO, "precomposedCount", "", OperatorName.ENDPATH, "Ljava/lang/String;", "NoIntrinsicsMessage", "", "isInLookaheadScope", "()Z", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1063:1\n978#1:1085\n978#1:1099\n978#1:1115\n978#1:1120\n361#2,7:1064\n361#2,7:1071\n361#2,7:1106\n495#3,4:1078\n500#3:1091\n495#3,4:1092\n500#3:1105\n129#4,3:1082\n133#4:1090\n129#4,3:1096\n133#4:1104\n1067#5,4:1086\n1067#5,4:1100\n1067#5,4:1116\n1067#5,4:1121\n1067#5,4:1125\n1067#5,2:1129\n1069#5,2:1133\n215#6,2:1113\n1855#7,2:1131\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n692#1:1085\n760#1:1099\n966#1:1115\n972#1:1120\n648#1:1064,7\n679#1:1071,7\n901#1:1106,7\n691#1:1078,4\n691#1:1091\n744#1:1092,4\n744#1:1105\n691#1:1082,3\n691#1:1090\n744#1:1096,3\n744#1:1104\n692#1:1086,4\n760#1:1100,4\n966#1:1116,4\n972#1:1121,4\n978#1:1125,4\n981#1:1129,2\n981#1:1133,2\n957#1:1113,2\n982#1:1131,2\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState */
/* loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsState {

    /* renamed from: a */
    public final LayoutNode f30092a;

    /* renamed from: b */
    public CompositionContext f30093b;

    /* renamed from: c */
    public SubcomposeSlotReusePolicy f30094c;

    /* renamed from: d */
    public int f30095d;

    /* renamed from: e */
    public final Map f30096e;

    /* renamed from: f */
    public final Map f30097f;

    /* renamed from: g */
    public final C3499c f30098g;

    /* renamed from: h */
    public final C3497a f30099h;

    /* renamed from: i */
    public Function2 f30100i;

    /* renamed from: j */
    public final Map f30101j;

    /* renamed from: k */
    public final SubcomposeSlotReusePolicy.SlotIdsSet f30102k;

    /* renamed from: l */
    public int f30103l;

    /* renamed from: m */
    public int f30104m;

    /* renamed from: n */
    public final String f30105n;

    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$a */
    /* loaded from: classes2.dex */
    public final class C3497a implements SubcomposeIntermediateMeasureScope, MeasureScope {

        /* renamed from: a */
        public final /* synthetic */ C3499c f30106a;

        /* renamed from: c */
        public Function2 f30108c;

        /* renamed from: b */
        public long f30107b = IntSize.Companion.m73823getZeroYbymL2g();

        /* renamed from: d */
        public long f30109d = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

        public C3497a() {
            this.f30106a = LayoutNodeSubcompositionsState.this.f30098g;
        }

        /* renamed from: a */
        public void m59567a(long j) {
            this.f30109d = j;
        }

        /* renamed from: b */
        public void m59566b(Function2 function2) {
            Intrinsics.checkNotNullParameter(function2, "<set-?>");
            this.f30108c = function2;
        }

        /* renamed from: c */
        public void m59565c(long j) {
            this.f30107b = j;
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getDensity() {
            return this.f30106a.getDensity();
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getFontScale() {
            return this.f30106a.getFontScale();
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.f30106a.getLayoutDirection();
        }

        @Override // androidx.compose.p003ui.layout.SubcomposeIntermediateMeasureScope
        /* renamed from: getLookaheadConstraints-msEJaDk  reason: not valid java name */
        public long mo72825getLookaheadConstraintsmsEJaDk() {
            return this.f30109d;
        }

        @Override // androidx.compose.p003ui.layout.SubcomposeIntermediateMeasureScope
        public Function2 getLookaheadMeasurePolicy() {
            Function2 function2 = this.f30108c;
            if (function2 != null) {
                return function2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("lookaheadMeasurePolicy");
            return null;
        }

        @Override // androidx.compose.p003ui.layout.SubcomposeIntermediateMeasureScope
        /* renamed from: getLookaheadSize-YbymL2g  reason: not valid java name */
        public long mo72826getLookaheadSizeYbymL2g() {
            return this.f30107b;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.f30106a.isLookingAhead();
        }

        @Override // androidx.compose.p003ui.layout.MeasureScope
        public MeasureResult layout(int i, int i2, Map alignmentLines, Function1 placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return this.f30106a.layout(i, i2, alignmentLines, placementBlock);
        }

        @Override // androidx.compose.p003ui.layout.SubcomposeIntermediateMeasureScope
        public List measurablesForSlot(Object obj) {
            List<Measurable> childMeasurables$ui_release;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.f30097f.get(obj);
            if (layoutNode == null || (childMeasurables$ui_release = layoutNode.getChildMeasurables$ui_release()) == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            return childMeasurables$ui_release;
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo69431roundToPxR2X_6o(long j) {
            return this.f30106a.mo69431roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo69432roundToPx0680j_4(float f) {
            return this.f30106a.mo69432roundToPx0680j_4(f);
        }

        @Override // androidx.compose.p003ui.layout.SubcomposeIntermediateMeasureScope, androidx.compose.p003ui.layout.SubcomposeMeasureScope
        public /* synthetic */ List subcompose(Object obj, Function2 function2) {
            return AbstractC21066mO1.m26259a(this, obj, function2);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-GaN1DYA */
        public float mo69433toDpGaN1DYA(long j) {
            return this.f30106a.mo69433toDpGaN1DYA(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo69434toDpu2uoSUM(float f) {
            return this.f30106a.mo69434toDpu2uoSUM(f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo69436toDpSizekrfVVM(long j) {
            return this.f30106a.mo69436toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo69437toPxR2X_6o(long j) {
            return this.f30106a.mo69437toPxR2X_6o(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo69438toPx0680j_4(float f) {
            return this.f30106a.mo69438toPx0680j_4(f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            Intrinsics.checkNotNullParameter(dpRect, "<this>");
            return this.f30106a.toRect(dpRect);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo69439toSizeXkaWNTQ(long j) {
            return this.f30106a.mo69439toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-0xMU5do */
        public long mo69440toSp0xMU5do(float f) {
            return this.f30106a.mo69440toSp0xMU5do(f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo69441toSpkPz2Gy4(float f) {
            return this.f30106a.mo69441toSpkPz2Gy4(f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo69435toDpu2uoSUM(int i) {
            return this.f30106a.mo69435toDpu2uoSUM(i);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo69442toSpkPz2Gy4(int i) {
            return this.f30106a.mo69442toSpkPz2Gy4(i);
        }
    }

    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$c */
    /* loaded from: classes2.dex */
    public final class C3499c implements SubcomposeMeasureScope {

        /* renamed from: a */
        public LayoutDirection f30116a = LayoutDirection.Rtl;

        /* renamed from: b */
        public float f30117b;

        /* renamed from: c */
        public float f30118c;

        public C3499c() {
        }

        /* renamed from: a */
        public void m59554a(float f) {
            this.f30117b = f;
        }

        /* renamed from: b */
        public void m59553b(float f) {
            this.f30118c = f;
        }

        /* renamed from: c */
        public void m59552c(LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.f30116a = layoutDirection;
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getDensity() {
            return this.f30117b;
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getFontScale() {
            return this.f30118c;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.f30116a;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            if (LayoutNodeSubcompositionsState.this.f30092a.getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadLayingOut && LayoutNodeSubcompositionsState.this.f30092a.getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadMeasuring) {
                return false;
            }
            return true;
        }

        @Override // androidx.compose.p003ui.layout.MeasureScope
        public /* synthetic */ MeasureResult layout(int i, int i2, Map map, Function1 function1) {
            return MeasureScope.CC.m59548a(this, i, i2, map, function1);
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

        @Override // androidx.compose.p003ui.layout.SubcomposeMeasureScope
        public List subcompose(Object obj, Function2 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return LayoutNodeSubcompositionsState.this.subcompose(obj, content);
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

    public LayoutNodeSubcompositionsState(@NotNull LayoutNode root, @NotNull SubcomposeSlotReusePolicy slotReusePolicy) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f30092a = root;
        this.f30094c = slotReusePolicy;
        this.f30096e = new LinkedHashMap();
        this.f30097f = new LinkedHashMap();
        this.f30098g = new C3499c();
        this.f30099h = new C3497a();
        this.f30100i = LayoutNodeSubcompositionsState$intermediateMeasurePolicy$1.INSTANCE;
        this.f30101j = new LinkedHashMap();
        this.f30102k = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
        this.f30105n = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* renamed from: d */
    public static /* synthetic */ void m59572d(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.m59573c(i, i2, i3);
    }

    /* renamed from: a */
    public final LayoutNode m59575a(int i) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.f30092a;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
        this.f30092a.insertAt$ui_release(i, layoutNode);
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
        return layoutNode;
    }

    /* renamed from: b */
    public final Object m59574b(int i) {
        Object obj = this.f30096e.get(this.f30092a.getFoldedChildren$ui_release().get(i));
        Intrinsics.checkNotNull(obj);
        return ((C3498b) obj).m59560e();
    }

    /* renamed from: c */
    public final void m59573c(int i, int i2, int i3) {
        LayoutNode layoutNode = this.f30092a;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, true);
        this.f30092a.move$ui_release(i, i2, i3);
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, false);
    }

    @NotNull
    public final MeasurePolicy createMeasurePolicy(@NotNull final Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f30099h.m59566b(block);
        final String str = this.f30105n;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo69194measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j) {
                LayoutNodeSubcompositionsState.C3497a c3497a;
                LayoutNodeSubcompositionsState.C3497a c3497a2;
                final int i;
                LayoutNodeSubcompositionsState.C3497a c3497a3;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                LayoutNodeSubcompositionsState.this.f30098g.m59552c(measure.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.f30098g.m59554a(measure.getDensity());
                LayoutNodeSubcompositionsState.this.f30098g.m59553b(measure.getFontScale());
                if ((LayoutNodeSubcompositionsState.this.f30092a.getLayoutState$ui_release() != LayoutNode.LayoutState.Measuring && LayoutNodeSubcompositionsState.this.f30092a.getLayoutState$ui_release() != LayoutNode.LayoutState.LayingOut) || LayoutNodeSubcompositionsState.this.f30092a.getLookaheadRoot$ui_release() == null) {
                    LayoutNodeSubcompositionsState.this.f30095d = 0;
                    c3497a2 = LayoutNodeSubcompositionsState.this.f30099h;
                    c3497a2.m59567a(j);
                    final MeasureResult measureResult = (MeasureResult) block.invoke(LayoutNodeSubcompositionsState.this.f30098g, Constraints.m73615boximpl(j));
                    i = LayoutNodeSubcompositionsState.this.f30095d;
                    c3497a3 = LayoutNodeSubcompositionsState.this.f30099h;
                    c3497a3.m59565c(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure$1
                        @Override // androidx.compose.p003ui.layout.MeasureResult
                        @NotNull
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return MeasureResult.this.getAlignmentLines();
                        }

                        @Override // androidx.compose.p003ui.layout.MeasureResult
                        public int getHeight() {
                            return MeasureResult.this.getHeight();
                        }

                        @Override // androidx.compose.p003ui.layout.MeasureResult
                        public int getWidth() {
                            return MeasureResult.this.getWidth();
                        }

                        @Override // androidx.compose.p003ui.layout.MeasureResult
                        public void placeChildren() {
                            int i2;
                            layoutNodeSubcompositionsState.f30095d = i;
                            MeasureResult.this.placeChildren();
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            i2 = layoutNodeSubcompositionsState2.f30095d;
                            layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(i2);
                        }
                    };
                }
                Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> intermediateMeasurePolicy$ui_release = LayoutNodeSubcompositionsState.this.getIntermediateMeasurePolicy$ui_release();
                c3497a = LayoutNodeSubcompositionsState.this.f30099h;
                return intermediateMeasurePolicy$ui_release.invoke(c3497a, Constraints.m73615boximpl(j));
            }
        };
    }

    public final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.f30092a;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, true);
        for (C3498b c3498b : this.f30096e.values()) {
            Composition m59563b = c3498b.m59563b();
            if (m59563b != null) {
                m59563b.dispose();
            }
        }
        this.f30092a.removeAll$ui_release();
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, false);
        this.f30096e.clear();
        this.f30097f.clear();
        this.f30104m = 0;
        this.f30103l = 0;
        this.f30101j.clear();
        makeSureStateIsConsistent();
    }

    public final void disposeOrReuseStartingFromIndex(int i) {
        boolean z = false;
        this.f30103l = 0;
        int size = (this.f30092a.getFoldedChildren$ui_release().size() - this.f30104m) - 1;
        if (i <= size) {
            this.f30102k.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.f30102k.add(m59574b(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            this.f30094c.getSlotsToRetain(this.f30102k);
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                boolean z2 = false;
                while (size >= i) {
                    LayoutNode layoutNode = this.f30092a.getFoldedChildren$ui_release().get(size);
                    Object obj = this.f30096e.get(layoutNode);
                    Intrinsics.checkNotNull(obj);
                    C3498b c3498b = (C3498b) obj;
                    Object m59560e = c3498b.m59560e();
                    if (this.f30102k.contains(m59560e)) {
                        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
                        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                        measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        if (lookaheadPassDelegate$ui_release != null) {
                            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
                        }
                        this.f30103l++;
                        if (c3498b.m59564a()) {
                            c3498b.m59559f(false);
                            z2 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.f30092a;
                        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
                        this.f30096e.remove(layoutNode);
                        Composition m59563b = c3498b.m59563b();
                        if (m59563b != null) {
                            m59563b.dispose();
                        }
                        this.f30092a.removeAt$ui_release(size, 1);
                        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
                    }
                    this.f30097f.remove(m59560e);
                    size--;
                }
                Unit unit = Unit.INSTANCE;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                z = z2;
            } catch (Throwable th2) {
                createNonObservableSnapshot.dispose();
                throw th2;
            }
        }
        if (z) {
            Snapshot.Companion.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    /* renamed from: e */
    public final void m59571e(LayoutNode layoutNode, C3498b c3498b) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            LayoutNode layoutNode2 = this.f30092a;
            LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
            Function2 m59562c = c3498b.m59562c();
            Composition m59563b = c3498b.m59563b();
            CompositionContext compositionContext = this.f30093b;
            if (compositionContext != null) {
                c3498b.m59558g(m59569g(m59563b, layoutNode, compositionContext, ComposableLambdaKt.composableLambdaInstance(-34810602, true, new LayoutNodeSubcompositionsState$subcompose$3$1$1(c3498b, m59562c))));
                LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
                Unit unit = Unit.INSTANCE;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* renamed from: f */
    public final void m59570f(LayoutNode layoutNode, Object obj, Function2 function2) {
        boolean z;
        Map map = this.f30096e;
        Object obj2 = map.get(layoutNode);
        if (obj2 == null) {
            obj2 = new C3498b(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m72805getLambda1$ui_release(), null, 4, null);
            map.put(layoutNode, obj2);
        }
        C3498b c3498b = (C3498b) obj2;
        Composition m59563b = c3498b.m59563b();
        if (m59563b != null) {
            z = m59563b.getHasInvalidations();
        } else {
            z = true;
        }
        if (c3498b.m59562c() != function2 || z || c3498b.m59561d()) {
            c3498b.m59557h(function2);
            m59571e(layoutNode, c3498b);
            c3498b.m59556i(false);
        }
    }

    public final void forceRecomposeChildren() {
        for (Map.Entry entry : this.f30096e.entrySet()) {
            ((C3498b) entry.getValue()).m59556i(true);
        }
        if (!this.f30092a.getMeasurePending$ui_release()) {
            LayoutNode.requestRemeasure$ui_release$default(this.f30092a, false, false, 3, null);
        }
    }

    /* renamed from: g */
    public final Composition m59569g(Composition composition, LayoutNode layoutNode, CompositionContext compositionContext, Function2 function2) {
        if (composition == null || composition.isDisposed()) {
            composition = Wrapper_androidKt.createSubcomposition(layoutNode, compositionContext);
        }
        composition.setContent(function2);
        return composition;
    }

    @Nullable
    public final CompositionContext getCompositionContext() {
        return this.f30093b;
    }

    @NotNull
    public final Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> getIntermediateMeasurePolicy$ui_release() {
        return this.f30100i;
    }

    @NotNull
    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.f30094c;
    }

    /* renamed from: h */
    public final LayoutNode m59568h(Object obj) {
        int i;
        if (this.f30103l == 0) {
            return null;
        }
        int size = this.f30092a.getFoldedChildren$ui_release().size() - this.f30104m;
        int i2 = size - this.f30103l;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 >= i2) {
                if (Intrinsics.areEqual(m59574b(i4), obj)) {
                    i = i4;
                    break;
                }
                i4--;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            while (true) {
                if (i3 >= i2) {
                    Object obj2 = this.f30096e.get(this.f30092a.getFoldedChildren$ui_release().get(i3));
                    Intrinsics.checkNotNull(obj2);
                    C3498b c3498b = (C3498b) obj2;
                    if (this.f30094c.areCompatible(obj, c3498b.m59560e())) {
                        c3498b.m59555j(obj);
                        i4 = i3;
                        i = i4;
                        break;
                    }
                    i3--;
                } else {
                    i4 = i3;
                    break;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            m59573c(i4, i2, 1);
        }
        this.f30103l--;
        LayoutNode layoutNode = this.f30092a.getFoldedChildren$ui_release().get(i2);
        Object obj3 = this.f30096e.get(layoutNode);
        Intrinsics.checkNotNull(obj3);
        C3498b c3498b2 = (C3498b) obj3;
        c3498b2.m59559f(true);
        c3498b2.m59556i(true);
        Snapshot.Companion.sendApplyNotifications();
        return layoutNode;
    }

    public final boolean isInLookaheadScope() {
        if (this.f30092a.getLookaheadRoot$ui_release() != null) {
            return true;
        }
        return false;
    }

    public final void makeSureStateIsConsistent() {
        if (this.f30096e.size() == this.f30092a.getFoldedChildren$ui_release().size()) {
            if ((this.f30092a.getFoldedChildren$ui_release().size() - this.f30103l) - this.f30104m >= 0) {
                if (this.f30101j.size() == this.f30104m) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f30104m + ". Map size " + this.f30101j.size()).toString());
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.f30092a.getFoldedChildren$ui_release().size() + ". Reusable children " + this.f30103l + ". Precomposed children " + this.f30104m).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f30096e.size() + ") and the children count on the SubcomposeLayout (" + this.f30092a.getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    @NotNull
    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(@Nullable final Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        if (!this.f30097f.containsKey(obj)) {
            Map map = this.f30101j;
            Object obj2 = map.get(obj);
            Object obj3 = obj2;
            if (obj2 == null) {
                LayoutNode m59568h = m59568h(obj);
                if (m59568h != null) {
                    m59573c(this.f30092a.getFoldedChildren$ui_release().indexOf(m59568h), this.f30092a.getFoldedChildren$ui_release().size(), 1);
                    this.f30104m++;
                } else {
                    m59568h = m59575a(this.f30092a.getFoldedChildren$ui_release().size());
                    this.f30104m++;
                }
                map.put(obj, m59568h);
                obj3 = m59568h;
            }
            m59570f((LayoutNode) obj3, obj, content);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
            @Override // androidx.compose.p003ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                Map map2;
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                map2 = LayoutNodeSubcompositionsState.this.f30101j;
                LayoutNode layoutNode = (LayoutNode) map2.remove(obj);
                if (layoutNode != null) {
                    i = LayoutNodeSubcompositionsState.this.f30104m;
                    if (i > 0) {
                        int indexOf = LayoutNodeSubcompositionsState.this.f30092a.getFoldedChildren$ui_release().indexOf(layoutNode);
                        int size = LayoutNodeSubcompositionsState.this.f30092a.getFoldedChildren$ui_release().size();
                        i2 = LayoutNodeSubcompositionsState.this.f30104m;
                        if (indexOf >= size - i2) {
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                            i3 = layoutNodeSubcompositionsState.f30103l;
                            layoutNodeSubcompositionsState.f30103l = i3 + 1;
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                            i4 = layoutNodeSubcompositionsState2.f30104m;
                            layoutNodeSubcompositionsState2.f30104m = i4 - 1;
                            int size2 = LayoutNodeSubcompositionsState.this.f30092a.getFoldedChildren$ui_release().size();
                            i5 = LayoutNodeSubcompositionsState.this.f30104m;
                            int i7 = size2 - i5;
                            i6 = LayoutNodeSubcompositionsState.this.f30103l;
                            int i8 = i7 - i6;
                            LayoutNodeSubcompositionsState.this.m59573c(indexOf, i8, 1);
                            LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(i8);
                            return;
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
            }

            @Override // androidx.compose.p003ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                Map map2;
                List<LayoutNode> children$ui_release;
                map2 = LayoutNodeSubcompositionsState.this.f30101j;
                LayoutNode layoutNode = (LayoutNode) map2.get(obj);
                if (layoutNode != null && (children$ui_release = layoutNode.getChildren$ui_release()) != null) {
                    return children$ui_release.size();
                }
                return 0;
            }

            @Override // androidx.compose.p003ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw  reason: not valid java name */
            public void mo72828premeasure0kLqBqw(int i, long j) {
                Map map2;
                map2 = LayoutNodeSubcompositionsState.this.f30101j;
                LayoutNode layoutNode = (LayoutNode) map2.get(obj);
                if (layoutNode != null && layoutNode.isAttached()) {
                    int size = layoutNode.getChildren$ui_release().size();
                    if (i >= 0 && i < size) {
                        if (!layoutNode.isPlaced()) {
                            LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.f30092a;
                            layoutNode2.f30270n = true;
                            LayoutNodeKt.requireOwner(layoutNode).mo73016measureAndLayout0kLqBqw(layoutNode.getChildren$ui_release().get(i), j);
                            layoutNode2.f30270n = false;
                            return;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
            }
        };
    }

    public final void setCompositionContext(@Nullable CompositionContext compositionContext) {
        this.f30093b = compositionContext;
    }

    public final void setIntermediateMeasurePolicy$ui_release(@NotNull Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f30100i = function2;
    }

    public final void setSlotReusePolicy(@NotNull SubcomposeSlotReusePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f30094c != value) {
            this.f30094c = value;
            disposeOrReuseStartingFromIndex(0);
        }
    }

    @NotNull
    public final List<Measurable> subcompose(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = this.f30092a.getLayoutState$ui_release();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (layoutState$ui_release != layoutState && layoutState$ui_release != LayoutNode.LayoutState.LayingOut && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui_release != LayoutNode.LayoutState.LookaheadLayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        Map map = this.f30097f;
        Object obj2 = map.get(obj);
        if (obj2 == null) {
            obj2 = (LayoutNode) this.f30101j.remove(obj);
            if (obj2 != null) {
                int i = this.f30104m;
                if (i > 0) {
                    this.f30104m = i - 1;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                obj2 = m59568h(obj);
                if (obj2 == null) {
                    obj2 = m59575a(this.f30095d);
                }
            }
            map.put(obj, obj2);
        }
        LayoutNode layoutNode = (LayoutNode) obj2;
        int indexOf = this.f30092a.getFoldedChildren$ui_release().indexOf(layoutNode);
        int i2 = this.f30095d;
        if (indexOf >= i2) {
            if (i2 != indexOf) {
                m59572d(this, indexOf, i2, 0, 4, null);
            }
            this.f30095d++;
            m59570f(layoutNode, obj, content);
            if (layoutState$ui_release != layoutState && layoutState$ui_release != LayoutNode.LayoutState.LayingOut) {
                return layoutNode.getChildLookaheadMeasurables$ui_release();
            }
            return layoutNode.getChildMeasurables$ui_release();
        }
        throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
    }

    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$b */
    /* loaded from: classes2.dex */
    public static final class C3498b {

        /* renamed from: a */
        public Object f30111a;

        /* renamed from: b */
        public Function2 f30112b;

        /* renamed from: c */
        public Composition f30113c;

        /* renamed from: d */
        public boolean f30114d;

        /* renamed from: e */
        public final MutableState f30115e;

        public C3498b(Object obj, Function2 content, Composition composition) {
            MutableState m31891g;
            Intrinsics.checkNotNullParameter(content, "content");
            this.f30111a = obj;
            this.f30112b = content;
            this.f30113c = composition;
            m31891g = AbstractC19508dK1.m31891g(Boolean.TRUE, null, 2, null);
            this.f30115e = m31891g;
        }

        /* renamed from: a */
        public final boolean m59564a() {
            return ((Boolean) this.f30115e.getValue()).booleanValue();
        }

        /* renamed from: b */
        public final Composition m59563b() {
            return this.f30113c;
        }

        /* renamed from: c */
        public final Function2 m59562c() {
            return this.f30112b;
        }

        /* renamed from: d */
        public final boolean m59561d() {
            return this.f30114d;
        }

        /* renamed from: e */
        public final Object m59560e() {
            return this.f30111a;
        }

        /* renamed from: f */
        public final void m59559f(boolean z) {
            this.f30115e.setValue(Boolean.valueOf(z));
        }

        /* renamed from: g */
        public final void m59558g(Composition composition) {
            this.f30113c = composition;
        }

        /* renamed from: h */
        public final void m59557h(Function2 function2) {
            Intrinsics.checkNotNullParameter(function2, "<set-?>");
            this.f30112b = function2;
        }

        /* renamed from: i */
        public final void m59556i(boolean z) {
            this.f30114d = z;
        }

        /* renamed from: j */
        public final void m59555j(Object obj) {
            this.f30111a = obj;
        }

        public /* synthetic */ C3498b(Object obj, Function2 function2, Composition composition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i & 4) != 0 ? null : composition);
        }
    }
}
