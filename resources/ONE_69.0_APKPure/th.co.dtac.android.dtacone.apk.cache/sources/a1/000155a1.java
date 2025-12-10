package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import io.reactivex.SingleSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.device_sale.GetMainPackageGroupResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.PaymentTypeListResponse;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SearchPackageRefNo;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SearchPackageType;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lth/co/dtac/android/dtacone/model/device_sale/PaymentTypeListResponse;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetMainPackageGroupResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$callListCampaignPaymentTypeMain$1 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$callListCampaignPaymentTypeMain$1 extends Lambda implements Function1<GetMainPackageGroupResponse, SingleSource<? extends PaymentTypeListResponse>> {
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$callListCampaignPaymentTypeMain$1(DeviceSaleViewModel deviceSaleViewModel) {
        super(1);
        this.this$0 = deviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SingleSource<? extends PaymentTypeListResponse> invoke(@NotNull GetMainPackageGroupResponse it) {
        DeviceSaleRepository deviceSaleRepository;
        DeviceSaleRepository deviceSaleRepository2;
        Intrinsics.checkNotNullParameter(it, "it");
        deviceSaleRepository = this.this$0.f105560b;
        deviceSaleRepository.setSearchPackageRefNo(new SearchPackageRefNo(it.getPackageGroupRefNo(), SearchPackageType.MAIN));
        deviceSaleRepository2 = this.this$0.f105560b;
        return deviceSaleRepository2.listCampaignPaymentTypeMain();
    }
}