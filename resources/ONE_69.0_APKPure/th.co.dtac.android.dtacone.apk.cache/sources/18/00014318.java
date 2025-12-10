package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInfoAddressType;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSection$1$1$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$AddressSection$1$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ CustomerInfoAddressType $addressType;
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ Function1<CustomerInformation, Unit> $onCustomerInfoChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$AddressSection$1$1$1(Function1<? super CustomerInformation, Unit> function1, CustomerInformation customerInformation, CustomerInfoAddressType customerInfoAddressType) {
        super(1);
        this.$onCustomerInfoChange = function1;
        this.$customerInfo = customerInformation;
        this.$addressType = customerInfoAddressType;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        CustomerInformation copy;
        Function1<CustomerInformation, Unit> function1 = this.$onCustomerInfoChange;
        copy = r0.copy((r24 & 1) != 0 ? r0.f97990a : null, (r24 & 2) != 0 ? r0.f97991b : null, (r24 & 4) != 0 ? r0.f97992c : null, (r24 & 8) != 0 ? r0.f97993d : null, (r24 & 16) != 0 ? r0.f97994e : this.$addressType, (r24 & 32) != 0 ? r0.f97995f : null, (r24 & 64) != 0 ? r0.f97996g : null, (r24 & 128) != 0 ? r0.f97997h : null, (r24 & 256) != 0 ? r0.f97998i : null, (r24 & 512) != 0 ? r0.f97999j : null, (r24 & 1024) != 0 ? this.$customerInfo.f98000k : null);
        function1.invoke(copy);
    }
}