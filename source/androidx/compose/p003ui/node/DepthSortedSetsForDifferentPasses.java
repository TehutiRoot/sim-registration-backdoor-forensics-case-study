package androidx.compose.p003ui.node;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0016\u001a\u00020\f28\b\u0004\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, m28850d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "affectsLookahead", "contains", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", ProductAction.ACTION_ADD, "(Landroidx/compose/ui/node/LayoutNode;Z)V", ProductAction.ACTION_REMOVE, "pop", "()Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "block", "popEach", "(Lkotlin/jvm/functions/Function2;)V", "isEmpty", "()Z", "isNotEmpty", "Landroidx/compose/ui/node/DepthSortedSet;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/node/DepthSortedSet;", "lookaheadSet", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "set", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,186:1\n100#2:187\n100#2:188\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n164#1:187\n176#1:188\n*E\n"})
/* renamed from: androidx.compose.ui.node.DepthSortedSetsForDifferentPasses */
/* loaded from: classes2.dex */
public final class DepthSortedSetsForDifferentPasses {

    /* renamed from: a */
    public final DepthSortedSet f30218a;

    /* renamed from: b */
    public final DepthSortedSet f30219b;

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.f30218a = new DepthSortedSet(z);
        this.f30219b = new DepthSortedSet(z);
    }

    public final void add(@NotNull LayoutNode node, boolean z) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (z) {
            this.f30218a.add(node);
        } else if (!this.f30218a.contains(node)) {
            this.f30219b.add(node);
        }
    }

    public final boolean contains(@NotNull LayoutNode node, boolean z) {
        Intrinsics.checkNotNullParameter(node, "node");
        boolean contains = this.f30218a.contains(node);
        return z ? contains : contains || this.f30219b.contains(node);
    }

    public final boolean isEmpty() {
        if (this.f30219b.isEmpty() && this.f30218a.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        if (!this.f30218a.isEmpty()) {
            return this.f30218a.pop();
        }
        return this.f30219b.pop();
    }

    public final void popEach(@NotNull Function2<? super LayoutNode, ? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        while (isNotEmpty()) {
            boolean z = !this.f30218a.isEmpty();
            block.invoke((z ? this.f30218a : this.f30219b).pop(), Boolean.valueOf(z));
        }
    }

    public final boolean remove(@NotNull LayoutNode node, boolean z) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (z) {
            return this.f30218a.remove(node);
        }
        return this.f30219b.remove(node);
    }

    public final boolean contains(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        return this.f30218a.contains(node) || this.f30219b.contains(node);
    }

    public final boolean remove(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        return this.f30219b.remove(node) || this.f30218a.remove(node);
    }
}
