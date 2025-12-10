package androidx.compose.p003ui.node;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/node/LayoutNode;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1 */
/* loaded from: classes2.dex */
public final class LayoutNode$Companion$Constructor$1 extends Lambda implements Function0<LayoutNode> {
    public static final LayoutNode$Companion$Constructor$1 INSTANCE = new LayoutNode$Companion$Constructor$1();

    public LayoutNode$Companion$Constructor$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LayoutNode invoke() {
        return new LayoutNode(false, 0, 3, null);
    }
}