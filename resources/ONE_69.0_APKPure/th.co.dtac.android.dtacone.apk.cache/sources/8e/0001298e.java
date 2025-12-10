package th.p047co.dtac.android.dtacone.view.appOne.activateSim.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.request.OneCheckActivateSimRequest;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.response.OneActivateSimScanResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimScanResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.viewModel.OneActivateSimViewModel$checkActivateSim$3 */
/* loaded from: classes10.dex */
public final class OneActivateSimViewModel$checkActivateSim$3 extends Lambda implements Function1<OneActivateSimScanResponse, Unit> {
    final /* synthetic */ OneActivateSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneActivateSimViewModel$checkActivateSim$3(OneActivateSimViewModel oneActivateSimViewModel) {
        super(1);
        this.this$0 = oneActivateSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneActivateSimScanResponse oneActivateSimScanResponse) {
        invoke2(oneActivateSimScanResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneActivateSimScanResponse oneActivateSimScanResponse) {
        MutableLiveData m16114l;
        MutableLiveData m16112n;
        ConfigurationRepository configurationRepository;
        OneCheckActivateSimRequest data;
        String simCardNumber;
        ConfigurationRepository configurationRepository2;
        OneCheckActivateSimRequest data2;
        OneActivateSimViewModel oneActivateSimViewModel = this.this$0;
        OneCheckActivateSimRequest data3 = oneActivateSimScanResponse != null ? oneActivateSimScanResponse.getData() : null;
        String str = "";
        if (data3 != null) {
            String str2 = (oneActivateSimScanResponse == null || (data2 = oneActivateSimScanResponse.getData()) == null || (str2 = data2.getSubscriberNumberShow()) == null) ? "" : "";
            configurationRepository2 = oneActivateSimViewModel.f88241f;
            data3.setSubscriberNumberShow(AESCryptUtil.decryptCBC(str2, configurationRepository2.dataPrivacyEncryptionAES256CBCKey()));
        }
        OneCheckActivateSimRequest data4 = oneActivateSimScanResponse != null ? oneActivateSimScanResponse.getData() : null;
        if (data4 != null) {
            if (oneActivateSimScanResponse != null && (data = oneActivateSimScanResponse.getData()) != null && (simCardNumber = data.getSimCardNumber()) != null) {
                str = simCardNumber;
            }
            configurationRepository = oneActivateSimViewModel.f88241f;
            data4.setSimCardNumber(AESCryptUtil.decryptCBC(str, configurationRepository.dataPrivacyEncryptionAES256CBCKey()));
        }
        m16114l = this.this$0.m16114l();
        Resource.Companion companion = Resource.Companion;
        m16114l.setValue(companion.success(oneActivateSimScanResponse));
        m16112n = this.this$0.m16112n();
        m16112n.setValue(Resource.Companion.error$default(companion, "", null, null, 4, null));
    }
}