package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.check_sim_info.response.MnpCheckSimInfoResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/check_sim_info/response/MnpCheckSimInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModel$checkSimInfo$1$3 */
/* loaded from: classes9.dex */
public final class MrtrMnpValidateViewModel$checkSimInfo$1$3 extends Lambda implements Function1<MnpCheckSimInfoResponse, Unit> {
    final /* synthetic */ String $simCardNumber;
    final /* synthetic */ MrtrMnpValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpValidateViewModel$checkSimInfo$1$3(MrtrMnpValidateViewModel mrtrMnpValidateViewModel, String str) {
        super(1);
        this.this$0 = mrtrMnpValidateViewModel;
        this.$simCardNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MnpCheckSimInfoResponse mnpCheckSimInfoResponse) {
        invoke2(mnpCheckSimInfoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MnpCheckSimInfoResponse mnpCheckSimInfoResponse) {
        MrtrMnpRepository mrtrMnpRepository;
        MrtrMnpRepository mrtrMnpRepository2;
        MutableLiveData mutableLiveData;
        mrtrMnpRepository = this.this$0.f106322b;
        mrtrMnpRepository.setCheckSimInfoResponse(mnpCheckSimInfoResponse);
        mrtrMnpRepository2 = this.this$0.f106322b;
        if (mrtrMnpRepository2.isCheckSimStock()) {
            this.this$0.checkSimStock(this.$simCardNumber);
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mutableLiveData = this.this$0.f106331k;
        mutableLiveData.setValue(Resource.Companion.success(mnpCheckSimInfoResponse));
    }
}