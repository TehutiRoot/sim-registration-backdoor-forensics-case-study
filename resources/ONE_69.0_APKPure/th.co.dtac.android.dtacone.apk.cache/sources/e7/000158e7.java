package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.blacklist.GetBlacklistSharingConsentTemplateResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/blacklist/GetBlacklistSharingConsentTemplateResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$callAPIGetBlacklistSharingConsentTemplate$3 */
/* loaded from: classes9.dex */
public final class C16614x10f2f522 extends Lambda implements Function1<GetBlacklistSharingConsentTemplateResponse, Unit> {
    final /* synthetic */ MrtrPostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16614x10f2f522(MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = mrtrPostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetBlacklistSharingConsentTemplateResponse getBlacklistSharingConsentTemplateResponse) {
        invoke2(getBlacklistSharingConsentTemplateResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetBlacklistSharingConsentTemplateResponse getBlacklistSharingConsentTemplateResponse) {
        MutableLiveData m2286Y;
        MutableLiveData m2291T;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m2286Y = this.this$0.m2286Y();
        Resource.Companion companion = Resource.Companion;
        m2286Y.setValue(companion.success(null));
        m2291T = this.this$0.m2291T();
        m2291T.setValue(companion.success(getBlacklistSharingConsentTemplateResponse.getBlacklistSharingConsentImage()));
    }
}