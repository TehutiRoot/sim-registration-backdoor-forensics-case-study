package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ClickableSemanticsNode$applySemantics$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ ClickableSemanticsNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableSemanticsNode$applySemantics$2(ClickableSemanticsNode clickableSemanticsNode) {
        super(0);
        this.this$0 = clickableSemanticsNode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        Function0 function0;
        function0 = this.this$0.f12912s;
        if (function0 != null) {
            function0.invoke();
        }
        return Boolean.TRUE;
    }
}