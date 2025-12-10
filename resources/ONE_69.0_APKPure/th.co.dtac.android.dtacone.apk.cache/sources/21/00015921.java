package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.response.CheckSimStockResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.scan.MrtrPostpaidScanIMEIFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidateBarcodeViewModel$checkSimStock$3 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidValidateBarcodeViewModel$checkSimStock$3 extends Lambda implements Function1<CheckSimStockResponse, Unit> {
    final /* synthetic */ MrtrPostpaidValidateBarcodeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidValidateBarcodeViewModel$checkSimStock$3(MrtrPostpaidValidateBarcodeViewModel mrtrPostpaidValidateBarcodeViewModel) {
        super(1);
        this.this$0 = mrtrPostpaidValidateBarcodeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckSimStockResponse checkSimStockResponse) {
        invoke2(checkSimStockResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CheckSimStockResponse checkSimStockResponse) {
        MrtrPostpaidRepository mrtrPostpaidRepository;
        MutableLiveData m2232f;
        MrtrPostpaidRepository mrtrPostpaidRepository2;
        MutableLiveData m2233e;
        mrtrPostpaidRepository = this.this$0.f106519b;
        mrtrPostpaidRepository.setCheckSimStockResponse(checkSimStockResponse);
        boolean isWithDevice = this.this$0.isWithDevice();
        if (isWithDevice) {
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            m2233e = this.this$0.m2233e();
            m2233e.setValue(new Event(new FragmentNavEvent(MrtrPostpaidScanIMEIFragment.class, null, null, 4, null)));
        } else if (isWithDevice) {
        } else {
            m2232f = this.this$0.m2232f();
            Resource.Companion companion = Resource.Companion;
            mrtrPostpaidRepository2 = this.this$0.f106519b;
            m2232f.postValue(companion.success(mrtrPostpaidRepository2.getValidateSimBarcodeResponse()));
        }
    }
}