package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.productType;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.productType.ComposableSingletons$SelectProductTypeScreenKt$lambda-1$1$2$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$SelectProductTypeScreenKt$lambda1$1$2$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MutableState<Boolean> $isFixedLinePlus$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$SelectProductTypeScreenKt$lambda1$1$2$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$isFixedLinePlus$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ComposableSingletons$SelectProductTypeScreenKt$lambda1$1.invoke$lambda$5(this.$isFixedLinePlus$delegate, z);
    }
}