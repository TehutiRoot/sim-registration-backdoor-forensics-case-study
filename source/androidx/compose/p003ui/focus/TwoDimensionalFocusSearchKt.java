package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.node.DelegatableNode;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a7\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a5\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001e\u001a\u0013\u0010#\u001a\u00020\u0016*\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010%\u001a\u00020\u0016*\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010$\u001a\u0013\u0010&\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m28850d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "twoDimensionalFocusSearch", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "findChildCorrespondingToFocusEnter", "focusedItem", OperatorName.SET_LINE_JOINSTYLE, "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "p", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/runtime/collection/MutableVector;", "accessibleChildren", "", OperatorName.CLOSE_PATH, "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/runtime/collection/MutableVector;)V", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "i", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", OperatorName.NON_STROKING_CMYK, "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "source", "rect1", "rect2", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SAVE, "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", OperatorName.NON_STROKING_GRAY, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,386:1\n1161#2,2:387\n1161#2,2:392\n1182#2:399\n1161#2,2:400\n1182#2:470\n1161#2,2:471\n359#3:389\n523#3:390\n48#3:409\n48#3:480\n460#3,11:536\n1#4:391\n1#4:397\n1#4:468\n90#5:394\n90#5:465\n276#6:395\n133#6:396\n134#6:398\n135#6,7:402\n142#6,9:410\n383#6,6:419\n393#6,2:426\n395#6,17:431\n412#6,8:451\n151#6,6:459\n276#6:466\n133#6:467\n134#6:469\n135#6,7:473\n142#6,9:481\n383#6,6:490\n393#6,2:497\n395#6,17:502\n412#6,8:522\n151#6,6:530\n261#7:425\n261#7:496\n234#8,3:428\n237#8,3:448\n234#8,3:499\n237#8,3:519\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n104#1:387,2\n160#1:392,2\n161#1:399\n161#1:400,2\n190#1:470\n190#1:471,2\n109#1:389\n109#1:390\n161#1:409\n190#1:480\n221#1:536,11\n161#1:397\n190#1:468\n161#1:394\n190#1:465\n161#1:395\n161#1:396\n161#1:398\n161#1:402,7\n161#1:410,9\n161#1:419,6\n161#1:426,2\n161#1:431,17\n161#1:451,8\n161#1:459,6\n190#1:466\n190#1:467\n190#1:469\n190#1:473,7\n190#1:481,9\n190#1:490,6\n190#1:497,2\n190#1:502,17\n190#1:522,8\n190#1:530,6\n161#1:425\n190#1:496\n161#1:428,3\n161#1:448,3\n190#1:499,3\n190#1:519,3\n*E\n"})
/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt */
/* loaded from: classes2.dex */
public final class TwoDimensionalFocusSearchKt {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final FocusTargetNode m59783a(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode != null) {
                return findActiveFocusNode;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public static final boolean m59782b(Rect rect, Rect rect2, Rect rect3, int i) {
        if (m59781c(rect3, i, rect) || !m59781c(rect2, i, rect)) {
            return false;
        }
        if (m59780d(rect3, i, rect)) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (!FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s()) && !FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s()) && m59779e(rect2, i, rect) >= m59778f(rect3, i, rect)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m59781c(Rect rect, int i, Rect rect2) {
        boolean m71432equalsimpl0;
        boolean m71432equalsimpl02;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            m71432equalsimpl0 = true;
        } else {
            m71432equalsimpl0 = FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s());
        }
        if (m71432equalsimpl0) {
            if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
                return true;
            }
        } else {
            if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
                m71432equalsimpl02 = true;
            } else {
                m71432equalsimpl02 = FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s());
            }
            if (m71432equalsimpl02) {
                if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                    return true;
                }
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m59780d(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            if (rect2.getLeft() < rect.getRight()) {
                return false;
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
            if (rect2.getRight() > rect.getLeft()) {
                return false;
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
            if (rect2.getTop() < rect.getBottom()) {
                return false;
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s())) {
            if (rect2.getBottom() > rect.getTop()) {
                return false;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return true;
    }

    /* renamed from: e */
    public static final float m59779e(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    /* renamed from: f */
    public static final float m59778f(Rect rect, int i, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            top = rect2.getLeft();
            top2 = rect.getLeft();
        } else {
            if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s())) {
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = bottom - bottom2;
            return Math.max(1.0f, f);
        }
        f = top - top2;
        return Math.max(1.0f, f);
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8  reason: not valid java name */
    public static final boolean m71466findChildCorrespondingToFocusEnterOMvw8(@NotNull FocusTargetNode findChildCorrespondingToFocusEnter, int i, @NotNull Function1<? super FocusTargetNode, Boolean> onFound) {
        boolean m71432equalsimpl0;
        Rect m59777g;
        Object obj;
        Intrinsics.checkNotNullParameter(findChildCorrespondingToFocusEnter, "$this$findChildCorrespondingToFocusEnter");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        m59776h(findChildCorrespondingToFocusEnter, mutableVector);
        boolean z = true;
        if (mutableVector.getSize() <= 1) {
            if (mutableVector.isEmpty()) {
                obj = null;
            } else {
                obj = mutableVector.getContent()[0];
            }
            FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
            if (focusTargetNode == null) {
                return false;
            }
            return onFound.invoke(focusTargetNode).booleanValue();
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71441getEnterdhqQ8s())) {
            i = companion.m71448getRightdhqQ8s();
        }
        if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
            m71432equalsimpl0 = true;
        } else {
            m71432equalsimpl0 = FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s());
        }
        if (m71432equalsimpl0) {
            m59777g = m59767q(FocusTraversalKt.focusRect(findChildCorrespondingToFocusEnter));
        } else {
            if (!FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
                z = FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s());
            }
            if (z) {
                m59777g = m59777g(FocusTraversalKt.focusRect(findChildCorrespondingToFocusEnter));
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        FocusTargetNode m59775i = m59775i(mutableVector, m59777g, i);
        if (m59775i == null) {
            return false;
        }
        return onFound.invoke(m59775i).booleanValue();
    }

    /* renamed from: g */
    public static final Rect m59777g(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    /* renamed from: h */
    public static final void m59776h(DelegatableNode delegatableNode, MutableVector mutableVector) {
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.m59510a(mutableVector2, delegatableNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                    DelegatableNodeKt.m59510a(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                                    if (focusTargetNode.isAttached()) {
                                        if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                            mutableVector.add(focusTargetNode);
                                        } else {
                                            m59776h(focusTargetNode, mutableVector);
                                        }
                                    }
                                } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector3.add(node);
                                                    node = null;
                                                }
                                                mutableVector3.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.m59509b(mutableVector3);
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

    /* renamed from: i */
    public static final FocusTargetNode m59775i(MutableVector mutableVector, Rect rect, int i) {
        Rect translate;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            translate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
            translate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
            translate = rect.translate(0.0f, rect.getHeight() + 1);
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s())) {
            translate = rect.translate(0.0f, -(rect.getHeight() + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                    Rect focusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                    if (m59773k(focusRect, translate, rect, i)) {
                        focusTargetNode = focusTargetNode2;
                        translate = focusRect;
                    }
                }
                i2++;
            } while (i2 < size);
            return focusTargetNode;
        }
        return focusTargetNode;
    }

    /* renamed from: j */
    public static final boolean m59774j(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1 function1) {
        if (m59768p(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m71428searchBeyondBoundsOMvw8(focusTargetNode, i, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetNode, focusTargetNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m59773k(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!m59772l(rect, i, rect3)) {
            return false;
        }
        if (m59772l(rect2, i, rect3) && !m59782b(rect3, rect, rect2, i) && (m59782b(rect3, rect2, rect, i) || m59769o(i, rect3, rect) >= m59769o(i, rect3, rect2))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final boolean m59772l(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            if ((rect2.getRight() <= rect.getRight() && rect2.getLeft() < rect.getRight()) || rect2.getLeft() <= rect.getLeft()) {
                return false;
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
            if ((rect2.getLeft() >= rect.getLeft() && rect2.getRight() > rect.getLeft()) || rect2.getRight() >= rect.getRight()) {
                return false;
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
            if ((rect2.getBottom() <= rect.getBottom() && rect2.getTop() < rect.getBottom()) || rect2.getTop() <= rect.getTop()) {
                return false;
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s())) {
            if ((rect2.getTop() >= rect.getTop() && rect2.getBottom() > rect.getTop()) || rect2.getBottom() >= rect.getBottom()) {
                return false;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return true;
    }

    /* renamed from: m */
    public static final float m59771m(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    /* renamed from: n */
    public static final float m59770n(Rect rect, int i, Rect rect2) {
        boolean m71432equalsimpl0;
        float f;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.Companion;
        boolean z = true;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            m71432equalsimpl0 = true;
        } else {
            m71432equalsimpl0 = FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s());
        }
        if (m71432equalsimpl0) {
            f = 2;
            left = rect2.getTop() + (rect2.getHeight() / f);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
                z = FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s());
            }
            if (z) {
                f = 2;
                left = rect2.getLeft() + (rect2.getWidth() / f);
                left2 = rect.getLeft();
                width = rect.getWidth();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return left - (left2 + (width / f));
    }

    /* renamed from: o */
    public static final long m59769o(int i, Rect rect, Rect rect2) {
        long abs = Math.abs(m59771m(rect2, i, rect));
        long abs2 = Math.abs(m59770n(rect2, i, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: p */
    public static final boolean m59768p(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1 function1) {
        FocusTargetNode m59775i;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.m59510a(mutableVector2, focusTargetNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                    DelegatableNodeKt.m59510a(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector3.add(node);
                                                    node = null;
                                                }
                                                mutableVector3.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.m59509b(mutableVector3);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            while (mutableVector.isNotEmpty() && (m59775i = m59775i(mutableVector, FocusTraversalKt.focusRect(focusTargetNode2), i)) != null) {
                if (m59775i.fetchFocusProperties$ui_release().getCanFocus()) {
                    return ((Boolean) function1.invoke(m59775i)).booleanValue();
                }
                if (m59774j(m59775i, focusTargetNode2, i, function1)) {
                    return true;
                }
                mutableVector.remove(m59775i);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: q */
    public static final Rect m59767q(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @Nullable
    /* renamed from: twoDimensionalFocusSearch--OM-vw8  reason: not valid java name */
    public static final Boolean m71467twoDimensionalFocusSearchOMvw8(@NotNull FocusTargetNode twoDimensionalFocusSearch, int i, @NotNull Function1<? super FocusTargetNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusStateImpl focusState = twoDimensionalFocusSearch.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusState.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (twoDimensionalFocusSearch.fetchFocusProperties$ui_release().getCanFocus()) {
                        return onFound.invoke(twoDimensionalFocusSearch);
                    }
                    return Boolean.FALSE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(m71466findChildCorrespondingToFocusEnterOMvw8(twoDimensionalFocusSearch, i, onFound));
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(twoDimensionalFocusSearch);
        if (activeChild != null) {
            int i3 = iArr[activeChild.getFocusState().ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                return Boolean.valueOf(m59774j(twoDimensionalFocusSearch, activeChild, i, onFound));
            }
            Boolean m71467twoDimensionalFocusSearchOMvw8 = m71467twoDimensionalFocusSearchOMvw8(activeChild, i, onFound);
            if (!Intrinsics.areEqual(m71467twoDimensionalFocusSearchOMvw8, Boolean.FALSE)) {
                return m71467twoDimensionalFocusSearchOMvw8;
            }
            return Boolean.valueOf(m59774j(twoDimensionalFocusSearch, m59783a(activeChild), i, onFound));
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }
}
