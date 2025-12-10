package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.p003ui.layout.LookaheadScope;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.AbstractC3526a;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.node.LookaheadDelegate;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.NodeMeasuringIntrinsics;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002IJBM\u0012A\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u000b*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u000b*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\tø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010#\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001fH\u0000¢\u0006\u0004\b%\u0010\"J#\u0010(\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b'\u0010\"J#\u0010*\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001fH\u0000¢\u0006\u0004\b)\u0010\"R`\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f8\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u000fR\u0018\u00103\u001a\u000600R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010?\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR!\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010H\u001a\b\u0018\u00010ER\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, m28850d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/ParameterName;", "name", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measureBlock", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "", "onAttach", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "lookaheadConstraints", "intermediateMeasure-Te-uZzU", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;JJJ)Landroidx/compose/ui/layout/MeasureResult;", "intermediateMeasure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntermediateIntrinsicWidth$ui_release", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntermediateIntrinsicWidth", "width", "minIntermediateIntrinsicHeight$ui_release", "minIntermediateIntrinsicHeight", "maxIntermediateIntrinsicWidth$ui_release", "maxIntermediateIntrinsicWidth", "maxIntermediateIntrinsicHeight$ui_release", "maxIntermediateIntrinsicHeight", OperatorName.ENDPATH, "Lkotlin/jvm/functions/Function3;", "getMeasureBlock$ui_release", "()Lkotlin/jvm/functions/Function3;", "setMeasureBlock$ui_release", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "o", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "intermediateMeasureScope", "Landroidx/compose/ui/layout/LookaheadScopeImpl;", "p", "Landroidx/compose/ui/layout/LookaheadScopeImpl;", "localLookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", OperatorName.SAVE, "Landroidx/compose/ui/layout/LookaheadScope;", "closestLookaheadScope", "", PDPageLabelRange.STYLE_ROMAN_LOWER, "Z", "isIntermediateChangeActive", "()Z", "setIntermediateChangeActive", "(Z)V", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$a;", "t", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$a;", "intermediateMeasurable", PDPageLabelRange.STYLE_LETTERS_LOWER, "IntermediateMeasureScopeImpl", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,333:1\n88#2:334\n230#3,5:335\n58#3:340\n59#3,8:342\n383#3,6:350\n393#3,2:357\n395#3,8:362\n403#3,9:373\n412#3,8:385\n68#3,7:393\n1#4:341\n261#5:356\n234#6,3:359\n237#6,3:382\n1182#7:370\n1161#7,2:371\n*S KotlinDebug\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n*L\n101#1:334\n101#1:335,5\n101#1:340\n101#1:342,8\n101#1:350,6\n101#1:357,2\n101#1:362,8\n101#1:373,9\n101#1:385,8\n101#1:393,7\n101#1:341\n101#1:356\n101#1:359,3\n101#1:382,3\n101#1:370\n101#1:371,2\n*E\n"})
/* renamed from: androidx.compose.ui.layout.IntermediateLayoutModifierNode */
/* loaded from: classes2.dex */
public final class IntermediateLayoutModifierNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public Function3 f30063n;

    /* renamed from: o */
    public final IntermediateMeasureScopeImpl f30064o;

    /* renamed from: p */
    public final LookaheadScopeImpl f30065p;

    /* renamed from: q */
    public LookaheadScope f30066q;

    /* renamed from: r */
    public boolean f30067r;

    /* renamed from: s */
    public Constraints f30068s;

    /* renamed from: t */
    public C3491a f30069t;

    /* renamed from: androidx.compose.ui.layout.IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl */
    /* loaded from: classes2.dex */
    public final class IntermediateMeasureScopeImpl implements IntermediateMeasureScope, CoroutineScope {

        /* renamed from: a */
        public long f30070a = IntSize.Companion.m73823getZeroYbymL2g();

        public IntermediateMeasureScopeImpl() {
        }

        /* renamed from: a */
        public void m59581a(long j) {
            this.f30070a = j;
        }

        @Override // kotlinx.coroutines.CoroutineScope
        public CoroutineContext getCoroutineContext() {
            return IntermediateLayoutModifierNode.this.getCoroutineScope().getCoroutineContext();
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getDensity() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            Intrinsics.checkNotNull(coordinator$ui_release);
            return coordinator$ui_release.getDensity();
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getFontScale() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            Intrinsics.checkNotNull(coordinator$ui_release);
            return coordinator$ui_release.getFontScale();
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            Intrinsics.checkNotNull(coordinator$ui_release);
            return coordinator$ui_release.getLayoutDirection();
        }

        @Override // androidx.compose.p003ui.layout.LookaheadScope
        public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
            Intrinsics.checkNotNullParameter(placementScope, "<this>");
            return IntermediateLayoutModifierNode.this.f30066q.getLookaheadScopeCoordinates(placementScope);
        }

        @Override // androidx.compose.p003ui.layout.IntermediateMeasureScope
        /* renamed from: getLookaheadSize-YbymL2g  reason: not valid java name */
        public long mo72813getLookaheadSizeYbymL2g() {
            return this.f30070a;
        }

        @Override // androidx.compose.p003ui.layout.LookaheadScope
        public /* synthetic */ Modifier intermediateLayout(Modifier modifier, Function4 function4) {
            return LookaheadScope.CC.m59550a(this, modifier, function4);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return false;
        }

        @Override // androidx.compose.p003ui.layout.MeasureScope
        public MeasureResult layout(final int i, final int i2, final Map alignmentLines, final Function1 placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            final IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
            return new MeasureResult(i, i2, alignmentLines, this, intermediateLayoutModifierNode, placementBlock) { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl$layout$1

                /* renamed from: a */
                public final int f30079a;

                /* renamed from: b */
                public final int f30080b;

                /* renamed from: c */
                public final Map f30081c;

                /* renamed from: d */
                public final /* synthetic */ int f30082d;

                /* renamed from: e */
                public final /* synthetic */ IntermediateLayoutModifierNode.IntermediateMeasureScopeImpl f30083e;

                /* renamed from: f */
                public final /* synthetic */ IntermediateLayoutModifierNode f30084f;

                /* renamed from: g */
                public final /* synthetic */ Function1 f30085g;

                {
                    this.f30082d = i;
                    this.f30083e = this;
                    this.f30084f = intermediateLayoutModifierNode;
                    this.f30085g = placementBlock;
                    this.f30079a = i;
                    this.f30080b = i2;
                    this.f30081c = alignmentLines;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                @NotNull
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.f30081c;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                public int getHeight() {
                    return this.f30080b;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                public int getWidth() {
                    return this.f30079a;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                    int i3 = this.f30082d;
                    LayoutDirection layoutDirection = this.f30083e.getLayoutDirection();
                    NodeCoordinator coordinator$ui_release = this.f30084f.getCoordinator$ui_release();
                    Function1 function1 = this.f30085g;
                    LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f30153c;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f30154d;
                    Placeable.PlacementScope.f30152b = i3;
                    Placeable.PlacementScope.f30151a = layoutDirection;
                    boolean m59522a = companion.m59522a(coordinator$ui_release);
                    function1.invoke(companion);
                    if (coordinator$ui_release != null) {
                        coordinator$ui_release.setPlacingForAlignment$ui_release(m59522a);
                    }
                    Placeable.PlacementScope.f30152b = parentWidth;
                    Placeable.PlacementScope.f30151a = parentLayoutDirection;
                    Placeable.PlacementScope.f30153c = layoutCoordinates;
                    Placeable.PlacementScope.f30154d = layoutNodeLayoutDelegate;
                }
            };
        }

        @Override // androidx.compose.p003ui.layout.LookaheadScope
        /* renamed from: localLookaheadPositionOf-dBAh8RU  reason: not valid java name */
        public /* synthetic */ long mo72814localLookaheadPositionOfdBAh8RU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
            return LookaheadScope.CC.m59549b(this, layoutCoordinates, layoutCoordinates2);
        }

        @Override // androidx.compose.p003ui.layout.LookaheadScope
        public Modifier onPlaced(Modifier modifier, Function2 onPlaced) {
            Intrinsics.checkNotNullParameter(modifier, "<this>");
            Intrinsics.checkNotNullParameter(onPlaced, "onPlaced");
            return IntermediateLayoutModifierNode.this.f30066q.onPlaced(modifier, onPlaced);
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

        @Override // androidx.compose.p003ui.layout.LookaheadScope
        public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
            Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
            return IntermediateLayoutModifierNode.this.f30066q.toLookaheadCoordinates(layoutCoordinates);
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

    /* renamed from: androidx.compose.ui.layout.IntermediateLayoutModifierNode$a */
    /* loaded from: classes2.dex */
    public final class C3491a extends Placeable implements Measurable {

        /* renamed from: f */
        public Measurable f30072f;

        /* renamed from: g */
        public Placeable f30073g;

        /* renamed from: h */
        public final /* synthetic */ IntermediateLayoutModifierNode f30074h;

        public C3491a(IntermediateLayoutModifierNode intermediateLayoutModifierNode, Measurable wrappedMeasurable) {
            Intrinsics.checkNotNullParameter(wrappedMeasurable, "wrappedMeasurable");
            this.f30074h = intermediateLayoutModifierNode;
            this.f30072f = wrappedMeasurable;
        }

        /* renamed from: b */
        public final void m59580b(Measurable measurable) {
            Intrinsics.checkNotNullParameter(measurable, "<set-?>");
            this.f30072f = measurable;
        }

        @Override // androidx.compose.p003ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            Placeable placeable = this.f30073g;
            Intrinsics.checkNotNull(placeable);
            return placeable.get(alignmentLine);
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.f30072f.getParentData();
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return this.f30072f.maxIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return this.f30072f.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo72811measureBRTryo0(long j) {
            Placeable mo72811measureBRTryo0;
            long mo72813getLookaheadSizeYbymL2g;
            if (this.f30074h.isIntermediateChangeActive()) {
                mo72811measureBRTryo0 = this.f30072f.mo72811measureBRTryo0(j);
                m72849setMeasurementConstraintsBRTryo0(j);
                m72848setMeasuredSizeozmzZPI(IntSizeKt.IntSize(mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight()));
            } else {
                Measurable measurable = this.f30072f;
                Constraints constraints = this.f30074h.f30068s;
                Intrinsics.checkNotNull(constraints);
                mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(constraints.m73632unboximpl());
                IntermediateLayoutModifierNode intermediateLayoutModifierNode = this.f30074h;
                Constraints constraints2 = intermediateLayoutModifierNode.f30068s;
                Intrinsics.checkNotNull(constraints2);
                m72849setMeasurementConstraintsBRTryo0(constraints2.m73632unboximpl());
                if (intermediateLayoutModifierNode.isIntermediateChangeActive()) {
                    mo72813getLookaheadSizeYbymL2g = IntSizeKt.IntSize(mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight());
                } else {
                    mo72813getLookaheadSizeYbymL2g = intermediateLayoutModifierNode.f30064o.mo72813getLookaheadSizeYbymL2g();
                }
                m72848setMeasuredSizeozmzZPI(mo72813getLookaheadSizeYbymL2g);
            }
            this.f30073g = mo72811measureBRTryo0;
            return this;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return this.f30072f.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return this.f30072f.minIntrinsicWidth(i);
        }

        @Override // androidx.compose.p003ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo69179placeAtf8xVGno(long j, float f, Function1 function1) {
            Unit unit;
            if (!this.f30074h.isIntermediateChangeActive()) {
                j = IntOffset.Companion.m73786getZeronOccac();
            }
            if (function1 != null) {
                Placeable placeable = this.f30073g;
                if (placeable != null) {
                    Placeable.PlacementScope.Companion.m72859placeWithLayeraW9wM(placeable, j, f, function1);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
            }
            Placeable placeable2 = this.f30073g;
            if (placeable2 != null) {
                Placeable.PlacementScope.Companion.m72854place70tqf50(placeable2, j, f);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: androidx.compose.ui.layout.IntermediateLayoutModifierNode$b */
    /* loaded from: classes2.dex */
    public static final class C3492b implements NodeMeasuringIntrinsics.MeasureBlock {
        public C3492b() {
        }

        @Override // androidx.compose.p003ui.node.NodeMeasuringIntrinsics.MeasureBlock
        /* renamed from: measure-3p2s80s  reason: not valid java name */
        public final MeasureResult mo72815measure3p2s80s(MeasureScope maxHeight, Measurable intrinsicMeasurable, long j) {
            Intrinsics.checkNotNullParameter(maxHeight, "$this$maxHeight");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.f30064o, intrinsicMeasurable, Constraints.m73615boximpl(j));
        }
    }

    /* renamed from: androidx.compose.ui.layout.IntermediateLayoutModifierNode$c */
    /* loaded from: classes2.dex */
    public static final class C3493c implements NodeMeasuringIntrinsics.MeasureBlock {
        public C3493c() {
        }

        @Override // androidx.compose.p003ui.node.NodeMeasuringIntrinsics.MeasureBlock
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo72815measure3p2s80s(MeasureScope maxWidth, Measurable intrinsicMeasurable, long j) {
            Intrinsics.checkNotNullParameter(maxWidth, "$this$maxWidth");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.f30064o, intrinsicMeasurable, Constraints.m73615boximpl(j));
        }
    }

    /* renamed from: androidx.compose.ui.layout.IntermediateLayoutModifierNode$d */
    /* loaded from: classes2.dex */
    public static final class C3494d implements NodeMeasuringIntrinsics.MeasureBlock {
        public C3494d() {
        }

        @Override // androidx.compose.p003ui.node.NodeMeasuringIntrinsics.MeasureBlock
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo72815measure3p2s80s(MeasureScope minHeight, Measurable intrinsicMeasurable, long j) {
            Intrinsics.checkNotNullParameter(minHeight, "$this$minHeight");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.f30064o, intrinsicMeasurable, Constraints.m73615boximpl(j));
        }
    }

    /* renamed from: androidx.compose.ui.layout.IntermediateLayoutModifierNode$e */
    /* loaded from: classes2.dex */
    public static final class C3495e implements NodeMeasuringIntrinsics.MeasureBlock {
        public C3495e() {
        }

        @Override // androidx.compose.p003ui.node.NodeMeasuringIntrinsics.MeasureBlock
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo72815measure3p2s80s(MeasureScope minWidth, Measurable intrinsicMeasurable, long j) {
            Intrinsics.checkNotNullParameter(minWidth, "$this$minWidth");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.f30064o, intrinsicMeasurable, Constraints.m73615boximpl(j));
        }
    }

    public IntermediateLayoutModifierNode(@NotNull Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        this.f30063n = measureBlock;
        this.f30064o = new IntermediateMeasureScopeImpl();
        LookaheadScopeImpl lookaheadScopeImpl = new LookaheadScopeImpl(new IntermediateLayoutModifierNode$localLookaheadScope$1(this));
        this.f30065p = lookaheadScopeImpl;
        this.f30066q = lookaheadScopeImpl;
        this.f30067r = true;
    }

    @NotNull
    public final Function3<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock$ui_release() {
        return this.f30063n;
    }

    @NotNull
    /* renamed from: intermediateMeasure-Te-uZzU  reason: not valid java name */
    public final MeasureResult m72812intermediateMeasureTeuZzU(@NotNull MeasureScope intermediateMeasure, @NotNull Measurable measurable, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(intermediateMeasure, "$this$intermediateMeasure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        this.f30064o.m59581a(j2);
        this.f30068s = Constraints.m73615boximpl(j3);
        C3491a c3491a = this.f30069t;
        if (c3491a == null) {
            c3491a = new C3491a(this, measurable);
        }
        this.f30069t = c3491a;
        c3491a.m59580b(measurable);
        return (MeasureResult) this.f30063n.invoke(this.f30064o, c3491a, Constraints.m73615boximpl(j));
    }

    public final boolean isIntermediateChangeActive() {
        return this.f30067r;
    }

    public final int maxIntermediateIntrinsicHeight$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new C3492b(), intrinsicMeasureScope, measurable, i);
    }

    public final int maxIntermediateIntrinsicWidth$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new C3493c(), intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59388a(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59387b(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new IntermediateLayoutModifierNode$measure$1$1(mo72811measureBRTryo0), 4, null);
    }

    public final int minIntermediateIntrinsicHeight$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new C3494d(), intrinsicMeasureScope, measurable, i);
    }

    public final int minIntermediateIntrinsicWidth$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new C3495e(), intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59386c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59385d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onAttach() {
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl;
        LookaheadScopeImpl lookaheadScopeImpl;
        LookaheadScopeImpl lookaheadScopeImpl2;
        NodeChain nodes$ui_release;
        NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
        Intrinsics.checkNotNull(coordinator$ui_release);
        LayoutNode layoutNode = coordinator$ui_release.getLayoutNode();
        NodeCoordinator coordinator$ui_release2 = getCoordinator$ui_release();
        Intrinsics.checkNotNull(coordinator$ui_release2);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release2.getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            lookaheadLayoutCoordinatesImpl = lookaheadDelegate.getLookaheadLayoutCoordinates();
        } else {
            lookaheadLayoutCoordinatesImpl = null;
        }
        if (lookaheadLayoutCoordinatesImpl != null) {
            LayoutNode lookaheadRoot$ui_release = layoutNode.getLookaheadRoot$ui_release();
            if (lookaheadRoot$ui_release != null && lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
                lookaheadScopeImpl2 = new LookaheadScopeImpl(new IntermediateLayoutModifierNode$onAttach$1(lookaheadRoot$ui_release));
            } else {
                int m72961constructorimpl = NodeKind.m72961constructorimpl(512);
                if (getNode().isAttached()) {
                    Modifier.Node parent$ui_release = getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
                    IntermediateLayoutModifierNode intermediateLayoutModifierNode = null;
                    while (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    Modifier.Node node = parent$ui_release;
                                    while (node != null) {
                                        if (node instanceof IntermediateLayoutModifierNode) {
                                            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) node;
                                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                            int i = 0;
                                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        node = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node != null) {
                                                            mutableVector.add(node);
                                                            node = null;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        node = DelegatableNodeKt.m59509b(mutableVector);
                                    }
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    }
                    if (intermediateLayoutModifierNode == null || (lookaheadScopeImpl = intermediateLayoutModifierNode.f30065p) == null) {
                        lookaheadScopeImpl = this.f30065p;
                    }
                    lookaheadScopeImpl2 = lookaheadScopeImpl;
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            this.f30066q = lookaheadScopeImpl2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void setIntermediateChangeActive(boolean z) {
        this.f30067r = z;
    }

    public final void setMeasureBlock$ui_release(@NotNull Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.f30063n = function3;
    }
}
