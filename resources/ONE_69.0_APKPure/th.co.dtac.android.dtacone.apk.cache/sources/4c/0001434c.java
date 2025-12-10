package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$1$2$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$InputInfoScreen$1$2$1 extends Lambda implements Function1<AddressSelectType, Unit> {
    final /* synthetic */ MutableState<Boolean> $showAddressSelectSheet$delegate;
    final /* synthetic */ MutableState<AddressSelectType> $targetSheet$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputInfoScreenKt$InputInfoScreen$1$2$1(MutableState<AddressSelectType> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$targetSheet$delegate = mutableState;
        this.$showAddressSelectSheet$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSelectType addressSelectType) {
        invoke2(addressSelectType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AddressSelectType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInfoScreenKt.m9503r(this.$targetSheet$delegate, it);
        InputInfoScreenKt.m9505p(this.$showAddressSelectSheet$delegate, true);
    }
}