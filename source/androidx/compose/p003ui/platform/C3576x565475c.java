package androidx.compose.p003ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 */
/* loaded from: classes2.dex */
public final class C3576x565475c extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref.ObjectRef<Function0<Unit>> $disposer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3576x565475c(Ref.ObjectRef<Function0<Unit>> objectRef) {
        super(0);
        this.$disposer = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$disposer.element.invoke();
    }
}
