package androidx.compose.p003ui.modifier;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.node.BackwardsCompatNode;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.runtime.collection.MutableVector;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0011\u0010\u000fJ1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00122\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u001e\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m28850d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Landroidx/compose/ui/node/Owner;", Constant.REGISTER_LEVEL_OWNER, "<init>", "(Landroidx/compose/ui/node/Owner;)V", "", "invalidate", "()V", "triggerUpdates", "Landroidx/compose/ui/node/BackwardsCompatNode;", "node", "Landroidx/compose/ui/modifier/ModifierLocal;", Action.KEY_ATTRIBUTE, "updatedProvider", "(Landroidx/compose/ui/node/BackwardsCompatNode;Landroidx/compose/ui/modifier/ModifierLocal;)V", "insertedProvider", "removedProvider", "Landroidx/compose/ui/Modifier$Node;", "", "set", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/modifier/ModifierLocal;Ljava/util/Set;)V", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/runtime/collection/MutableVector;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/collection/MutableVector;", "inserted", OperatorName.CURVE_TO, "insertedLocal", "Landroidx/compose/ui/node/LayoutNode;", "d", "removed", "e", "removedLocal", "", OperatorName.FILL_NON_ZERO, "Z", "invalidated", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,121:1\n1182#2:122\n1161#2,2:123\n1182#2:125\n1161#2,2:126\n1182#2:128\n1161#2,2:129\n1182#2:131\n1161#2,2:132\n1182#2:165\n1161#2,2:166\n476#3,7:134\n523#3:141\n483#3,4:142\n476#3,7:146\n523#3:153\n483#3,4:154\n728#3,2:233\n728#3,2:235\n728#3,2:237\n728#3,2:239\n728#3,2:241\n728#3,2:243\n1855#4,2:158\n80#5:160\n289#6:161\n163#6:162\n164#6:164\n165#6,12:168\n290#6:180\n383#6,5:181\n291#6,2:186\n388#6:188\n393#6,2:190\n395#6,17:195\n412#6,8:215\n293#6:223\n177#6,8:224\n294#6:232\n1#7:163\n261#8:189\n234#9,3:192\n237#9,3:212\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:122\n44#1:123,2\n45#1:125\n45#1:126,2\n46#1:128\n46#1:129,2\n47#1:131\n47#1:132,2\n93#1:165\n93#1:166,2\n64#1:134,7\n65#1:141\n64#1:142,4\n77#1:146,7\n78#1:153\n77#1:154,4\n105#1:233,2\n106#1:235,2\n111#1:237,2\n112#1:239,2\n117#1:241,2\n118#1:243,2\n85#1:158,2\n93#1:160\n93#1:161\n93#1:162\n93#1:164\n93#1:168,12\n93#1:180\n93#1:181,5\n93#1:186,2\n93#1:188\n93#1:190,2\n93#1:195,17\n93#1:215,8\n93#1:223\n93#1:224,8\n93#1:232\n93#1:163\n93#1:189\n93#1:192,3\n93#1:212,3\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalManager */
/* loaded from: classes2.dex */
public final class ModifierLocalManager {

    /* renamed from: a */
    public final Owner f30173a;

    /* renamed from: b */
    public final MutableVector f30174b;

    /* renamed from: c */
    public final MutableVector f30175c;

    /* renamed from: d */
    public final MutableVector f30176d;

    /* renamed from: e */
    public final MutableVector f30177e;

    /* renamed from: f */
    public boolean f30178f;

    public ModifierLocalManager(@NotNull Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f30173a = owner;
        this.f30174b = new MutableVector(new BackwardsCompatNode[16], 0);
        this.f30175c = new MutableVector(new ModifierLocal[16], 0);
        this.f30176d = new MutableVector(new LayoutNode[16], 0);
        this.f30177e = new MutableVector(new ModifierLocal[16], 0);
    }

    /* renamed from: a */
    public final void m59519a(Modifier.Node node, ModifierLocal modifierLocal, Set set) {
        int m72961constructorimpl = NodeKind.m72961constructorimpl(32);
        if (node.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = node.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.m59510a(mutableVector, node.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node2.getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                    for (Modifier.Node node3 = node2; node3 != null; node3 = node3.getChild$ui_release()) {
                        if ((node3.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                            Modifier.Node node4 = node3;
                            MutableVector mutableVector2 = null;
                            while (node4 != null) {
                                if (node4 instanceof ModifierLocalModifierNode) {
                                    ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) node4;
                                    if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                        BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                        if ((backwardsCompatNode.getElement() instanceof ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(modifierLocal)) {
                                            set.add(modifierLocalModifierNode);
                                        }
                                    }
                                    if (!(!modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal))) {
                                        break;
                                    }
                                } else if ((node4.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node4 instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                node4 = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node4 != null) {
                                                    mutableVector2.add(node4);
                                                    node4 = null;
                                                }
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                node4 = DelegatableNodeKt.m59509b(mutableVector2);
                            }
                            continue;
                        }
                    }
                }
                DelegatableNodeKt.m59510a(mutableVector, node2);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    @NotNull
    public final Owner getOwner() {
        return this.f30173a;
    }

    public final void insertedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30174b.add(node);
        this.f30175c.add(key);
        invalidate();
    }

    public final void invalidate() {
        if (!this.f30178f) {
            this.f30178f = true;
            this.f30173a.registerOnEndApplyChangesListener(new ModifierLocalManager$invalidate$1(this));
        }
    }

    public final void removedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30176d.add(DelegatableNodeKt.requireLayoutNode(node));
        this.f30177e.add(key);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[LOOP:2: B:19:0x007f->B:21:0x0085, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void triggerUpdates() {
        /*
            r8 = this;
            r0 = 0
            r8.f30178f = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            androidx.compose.runtime.collection.MutableVector r2 = r8.f30176d
            int r3 = r2.getSize()
            if (r3 <= 0) goto L40
            java.lang.Object[] r2 = r2.getContent()
            r4 = 0
        L15:
            r5 = r2[r4]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p003ui.node.LayoutNode) r5
            androidx.compose.runtime.collection.MutableVector r6 = r8.f30177e
            java.lang.Object[] r6 = r6.getContent()
            r6 = r6[r4]
            androidx.compose.ui.modifier.ModifierLocal r6 = (androidx.compose.p003ui.modifier.ModifierLocal) r6
            androidx.compose.ui.node.NodeChain r7 = r5.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r7 = r7.getHead$ui_release()
            boolean r7 = r7.isAttached()
            if (r7 == 0) goto L3c
            androidx.compose.ui.node.NodeChain r5 = r5.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r5 = r5.getHead$ui_release()
            r8.m59519a(r5, r6, r1)
        L3c:
            int r4 = r4 + 1
            if (r4 < r3) goto L15
        L40:
            androidx.compose.runtime.collection.MutableVector r2 = r8.f30176d
            r2.clear()
            androidx.compose.runtime.collection.MutableVector r2 = r8.f30177e
            r2.clear()
            androidx.compose.runtime.collection.MutableVector r2 = r8.f30174b
            int r3 = r2.getSize()
            if (r3 <= 0) goto L71
            java.lang.Object[] r2 = r2.getContent()
        L56:
            r4 = r2[r0]
            androidx.compose.ui.node.BackwardsCompatNode r4 = (androidx.compose.p003ui.node.BackwardsCompatNode) r4
            androidx.compose.runtime.collection.MutableVector r5 = r8.f30175c
            java.lang.Object[] r5 = r5.getContent()
            r5 = r5[r0]
            androidx.compose.ui.modifier.ModifierLocal r5 = (androidx.compose.p003ui.modifier.ModifierLocal) r5
            boolean r6 = r4.isAttached()
            if (r6 == 0) goto L6d
            r8.m59519a(r4, r5, r1)
        L6d:
            int r0 = r0 + 1
            if (r0 < r3) goto L56
        L71:
            androidx.compose.runtime.collection.MutableVector r0 = r8.f30174b
            r0.clear()
            androidx.compose.runtime.collection.MutableVector r0 = r8.f30175c
            r0.clear()
            java.util.Iterator r0 = r1.iterator()
        L7f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r0.next()
            androidx.compose.ui.node.BackwardsCompatNode r1 = (androidx.compose.p003ui.node.BackwardsCompatNode) r1
            r1.updateModifierLocalConsumer()
            goto L7f
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.modifier.ModifierLocalManager.triggerUpdates():void");
    }

    public final void updatedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30174b.add(node);
        this.f30175c.add(key);
        invalidate();
    }
}
