package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifier;
import androidx.compose.p003ui.focus.FocusEventModifier;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusEventModifierNodeKt;
import androidx.compose.p003ui.focus.FocusOrderModifier;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.p003ui.focus.FocusTargetNode;
import androidx.compose.p003ui.focus.FocusTargetNodeKt;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p003ui.input.pointer.PointerInputModifier;
import androidx.compose.p003ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p003ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p003ui.layout.OnPlacedModifier;
import androidx.compose.p003ui.layout.OnRemeasuredModifier;
import androidx.compose.p003ui.layout.ParentDataModifier;
import androidx.compose.p003ui.modifier.ModifierLocalConsumer;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.modifier.ModifierLocalProvider;
import androidx.compose.p003ui.semantics.SemanticsModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u001a&\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\u0007*\u00020\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\r\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a'\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u0013\u0010\u001e\u001a\u00020\u0012*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u0007*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!\u001a\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\"\u0010\u0011\"\u001f\u0010%\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00018@X\u0080\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, m28850d2 = {"", "Landroidx/compose/ui/node/NodeKind;", "other", "or-64DMado", "(II)I", "or", "value", "", "contains-64DMado", "(II)Z", "contains", "Landroidx/compose/ui/Modifier$Element;", "element", "calculateNodeKindSetFrom", "(Landroidx/compose/ui/Modifier$Element;)I", "Landroidx/compose/ui/Modifier$Node;", "node", "(Landroidx/compose/ui/Modifier$Node;)I", "", "autoInvalidateRemovedNode", "(Landroidx/compose/ui/Modifier$Node;)V", "autoInvalidateInsertedNode", "autoInvalidateUpdatedNode", "remainingSet", TypedValues.CycleType.S_WAVE_PHASE, "autoInvalidateNodeIncludingDelegates", "(Landroidx/compose/ui/Modifier$Node;II)V", "selfKindSet", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", OperatorName.CURVE_TO, "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)Z", "calculateNodeKindSetFromIncludingDelegates", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "includeSelfInTraversal", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,336:1\n52#1:340\n52#1:342\n52#1:344\n52#1:346\n52#1:348\n52#1:350\n52#1:352\n52#1:354\n52#1:356\n52#1:358\n52#1:361\n52#1:363\n52#1:365\n52#1:367\n52#1:369\n52#1:371\n52#1:373\n52#1:375\n52#1:377\n52#1:379\n52#1:381\n52#1:383\n52#1:385\n52#1:387\n52#1:389\n52#1:391\n55#1:399\n55#1:402\n55#1:404\n55#1:406\n55#1:408\n55#1:410\n55#1:412\n55#1:414\n84#2:337\n70#2:338\n72#2:339\n74#2:341\n76#2:343\n78#2:345\n80#2:347\n94#2:349\n92#2:351\n86#2:353\n82#2:355\n84#2:357\n70#2:359\n72#2:360\n74#2:362\n76#2:364\n78#2:366\n80#2:368\n82#2:370\n84#2:372\n86#2:374\n88#2:376\n90#2:378\n92#2:380\n94#2:382\n96#2:384\n98#2:386\n101#2:388\n104#2:390\n72#2:398\n72#2:400\n86#2:401\n74#2:403\n76#2:405\n82#2:407\n90#2:409\n92#2:411\n94#2:413\n90#2:415\n234#3,6:392\n234#3,3:449\n237#3,3:469\n234#3,6:486\n276#4:416\n133#4:417\n134#4:419\n135#4,7:423\n142#4,9:431\n383#4,6:440\n393#4,2:447\n395#4,17:452\n412#4,8:472\n151#4,6:480\n1#5:418\n1182#6:420\n1161#6,2:421\n48#7:430\n261#8:446\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n111#1:340\n114#1:342\n117#1:344\n120#1:346\n126#1:348\n130#1:350\n134#1:352\n137#1:354\n140#1:356\n146#1:358\n159#1:361\n162#1:363\n165#1:365\n168#1:367\n171#1:369\n174#1:371\n177#1:373\n180#1:375\n183#1:377\n186#1:379\n189#1:381\n192#1:383\n195#1:385\n198#1:387\n201#1:389\n204#1:391\n252#1:399\n259#1:402\n262#1:404\n265#1:406\n268#1:408\n271#1:410\n280#1:412\n289#1:414\n62#1:337\n109#1:338\n111#1:339\n114#1:341\n117#1:343\n120#1:345\n126#1:347\n130#1:349\n134#1:351\n137#1:353\n140#1:355\n146#1:357\n157#1:359\n159#1:360\n162#1:362\n165#1:364\n168#1:366\n171#1:368\n174#1:370\n177#1:372\n180#1:374\n183#1:376\n186#1:378\n189#1:380\n192#1:382\n195#1:384\n198#1:386\n201#1:388\n204#1:390\n252#1:398\n255#1:400\n259#1:401\n262#1:403\n265#1:405\n268#1:407\n271#1:409\n280#1:411\n289#1:413\n295#1:415\n239#1:392,6\n295#1:449,3\n295#1:469,3\n329#1:486,6\n295#1:416\n295#1:417\n295#1:419\n295#1:423,7\n295#1:431,9\n295#1:440,6\n295#1:447,2\n295#1:452,17\n295#1:472,8\n295#1:480,6\n295#1:418\n295#1:420\n295#1:421,2\n295#1:430\n295#1:446\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeKindKt */
/* loaded from: classes2.dex */
public final class NodeKindKt {
    /* renamed from: a */
    public static final void m59393a(Modifier.Node node, int i, int i2) {
        if (i2 == 0 && !node.getShouldAutoInvalidate()) {
            return;
        }
        if ((NodeKind.m72961constructorimpl(2) & i) != 0 && (node instanceof LayoutModifierNode)) {
            LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
            if (i2 == 2) {
                DelegatableNodeKt.m72894requireCoordinator64DMado(node, NodeKind.m72961constructorimpl(2)).onRelease();
            }
        }
        if ((NodeKind.m72961constructorimpl(256) & i) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
            DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
        }
        if ((NodeKind.m72961constructorimpl(4) & i) != 0 && (node instanceof DrawModifierNode)) {
            DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
        }
        if ((NodeKind.m72961constructorimpl(8) & i) != 0 && (node instanceof SemanticsModifierNode)) {
            SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
        }
        if ((NodeKind.m72961constructorimpl(64) & i) != 0 && (node instanceof ParentDataModifierNode)) {
            ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
        }
        if ((NodeKind.m72961constructorimpl(1024) & i) != 0 && (node instanceof FocusTargetNode)) {
            if (i2 == 2) {
                node.onReset();
            } else {
                DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetNode) node);
            }
        }
        if ((NodeKind.m72961constructorimpl(2048) & i) != 0 && (node instanceof FocusPropertiesModifierNode)) {
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
            if (m59391c(focusPropertiesModifierNode)) {
                if (i2 == 2) {
                    m59392b(focusPropertiesModifierNode);
                } else {
                    FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                }
            }
        }
        if ((i & NodeKind.m72961constructorimpl(4096)) != 0 && (node instanceof FocusEventModifierNode)) {
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateInsertedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void autoInvalidateNodeIncludingDelegates(@NotNull Modifier.Node node, int i, int i2) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            m59393a(node, delegatingNode.getSelfKindSet$ui_release() & i, i2);
            int i3 = (~delegatingNode.getSelfKindSet$ui_release()) & i;
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                autoInvalidateNodeIncludingDelegates(delegate$ui_release, i3, i2);
            }
            return;
        }
        m59393a(node, i & node.getKindSet$ui_release(), i2);
    }

    public static final void autoInvalidateRemovedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void autoInvalidateUpdatedNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 0);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public static final void m59392b(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
        if (focusPropertiesModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.m59510a(mutableVector, focusPropertiesModifierNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                    DelegatableNodeKt.m59510a(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                            MutableVector mutableVector2 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector2.add(node);
                                                    node = null;
                                                }
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.m59509b(mutableVector2);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: c */
    public static final boolean m59391c(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        C13110pl c13110pl = C13110pl.f76681a;
        c13110pl.m23616b();
        focusPropertiesModifierNode.applyFocusProperties(c13110pl);
        return c13110pl.m23617a();
    }

    public static final int calculateNodeKindSetFrom(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.getKindSet$ui_release() != 0) {
            return node.getKindSet$ui_release();
        }
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(32768);
        }
        return node instanceof SoftKeyboardInterceptionModifierNode ? m72961constructorimpl | NodeKind.m72961constructorimpl(131072) : m72961constructorimpl;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet$ui_release();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
            }
            return selfKindSet$ui_release;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* renamed from: contains-64DMado  reason: not valid java name */
    public static final boolean m72969contains64DMado(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI  reason: not valid java name */
    public static final boolean m72970getIncludeSelfInTraversalH91voCI(int i) {
        if ((i & NodeKind.m72961constructorimpl(128)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: or-64DMado  reason: not valid java name */
    public static final int m72971or64DMado(int i, int i2) {
        return i | i2;
    }

    public static final int calculateNodeKindSetFrom(@NotNull Modifier.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1);
        if (element instanceof LayoutModifier) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            m72961constructorimpl |= NodeKind.m72961constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) ? m72961constructorimpl | NodeKind.m72961constructorimpl(128) : m72961constructorimpl;
    }
}
