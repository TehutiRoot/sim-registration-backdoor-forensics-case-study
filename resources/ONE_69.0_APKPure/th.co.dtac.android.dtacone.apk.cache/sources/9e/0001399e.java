package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidScanIMEIFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidateBarcodeViewModel$validateSimBarcode$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidValidateBarcodeViewModel$validateSimBarcode$3 extends Lambda implements Function1<OnePostpaidValidateSimBarcodeResponse, Unit> {
    final /* synthetic */ String $barcode;
    final /* synthetic */ OnePostpaidValidateBarcodeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidValidateBarcodeViewModel$validateSimBarcode$3(OnePostpaidValidateBarcodeViewModel onePostpaidValidateBarcodeViewModel, String str) {
        super(1);
        this.this$0 = onePostpaidValidateBarcodeViewModel;
        this.$barcode = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse) {
        invoke2(onePostpaidValidateSimBarcodeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse) {
        MutableLiveData m11513g;
        MutableLiveData m11516d;
        this.this$0.setSimBarcode(this.$barcode);
        this.this$0.setValidateSimBarcodeResponse(onePostpaidValidateSimBarcodeResponse);
        boolean isWithDevice = this.this$0.isWithDevice();
        if (isWithDevice) {
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            m11516d = this.this$0.m11516d();
            m11516d.setValue(new Event(new FragmentNavEvent(OnePostpaidScanIMEIFragment.class, null, null, 4, null)));
        } else if (isWithDevice) {
        } else {
            m11513g = this.this$0.m11513g();
            m11513g.postValue(Resource.Companion.success(onePostpaidValidateSimBarcodeResponse));
        }
    }
}