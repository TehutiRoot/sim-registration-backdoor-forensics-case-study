package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0013\"\u0018\u0010\u0015\u001a\u00020\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "Lkotlin/Function1;", "", "onFound", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)Z", "focusSearch", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;", "findActiveFocusNode", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", PDPageLabelRange.STYLE_LETTERS_LOWER, "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "getActiveChild", "activeChild", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,169:1\n1#2:170\n1#2:174\n1#2:245\n1#2:320\n90#3:171\n90#3:242\n90#3:313\n276#4:172\n133#4:173\n134#4:175\n135#4,7:179\n142#4,9:187\n383#4,6:196\n393#4,2:203\n395#4,17:208\n412#4,8:228\n151#4,6:236\n276#4:243\n133#4:244\n134#4:246\n135#4,7:250\n142#4,9:258\n383#4,6:267\n393#4,2:274\n395#4,17:279\n412#4,8:299\n151#4,6:307\n230#4,5:314\n58#4:319\n59#4,8:321\n383#4,6:329\n393#4,2:336\n395#4,8:341\n403#4,9:352\n412#4,8:364\n68#4,7:372\n1182#5:176\n1161#5,2:177\n1182#5:247\n1161#5,2:248\n1182#5:349\n1161#5,2:350\n48#6:186\n48#6:257\n261#7:202\n261#7:273\n261#7:335\n234#8,3:205\n237#8,3:225\n234#8,3:276\n237#8,3:296\n234#8,3:338\n237#8,3:361\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n140#1:174\n153#1:245\n164#1:320\n140#1:171\n153#1:242\n164#1:313\n140#1:172\n140#1:173\n140#1:175\n140#1:179,7\n140#1:187,9\n140#1:196,6\n140#1:203,2\n140#1:208,17\n140#1:228,8\n140#1:236,6\n153#1:243\n153#1:244\n153#1:246\n153#1:250,7\n153#1:258,9\n153#1:267,6\n153#1:274,2\n153#1:279,17\n153#1:299,8\n153#1:307,6\n164#1:314,5\n164#1:319\n164#1:321,8\n164#1:329,6\n164#1:336,2\n164#1:341,8\n164#1:352,9\n164#1:364,8\n164#1:372,7\n140#1:176\n140#1:177,2\n153#1:247\n153#1:248,2\n164#1:349\n164#1:350,2\n140#1:186\n153#1:257\n140#1:202\n153#1:273\n164#1:335\n140#1:205,3\n140#1:225,3\n153#1:276,3\n153#1:296,3\n164#1:338,3\n164#1:361,3\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTraversalKt */
/* loaded from: classes2.dex */
public final class FocusTraversalKt {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusTraversalKt$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: a */
    public static final FocusTargetNode m59791a(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                            Modifier.Node node = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                    if (focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                                        return focusTargetNode2;
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
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @NotNull
    /* renamed from: customFocusSearch--OM-vw8  reason: not valid java name */
    public static final FocusRequester m71461customFocusSearchOMvw8(@NotNull FocusTargetNode customFocusSearch, int i, @NotNull LayoutDirection layoutDirection) {
        FocusRequester end;
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusProperties fetchFocusProperties$ui_release = customFocusSearch.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71445getNextdhqQ8s())) {
            return fetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m71432equalsimpl0(i, companion.m71447getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s())) {
            return fetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s())) {
            return fetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    end = fetchFocusProperties$ui_release.getEnd();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                end = fetchFocusProperties$ui_release.getStart();
            }
            if (end == FocusRequester.Companion.getDefault()) {
                end = null;
            }
            if (end == null) {
                return fetchFocusProperties$ui_release.getLeft();
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    end = fetchFocusProperties$ui_release.getStart();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                end = fetchFocusProperties$ui_release.getEnd();
            }
            if (end == FocusRequester.Companion.getDefault()) {
                end = null;
            }
            if (end == null) {
                return fetchFocusProperties$ui_release.getRight();
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71441getEnterdhqQ8s())) {
            return fetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m71429boximpl(i));
        } else {
            if (FocusDirection.m71432equalsimpl0(i, companion.m71442getExitdhqQ8s())) {
                return fetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m71429boximpl(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return end;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0054, code lost:
        continue;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.p003ui.focus.FocusTargetNode findActiveFocusNode(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.focus.FocusTargetNode r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            androidx.compose.ui.focus.FocusStateImpl r0 = r10.getFocusState()
            int[] r1 = androidx.compose.p003ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Ldc
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto Ldc
            r10 = 4
            if (r0 != r10) goto L1f
            return r3
        L1f:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L25:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p003ui.node.NodeKind.m72961constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r10.getNode()
            boolean r2 = r2.isAttached()
            if (r2 == 0) goto Ld0
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r4 = 16
            androidx.compose.ui.Modifier$Node[] r5 = new androidx.compose.p003ui.Modifier.Node[r4]
            r6 = 0
            r2.<init>(r5, r6)
            androidx.compose.ui.Modifier$Node r5 = r10.getNode()
            androidx.compose.ui.Modifier$Node r5 = r5.getChild$ui_release()
            if (r5 != 0) goto L51
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.p003ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10)
            goto L54
        L51:
            r2.add(r5)
        L54:
            boolean r10 = r2.isNotEmpty()
            if (r10 == 0) goto Lcf
            int r10 = r2.getSize()
            int r10 = r10 - r1
            java.lang.Object r10 = r2.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.p003ui.Modifier.Node) r10
            int r5 = r10.getAggregateChildKindSet$ui_release()
            r5 = r5 & r0
            if (r5 != 0) goto L70
            androidx.compose.p003ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10)
            goto L54
        L70:
            if (r10 == 0) goto L54
            int r5 = r10.getKindSet$ui_release()
            r5 = r5 & r0
            if (r5 == 0) goto Lca
            r5 = r3
        L7a:
            if (r10 == 0) goto L54
            boolean r7 = r10 instanceof androidx.compose.p003ui.focus.FocusTargetNode
            if (r7 == 0) goto L89
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.p003ui.focus.FocusTargetNode) r10
            androidx.compose.ui.focus.FocusTargetNode r10 = findActiveFocusNode(r10)
            if (r10 == 0) goto Lc5
            return r10
        L89:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto Lc5
            boolean r7 = r10 instanceof androidx.compose.p003ui.node.DelegatingNode
            if (r7 == 0) goto Lc5
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.p003ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = 0
        L9c:
            if (r7 == 0) goto Lc2
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto Lbd
            int r8 = r8 + 1
            if (r8 != r1) goto Lab
            r10 = r7
            goto Lbd
        Lab:
            if (r5 != 0) goto Lb4
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.p003ui.Modifier.Node[r4]
            r5.<init>(r9, r6)
        Lb4:
            if (r10 == 0) goto Lba
            r5.add(r10)
            r10 = r3
        Lba:
            r5.add(r7)
        Lbd:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L9c
        Lc2:
            if (r8 != r1) goto Lc5
            goto L7a
        Lc5:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.p003ui.node.DelegatableNodeKt.access$pop(r5)
            goto L7a
        Lca:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L70
        Lcf:
            return r3
        Ld0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Ldc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    @NotNull
    public static final Rect focusRect(@NotNull FocusTargetNode focusTargetNode) {
        Rect localBoundingBoxOf;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release == null || (localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui_release).localBoundingBoxOf(coordinator$ui_release, false)) == null) {
            return Rect.Companion.getZero();
        }
        return localBoundingBoxOf;
    }

    /* renamed from: focusSearch-sMXa3k8  reason: not valid java name */
    public static final boolean m71462focusSearchsMXa3k8(@NotNull FocusTargetNode focusSearch, int i, @NotNull LayoutDirection layoutDirection, @NotNull Function1<? super FocusTargetNode, Boolean> onFound) {
        boolean m71432equalsimpl0;
        boolean m71432equalsimpl02;
        boolean m71432equalsimpl03;
        boolean m71432equalsimpl04;
        FocusTargetNode focusTargetNode;
        int m71448getRightdhqQ8s;
        Boolean m71467twoDimensionalFocusSearchOMvw8;
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71445getNextdhqQ8s())) {
            m71432equalsimpl0 = true;
        } else {
            m71432equalsimpl0 = FocusDirection.m71432equalsimpl0(i, companion.m71447getPreviousdhqQ8s());
        }
        if (m71432equalsimpl0) {
            return OneDimensionalFocusSearchKt.m71464oneDimensionalFocusSearchOMvw8(focusSearch, i, onFound);
        }
        if (FocusDirection.m71432equalsimpl0(i, companion.m71444getLeftdhqQ8s())) {
            m71432equalsimpl02 = true;
        } else {
            m71432equalsimpl02 = FocusDirection.m71432equalsimpl0(i, companion.m71448getRightdhqQ8s());
        }
        if (m71432equalsimpl02) {
            m71432equalsimpl03 = true;
        } else {
            m71432equalsimpl03 = FocusDirection.m71432equalsimpl0(i, companion.m71449getUpdhqQ8s());
        }
        if (m71432equalsimpl03) {
            m71432equalsimpl04 = true;
        } else {
            m71432equalsimpl04 = FocusDirection.m71432equalsimpl0(i, companion.m71440getDowndhqQ8s());
        }
        if (m71432equalsimpl04) {
            Boolean m71467twoDimensionalFocusSearchOMvw82 = TwoDimensionalFocusSearchKt.m71467twoDimensionalFocusSearchOMvw8(focusSearch, i, onFound);
            if (m71467twoDimensionalFocusSearchOMvw82 != null) {
                return m71467twoDimensionalFocusSearchOMvw82.booleanValue();
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71441getEnterdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    m71448getRightdhqQ8s = companion.m71444getLeftdhqQ8s();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m71448getRightdhqQ8s = companion.m71448getRightdhqQ8s();
            }
            FocusTargetNode findActiveFocusNode = findActiveFocusNode(focusSearch);
            if (findActiveFocusNode != null && (m71467twoDimensionalFocusSearchOMvw8 = TwoDimensionalFocusSearchKt.m71467twoDimensionalFocusSearchOMvw8(findActiveFocusNode, m71448getRightdhqQ8s, onFound)) != null) {
                return m71467twoDimensionalFocusSearchOMvw8.booleanValue();
            }
        } else if (FocusDirection.m71432equalsimpl0(i, companion.m71442getExitdhqQ8s())) {
            FocusTargetNode findActiveFocusNode2 = findActiveFocusNode(focusSearch);
            if (findActiveFocusNode2 != null) {
                focusTargetNode = m59791a(findActiveFocusNode2);
            } else {
                focusTargetNode = null;
            }
            if (focusTargetNode != null && !Intrinsics.areEqual(focusTargetNode, focusSearch)) {
                return onFound.invoke(focusTargetNode).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m71434toStringimpl(i))).toString());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0040, code lost:
        continue;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.p003ui.focus.FocusTargetNode getActiveChild(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.focus.FocusTargetNode r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            androidx.compose.ui.Modifier$Node r0 = r10.getNode()
            boolean r0 = r0.isAttached()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p003ui.node.NodeKind.m72961constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r10.getNode()
            boolean r2 = r2.isAttached()
            if (r2 == 0) goto Lcc
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.p003ui.Modifier.Node[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$Node r4 = r10.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            if (r4 != 0) goto L3d
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.p003ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10)
            goto L40
        L3d:
            r2.add(r4)
        L40:
            boolean r10 = r2.isNotEmpty()
            if (r10 == 0) goto Lcb
            int r10 = r2.getSize()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.p003ui.Modifier.Node) r10
            int r6 = r10.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L5d
            androidx.compose.p003ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10)
            goto L40
        L5d:
            if (r10 == 0) goto L40
            int r6 = r10.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Lc6
            r6 = r1
        L67:
            if (r10 == 0) goto L40
            boolean r7 = r10 instanceof androidx.compose.p003ui.focus.FocusTargetNode
            if (r7 == 0) goto L85
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.p003ui.focus.FocusTargetNode) r10
            androidx.compose.ui.focus.FocusStateImpl r7 = r10.getFocusState()
            int[] r8 = androidx.compose.p003ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L84
            r8 = 2
            if (r7 == r8) goto L84
            r8 = 3
            if (r7 == r8) goto L84
            goto Lc1
        L84:
            return r10
        L85:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto Lc1
            boolean r7 = r10 instanceof androidx.compose.p003ui.node.DelegatingNode
            if (r7 == 0) goto Lc1
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.p003ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = 0
        L98:
            if (r7 == 0) goto Lbe
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto Lb9
            int r8 = r8 + 1
            if (r8 != r4) goto La7
            r10 = r7
            goto Lb9
        La7:
            if (r6 != 0) goto Lb0
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.p003ui.Modifier.Node[r3]
            r6.<init>(r9, r5)
        Lb0:
            if (r10 == 0) goto Lb6
            r6.add(r10)
            r10 = r1
        Lb6:
            r6.add(r7)
        Lb9:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L98
        Lbe:
            if (r8 != r4) goto Lc1
            goto L67
        Lc1:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.p003ui.node.DelegatableNodeKt.access$pop(r6)
            goto L67
        Lc6:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L5d
        Lcb:
            return r1
        Lcc:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean isEligibleForFocusSearch(@NotNull FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui_release;
        LayoutNode layoutNode2;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        NodeCoordinator coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release2 != null && (layoutNode = coordinator$ui_release2.getLayoutNode()) != null && layoutNode.isPlaced() && (coordinator$ui_release = focusTargetNode.getCoordinator$ui_release()) != null && (layoutNode2 = coordinator$ui_release.getLayoutNode()) != null && layoutNode2.isAttached()) {
            return true;
        }
        return false;
    }
}
