package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a=\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000e\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\n\u001a'\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\n\u001a\u0013\u0010\u0012\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "oneDimensionalFocusSearch", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/focus/FocusTargetNode;Lkotlin/jvm/functions/Function1;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "focusedItem", OperatorName.CURVE_TO, "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", OperatorName.NON_STROKING_GRAY, OperatorName.FILL_NON_ZERO, "e", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,265:1\n180#1,3:339\n183#1,2:343\n186#1,5:346\n195#1,3:351\n198#1,2:355\n201#1,5:358\n1161#2,2:266\n1182#2:273\n1161#2,2:274\n1161#2,2:363\n1182#2:370\n1161#2,2:371\n1161#2,2:447\n1182#2:454\n1161#2,2:455\n1182#2:569\n1161#2,2:570\n90#3:268\n90#3:365\n90#3:449\n90#3:531\n276#4:269\n133#4:270\n134#4:272\n135#4,7:276\n142#4,9:284\n383#4,6:293\n393#4,2:300\n395#4,17:305\n412#4,8:325\n151#4,6:333\n276#4:366\n133#4:367\n134#4:369\n135#4,7:373\n142#4,9:381\n383#4,6:390\n393#4,2:397\n395#4,17:402\n412#4,8:422\n151#4,6:430\n276#4:450\n133#4:451\n134#4:453\n135#4,7:457\n142#4,9:465\n383#4,6:474\n393#4,2:481\n395#4,17:486\n412#4,8:506\n151#4,6:514\n262#4:532\n230#4,5:533\n58#4:538\n59#4,8:540\n383#4,5:548\n263#4:553\n388#4:554\n393#4,2:556\n395#4,8:561\n403#4,9:572\n412#4,8:584\n68#4,7:592\n265#4:599\n1#5:271\n1#5:368\n1#5:452\n1#5:539\n48#6:283\n53#6:342\n523#6:345\n53#6:354\n523#6:357\n48#6:380\n204#6,11:436\n48#6:464\n492#6,11:520\n53#6:600\n523#6:601\n523#6:602\n53#6:603\n523#6:604\n523#6:605\n261#7:299\n261#7:396\n261#7:480\n261#7:555\n234#8,3:302\n237#8,3:322\n234#8,3:399\n237#8,3:419\n234#8,3:483\n237#8,3:503\n234#8,3:558\n237#8,3:581\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n132#1:339,3\n132#1:343,2\n132#1:346,5\n135#1:351,3\n135#1:355,2\n135#1:358,5\n127#1:266,2\n128#1:273\n128#1:274,2\n153#1:363,2\n154#1:370\n154#1:371,2\n163#1:447,2\n164#1:454\n164#1:455,2\n175#1:569\n175#1:570,2\n128#1:268\n154#1:365\n164#1:449\n175#1:531\n128#1:269\n128#1:270\n128#1:272\n128#1:276,7\n128#1:284,9\n128#1:293,6\n128#1:300,2\n128#1:305,17\n128#1:325,8\n128#1:333,6\n154#1:366\n154#1:367\n154#1:369\n154#1:373,7\n154#1:381,9\n154#1:390,6\n154#1:397,2\n154#1:402,17\n154#1:422,8\n154#1:430,6\n164#1:450\n164#1:451\n164#1:453\n164#1:457,7\n164#1:465,9\n164#1:474,6\n164#1:481,2\n164#1:486,17\n164#1:506,8\n164#1:514,6\n175#1:532\n175#1:533,5\n175#1:538\n175#1:540,8\n175#1:548,5\n175#1:553\n175#1:554\n175#1:556,2\n175#1:561,8\n175#1:572,9\n175#1:584,8\n175#1:592,7\n175#1:599\n128#1:271\n154#1:368\n164#1:452\n175#1:539\n128#1:283\n132#1:342\n132#1:345\n135#1:354\n135#1:357\n154#1:380\n157#1:436,11\n164#1:464\n167#1:520,11\n182#1:600\n184#1:601\n186#1:602\n197#1:603\n199#1:604\n201#1:605\n128#1:299\n154#1:396\n164#1:480\n175#1:555\n128#1:302,3\n128#1:322,3\n154#1:399,3\n154#1:419,3\n164#1:483,3\n164#1:503,3\n175#1:558,3\n175#1:581,3\n*E\n"})
/* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt */
/* loaded from: classes2.dex */
public final class OneDimensionalFocusSearchKt {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$WhenMappings */
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
    public static final boolean m59790a(FocusTargetNode focusTargetNode, Function1 function1) {
        boolean z;
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[focusState.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (!m59786e(focusTargetNode, function1)) {
                        if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                            z = ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return false;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return m59786e(focusTargetNode, function1);
            }
        } else {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                int i2 = iArr[activeChild.getFocusState().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    return m59788c(focusTargetNode, activeChild, FocusDirection.Companion.m71447getPreviousdhqQ8s(), function1);
                } else if (!m59790a(activeChild, function1) && !m59788c(focusTargetNode, activeChild, FocusDirection.Companion.m71447getPreviousdhqQ8s(), function1) && (!activeChild.fetchFocusProperties$ui_release().getCanFocus() || !((Boolean) function1.invoke(activeChild)).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m59789b(FocusTargetNode focusTargetNode, Function1 function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                        return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
                    }
                    return m59785f(focusTargetNode, function1);
                }
                throw new NoWhenBranchMatchedException();
            }
            return m59785f(focusTargetNode, function1);
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            if (m59789b(activeChild, function1) || m59788c(focusTargetNode, activeChild, FocusDirection.Companion.m71445getNextdhqQ8s(), function1)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    /* renamed from: c */
    public static final boolean m59788c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1 function1) {
        if (m59784g(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m71428searchBeyondBoundsOMvw8(focusTargetNode, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetNode, focusTargetNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m59787d(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui_release;
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                node = null;
                if (requireLayoutNode == null) {
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                            Modifier.Node node2 = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (node2 != null) {
                                if (node2 instanceof FocusTargetNode) {
                                    node = node2;
                                    break loop0;
                                }
                                if ((node2.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                node2 = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.m59509b(mutableVector);
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
            if (node != null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: e */
    public static final boolean m59786e(FocusTargetNode focusTargetNode, Function1 function1) {
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
            mutableVector.sortWith(S30.f5502a);
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            int i2 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && m59790a(focusTargetNode2, function1)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: f */
    public static final boolean m59785f(FocusTargetNode focusTargetNode, Function1 function1) {
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
            mutableVector.sortWith(S30.f5502a);
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && m59789b(focusTargetNode2, function1)) {
                    return true;
                }
                i2++;
            } while (i2 < size);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: g */
    public static final boolean m59784g(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1 function1) {
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
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
                mutableVector.sortWith(S30.f5502a);
                FocusDirection.Companion companion = FocusDirection.Companion;
                if (FocusDirection.m71432equalsimpl0(i, companion.m71445getNextdhqQ8s())) {
                    IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
                    int first = intRange.getFirst();
                    int last = intRange.getLast();
                    if (first <= last) {
                        boolean z = false;
                        while (true) {
                            if (z) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.getContent()[first];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && m59789b(focusTargetNode3, function1)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.areEqual(mutableVector.getContent()[first], focusTargetNode2)) {
                                z = true;
                            }
                            if (first == last) {
                                break;
                            }
                            first++;
                        }
                    }
                } else if (FocusDirection.m71432equalsimpl0(i, companion.m71447getPreviousdhqQ8s())) {
                    IntRange intRange2 = new IntRange(0, mutableVector.getSize() - 1);
                    int first2 = intRange2.getFirst();
                    int last2 = intRange2.getLast();
                    if (first2 <= last2) {
                        boolean z2 = false;
                        while (true) {
                            if (z2) {
                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.getContent()[last2];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && m59790a(focusTargetNode4, function1)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.areEqual(mutableVector.getContent()[last2], focusTargetNode2)) {
                                z2 = true;
                            }
                            if (last2 == first2) {
                                break;
                            }
                            last2--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                if (FocusDirection.m71432equalsimpl0(i, FocusDirection.Companion.m71445getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || m59787d(focusTargetNode)) {
                    return false;
                }
                return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
            }
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8  reason: not valid java name */
    public static final boolean m71464oneDimensionalFocusSearchOMvw8(@NotNull FocusTargetNode oneDimensionalFocusSearch, int i, @NotNull Function1<? super FocusTargetNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m71432equalsimpl0(i, companion.m71445getNextdhqQ8s())) {
            return m59789b(oneDimensionalFocusSearch, onFound);
        }
        if (FocusDirection.m71432equalsimpl0(i, companion.m71447getPreviousdhqQ8s())) {
            return m59790a(oneDimensionalFocusSearch, onFound);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }
}
