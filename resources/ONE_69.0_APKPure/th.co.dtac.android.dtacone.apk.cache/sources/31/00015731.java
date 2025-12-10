package th.p047co.dtac.android.dtacone.viewmodel.home;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolConsent;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneConsentContentResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneConsentResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "consentList", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneConsentResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.GetProfileImageViewModel$getBuyDOLConsentByFeatureName$3 */
/* loaded from: classes9.dex */
public final class GetProfileImageViewModel$getBuyDOLConsentByFeatureName$3 extends Lambda implements Function1<OneConsentResponse, Unit> {
    final /* synthetic */ String $featureCode;
    final /* synthetic */ GetProfileImageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileImageViewModel$getBuyDOLConsentByFeatureName$3(String str, GetProfileImageViewModel getProfileImageViewModel) {
        super(1);
        this.$featureCode = str;
        this.this$0 = getProfileImageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneConsentResponse oneConsentResponse) {
        invoke2(oneConsentResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneConsentResponse oneConsentResponse) {
        MutableLiveData m2605y;
        List<OneConsentContentResponse> consent;
        List<OneConsentContentResponse> consent2 = oneConsentResponse.getConsent();
        OneConsentContentResponse oneConsentContentResponse = ((consent2 != null ? consent2.size() : 0) <= 0 || (consent = oneConsentResponse.getConsent()) == null) ? null : consent.get(0);
        Pair pair = new Pair(new BuyDolConsent(oneConsentContentResponse != null ? oneConsentContentResponse.getMrtrConsentId() : null, oneConsentContentResponse != null ? oneConsentContentResponse.getConsent() : null), this.$featureCode);
        m2605y = this.this$0.m2605y();
        m2605y.setValue(Resource.Companion.success(pair));
    }
}