package androidx.compose.p003ui.node;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.VerticalAlignmentLine;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.IntOffset;
import ch.qos.logback.core.pattern.parser.Parser;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\r\u001a\u00020\u000bH ¢\u0006\u0004\b\f\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00118VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001d\u0010\u0015R\u001d\u0010\"\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010)\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028 X \u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m28850d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "<init>", "()V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "calculateAlignmentLine", "", "replace$ui_release", Parser.REPLACE_CONVERTER_WORD, "Landroidx/compose/ui/node/NodeCoordinator;", "invalidateAlignmentLinesFromPositionChange", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "", OperatorName.FILL_NON_ZERO, "Z", "isShallowPlacing$ui_release", "()Z", "setShallowPlacing$ui_release", "(Z)V", "isShallowPlacing", OperatorName.NON_STROKING_GRAY, "isPlacingForAlignment$ui_release", "setPlacingForAlignment$ui_release", "isPlacingForAlignment", "isLookingAhead", "isLookingAhead$annotations", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "position", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "getParent", "parent", "getHasMeasureResult", "hasMeasureResult", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.LookaheadCapablePlaceable */
/* loaded from: classes2.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode {

    /* renamed from: f */
    public boolean f30343f;

    /* renamed from: g */
    public boolean f30344g;

    public static /* synthetic */ void isLookingAhead$annotations() {
    }

    public abstract int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine);

    @Override // androidx.compose.p003ui.layout.Measured
    public final int get(@NotNull AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        int m73777getYimpl;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (!getHasMeasureResult() || (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (alignmentLine instanceof VerticalAlignmentLine) {
            m73777getYimpl = IntOffset.m73776getXimpl(m72845getApparentToRealOffsetnOccac());
        } else {
            m73777getYimpl = IntOffset.m73777getYimpl(m72845getApparentToRealOffsetnOccac());
        }
        return calculateAlignmentLine + m73777getYimpl;
    }

    @NotNull
    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    @Nullable
    public abstract LookaheadCapablePlaceable getChild();

    @NotNull
    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.p003ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public abstract LayoutNode getLayoutNode();

    @NotNull
    public abstract MeasureResult getMeasureResult$ui_release();

    @Nullable
    public abstract LookaheadCapablePlaceable getParent();

    /* renamed from: getPosition-nOcc-ac  reason: not valid java name */
    public abstract long mo72925getPositionnOccac();

    public final void invalidateAlignmentLinesFromPositionChange(@NotNull NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode;
        AlignmentLines alignmentLines;
        Intrinsics.checkNotNullParameter(nodeCoordinator, "<this>");
        NodeCoordinator wrapped$ui_release = nodeCoordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            layoutNode = wrapped$ui_release.getLayoutNode();
        } else {
            layoutNode = null;
        }
        if (!Intrinsics.areEqual(layoutNode, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner != null && (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) != null) {
            alignmentLines.onAlignmentsChanged();
        }
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.f30344g;
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.f30343f;
    }

    @Override // androidx.compose.p003ui.layout.MeasureScope
    public /* synthetic */ MeasureResult layout(int i, int i2, Map map, Function1 function1) {
        return MeasureScope.CC.m59548a(this, i, i2, map, function1);
    }

    public abstract void replace$ui_release();

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

    public final void setPlacingForAlignment$ui_release(boolean z) {
        this.f30344g = z;
    }

    public final void setShallowPlacing$ui_release(boolean z) {
        this.f30343f = z;
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
