package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.blacklist.CheckBlacklistSharingResponse;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/blacklist/CheckBlacklistSharingResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$callAPICheckBlacklistSharing$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$callAPICheckBlacklistSharing$3 extends Lambda implements Function1<CheckBlacklistSharingResponse, Unit> {
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$callAPICheckBlacklistSharing$3(DeviceSaleViewModel deviceSaleViewModel) {
        super(1);
        this.this$0 = deviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckBlacklistSharingResponse checkBlacklistSharingResponse) {
        invoke2(checkBlacklistSharingResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CheckBlacklistSharingResponse checkBlacklistSharingResponse) {
        DeviceSaleRepository deviceSaleRepository;
        MutableLiveData m2932l0;
        deviceSaleRepository = this.this$0.f105560b;
        deviceSaleRepository.setBlacklistSharingStatus(checkBlacklistSharingResponse.getResult());
        if (!Intrinsics.areEqual(checkBlacklistSharingResponse.getResult(), "00")) {
            this.this$0.m2997K();
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m2932l0 = this.this$0.m2932l0();
        m2932l0.postValue(Resource.Companion.success(null));
    }
}