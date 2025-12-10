package th.p047co.dtac.android.dtacone.view.fragment.device_sale;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleSummaryFragment$onViewCreated$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleSummaryFragment$onViewCreated$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ DeviceSaleSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleSummaryFragment$onViewCreated$3(DeviceSaleSummaryFragment deviceSaleSummaryFragment) {
        super(0);
        this.this$0 = deviceSaleSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DeviceSaleViewModel deviceSaleViewModel;
        boolean m8048t;
        deviceSaleViewModel = this.this$0.f100027i;
        if (deviceSaleViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceSaleViewModel");
            deviceSaleViewModel = null;
        }
        m8048t = this.this$0.m8048t();
        deviceSaleViewModel.onSubmitDeviceSale(m8048t);
    }
}