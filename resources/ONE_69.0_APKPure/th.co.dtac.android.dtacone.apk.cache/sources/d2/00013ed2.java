package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.consent.ConsentResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/consent/ConsentResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneRetailerProfileUpdateViewModel$getRetailerProfileConsent$3 */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateViewModel$getRetailerProfileConsent$3 extends Lambda implements Function1<ConsentResponse, Unit> {
    final /* synthetic */ int $requestId;
    final /* synthetic */ OneRetailerProfileUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRetailerProfileUpdateViewModel$getRetailerProfileConsent$3(int i, OneRetailerProfileUpdateViewModel oneRetailerProfileUpdateViewModel) {
        super(1);
        this.$requestId = i;
        this.this$0 = oneRetailerProfileUpdateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentResponse consentResponse) {
        invoke2(consentResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConsentResponse consentResponse) {
        MutableLiveData m10062p;
        Pair pair = new Pair(Integer.valueOf(this.$requestId), consentResponse);
        m10062p = this.this$0.m10062p();
        m10062p.setValue(Resource.Companion.success(pair));
    }
}