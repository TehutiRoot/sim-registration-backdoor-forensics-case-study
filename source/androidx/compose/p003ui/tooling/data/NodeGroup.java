package androidx.compose.p003ui.tooling.data;

import androidx.compose.p003ui.layout.ModifierInfo;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m28850d2 = {"Landroidx/compose/ui/tooling/data/NodeGroup;", "Landroidx/compose/ui/tooling/data/Group;", "", Action.KEY_ATTRIBUTE, "node", "Landroidx/compose/ui/unit/IntRect;", "box", "", "data", "", "Landroidx/compose/ui/layout/ModifierInfo;", "modifierInfo", "children", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/unit/IntRect;Ljava/util/Collection;Ljava/util/List;Ljava/util/Collection;)V", "i", "Ljava/lang/Object;", "getNode", "()Ljava/lang/Object;", OperatorName.SET_LINE_JOINSTYLE, "Ljava/util/List;", "getModifierInfo", "()Ljava/util/List;", "ui-tooling-data_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.data.NodeGroup */
/* loaded from: classes2.dex */
public final class NodeGroup extends Group {
    public static final int $stable = 8;

    /* renamed from: i */
    public final Object f31719i;

    /* renamed from: j */
    public final List f31720j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeGroup(@Nullable Object obj, @NotNull Object node, @NotNull IntRect box, @NotNull Collection<? extends Object> data, @NotNull List<ModifierInfo> modifierInfo, @NotNull Collection<? extends Group> children) {
        super(obj, null, null, null, box, data, children, false, null);
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(box, "box");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(modifierInfo, "modifierInfo");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f31719i = node;
        this.f31720j = modifierInfo;
    }

    @Override // androidx.compose.p003ui.tooling.data.Group
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        return this.f31720j;
    }

    @NotNull
    public final Object getNode() {
        return this.f31719i;
    }
}
