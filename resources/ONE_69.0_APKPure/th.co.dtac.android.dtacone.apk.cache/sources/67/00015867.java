package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.otp.MnpRequestOtpResponse;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpVerifyOTPFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModel$callRequestOtp$3 */
/* loaded from: classes9.dex */
public final class MrtrMnpValidateViewModel$callRequestOtp$3 extends Lambda implements Function1<MnpRequestOtpResponse, Unit> {
    final /* synthetic */ MrtrMnpValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpValidateViewModel$callRequestOtp$3(MrtrMnpValidateViewModel mrtrMnpValidateViewModel) {
        super(1);
        this.this$0 = mrtrMnpValidateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MnpRequestOtpResponse mnpRequestOtpResponse) {
        invoke2(mnpRequestOtpResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MnpRequestOtpResponse mnpRequestOtpResponse) {
        MutableLiveData m2363s;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        this.this$0.setRequestOtpResponse(mnpRequestOtpResponse);
        m2363s = this.this$0.m2363s();
        m2363s.setValue(new Event(new FragmentNavEvent(MrtrMnpVerifyOTPFragment.class, null, null, 4, null)));
    }
}