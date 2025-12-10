package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$callAPIHardwareNumber$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$callAPIHardwareNumber$3 extends Lambda implements Function1<GetNewIMEIResponse, Unit> {
    final /* synthetic */ String $imei;
    final /* synthetic */ String $mode;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$callAPIHardwareNumber$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, String str, String str2) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$imei = str;
        this.$mode = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetNewIMEIResponse getNewIMEIResponse) {
        invoke2(getNewIMEIResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetNewIMEIResponse getNewIMEIResponse) {
        OnePostpaidRepository onePostpaidRepository;
        MutableLiveData m11625c2;
        onePostpaidRepository = this.this$0.f94609b;
        onePostpaidRepository.setHardwareNumberResponse(getNewIMEIResponse);
        m11625c2 = this.this$0.m11625c2();
        m11625c2.setValue(Resource.Companion.success(getNewIMEIResponse));
        boolean isDtacDevice = getNewIMEIResponse.isDtacDevice();
        if (isDtacDevice) {
            this.this$0.callPackages();
        } else if (isDtacDevice) {
        } else {
            if (Intrinsics.areEqual(getNewIMEIResponse.getCheckUsedStatus(), "N")) {
                this.this$0.m11664T0(this.$imei, this.$mode);
            } else {
                this.this$0.callPackages();
            }
        }
    }
}