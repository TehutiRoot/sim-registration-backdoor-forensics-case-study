package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.layout.BeyondBoundsLayout;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28850d2 = {"searchBeyondBounds", "T", "Landroidx/compose/ui/focus/FocusTargetNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,58:1\n90#2:59\n262#3:60\n230#3,5:61\n58#3:66\n59#3,8:68\n383#3,5:76\n263#3:81\n388#3:82\n393#3,2:84\n395#3,8:89\n403#3,9:100\n412#3,8:112\n68#3,7:120\n265#3:127\n1#4:67\n261#5:83\n234#6,3:86\n237#6,3:109\n1182#7:97\n1161#7,2:98\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:59\n39#1:60\n39#1:61,5\n39#1:66\n39#1:68,8\n39#1:76,5\n39#1:81\n39#1:82\n39#1:84,2\n39#1:89,8\n39#1:100,9\n39#1:112,8\n39#1:120,7\n39#1:127\n39#1:67\n39#1:83\n39#1:86,3\n39#1:109,3\n39#1:97\n39#1:98,2\n*E\n"})
/* renamed from: androidx.compose.ui.focus.BeyondBoundsLayoutKt */
/* loaded from: classes2.dex */
public final class BeyondBoundsLayoutKt {
    @Nullable
    /* renamed from: searchBeyondBounds--OM-vw8  reason: not valid java name */
    public static final <T> T m71428searchBeyondBoundsOMvw8(@NotNull FocusTargetNode searchBeyondBounds, int i, @NotNull Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        FocusTargetNode focusTargetNode;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int m72801getBeforehoxUOeE;
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
        if (searchBeyondBounds.getNode().isAttached()) {
            Modifier.Node parent$ui_release = searchBeyondBounds.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(searchBeyondBounds);
            loop0: while (true) {
                if (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                focusTargetNode = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (focusTargetNode != null) {
                                    if (focusTargetNode instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((focusTargetNode.getKindSet$ui_release() & m72961constructorimpl) != 0 && (focusTargetNode instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) focusTargetNode).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    focusTargetNode = delegate$ui_release;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (focusTargetNode != null) {
                                                        mutableVector.add(focusTargetNode);
                                                        focusTargetNode = null;
                                                    }
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    focusTargetNode = DelegatableNodeKt.m59509b(mutableVector);
                                }
                                continue;
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
                } else {
                    focusTargetNode = null;
                    break;
                }
            }
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            if ((focusTargetNode2 != null && Intrinsics.areEqual(focusTargetNode2.getBeyondBoundsLayoutParent(), searchBeyondBounds.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = searchBeyondBounds.getBeyondBoundsLayoutParent()) == null) {
                return null;
            }
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
                m72801getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m72799getAbovehoxUOeE();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s())) {
                m72801getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m72802getBelowhoxUOeE();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
                m72801getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m72803getLefthoxUOeE();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
                m72801getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m72804getRighthoxUOeE();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71445getNextdhqQ8s())) {
                m72801getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m72800getAfterhoxUOeE();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71447getPreviousdhqQ8s())) {
                m72801getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m72801getBeforehoxUOeE();
            } else {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            return (T) beyondBoundsLayoutParent.mo69639layouto7g1Pn8(m72801getBeforehoxUOeE, block);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
