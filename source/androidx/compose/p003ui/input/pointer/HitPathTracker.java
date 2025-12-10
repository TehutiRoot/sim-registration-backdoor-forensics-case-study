package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m28850d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "Landroidx/compose/ui/Modifier$Node;", "pointerInputNodes", "", "addHitPath-KNwqfcY", "(JLjava/util/List;)V", "addHitPath", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "dispatchChanges", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "processCancel", "()V", "removeDetachedPointerInputFilters", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/input/pointer/NodeParent;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "root", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,557:1\n366#2,12:558\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n61#1:558,12\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.HitPathTracker */
/* loaded from: classes2.dex */
public final class HitPathTracker {

    /* renamed from: a */
    public final LayoutCoordinates f29903a;

    /* renamed from: b */
    public final NodeParent f29904b;

    public HitPathTracker(@NotNull LayoutCoordinates rootCoordinates) {
        Intrinsics.checkNotNullParameter(rootCoordinates, "rootCoordinates");
        this.f29903a = rootCoordinates;
        this.f29904b = new NodeParent();
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z);
    }

    /* renamed from: addHitPath-KNwqfcY  reason: not valid java name */
    public final void m72647addHitPathKNwqfcY(long j, @NotNull List<? extends Modifier.Node> pointerInputNodes) {
        Node node;
        Intrinsics.checkNotNullParameter(pointerInputNodes, "pointerInputNodes");
        NodeParent nodeParent = this.f29904b;
        int size = pointerInputNodes.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            Modifier.Node node2 = pointerInputNodes.get(i);
            if (z) {
                MutableVector<Node> children = nodeParent.getChildren();
                int size2 = children.getSize();
                if (size2 > 0) {
                    Node[] content = children.getContent();
                    int i2 = 0;
                    do {
                        node = content[i2];
                        if (Intrinsics.areEqual(node.getModifierNode(), node2)) {
                            break;
                        }
                        i2++;
                    } while (i2 < size2);
                    node = null;
                } else {
                    node = null;
                }
                Node node3 = node;
                if (node3 != null) {
                    node3.markIsIn();
                    if (!node3.getPointerIds().contains(PointerId.m72694boximpl(j))) {
                        node3.getPointerIds().add(PointerId.m72694boximpl(j));
                    }
                    nodeParent = node3;
                } else {
                    z = false;
                }
            }
            Node node4 = new Node(node2);
            node4.getPointerIds().add(PointerId.m72694boximpl(j));
            nodeParent.getChildren().add(node4);
            nodeParent = node4;
        }
    }

    public final boolean dispatchChanges(@NotNull InternalPointerEvent internalPointerEvent, boolean z) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        if (!this.f29904b.buildCache(internalPointerEvent.getChanges(), this.f29903a, internalPointerEvent, z)) {
            return false;
        }
        boolean dispatchMainEventPass = this.f29904b.dispatchMainEventPass(internalPointerEvent.getChanges(), this.f29903a, internalPointerEvent, z);
        if (!this.f29904b.dispatchFinalEventPass(internalPointerEvent) && !dispatchMainEventPass) {
            return false;
        }
        return true;
    }

    @NotNull
    public final NodeParent getRoot$ui_release() {
        return this.f29904b;
    }

    public final void processCancel() {
        this.f29904b.dispatchCancel();
        this.f29904b.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.f29904b.removeDetachedPointerInputFilters();
    }
}
