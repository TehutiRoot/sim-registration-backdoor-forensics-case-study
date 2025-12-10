package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.blacklist.GetExtraAdvanceMasterResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/blacklist/GetExtraAdvanceMasterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$callAPIGetExtraAdvanceMaster$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$callAPIGetExtraAdvanceMaster$3 extends Lambda implements Function1<GetExtraAdvanceMasterResponse, Unit> {
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$callAPIGetExtraAdvanceMaster$3(DeviceSaleViewModel deviceSaleViewModel) {
        super(1);
        this.this$0 = deviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetExtraAdvanceMasterResponse getExtraAdvanceMasterResponse) {
        invoke2(getExtraAdvanceMasterResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetExtraAdvanceMasterResponse getExtraAdvanceMasterResponse) {
        MutableLiveData m3008E0;
        MutableLiveData m2902y0;
        List m2922o1;
        MutableLiveData m2932l0;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (getExtraAdvanceMasterResponse.getListExtraAdvanceMasterInformation().isEmpty()) {
            m2932l0 = this.this$0.m2932l0();
            m2932l0.postValue(Resource.Companion.success(null));
        } else {
            m3008E0 = this.this$0.m3008E0();
            m3008E0.postValue(Resource.Companion.success(null));
        }
        m2902y0 = this.this$0.m2902y0();
        Resource.Companion companion = Resource.Companion;
        m2922o1 = this.this$0.m2922o1(getExtraAdvanceMasterResponse.getListExtraAdvanceMasterInformation());
        m2902y0.postValue(companion.success(m2922o1));
    }
}