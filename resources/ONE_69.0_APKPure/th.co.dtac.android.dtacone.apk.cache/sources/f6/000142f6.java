package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.ComposableSingletons$InputInfoScreenKt$lambda-14$1$1$1$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$InputInfoScreenKt$lambda14$1$1$1$1 extends Lambda implements Function1<CustomerInformation, Unit> {
    final /* synthetic */ MutableState<CustomerInformation> $customerInfo$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$InputInfoScreenKt$lambda14$1$1$1$1(MutableState<CustomerInformation> mutableState) {
        super(1);
        this.$customerInfo$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CustomerInformation customerInformation) {
        invoke2(customerInformation);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull CustomerInformation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$customerInfo$delegate.setValue(it);
    }
}