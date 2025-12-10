package p000;

import androidx.compose.p003ui.focus.FocusTargetNode;
import androidx.compose.p003ui.focus.FocusTraversalKt;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W30 */
/* loaded from: classes2.dex */
public final class W30 implements Comparator {

    /* renamed from: a */
    public static final W30 f7175a = new W30();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        LayoutNode layoutNode;
        if (focusTargetNode != null) {
            if (focusTargetNode2 != null) {
                int i = 0;
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode) && FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                    NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
                    LayoutNode layoutNode2 = null;
                    if (coordinator$ui_release != null) {
                        layoutNode = coordinator$ui_release.getLayoutNode();
                    } else {
                        layoutNode = null;
                    }
                    if (layoutNode != null) {
                        NodeCoordinator coordinator$ui_release2 = focusTargetNode2.getCoordinator$ui_release();
                        if (coordinator$ui_release2 != null) {
                            layoutNode2 = coordinator$ui_release2.getLayoutNode();
                        }
                        if (layoutNode2 != null) {
                            if (Intrinsics.areEqual(layoutNode, layoutNode2)) {
                                return 0;
                            }
                            MutableVector m65820b = m65820b(layoutNode);
                            MutableVector m65820b2 = m65820b(layoutNode2);
                            int min = Math.min(m65820b.getSize() - 1, m65820b2.getSize() - 1);
                            if (min >= 0) {
                                while (Intrinsics.areEqual(m65820b.getContent()[i], m65820b2.getContent()[i])) {
                                    if (i != min) {
                                        i++;
                                    }
                                }
                                return Intrinsics.compare(((LayoutNode) m65820b.getContent()[i]).getPlaceOrder$ui_release(), ((LayoutNode) m65820b2.getContent()[i]).getPlaceOrder$ui_release());
                            }
                            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode)) {
                    return -1;
                } else {
                    if (!FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                        return 0;
                    }
                    return 1;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: b */
    public final MutableVector m65820b(LayoutNode layoutNode) {
        MutableVector mutableVector = new MutableVector(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }
}