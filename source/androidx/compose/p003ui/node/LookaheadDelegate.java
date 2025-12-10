package androidx.compose.p003ui.node;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.pattern.parser.Parser;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001c\u0010\u000fJ/\u0010%\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010(J \u00100\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0000H\u0000ø\u0001\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R+\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR(\u0010J\u001a\u0004\u0018\u00010 2\b\u0010E\u001a\u0004\u0018\u00010 8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bF\u0010G\"\u0004\bH\u0010IR&\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0;8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bK\u0010=\u001a\u0004\bL\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020 8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010TR\u0014\u0010]\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0016\u0010d\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010PR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0016\u0010t\u001a\u0004\u0018\u00010q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010s\u0082\u0002\u0016\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006u"}, m28850d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getCachedAlignmentLine$ui_release", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "getCachedAlignmentLine", "", "replace$ui_release", "()V", Parser.REPLACE_CONVERTER_WORD, "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "placeChildren", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/MeasureResult;", "block", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "ancestor", "positionIn-Bjo55l4$ui_release", "(Landroidx/compose/ui/node/LookaheadDelegate;)J", "positionIn", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "i", OperatorName.SET_LINE_CAPSTYLE, "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "", OperatorName.SET_LINE_JOINSTYLE, "Ljava/util/Map;", "oldAlignmentLines", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "lookaheadLayoutCoordinates", "result", OperatorName.LINE_TO, "Landroidx/compose/ui/layout/MeasureResult;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/layout/MeasureResult;)V", "_measureResult", OperatorName.MOVE_TO, "getCachedAlignmentLinesMap", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "", "getHasMeasureResult", "()Z", "hasMeasureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParent", "parent", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "", "getParentData", "()Ljava/lang/Object;", "parentData", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,212:1\n1#2:213\n365#3,15:214\n86#4:229\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n165#1:214,15\n206#1:229\n*E\n"})
/* renamed from: androidx.compose.ui.node.LookaheadDelegate */
/* loaded from: classes2.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {

    /* renamed from: h */
    public final NodeCoordinator f30345h;

    /* renamed from: i */
    public long f30346i;

    /* renamed from: j */
    public Map f30347j;

    /* renamed from: k */
    public final LookaheadLayoutCoordinatesImpl f30348k;

    /* renamed from: l */
    public MeasureResult f30349l;

    /* renamed from: m */
    public final Map f30350m;

    public LookaheadDelegate(@NotNull NodeCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        this.f30345h = coordinator;
        this.f30346i = IntOffset.Companion.m73786getZeronOccac();
        this.f30348k = new LookaheadLayoutCoordinatesImpl(this);
        this.f30350m = new LinkedHashMap();
    }

    /* renamed from: b */
    public final void m59451b(MeasureResult measureResult) {
        Unit unit;
        Map map;
        if (measureResult != null) {
            m72848setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m72848setMeasuredSizeozmzZPI(IntSize.Companion.m73823getZeroYbymL2g());
        }
        if (!Intrinsics.areEqual(this.f30349l, measureResult) && measureResult != null && ((((map = this.f30347j) != null && !map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(measureResult.getAlignmentLines(), this.f30347j))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map map2 = this.f30347j;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.f30347j = map2;
            }
            map2.clear();
            map2.putAll(measureResult.getAlignmentLines());
        }
        this.f30349l = measureResult;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.f30345h.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = (Integer) this.f30350m.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    public final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.f30350m;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.f30345h.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.f30348k;
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.f30345h;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.f30345h.getDensity();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return this.f30345h.getFontScale();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        if (this.f30349l != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f30345h.getLayoutDirection();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable, androidx.compose.p003ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.f30345h.getLayoutNode();
    }

    @NotNull
    public final LookaheadLayoutCoordinatesImpl getLookaheadLayoutCoordinates() {
        return this.f30348k;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this.f30349l;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui_release = this.f30345h.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            return wrappedBy$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.f30345h.getParentData();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo72925getPositionnOccac() {
        return this.f30346i;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable, androidx.compose.p003ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui_release = this.f30345h.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui_release = this.f30345h.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i);
    }

    public int minIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui_release = this.f30345h.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i);
    }

    public int minIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui_release = this.f30345h.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i);
    }

    @NotNull
    /* renamed from: performingMeasure-K40F9xA  reason: not valid java name */
    public final Placeable m72927performingMeasureK40F9xA(long j, @NotNull Function0<? extends MeasureResult> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m72849setMeasurementConstraintsBRTryo0(j);
        m59451b(block.invoke());
        return this;
    }

    @Override // androidx.compose.p003ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo69179placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        if (!IntOffset.m73775equalsimpl0(mo72925getPositionnOccac(), j)) {
            m72929setPositiongyyYBs(j);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.f30345h);
        }
        if (isShallowPlacing$ui_release()) {
            return;
        }
        placeChildren();
    }

    public void placeChildren() {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int width = getMeasureResult$ui_release().getWidth();
        LayoutDirection layoutDirection = this.f30345h.getLayoutDirection();
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f30153c;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f30154d;
        Placeable.PlacementScope.f30152b = width;
        Placeable.PlacementScope.f30151a = layoutDirection;
        boolean m59522a = companion.m59522a(this);
        getMeasureResult$ui_release().placeChildren();
        setPlacingForAlignment$ui_release(m59522a);
        Placeable.PlacementScope.f30152b = parentWidth;
        Placeable.PlacementScope.f30151a = parentLayoutDirection;
        Placeable.PlacementScope.f30153c = layoutCoordinates;
        Placeable.PlacementScope.f30154d = layoutNodeLayoutDelegate;
    }

    /* renamed from: positionIn-Bjo55l4$ui_release  reason: not valid java name */
    public final long m72928positionInBjo55l4$ui_release(@NotNull LookaheadDelegate ancestor) {
        Intrinsics.checkNotNullParameter(ancestor, "ancestor");
        long m73786getZeronOccac = IntOffset.Companion.m73786getZeronOccac();
        LookaheadDelegate lookaheadDelegate = this;
        while (!Intrinsics.areEqual(lookaheadDelegate, ancestor)) {
            long mo72925getPositionnOccac = lookaheadDelegate.mo72925getPositionnOccac();
            m73786getZeronOccac = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m73786getZeronOccac) + IntOffset.m73776getXimpl(mo72925getPositionnOccac), IntOffset.m73777getYimpl(m73786getZeronOccac) + IntOffset.m73777getYimpl(mo72925getPositionnOccac));
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate.f30345h.getWrappedBy$ui_release();
            Intrinsics.checkNotNull(wrappedBy$ui_release);
            lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
        }
        return m73786getZeronOccac;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo69179placeAtf8xVGno(mo72925getPositionnOccac(), 0.0f, null);
    }

    /* renamed from: setPosition--gyyYBs  reason: not valid java name */
    public void m72929setPositiongyyYBs(long j) {
        this.f30346i = j;
    }
}
