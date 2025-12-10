package androidx.compose.p003ui.node;

import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "<init>", "()V", "", "isNotEmpty", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "onNodePositioned", "(Landroidx/compose/ui/node/LayoutNode;)V", "rootNode", "onRootNodePositioned", "dispatch", "layoutNode", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "layoutNodes", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,75:1\n1182#2:76\n1161#2,2:77\n728#3,2:79\n728#3,2:81\n492#3,11:83\n460#3,11:95\n197#4:94\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:76\n26#1:77,2\n31#1:79,2\n37#1:81,2\n44#1:83,11\n58#1:95,11\n58#1:94\n*E\n"})
/* renamed from: androidx.compose.ui.node.OnPositionedDispatcher */
/* loaded from: classes2.dex */
public final class OnPositionedDispatcher {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final MutableVector f30419a = new MutableVector(new LayoutNode[16], 0);

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28850d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion;", "", "<init>", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.OnPositionedDispatcher$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: androidx.compose.ui.node.OnPositionedDispatcher$Companion$a */
        /* loaded from: classes2.dex */
        public static final class C3524a implements Comparator {

            /* renamed from: a */
            public static final C3524a f30420a = new C3524a();

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(LayoutNode a, LayoutNode b) {
                Intrinsics.checkNotNullParameter(a, "a");
                Intrinsics.checkNotNullParameter(b, "b");
                int compare = Intrinsics.compare(b.getDepth$ui_release(), a.getDepth$ui_release());
                if (compare != 0) {
                    return compare;
                }
                return Intrinsics.compare(a.hashCode(), b.hashCode());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: a */
    public final void m59390a(LayoutNode layoutNode) {
        layoutNode.dispatchOnPositionedCallbacks$ui_release();
        int i = 0;
        layoutNode.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                m59390a(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void dispatch() {
        this.f30419a.sortWith(Companion.C3524a.f30420a);
        MutableVector mutableVector = this.f30419a;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.getNeedsOnPositionedDispatch$ui_release()) {
                    m59390a(layoutNode);
                }
                i--;
            } while (i >= 0);
            this.f30419a.clear();
        }
        this.f30419a.clear();
    }

    public final boolean isNotEmpty() {
        return this.f30419a.isNotEmpty();
    }

    public final void onNodePositioned(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f30419a.add(node);
        node.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(@NotNull LayoutNode rootNode) {
        Intrinsics.checkNotNullParameter(rootNode, "rootNode");
        this.f30419a.clear();
        this.f30419a.add(rootNode);
        rootNode.setNeedsOnPositionedDispatch$ui_release(true);
    }
}
