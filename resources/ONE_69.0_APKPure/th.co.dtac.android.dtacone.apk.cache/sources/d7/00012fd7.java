package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.device_sale.GetAuthDeviceSaleResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetAuthDeviceSaleResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$getAuthorizationDeviceSale$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel$getAuthorizationDeviceSale$2 extends Lambda implements Function1<GetAuthDeviceSaleResponse, Unit> {
    final /* synthetic */ OneDeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleViewModel$getAuthorizationDeviceSale$2(OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetAuthDeviceSaleResponse getAuthDeviceSaleResponse) {
        invoke2(getAuthDeviceSaleResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetAuthDeviceSaleResponse getAuthDeviceSaleResponse) {
        OneDeviceSaleRepository oneDeviceSaleRepository;
        oneDeviceSaleRepository = this.this$0.f90680b;
        oneDeviceSaleRepository.setRequirePaymentInfo(getAuthDeviceSaleResponse.isRequirePaymentInfo());
    }
}