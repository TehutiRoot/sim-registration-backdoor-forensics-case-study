package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.GetAuthorizationByRtrPostpaidResponse;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/GetAuthorizationByRtrPostpaidResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$getAuthorizationByRTR$3 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModel$getAuthorizationByRTR$3 extends Lambda implements Function1<GetAuthorizationByRtrPostpaidResponse, Unit> {
    final /* synthetic */ String $featureCode;
    final /* synthetic */ MrtrPostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidRegistrationViewModel$getAuthorizationByRTR$3(MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel, String str) {
        super(1);
        this.this$0 = mrtrPostpaidRegistrationViewModel;
        this.$featureCode = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetAuthorizationByRtrPostpaidResponse getAuthorizationByRtrPostpaidResponse) {
        invoke2(getAuthorizationByRtrPostpaidResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetAuthorizationByRtrPostpaidResponse getAuthorizationByRtrPostpaidResponse) {
        MutableLiveData m2276e0;
        MutableLiveData m2292S;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        if (Intrinsics.areEqual(this.$featureCode, PermissionConstant.M_REGS_POST)) {
            m2292S = this.this$0.m2292S();
            m2292S.postValue(Resource.Companion.success(getAuthorizationByRtrPostpaidResponse));
            return;
        }
        m2276e0 = this.this$0.m2276e0();
        m2276e0.postValue(Resource.Companion.success(getAuthorizationByRtrPostpaidResponse));
    }
}