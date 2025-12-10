package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleCampaignViewModel$validateContract$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleCampaignViewModel$validateContract$3 extends Lambda implements Function1<ResponseBody, Unit> {
    final /* synthetic */ Discount $discount;
    final /* synthetic */ DeviceSaleCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleCampaignViewModel$validateContract$3(DeviceSaleCampaignViewModel deviceSaleCampaignViewModel, Discount discount) {
        super(1);
        this.this$0 = deviceSaleCampaignViewModel;
        this.$discount = discount;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ResponseBody responseBody) {
        invoke2(responseBody);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ResponseBody responseBody) {
        DeviceSaleRepository deviceSaleRepository;
        MutableLiveData m3053B;
        deviceSaleRepository = this.this$0.f105445b;
        String blacklistSharingStatus = deviceSaleRepository.getBlacklistSharingStatus();
        if (blacklistSharingStatus != null && (Intrinsics.areEqual(blacklistSharingStatus, "01") || Intrinsics.areEqual(blacklistSharingStatus, "10"))) {
            this.this$0.m3036p(this.$discount);
            return;
        }
        this.this$0.addDiscount(this.$discount);
        m3053B = this.this$0.m3053B();
        m3053B.postValue(Resource.Companion.success(""));
    }
}