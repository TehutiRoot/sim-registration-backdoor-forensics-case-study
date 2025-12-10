package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationCheckRSEResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit.MrtrOnlineRegisterCreateRetailerProfile;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationCheckRSEResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$checkRSE$3 */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel$checkRSE$3 extends Lambda implements Function1<OneOnlineRegistrationCheckRSEResponse, Unit> {
    final /* synthetic */ String $saleCode;
    final /* synthetic */ OneOnlineRegisterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegisterViewModel$checkRSE$3(OneOnlineRegisterViewModel oneOnlineRegisterViewModel, String str) {
        super(1);
        this.this$0 = oneOnlineRegisterViewModel;
        this.$saleCode = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse) {
        invoke2(oneOnlineRegistrationCheckRSEResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse) {
        MutableLiveData m12889N;
        this.this$0.m12858j0(oneOnlineRegistrationCheckRSEResponse);
        MrtrOnlineRegisterCreateRetailerProfile submitCollection = this.this$0.getSubmitCollection();
        if (submitCollection != null) {
            String str = this.$saleCode;
            submitCollection.setParentPartnerId(Integer.valueOf(Integer.parseInt(oneOnlineRegistrationCheckRSEResponse.getDtrID())));
            submitCollection.setSalesCode(str);
        }
        m12889N = this.this$0.m12889N();
        m12889N.setValue(Resource.Companion.success(oneOnlineRegistrationCheckRSEResponse));
    }
}