package androidx.compose.p003ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1 */
/* loaded from: classes2.dex */
public final class NestedScrollNode$updateDispatcherFields$1 extends Lambda implements Function0<CoroutineScope> {
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$updateDispatcherFields$1(NestedScrollNode nestedScrollNode) {
        super(0);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CoroutineScope invoke() {
        CoroutineScope m59582a;
        m59582a = this.this$0.m59582a();
        return m59582a;
    }
}