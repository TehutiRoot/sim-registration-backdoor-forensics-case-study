package androidx.compose.p003ui.node;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.HorizontalAlignmentLine;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ!\u0010\u001a\u001a\u00020\u0016*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\"\u00105\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u00109\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\"\u0010=\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u0018\u0010?\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\u001fR \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010&R\u0014\u0010G\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010&R$\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0001\u0002KL\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006M"}, m28850d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "", "recalculateQueryOwner", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getLastCalculation", "()Ljava/util/Map;", "Landroidx/compose/ui/node/NodeCoordinator;", "alignmentLine", "getPositionFor", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/AlignmentLine;)I", "recalculate", "reset$ui_release", "reset", "onAlignmentsChanged", "Landroidx/compose/ui/geometry/Offset;", "position", "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculatePositionInParent", "initialPosition", "initialCoordinator", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/layout/AlignmentLine;ILandroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getDirty$ui_release", "()Z", "setDirty$ui_release", "(Z)V", "dirty", OperatorName.CURVE_TO, "getUsedDuringParentMeasurement$ui_release", "setUsedDuringParentMeasurement$ui_release", "usedDuringParentMeasurement", "d", "getUsedDuringParentLayout$ui_release", "setUsedDuringParentLayout$ui_release", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "setPreviousUsedDuringParentLayout$ui_release", "previousUsedDuringParentLayout", OperatorName.FILL_NON_ZERO, "getUsedByModifierMeasurement$ui_release", "setUsedByModifierMeasurement$ui_release", "usedByModifierMeasurement", OperatorName.NON_STROKING_GRAY, "getUsedByModifierLayout$ui_release", "setUsedByModifierLayout$ui_release", "usedByModifierLayout", OperatorName.CLOSE_PATH, "queryOwner", "", "i", "Ljava/util/Map;", "alignmentLineMap", "getQueried$ui_release", "queried", "getRequired$ui_release", "required", "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LookaheadAlignmentLines;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.AlignmentLines */
/* loaded from: classes2.dex */
public abstract class AlignmentLines {

    /* renamed from: a */
    public final AlignmentLinesOwner f30184a;

    /* renamed from: b */
    public boolean f30185b;

    /* renamed from: c */
    public boolean f30186c;

    /* renamed from: d */
    public boolean f30187d;

    /* renamed from: e */
    public boolean f30188e;

    /* renamed from: f */
    public boolean f30189f;

    /* renamed from: g */
    public boolean f30190g;

    /* renamed from: h */
    public AlignmentLinesOwner f30191h;

    /* renamed from: i */
    public final Map f30192i;

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLinesOwner);
    }

    /* renamed from: a */
    public final void m59516a(AlignmentLine alignmentLine, int i, NodeCoordinator nodeCoordinator) {
        int roundToInt;
        float f = i;
        long Offset = OffsetKt.Offset(f, f);
        while (true) {
            Offset = mo72889calculatePositionInParentR5De75A(nodeCoordinator, Offset);
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator);
            if (Intrinsics.areEqual(nodeCoordinator, this.f30184a.getInnerCoordinator())) {
                break;
            } else if (getAlignmentLinesMap(nodeCoordinator).containsKey(alignmentLine)) {
                float positionFor = getPositionFor(nodeCoordinator, alignmentLine);
                Offset = OffsetKt.Offset(positionFor, positionFor);
            }
        }
        if (alignmentLine instanceof HorizontalAlignmentLine) {
            roundToInt = AbstractC21140mr0.roundToInt(Offset.m71503getYimpl(Offset));
        } else {
            roundToInt = AbstractC21140mr0.roundToInt(Offset.m71502getXimpl(Offset));
        }
        Map map = this.f30192i;
        if (map.containsKey(alignmentLine)) {
            roundToInt = AlignmentLineKt.merge(alignmentLine, ((Number) AbstractC11687a.getValue(this.f30192i, alignmentLine)).intValue(), roundToInt);
        }
        map.put(alignmentLine, Integer.valueOf(roundToInt));
    }

    /* renamed from: calculatePositionInParent-R5De75A  reason: not valid java name */
    public abstract long mo72889calculatePositionInParentR5De75A(@NotNull NodeCoordinator nodeCoordinator, long j);

    @NotNull
    public abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(@NotNull NodeCoordinator nodeCoordinator);

    @NotNull
    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.f30184a;
    }

    public final boolean getDirty$ui_release() {
        return this.f30185b;
    }

    @NotNull
    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.f30192i;
    }

    public abstract int getPositionFor(@NotNull NodeCoordinator nodeCoordinator, @NotNull AlignmentLine alignmentLine);

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.f30188e;
    }

    public final boolean getQueried$ui_release() {
        if (!this.f30186c && !this.f30188e && !this.f30189f && !this.f30190g) {
            return false;
        }
        return true;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner();
        if (this.f30191h != null) {
            return true;
        }
        return false;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.f30190g;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.f30189f;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.f30187d;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.f30186c;
    }

    public final void onAlignmentsChanged() {
        this.f30185b = true;
        AlignmentLinesOwner parentAlignmentLinesOwner = this.f30184a.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null) {
            return;
        }
        if (this.f30186c) {
            parentAlignmentLinesOwner.requestMeasure();
        } else if (this.f30188e || this.f30187d) {
            parentAlignmentLinesOwner.requestLayout();
        }
        if (this.f30189f) {
            this.f30184a.requestMeasure();
        }
        if (this.f30190g) {
            this.f30184a.requestLayout();
        }
        parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
    }

    public final void recalculate() {
        this.f30192i.clear();
        this.f30184a.forEachChildAlignmentLinesOwner(new AlignmentLines$recalculate$1(this));
        this.f30192i.putAll(getAlignmentLinesMap(this.f30184a.getInnerCoordinator()));
        this.f30185b = false;
    }

    public final void recalculateQueryOwner() {
        AlignmentLinesOwner alignmentLinesOwner;
        AlignmentLines alignmentLines;
        AlignmentLines alignmentLines2;
        if (getQueried$ui_release()) {
            alignmentLinesOwner = this.f30184a;
        } else {
            AlignmentLinesOwner parentAlignmentLinesOwner = this.f30184a.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner == null) {
                return;
            }
            alignmentLinesOwner = parentAlignmentLinesOwner.getAlignmentLines().f30191h;
            if (alignmentLinesOwner == null || !alignmentLinesOwner.getAlignmentLines().getQueried$ui_release()) {
                AlignmentLinesOwner alignmentLinesOwner2 = this.f30191h;
                if (alignmentLinesOwner2 != null && !alignmentLinesOwner2.getAlignmentLines().getQueried$ui_release()) {
                    AlignmentLinesOwner parentAlignmentLinesOwner2 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                    if (parentAlignmentLinesOwner2 != null && (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) != null) {
                        alignmentLines2.recalculateQueryOwner();
                    }
                    AlignmentLinesOwner parentAlignmentLinesOwner3 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                    if (parentAlignmentLinesOwner3 != null && (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) != null) {
                        alignmentLinesOwner = alignmentLines.f30191h;
                    } else {
                        alignmentLinesOwner = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.f30191h = alignmentLinesOwner;
    }

    public final void reset$ui_release() {
        this.f30185b = true;
        this.f30186c = false;
        this.f30188e = false;
        this.f30187d = false;
        this.f30189f = false;
        this.f30190g = false;
        this.f30191h = null;
    }

    public final void setDirty$ui_release(boolean z) {
        this.f30185b = z;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z) {
        this.f30188e = z;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z) {
        this.f30190g = z;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z) {
        this.f30189f = z;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z) {
        this.f30187d = z;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z) {
        this.f30186c = z;
    }

    public AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.f30184a = alignmentLinesOwner;
        this.f30185b = true;
        this.f30192i = new HashMap();
    }
}
