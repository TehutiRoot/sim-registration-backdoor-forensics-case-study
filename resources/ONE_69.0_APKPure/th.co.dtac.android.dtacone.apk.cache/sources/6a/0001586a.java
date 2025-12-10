package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpInputPinCodeFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModel$callVerifyOtp$3 */
/* loaded from: classes9.dex */
public final class MrtrMnpValidateViewModel$callVerifyOtp$3 extends Lambda implements Function1<ResponseBody, Unit> {
    final /* synthetic */ String $otpCode;
    final /* synthetic */ MrtrMnpValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpValidateViewModel$callVerifyOtp$3(MrtrMnpValidateViewModel mrtrMnpValidateViewModel, String str) {
        super(1);
        this.this$0 = mrtrMnpValidateViewModel;
        this.$otpCode = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ResponseBody responseBody) {
        invoke2(responseBody);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ResponseBody responseBody) {
        MrtrMnpRepository mrtrMnpRepository;
        MutableLiveData m2363s;
        mrtrMnpRepository = this.this$0.f106322b;
        mrtrMnpRepository.setOtpCode(this.$otpCode);
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m2363s = this.this$0.m2363s();
        m2363s.setValue(new Event(new FragmentNavEvent(MrtrMnpInputPinCodeFragment.class, null, null, 4, null)));
    }
}