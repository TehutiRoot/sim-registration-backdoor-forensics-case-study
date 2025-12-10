package androidx.compose.p003ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/node/ComposeUiNode;", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1 */
/* loaded from: classes2.dex */
public final class ComposeUiNode$Companion$SetCompositeKeyHash$1 extends Lambda implements Function2<ComposeUiNode, Integer, Unit> {
    public static final ComposeUiNode$Companion$SetCompositeKeyHash$1 INSTANCE = new ComposeUiNode$Companion$SetCompositeKeyHash$1();

    public ComposeUiNode$Companion$SetCompositeKeyHash$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Integer num) {
        invoke(composeUiNode, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull ComposeUiNode composeUiNode, int i) {
        Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
        composeUiNode.setCompositeKeyHash(i);
    }
}
