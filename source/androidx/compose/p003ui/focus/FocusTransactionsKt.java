package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.ObserverModifierNodeKt;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a%\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\u0003\u001a'\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0003\u001a!\u0010\u0016\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0018\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0015\u001a!\u0010\u001a\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "requestFocus", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "performRequestFocus", "captureFocus", "freeFocus", "forced", "refreshFocusEvents", "clearFocus", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "childNode", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus", "performCustomClearFocus-Mxy_nc0", "performCustomClearFocus", "d", "e", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,299:1\n90#2:300\n90#2:369\n90#2:438\n90#2:507\n262#3:301\n230#3,5:302\n58#3:307\n59#3,8:309\n383#3,5:317\n263#3:322\n388#3:323\n393#3,2:325\n395#3,8:330\n403#3,9:341\n412#3,8:353\n68#3,7:361\n265#3:368\n262#3:370\n230#3,5:371\n58#3:376\n59#3,8:378\n383#3,5:386\n263#3:391\n388#3:392\n393#3,2:394\n395#3,8:399\n403#3,9:410\n412#3,8:422\n68#3,7:430\n265#3:437\n262#3:439\n230#3,5:440\n58#3:445\n59#3,8:447\n383#3,5:455\n263#3:460\n388#3:461\n393#3,2:463\n395#3,8:468\n403#3,9:479\n412#3,8:491\n68#3,7:499\n265#3:506\n262#3:508\n230#3,5:509\n58#3:514\n59#3,8:516\n383#3,5:524\n263#3:529\n388#3:530\n393#3,2:532\n395#3,8:537\n403#3,9:548\n412#3,8:560\n68#3,7:568\n265#3:575\n1#4:308\n1#4:377\n1#4:446\n1#4:515\n1#4:576\n261#5:324\n261#5:393\n261#5:462\n261#5:531\n234#6,3:327\n237#6,3:350\n234#6,3:396\n237#6,3:419\n234#6,3:465\n237#6,3:488\n234#6,3:534\n237#6,3:557\n1182#7:338\n1161#7,2:339\n1182#7:407\n1161#7,2:408\n1182#7:476\n1161#7,2:477\n1182#7:545\n1161#7,2:546\n105#8,12:577\n132#8,12:589\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n67#1:300\n188#1:369\n212#1:438\n255#1:507\n67#1:301\n67#1:302,5\n67#1:307\n67#1:309,8\n67#1:317,5\n67#1:322\n67#1:323\n67#1:325,2\n67#1:330,8\n67#1:341,9\n67#1:353,8\n67#1:361,7\n67#1:368\n188#1:370\n188#1:371,5\n188#1:376\n188#1:378,8\n188#1:386,5\n188#1:391\n188#1:392\n188#1:394,2\n188#1:399,8\n188#1:410,9\n188#1:422,8\n188#1:430,7\n188#1:437\n212#1:439\n212#1:440,5\n212#1:445\n212#1:447,8\n212#1:455,5\n212#1:460\n212#1:461\n212#1:463,2\n212#1:468,8\n212#1:479,9\n212#1:491,8\n212#1:499,7\n212#1:506\n255#1:508\n255#1:509,5\n255#1:514\n255#1:516,8\n255#1:524,5\n255#1:529\n255#1:530\n255#1:532,2\n255#1:537,8\n255#1:548,9\n255#1:560,8\n255#1:568,7\n255#1:575\n67#1:308\n188#1:377\n212#1:446\n255#1:515\n67#1:324\n188#1:393\n212#1:462\n255#1:531\n67#1:327,3\n67#1:350,3\n188#1:396,3\n188#1:419,3\n212#1:465,3\n212#1:488,3\n255#1:534,3\n255#1:557,3\n67#1:338\n67#1:339,2\n188#1:407\n188#1:408,2\n212#1:476\n212#1:477,2\n255#1:545\n255#1:546,2\n282#1:577,12\n293#1:589,12\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTransactionsKt */
/* loaded from: classes2.dex */
public final class FocusTransactionsKt {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: a */
    public static final boolean m59798a(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m59797b(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m59798a(focusTargetNode, z, z2);
    }

    /* renamed from: c */
    public static final boolean m59796c(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new FocusTransactionsKt$grantFocus$1(focusTargetNode));
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 3 || i == 4) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            return true;
        }
        return true;
    }

    public static final boolean captureFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return false;
        }
        focusTargetNode.setFocusState(FocusStateImpl.Captured);
        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
        return true;
    }

    public static final boolean clearFocus(@NotNull FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (m59798a(focusTargetNode, z, z2)) {
                    focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                    if (z2) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                    }
                } else {
                    return false;
                }
            } else if (z) {
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (z2) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                    return z;
                }
                return z;
            } else {
                return z;
            }
        } else {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z2) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    /* renamed from: d */
    public static final CustomDestinationResult m59795d(FocusTargetNode focusTargetNode, int i) {
        CustomDestinationResult customDestinationResult;
        if (!focusTargetNode.f28939o) {
            focusTargetNode.f28939o = true;
            try {
                FocusRequester invoke = focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m71429boximpl(i));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (invoke != companion.getDefault()) {
                    if (invoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (invoke.focus$ui_release()) {
                        customDestinationResult = CustomDestinationResult.Redirected;
                    } else {
                        customDestinationResult = CustomDestinationResult.RedirectCancelled;
                    }
                    return customDestinationResult;
                }
            } finally {
                focusTargetNode.f28939o = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: e */
    public static final CustomDestinationResult m59794e(FocusTargetNode focusTargetNode, int i) {
        CustomDestinationResult customDestinationResult;
        if (!focusTargetNode.f28938n) {
            focusTargetNode.f28938n = true;
            try {
                FocusRequester invoke = focusTargetNode.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m71429boximpl(i));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (invoke != companion.getDefault()) {
                    if (invoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (invoke.focus$ui_release()) {
                        customDestinationResult = CustomDestinationResult.Redirected;
                    } else {
                        customDestinationResult = CustomDestinationResult.RedirectCancelled;
                    }
                    return customDestinationResult;
                }
            } finally {
                focusTargetNode.f28938n = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: f */
    public static final boolean m59793f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        boolean z;
        FocusTargetNode focusTargetNode3;
        Modifier.Node node;
        NodeChain nodes$ui_release;
        NodeChain nodes$ui_release2;
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
        if (focusTargetNode2.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            loop0: while (true) {
                z = true;
                focusTargetNode3 = null;
                if (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                node = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
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
                    if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                        parent$ui_release = nodes$ui_release2.getTail$ui_release();
                    } else {
                        parent$ui_release = null;
                    }
                } else {
                    node = null;
                    break;
                }
            }
            if (Intrinsics.areEqual(node, focusTargetNode)) {
                int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return false;
                    }
                    if (i2 != 3) {
                        if (i2 == 4) {
                            int m72961constructorimpl2 = NodeKind.m72961constructorimpl(1024);
                            if (focusTargetNode.getNode().isAttached()) {
                                Modifier.Node parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
                                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                                loop4: while (true) {
                                    if (requireLayoutNode2 == null) {
                                        break;
                                    }
                                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                        while (parent$ui_release2 != null) {
                                            if ((parent$ui_release2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                                Modifier.Node node2 = parent$ui_release2;
                                                MutableVector mutableVector2 = null;
                                                while (node2 != null) {
                                                    if (node2 instanceof FocusTargetNode) {
                                                        focusTargetNode3 = node2;
                                                        break loop4;
                                                    }
                                                    if ((node2.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                                        int i3 = 0;
                                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                            if ((delegate$ui_release2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                                                i3++;
                                                                if (i3 == 1) {
                                                                    node2 = delegate$ui_release2;
                                                                } else {
                                                                    if (mutableVector2 == null) {
                                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                                    }
                                                                    if (node2 != null) {
                                                                        mutableVector2.add(node2);
                                                                        node2 = null;
                                                                    }
                                                                    mutableVector2.add(delegate$ui_release2);
                                                                }
                                                            }
                                                        }
                                                        if (i3 == 1) {
                                                        }
                                                    }
                                                    node2 = DelegatableNodeKt.m59509b(mutableVector2);
                                                }
                                                continue;
                                            }
                                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                                        }
                                    }
                                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                                    if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                                        parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                                    } else {
                                        parent$ui_release2 = null;
                                    }
                                }
                                FocusTargetNode focusTargetNode4 = focusTargetNode3;
                                if (focusTargetNode4 == null && m59792g(focusTargetNode)) {
                                    focusTargetNode.setFocusState(FocusStateImpl.Active);
                                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                                    return m59793f(focusTargetNode, focusTargetNode2);
                                } else if (focusTargetNode4 == null || !m59793f(focusTargetNode4, focusTargetNode)) {
                                    return false;
                                } else {
                                    boolean m59793f = m59793f(focusTargetNode, focusTargetNode2);
                                    if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                    return m59793f;
                                }
                            }
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                        throw new NoWhenBranchMatchedException();
                    } else if (FocusTraversalKt.getActiveChild(focusTargetNode) != null) {
                        z = (m59797b(focusTargetNode, false, false, 3, null) && m59796c(focusTargetNode2)) ? false : false;
                        if (z) {
                            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode2);
                        }
                        return z;
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                boolean m59796c = m59796c(focusTargetNode2);
                if (m59796c) {
                    focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode2);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                    return m59796c;
                }
                return m59796c;
            }
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final boolean freeFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return false;
        }
        focusTargetNode.setFocusState(FocusStateImpl.Active);
        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
        return true;
    }

    /* renamed from: g */
    public static final boolean m59792g(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner$ui_release;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release != null && (layoutNode = coordinator$ui_release.getLayoutNode()) != null && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
            return owner$ui_release.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }

    @NotNull
    /* renamed from: performCustomClearFocus-Mxy_nc0  reason: not valid java name */
    public static final CustomDestinationResult m71459performCustomClearFocusMxy_nc0(@NotNull FocusTargetNode performCustomClearFocus, int i) {
        Intrinsics.checkNotNullParameter(performCustomClearFocus, "$this$performCustomClearFocus");
        int i2 = WhenMappings.$EnumSwitchMapping$1[performCustomClearFocus.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(performCustomClearFocus);
                    if (activeChild != null) {
                        CustomDestinationResult m71459performCustomClearFocusMxy_nc0 = m71459performCustomClearFocusMxy_nc0(activeChild, i);
                        if (m71459performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                            m71459performCustomClearFocusMxy_nc0 = null;
                        }
                        if (m71459performCustomClearFocusMxy_nc0 == null) {
                            return m59794e(performCustomClearFocus, i);
                        }
                        return m71459performCustomClearFocusMxy_nc0;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                return CustomDestinationResult.Cancelled;
            }
        }
        return CustomDestinationResult.None;
    }

    @NotNull
    /* renamed from: performCustomRequestFocus-Mxy_nc0  reason: not valid java name */
    public static final CustomDestinationResult m71460performCustomRequestFocusMxy_nc0(@NotNull FocusTargetNode performCustomRequestFocus, int i) {
        CustomDestinationResult customDestinationResult;
        FocusTargetNode focusTargetNode;
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(performCustomRequestFocus, "$this$performCustomRequestFocus");
        int i2 = WhenMappings.$EnumSwitchMapping$1[performCustomRequestFocus.getFocusState().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
                    if (performCustomRequestFocus.getNode().isAttached()) {
                        Modifier.Node parent$ui_release = performCustomRequestFocus.getNode().getParent$ui_release();
                        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(performCustomRequestFocus);
                        loop0: while (true) {
                            customDestinationResult = null;
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
                                                    int i3 = 0;
                                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) focusTargetNode).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                        if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
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
                                                    if (i3 == 1) {
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
                        if (focusTargetNode2 == null) {
                            return CustomDestinationResult.None;
                        }
                        int i4 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 == 4) {
                                        CustomDestinationResult m71460performCustomRequestFocusMxy_nc0 = m71460performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
                                        if (m71460performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None) {
                                            customDestinationResult = m71460performCustomRequestFocusMxy_nc0;
                                        }
                                        if (customDestinationResult == null) {
                                            return m59795d(focusTargetNode2, i);
                                        }
                                        return customDestinationResult;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                return m71460performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
                            }
                            return CustomDestinationResult.Cancelled;
                        }
                        return m59795d(focusTargetNode2, i);
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(performCustomRequestFocus);
            if (activeChild != null) {
                return m71459performCustomClearFocusMxy_nc0(activeChild, i);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        return CustomDestinationResult.None;
    }

    public static final boolean performRequestFocus(@NotNull FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            FocusTargetNode focusTargetNode2 = null;
            if (i != 3) {
                if (i == 4) {
                    int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
                    if (focusTargetNode.getNode().isAttached()) {
                        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
                        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                        loop0: while (true) {
                            if (requireLayoutNode == null) {
                                break;
                            }
                            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                                while (parent$ui_release != null) {
                                    if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                        Modifier.Node node = parent$ui_release;
                                        MutableVector mutableVector = null;
                                        while (node != null) {
                                            if (node instanceof FocusTargetNode) {
                                                focusTargetNode2 = node;
                                                break loop0;
                                            }
                                            if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
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
                        FocusTargetNode focusTargetNode3 = focusTargetNode2;
                        if (focusTargetNode3 != null) {
                            return m59793f(focusTargetNode3, focusTargetNode);
                        }
                        z = (m59792g(focusTargetNode) && m59796c(focusTargetNode)) ? false : false;
                        if (z) {
                            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                            return z;
                        }
                        return z;
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            z = (m59797b(focusTargetNode, false, false, 3, null) && m59796c(focusTargetNode)) ? false : false;
            if (z) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                return z;
            }
            return z;
        }
        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
        return true;
    }

    public static final boolean requestFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[m71460performCustomRequestFocusMxy_nc0(focusTargetNode, FocusDirection.Companion.m71441getEnterdhqQ8s()).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return false;
        }
        return performRequestFocus(focusTargetNode);
    }
}
