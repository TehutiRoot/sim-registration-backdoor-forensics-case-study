package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28850d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.layout.LayoutCoordinatesKt */
/* loaded from: classes2.dex */
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Rect m31265c;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || (m31265c = AbstractC19909fi0.m31265c(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) {
            return new Rect(0.0f, 0.0f, IntSize.m73818getWidthimpl(layoutCoordinates.mo72816getSizeYbymL2g()), IntSize.m73817getHeightimpl(layoutCoordinates.mo72816getSizeYbymL2g()));
        }
        return m31265c;
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return AbstractC19909fi0.m31265c(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float m73818getWidthimpl = IntSize.m73818getWidthimpl(findRootCoordinates.mo72816getSizeYbymL2g());
        float m73817getHeightimpl = IntSize.m73817getHeightimpl(findRootCoordinates.mo72816getSizeYbymL2g());
        float coerceIn = AbstractC11719c.coerceIn(boundsInRoot.getLeft(), 0.0f, m73818getWidthimpl);
        float coerceIn2 = AbstractC11719c.coerceIn(boundsInRoot.getTop(), 0.0f, m73817getHeightimpl);
        float coerceIn3 = AbstractC11719c.coerceIn(boundsInRoot.getRight(), 0.0f, m73818getWidthimpl);
        float coerceIn4 = AbstractC11719c.coerceIn(boundsInRoot.getBottom(), 0.0f, m73817getHeightimpl);
        if (coerceIn == coerceIn3 || coerceIn2 == coerceIn4) {
            return Rect.Companion.getZero();
        }
        long mo72819localToWindowMKHz9U = findRootCoordinates.mo72819localToWindowMKHz9U(OffsetKt.Offset(coerceIn, coerceIn2));
        long mo72819localToWindowMKHz9U2 = findRootCoordinates.mo72819localToWindowMKHz9U(OffsetKt.Offset(coerceIn3, coerceIn2));
        long mo72819localToWindowMKHz9U3 = findRootCoordinates.mo72819localToWindowMKHz9U(OffsetKt.Offset(coerceIn3, coerceIn4));
        long mo72819localToWindowMKHz9U4 = findRootCoordinates.mo72819localToWindowMKHz9U(OffsetKt.Offset(coerceIn, coerceIn4));
        return new Rect(AbstractC16931vu.minOf(Offset.m71502getXimpl(mo72819localToWindowMKHz9U), Offset.m71502getXimpl(mo72819localToWindowMKHz9U2), Offset.m71502getXimpl(mo72819localToWindowMKHz9U4), Offset.m71502getXimpl(mo72819localToWindowMKHz9U3)), AbstractC16931vu.minOf(Offset.m71503getYimpl(mo72819localToWindowMKHz9U), Offset.m71503getYimpl(mo72819localToWindowMKHz9U2), Offset.m71503getYimpl(mo72819localToWindowMKHz9U4), Offset.m71503getYimpl(mo72819localToWindowMKHz9U3)), AbstractC16931vu.maxOf(Offset.m71502getXimpl(mo72819localToWindowMKHz9U), Offset.m71502getXimpl(mo72819localToWindowMKHz9U2), Offset.m71502getXimpl(mo72819localToWindowMKHz9U4), Offset.m71502getXimpl(mo72819localToWindowMKHz9U3)), AbstractC16931vu.maxOf(Offset.m71503getYimpl(mo72819localToWindowMKHz9U), Offset.m71503getYimpl(mo72819localToWindowMKHz9U2), Offset.m71503getYimpl(mo72819localToWindowMKHz9U4), Offset.m71503getYimpl(mo72819localToWindowMKHz9U3)));
    }

    @NotNull
    public static final LayoutCoordinates findRootCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        NodeCoordinator nodeCoordinator;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        if (layoutCoordinates2 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) layoutCoordinates2;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui_release;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
            } else {
                return nodeCoordinator3;
            }
        }
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            return parentLayoutCoordinates.mo72817localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m71518getZeroF1C5BW0());
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo72818localToRootMKHz9U(Offset.Companion.m71518getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo72819localToWindowMKHz9U(Offset.Companion.m71518getZeroF1C5BW0());
    }
}
