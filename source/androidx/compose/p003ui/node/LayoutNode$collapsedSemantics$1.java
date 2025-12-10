package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1461:1\n76#2:1462\n728#3,18:1463\n746#3,3:1525\n383#4,5:1481\n388#4:1487\n393#4,2:1489\n395#4,8:1494\n403#4,9:1505\n412#4,8:1517\n1#5:1486\n261#6:1488\n234#7,3:1491\n237#7,3:1514\n1182#8:1502\n1161#8,2:1503\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1\n*L\n422#1:1462\n422#1:1463,18\n422#1:1525,3\n422#1:1481,5\n422#1:1487\n422#1:1489,2\n422#1:1494,8\n422#1:1505,9\n422#1:1517,8\n422#1:1488\n422#1:1491,3\n422#1:1514,3\n422#1:1502\n422#1:1503,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1 */
/* loaded from: classes2.dex */
public final class LayoutNode$collapsedSemantics$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref.ObjectRef<SemanticsConfiguration> $config;
    final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$collapsedSemantics$1(LayoutNode layoutNode, Ref.ObjectRef<SemanticsConfiguration> objectRef) {
        super(0);
        this.this$0 = layoutNode;
        this.$config = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.semantics.SemanticsConfiguration, T] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NodeChain nodes$ui_release = this.this$0.getNodes$ui_release();
        int m72961constructorimpl = NodeKind.m72961constructorimpl(8);
        Ref.ObjectRef<SemanticsConfiguration> objectRef = this.$config;
        if ((nodes$ui_release.m59429c() & m72961constructorimpl) != 0) {
            for (Modifier.Node tail$ui_release = nodes$ui_release.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                    Modifier.Node node = tail$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof SemanticsModifierNode) {
                            SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) node;
                            if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                ?? semanticsConfiguration = new SemanticsConfiguration();
                                objectRef.element = semanticsConfiguration;
                                semanticsConfiguration.setClearingSemantics(true);
                            }
                            if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                objectRef.element.setMergingSemanticsOfDescendants(true);
                            }
                            semanticsModifierNode.applySemantics(objectRef.element);
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
                }
            }
        }
    }
}
