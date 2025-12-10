package androidx.compose.p003ui.node;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Comparator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\n2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00060\"j\b\u0012\u0004\u0012\u00020\u0006`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, m28850d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "contains", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", ProductAction.ACTION_ADD, "(Landroidx/compose/ui/node/LayoutNode;)V", ProductAction.ACTION_REMOVE, "pop", "()Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "block", "popEach", "(Lkotlin/jvm/functions/Function1;)V", "isEmpty", "()Z", "isNotEmpty", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", OperatorName.CURVE_TO, "Ljava/util/Comparator;", "DepthComparator", "Landroidx/compose/ui/node/TreeSet;", "d", "Landroidx/compose/ui/node/TreeSet;", "set", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,186:1\n100#1:187\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n91#1:187\n*E\n"})
/* renamed from: androidx.compose.ui.node.DepthSortedSet */
/* loaded from: classes2.dex */
public final class DepthSortedSet {

    /* renamed from: a */
    public final boolean f30214a;

    /* renamed from: b */
    public final Lazy f30215b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) DepthSortedSet$mapOfOriginalDepth$2.INSTANCE);

    /* renamed from: c */
    public final Comparator f30216c;

    /* renamed from: d */
    public final TreeSet f30217d;

    public DepthSortedSet(boolean z) {
        this.f30214a = z;
        Comparator<LayoutNode> comparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(@NotNull LayoutNode l1, @NotNull LayoutNode l2) {
                Intrinsics.checkNotNullParameter(l1, "l1");
                Intrinsics.checkNotNullParameter(l2, "l2");
                int compare = Intrinsics.compare(l1.getDepth$ui_release(), l2.getDepth$ui_release());
                return compare != 0 ? compare : Intrinsics.compare(l1.hashCode(), l2.hashCode());
            }
        };
        this.f30216c = comparator;
        this.f30217d = new TreeSet(comparator);
    }

    /* renamed from: a */
    public final Map m59506a() {
        return (Map) this.f30215b.getValue();
    }

    public final void add(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.isAttached()) {
            if (this.f30214a) {
                Integer num = (Integer) m59506a().get(node);
                if (num == null) {
                    m59506a().put(node, Integer.valueOf(node.getDepth$ui_release()));
                } else {
                    if (num.intValue() != node.getDepth$ui_release()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f30217d.add(node);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean contains(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        boolean contains = this.f30217d.contains(node);
        if (this.f30214a && contains != m59506a().containsKey(node)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return contains;
    }

    public final boolean isEmpty() {
        return this.f30217d.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        LayoutNode node = (LayoutNode) this.f30217d.first();
        Intrinsics.checkNotNullExpressionValue(node, "node");
        remove(node);
        return node;
    }

    public final void popEach(@NotNull Function1<? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        while (!isEmpty()) {
            block.invoke(pop());
        }
    }

    public final boolean remove(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.isAttached()) {
            boolean remove = this.f30217d.remove(node);
            if (this.f30214a) {
                Integer num = (Integer) m59506a().remove(node);
                if (remove) {
                    int depth$ui_release = node.getDepth$ui_release();
                    if (num == null || num.intValue() != depth$ui_release) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (num != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    public String toString() {
        String obj = this.f30217d.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "set.toString()");
        return obj;
    }
}
