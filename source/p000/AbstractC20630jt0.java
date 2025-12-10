package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.modifier.EmptyMap;
import androidx.compose.p003ui.modifier.ModifierLocal;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC20630jt0 {
    /* renamed from: a */
    public static Object m29033a(ModifierLocalModifierNode modifierLocalModifierNode, ModifierLocal modifierLocal) {
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
        if (modifierLocalModifierNode.getNode().isAttached()) {
            int m72961constructorimpl = NodeKind.m72961constructorimpl(32);
            if (modifierLocalModifierNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release = modifierLocalModifierNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(modifierLocalModifierNode);
                while (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                Modifier.Node node = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof ModifierLocalModifierNode) {
                                        ModifierLocalModifierNode modifierLocalModifierNode2 = (ModifierLocalModifierNode) node;
                                        if (modifierLocalModifierNode2.getProvidedValues().contains$ui_release(modifierLocal)) {
                                            return modifierLocalModifierNode2.getProvidedValues().get$ui_release(modifierLocal);
                                        }
                                    } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                        int i = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                i++;
                                                if (i == 1) {
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
                                        if (i == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.m59509b(mutableVector);
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
                }
                return modifierLocal.getDefaultFactory$ui_release().invoke();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: b */
    public static ModifierLocalMap m29032b(ModifierLocalModifierNode modifierLocalModifierNode) {
        return EmptyMap.INSTANCE;
    }

    /* renamed from: c */
    public static void m29031c(ModifierLocalModifierNode modifierLocalModifierNode, ModifierLocal key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (modifierLocalModifierNode.getProvidedValues() != EmptyMap.INSTANCE) {
            if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(key)) {
                modifierLocalModifierNode.getProvidedValues().set$ui_release(key, obj);
                return;
            }
            throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.").toString());
        }
        throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
    }
}
