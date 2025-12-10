package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneExtraAdvanceMasterResponse;
import th.p047co.dtac.android.dtacone.model.blacklist.ExtraAdvanceMasterInformation;
import th.p047co.dtac.android.dtacone.model.blacklist.GetExtraAdvanceMasterResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneExtraAdvanceMasterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$callAPIGetExtraAdvanceMaster$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$callAPIGetExtraAdvanceMaster$3 extends Lambda implements Function1<OneExtraAdvanceMasterResponse, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$callAPIGetExtraAdvanceMaster$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneExtraAdvanceMasterResponse oneExtraAdvanceMasterResponse) {
        invoke2(oneExtraAdvanceMasterResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneExtraAdvanceMasterResponse oneExtraAdvanceMasterResponse) {
        MutableLiveData m11605g2;
        List<ExtraAdvanceMasterInformation> listExtraAdvanceMasterInformation;
        MutableLiveData m11663T1;
        List m11674Q2;
        List<ExtraAdvanceMasterInformation> listExtraAdvanceMasterInformation2;
        MutableLiveData m11691M1;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        GetExtraAdvanceMasterResponse data = oneExtraAdvanceMasterResponse.getData();
        if (data == null || (listExtraAdvanceMasterInformation2 = data.getListExtraAdvanceMasterInformation()) == null || !listExtraAdvanceMasterInformation2.isEmpty()) {
            m11605g2 = this.this$0.m11605g2();
            m11605g2.postValue(Resource.Companion.success(null));
        } else {
            m11691M1 = this.this$0.m11691M1();
            m11691M1.postValue(Resource.Companion.success(null));
        }
        GetExtraAdvanceMasterResponse data2 = oneExtraAdvanceMasterResponse.getData();
        if (data2 == null || (listExtraAdvanceMasterInformation = data2.getListExtraAdvanceMasterInformation()) == null) {
            return;
        }
        OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.this$0;
        m11663T1 = onePostpaidRegistrationViewModel.m11663T1();
        Resource.Companion companion = Resource.Companion;
        m11674Q2 = onePostpaidRegistrationViewModel.m11674Q2(listExtraAdvanceMasterInformation);
        m11663T1.postValue(companion.success(m11674Q2));
    }
}