package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.PointerInputModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070'8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0-8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/Modifier$Node;", "modifierNode", "<init>", "(Landroidx/compose/ui/Modifier$Node;)V", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "dispatchMainEventPass", "(Ljava/util/Map;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "buildCache", "", "dispatchCancel", "()V", "markIsIn", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "oldEvent", "newEvent", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEvent;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/Modifier$Node;", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/runtime/collection/MutableVector;", OperatorName.CURVE_TO, "Landroidx/compose/runtime/collection/MutableVector;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "pointerIds", "", "d", "Ljava/util/Map;", "relevantChanges", "e", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", OperatorName.NON_STROKING_GRAY, "Z", "wasIn", OperatorName.CLOSE_PATH, "isIn", "i", "hasExited", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,557:1\n503#1,5:561\n510#1:665\n503#1,5:666\n510#1:726\n1182#2:558\n1161#2,2:559\n1182#2:587\n1161#2,2:588\n1182#2:642\n1161#2,2:643\n1182#2:692\n1161#2,2:693\n1182#2:748\n1161#2,2:749\n1182#2:822\n1161#2,2:823\n78#3:566\n78#3:621\n78#3:671\n78#3:727\n78#3:801\n383#4,6:567\n393#4,2:574\n395#4,8:579\n403#4,9:590\n412#4,8:602\n383#4,6:622\n393#4,2:629\n395#4,8:634\n403#4,9:645\n412#4,8:657\n383#4,6:672\n393#4,2:679\n395#4,8:684\n403#4,9:695\n412#4,8:707\n383#4,6:728\n393#4,2:735\n395#4,8:740\n403#4,9:751\n412#4,8:763\n383#4,6:802\n393#4,2:809\n395#4,8:814\n403#4,9:825\n412#4,8:837\n261#5:573\n261#5:628\n261#5:678\n261#5:734\n261#5:808\n234#6,3:576\n237#6,3:599\n234#6,3:631\n237#6,3:654\n234#6,3:681\n237#6,3:704\n234#6,3:737\n237#6,3:760\n234#6,3:811\n237#6,3:834\n460#7,11:610\n460#7,11:715\n48#7:771\n523#7:772\n48#7:779\n523#7:780\n460#7,11:790\n33#8,6:773\n116#8,2:781\n33#8,6:783\n118#8:789\n33#8,6:845\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:561,5\n292#1:665\n330#1:666,5\n330#1:726\n263#1:558\n263#1:559,2\n296#1:587\n296#1:588,2\n316#1:642\n316#1:643,2\n334#1:692\n334#1:693,2\n373#1:748\n373#1:749,2\n522#1:822\n522#1:823,2\n296#1:566\n316#1:621\n334#1:671\n373#1:727\n522#1:801\n296#1:567,6\n296#1:574,2\n296#1:579,8\n296#1:590,9\n296#1:602,8\n316#1:622,6\n316#1:629,2\n316#1:634,8\n316#1:645,9\n316#1:657,8\n334#1:672,6\n334#1:679,2\n334#1:684,8\n334#1:695,9\n334#1:707,8\n373#1:728,6\n373#1:735,2\n373#1:740,8\n373#1:751,9\n373#1:763,8\n522#1:802,6\n522#1:809,2\n522#1:814,8\n522#1:825,9\n522#1:837,8\n296#1:573\n316#1:628\n334#1:678\n373#1:734\n522#1:808\n296#1:576,3\n296#1:599,3\n316#1:631,3\n316#1:654,3\n334#1:681,3\n334#1:704,3\n373#1:737,3\n373#1:760,3\n522#1:811,3\n522#1:834,3\n302#1:610,11\n340#1:715,11\n383#1:771\n384#1:772\n424#1:779\n425#1:780\n521#1:790,11\n394#1:773,6\n432#1:781,2\n432#1:783,6\n432#1:789\n538#1:845,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.Node */
/* loaded from: classes2.dex */
public final class Node extends NodeParent {

    /* renamed from: b */
    public final Modifier.Node f29914b;

    /* renamed from: c */
    public final MutableVector f29915c;

    /* renamed from: d */
    public final Map f29916d;

    /* renamed from: e */
    public LayoutCoordinates f29917e;

    /* renamed from: f */
    public PointerEvent f29918f;

    /* renamed from: g */
    public boolean f29919g;

    /* renamed from: h */
    public boolean f29920h;

    /* renamed from: i */
    public boolean f29921i;

    public Node(@NotNull Modifier.Node modifierNode) {
        Intrinsics.checkNotNullParameter(modifierNode, "modifierNode");
        this.f29914b = modifierNode;
        this.f29915c = new MutableVector(new PointerId[16], 0);
        this.f29916d = new LinkedHashMap();
        this.f29920h = true;
        this.f29921i = true;
    }

    /* renamed from: a */
    public final void m59620a() {
        this.f29916d.clear();
        this.f29917e = null;
    }

    /* renamed from: b */
    public final boolean m59619b(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m71499equalsimpl0(pointerEvent.getChanges().get(i).m72714getPositionF1C5BW0(), pointerEvent2.getChanges().get(i).m72714getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01f4  */
    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean buildCache(@org.jetbrains.annotations.NotNull java.util.Map<androidx.compose.p003ui.input.pointer.PointerId, androidx.compose.p003ui.input.pointer.PointerInputChange> r34, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.layout.LayoutCoordinates r35, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.input.pointer.InternalPointerEvent r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.input.pointer.Node.buildCache(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.f29918f;
        if (pointerEvent == null) {
            return;
        }
        this.f29919g = this.f29920h;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPressed() && (!internalPointerEvent.m72648issuesEnterExitEvent0FcD4WY(pointerInputChange.m72713getIdJ3iCeTQ()) || !this.f29920h)) {
                this.f29915c.remove(PointerId.m72694boximpl(pointerInputChange.m72713getIdJ3iCeTQ()));
            }
        }
        this.f29920h = false;
        this.f29921i = PointerEventType.m72664equalsimpl0(pointerEvent.m72658getType7fucELk(), PointerEventType.Companion.m72669getExit7fucELk());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchCancel() {
        /*
            r10 = this;
            androidx.compose.runtime.collection.MutableVector r0 = r10.getChildren()
            int r1 = r0.getSize()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L1b
            java.lang.Object[] r0 = r0.getContent()
            r4 = 0
        L11:
            r5 = r0[r4]
            androidx.compose.ui.input.pointer.Node r5 = (androidx.compose.p003ui.input.pointer.Node) r5
            r5.dispatchCancel()
            int r4 = r4 + r3
            if (r4 < r1) goto L11
        L1b:
            androidx.compose.ui.Modifier$Node r0 = r10.f29914b
            r1 = 16
            int r4 = androidx.compose.p003ui.node.NodeKind.m72961constructorimpl(r1)
            r5 = 0
            r6 = r5
        L25:
            if (r0 == 0) goto L72
            boolean r7 = r0 instanceof androidx.compose.p003ui.node.PointerInputModifierNode
            if (r7 == 0) goto L31
            androidx.compose.ui.node.PointerInputModifierNode r0 = (androidx.compose.p003ui.node.PointerInputModifierNode) r0
            r0.onCancelPointerInput()
            goto L6d
        L31:
            int r7 = r0.getKindSet$ui_release()
            r7 = r7 & r4
            if (r7 == 0) goto L6d
            boolean r7 = r0 instanceof androidx.compose.p003ui.node.DelegatingNode
            if (r7 == 0) goto L6d
            r7 = r0
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.p003ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = 0
        L44:
            if (r7 == 0) goto L6a
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r4
            if (r9 == 0) goto L65
            int r8 = r8 + 1
            if (r8 != r3) goto L53
            r0 = r7
            goto L65
        L53:
            if (r6 != 0) goto L5c
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.p003ui.Modifier.Node[r1]
            r6.<init>(r9, r2)
        L5c:
            if (r0 == 0) goto L62
            r6.add(r0)
            r0 = r5
        L62:
            r6.add(r7)
        L65:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L44
        L6a:
            if (r8 != r3) goto L6d
            goto L25
        L6d:
            androidx.compose.ui.Modifier$Node r0 = androidx.compose.p003ui.node.DelegatableNodeKt.access$pop(r6)
            goto L25
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.input.pointer.Node.dispatchCancel():void");
    }

    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@NotNull InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.f29916d.isEmpty() && this.f29914b.isAttached()) {
            PointerEvent pointerEvent = this.f29918f;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.f29917e;
            Intrinsics.checkNotNull(layoutCoordinates);
            long mo72816getSizeYbymL2g = layoutCoordinates.mo72816getSizeYbymL2g();
            Modifier.Node node = this.f29914b;
            int m72961constructorimpl = NodeKind.m72961constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != null) {
                if (node instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) node).mo69310onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, mo72816getSizeYbymL2g);
                } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    int i2 = 0;
                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                            i2++;
                            if (i2 == 1) {
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
                    if (i2 == 1) {
                    }
                }
                node = DelegatableNodeKt.m59509b(mutableVector);
            }
            if (this.f29914b.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i].dispatchFinalEventPass(internalPointerEvent);
                    i++;
                } while (i < size);
                z = true;
            } else {
                z = true;
            }
        }
        cleanUpHits(internalPointerEvent);
        m59620a();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchMainEventPass(@org.jetbrains.annotations.NotNull java.util.Map<androidx.compose.p003ui.input.pointer.PointerId, androidx.compose.p003ui.input.pointer.PointerInputChange> r12, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.layout.LayoutCoordinates r13, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.input.pointer.InternalPointerEvent r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.input.pointer.Node.dispatchMainEventPass(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @NotNull
    public final Modifier.Node getModifierNode() {
        return this.f29914b;
    }

    @NotNull
    public final MutableVector<PointerId> getPointerIds() {
        return this.f29915c;
    }

    public final void markIsIn() {
        this.f29920h = true;
    }

    @NotNull
    public String toString() {
        return "Node(pointerInputFilter=" + this.f29914b + ", children=" + getChildren() + ", pointerIds=" + this.f29915c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
