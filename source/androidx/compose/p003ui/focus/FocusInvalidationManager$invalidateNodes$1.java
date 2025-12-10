package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,140:1\n1855#2:141\n1856#2:252\n1855#2:253\n1856#2:364\n1855#2,2:365\n90#3:142\n90#3:254\n282#4:143\n383#4,6:144\n393#4,2:151\n395#4,8:156\n403#4,9:167\n412#4,8:179\n283#4:187\n133#4:188\n134#4,8:190\n142#4,9:199\n383#4,37:208\n151#4,6:245\n284#4:251\n282#4:255\n383#4,6:256\n393#4,2:263\n395#4,8:268\n403#4,9:279\n412#4,8:291\n283#4:299\n133#4:300\n134#4,8:302\n142#4,9:311\n383#4,37:320\n151#4,6:357\n284#4:363\n261#5:150\n261#5:262\n234#6,3:153\n237#6,3:176\n234#6,3:265\n237#6,3:288\n1182#7:164\n1161#7,2:165\n1182#7:276\n1161#7,2:277\n1#8:189\n1#8:301\n1#8:367\n48#9:198\n48#9:310\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n*L\n59#1:141\n59#1:252\n72#1:253\n72#1:364\n120#1:365,2\n64#1:142\n86#1:254\n64#1:143\n64#1:144,6\n64#1:151,2\n64#1:156,8\n64#1:167,9\n64#1:179,8\n64#1:187\n64#1:188\n64#1:190,8\n64#1:199,9\n64#1:208,37\n64#1:245,6\n64#1:251\n86#1:255\n86#1:256,6\n86#1:263,2\n86#1:268,8\n86#1:279,9\n86#1:291,8\n86#1:299\n86#1:300\n86#1:302,8\n86#1:311,9\n86#1:320,37\n86#1:357,6\n86#1:363\n64#1:150\n86#1:262\n64#1:153,3\n64#1:176,3\n86#1:265,3\n86#1:288,3\n64#1:164\n64#1:165,2\n86#1:276\n86#1:277,2\n64#1:189\n86#1:301\n64#1:198\n86#1:310\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1 */
/* loaded from: classes2.dex */
public final class FocusInvalidationManager$invalidateNodes$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FocusInvalidationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInvalidationManager$invalidateNodes$1(FocusInvalidationManager focusInvalidationManager) {
        super(0);
        this.this$0 = focusInvalidationManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Set set;
        Set set2;
        Set<FocusEventModifierNode> set3;
        Set set4;
        Set<FocusTargetNode> set5;
        Set set6;
        Set set7;
        Set set8;
        Set set9;
        FocusState focusState;
        Set set10;
        Set set11;
        Set set12;
        Set set13;
        set = this.this$0.f28914d;
        FocusInvalidationManager focusInvalidationManager = this.this$0;
        Iterator it = set.iterator();
        while (true) {
            int i = 1024;
            int i2 = 16;
            int i3 = 0;
            int i4 = 1;
            if (!it.hasNext()) {
                set2 = this.this$0.f28914d;
                set2.clear();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                set3 = this.this$0.f28913c;
                FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                for (FocusEventModifierNode focusEventModifierNode : set3) {
                    if (!focusEventModifierNode.getNode().isAttached()) {
                        focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                    } else {
                        int m72961constructorimpl = NodeKind.m72961constructorimpl(i);
                        Modifier.Node node = focusEventModifierNode.getNode();
                        FocusTargetNode focusTargetNode = null;
                        MutableVector mutableVector = null;
                        boolean z = true;
                        boolean z2 = false;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode != null) {
                                    z2 = true;
                                }
                                set11 = focusInvalidationManager2.f28912b;
                                if (set11.contains(focusTargetNode2)) {
                                    linkedHashSet.add(focusTargetNode2);
                                    z = false;
                                }
                                focusTargetNode = focusTargetNode2;
                            } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                                int i5 = 0;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                        i5++;
                                        if (i5 == i4) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[i2], i3);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    i4 = 1;
                                }
                                if (i5 == 1) {
                                    i4 = 1;
                                }
                            }
                            node = DelegatableNodeKt.m59509b(mutableVector);
                            i4 = 1;
                        }
                        if (focusEventModifierNode.getNode().isAttached()) {
                            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[i2], i3);
                            Modifier.Node child$ui_release = focusEventModifierNode.getNode().getChild$ui_release();
                            if (child$ui_release == null) {
                                DelegatableNodeKt.m59510a(mutableVector2, focusEventModifierNode.getNode());
                            } else {
                                mutableVector2.add(child$ui_release);
                            }
                            while (mutableVector2.isNotEmpty()) {
                                Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((node2.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                                    DelegatableNodeKt.m59510a(mutableVector2, node2);
                                } else {
                                    while (node2 != null) {
                                        if ((node2.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                            MutableVector mutableVector3 = null;
                                            while (node2 != null) {
                                                if (node2 instanceof FocusTargetNode) {
                                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                                                    if (focusTargetNode != null) {
                                                        z2 = true;
                                                    }
                                                    set10 = focusInvalidationManager2.f28912b;
                                                    if (set10.contains(focusTargetNode3)) {
                                                        linkedHashSet.add(focusTargetNode3);
                                                        z = false;
                                                    }
                                                    focusTargetNode = focusTargetNode3;
                                                } else if ((node2.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                                    Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release();
                                                    int i6 = 0;
                                                    while (delegate$ui_release2 != null) {
                                                        if ((delegate$ui_release2.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                            i6++;
                                                            if (i6 == 1) {
                                                                node2 = delegate$ui_release2;
                                                            } else {
                                                                if (mutableVector3 == null) {
                                                                    mutableVector3 = new MutableVector(new Modifier.Node[i2], 0);
                                                                }
                                                                if (node2 != null) {
                                                                    mutableVector3.add(node2);
                                                                    node2 = null;
                                                                }
                                                                mutableVector3.add(delegate$ui_release2);
                                                                delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                                                                i2 = 16;
                                                            }
                                                        }
                                                        delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                                                        i2 = 16;
                                                    }
                                                    if (i6 == 1) {
                                                        i2 = 16;
                                                    }
                                                    node2 = DelegatableNodeKt.m59509b(mutableVector3);
                                                    i2 = 16;
                                                }
                                                node2 = DelegatableNodeKt.m59509b(mutableVector3);
                                                i2 = 16;
                                            }
                                        } else {
                                            node2 = node2.getChild$ui_release();
                                            i2 = 16;
                                        }
                                    }
                                }
                                i2 = 16;
                            }
                            if (z) {
                                if (z2) {
                                    focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                } else if (focusTargetNode == null || (focusState = focusTargetNode.getFocusState()) == null) {
                                    focusState = FocusStateImpl.Inactive;
                                }
                                focusEventModifierNode.onFocusEvent(focusState);
                            }
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                    }
                    i = 1024;
                    i2 = 16;
                    i3 = 0;
                    i4 = 1;
                }
                set4 = this.this$0.f28913c;
                set4.clear();
                set5 = this.this$0.f28912b;
                for (FocusTargetNode focusTargetNode4 : set5) {
                    if (focusTargetNode4.isAttached()) {
                        FocusStateImpl focusState2 = focusTargetNode4.getFocusState();
                        focusTargetNode4.invalidateFocus$ui_release();
                        if (focusState2 != focusTargetNode4.getFocusState() || linkedHashSet.contains(focusTargetNode4)) {
                            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                        }
                    }
                }
                set6 = this.this$0.f28912b;
                set6.clear();
                linkedHashSet.clear();
                set7 = this.this$0.f28914d;
                if (set7.isEmpty()) {
                    set8 = this.this$0.f28913c;
                    if (set8.isEmpty()) {
                        set9 = this.this$0.f28912b;
                        if (!set9.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                        }
                        return;
                    }
                    throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                }
                throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) it.next();
            if (focusPropertiesModifierNode.getNode().isAttached()) {
                int m72961constructorimpl2 = NodeKind.m72961constructorimpl(1024);
                Modifier.Node node3 = focusPropertiesModifierNode.getNode();
                MutableVector mutableVector4 = null;
                while (node3 != null) {
                    if (node3 instanceof FocusTargetNode) {
                        set13 = focusInvalidationManager.f28912b;
                        set13.add((FocusTargetNode) node3);
                    } else if ((node3.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        int i7 = 0;
                        for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    node3 = delegate$ui_release3;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != null) {
                                        mutableVector4.add(node3);
                                        node3 = null;
                                    }
                                    mutableVector4.add(delegate$ui_release3);
                                }
                            }
                        }
                        if (i7 == 1) {
                        }
                    }
                    node3 = DelegatableNodeKt.m59509b(mutableVector4);
                }
                if (focusPropertiesModifierNode.getNode().isAttached()) {
                    MutableVector mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node child$ui_release2 = focusPropertiesModifierNode.getNode().getChild$ui_release();
                    if (child$ui_release2 == null) {
                        DelegatableNodeKt.m59510a(mutableVector5, focusPropertiesModifierNode.getNode());
                    } else {
                        mutableVector5.add(child$ui_release2);
                    }
                    while (mutableVector5.isNotEmpty()) {
                        Modifier.Node node4 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                        if ((node4.getAggregateChildKindSet$ui_release() & m72961constructorimpl2) == 0) {
                            DelegatableNodeKt.m59510a(mutableVector5, node4);
                        } else {
                            while (true) {
                                if (node4 == null) {
                                    break;
                                } else if ((node4.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                    MutableVector mutableVector6 = null;
                                    while (node4 != null) {
                                        if (node4 instanceof FocusTargetNode) {
                                            set12 = focusInvalidationManager.f28912b;
                                            set12.add((FocusTargetNode) node4);
                                        } else if ((node4.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                                            int i8 = 0;
                                            for (Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release4 != null; delegate$ui_release4 = delegate$ui_release4.getChild$ui_release()) {
                                                if ((delegate$ui_release4.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        node4 = delegate$ui_release4;
                                                    } else {
                                                        if (mutableVector6 == null) {
                                                            mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node4 != null) {
                                                            mutableVector6.add(node4);
                                                            node4 = null;
                                                        }
                                                        mutableVector6.add(delegate$ui_release4);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        node4 = DelegatableNodeKt.m59509b(mutableVector6);
                                    }
                                } else {
                                    node4 = node4.getChild$ui_release();
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                }
            }
        }
    }
}
