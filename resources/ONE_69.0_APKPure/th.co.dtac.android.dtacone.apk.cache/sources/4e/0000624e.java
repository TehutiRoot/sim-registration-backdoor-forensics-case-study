package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.PaintingStyle;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 F2\u00020\u0001:\u0002FGB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J@\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0019\u0010 \u001a\u0015\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d¢\u0006\u0002\b\u001fH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R*\u00103\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R!\u00106\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b4\u00105R.\u0010>\u001a\u0004\u0018\u0001072\b\u0010,\u001a\u0004\u0018\u0001078\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010E\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006H"}, m29142d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "", "ensureLookaheadDelegateCreated", "()V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;)V", "<set-?>", OperatorName.STROKING_COLOR_GRAY, "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayoutModifierNode", "()Landroidx/compose/ui/node/LayoutModifierNode;", "setLayoutModifierNode$ui_release", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "layoutModifierNode", "H", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "Landroidx/compose/ui/node/LookaheadDelegate;", "I", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getWrappedNonNull", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "Companion", PDPageLabelRange.STYLE_LETTERS_LOWER, "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,223:1\n287#2,2:224\n1#3:226\n365#4,15:227\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n106#1:224,2\n167#1:227,15\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinator */
/* loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: J */
    public static final Paint f30326J;

    /* renamed from: G */
    public LayoutModifierNode f30327G;

    /* renamed from: H */
    public Constraints f30328H;

    /* renamed from: I */
    public LookaheadDelegate f30329I;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m29142d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinator$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.f30326J;
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinator$a */
    /* loaded from: classes2.dex */
    public final class C3497a extends LookaheadDelegate {
        public C3497a() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int m59441a;
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            m59441a = LayoutModifierNodeCoordinatorKt.m59441a(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(m59441a));
            return m59441a;
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo72995measureBRTryo0(long j) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            m73033setMeasurementConstraintsBRTryo0(j);
            layoutModifierNodeCoordinator.f30328H = Constraints.m73799boximpl(j);
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            m59401b(layoutModifierNode.mo69341measure3p2s80s(this, lookaheadDelegate, j));
            return this;
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo71807setColor8_81llA(Color.Companion.m71946getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo71811setStylek9PVt8s(PaintingStyle.Companion.m72147getStrokeTiuSbCo());
        f30326J = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutModifierNodeCoordinator(@NotNull LayoutNode layoutNode, @NotNull LayoutModifierNode measureNode) {
        super(layoutNode);
        C3497a c3497a;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(measureNode, "measureNode");
        this.f30327G = measureNode;
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            c3497a = new C3497a();
        } else {
            c3497a = null;
        }
        this.f30329I = c3497a;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        int m59441a;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            m59441a = LayoutModifierNodeCoordinatorKt.m59441a(this, alignmentLine);
            return m59441a;
        }
        return lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine);
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new C3497a());
        }
    }

    @NotNull
    public final LayoutModifierNode getLayoutModifierNode() {
        return this.f30327G;
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    @Nullable
    public LookaheadDelegate getLookaheadDelegate() {
        return this.f30329I;
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    @NotNull
    public Modifier.Node getTail() {
        return this.f30327G.getNode();
    }

    @NotNull
    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui_release = getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.f30327G;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.maxIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), i);
        }
        return layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.f30327G;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.maxIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), i);
        }
        return layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.p003ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo72995measureBRTryo0(long j) {
        MeasureResult mo69341measure3p2s80s;
        m73033setMeasurementConstraintsBRTryo0(j);
        LayoutModifierNode layoutModifierNode = getLayoutModifierNode();
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
            NodeCoordinator wrappedNonNull = getWrappedNonNull();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
            long IntSize = IntSizeKt.IntSize(measureResult$ui_release.getWidth(), measureResult$ui_release.getHeight());
            Constraints constraints = this.f30328H;
            Intrinsics.checkNotNull(constraints);
            mo69341measure3p2s80s = intermediateLayoutModifierNode.m72996intermediateMeasureTeuZzU(this, wrappedNonNull, j, IntSize, constraints.m73816unboximpl());
        } else {
            mo69341measure3p2s80s = layoutModifierNode.mo69341measure3p2s80s(this, getWrappedNonNull(), j);
        }
        setMeasureResult$ui_release(mo69341measure3p2s80s);
        onMeasured();
        return this;
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.f30327G;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.minIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), i);
        }
        return layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.f30327G;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.minIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), i);
        }
        return layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getWrappedNonNull().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, f30326J);
        }
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator, androidx.compose.p003ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo69367placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        super.mo69367placeAtf8xVGno(j, f, function1);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        onPlaced();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int m74002getWidthimpl = IntSize.m74002getWidthimpl(m73030getMeasuredSizeYbymL2g());
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f30241c;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f30242d;
        Placeable.PlacementScope.f30240b = m74002getWidthimpl;
        Placeable.PlacementScope.f30239a = layoutDirection;
        boolean m59472a = companion.m59472a(this);
        getMeasureResult$ui_release().placeChildren();
        setPlacingForAlignment$ui_release(m59472a);
        Placeable.PlacementScope.f30240b = parentWidth;
        Placeable.PlacementScope.f30239a = parentLayoutDirection;
        Placeable.PlacementScope.f30241c = layoutCoordinates;
        Placeable.PlacementScope.f30242d = layoutNodeLayoutDelegate;
    }

    public final void setLayoutModifierNode$ui_release(@NotNull LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<set-?>");
        this.f30327G = layoutModifierNode;
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    public void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate) {
        this.f30329I = lookaheadDelegate;
    }
}