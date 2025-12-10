package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import io.reactivex.SingleSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OnePaymentTypeListResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.GetMainPackageGroupResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SearchPackageRefNo;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SearchPackageType;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OnePaymentTypeListResponse;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetMainPackageGroupResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$callListCampaignPaymentTypeMain$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel$callListCampaignPaymentTypeMain$1 extends Lambda implements Function1<GetMainPackageGroupResponse, SingleSource<? extends OnePaymentTypeListResponse>> {
    final /* synthetic */ OneDeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleViewModel$callListCampaignPaymentTypeMain$1(OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SingleSource<? extends OnePaymentTypeListResponse> invoke(@NotNull GetMainPackageGroupResponse it) {
        OneDeviceSaleRepository oneDeviceSaleRepository;
        OneDeviceSaleRepository oneDeviceSaleRepository2;
        Intrinsics.checkNotNullParameter(it, "it");
        oneDeviceSaleRepository = this.this$0.f90680b;
        oneDeviceSaleRepository.setSearchPackageRefNo(new SearchPackageRefNo(it.getPackageGroupRefNo(), SearchPackageType.MAIN));
        oneDeviceSaleRepository2 = this.this$0.f90680b;
        return oneDeviceSaleRepository2.listCampaignPaymentTypeMain();
    }
}