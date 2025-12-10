package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneAuthorizeScabData;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTGetScabResponse;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTGetScabResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel$getSCAB$3 */
/* loaded from: classes10.dex */
public final class OneHomeViewModel$getSCAB$3 extends Lambda implements Function1<OnePrepaidRegisterTGetScabResponse, Unit> {
    final /* synthetic */ OnePrepaidAuthorizationResponse.Data $authorize;
    final /* synthetic */ OneHomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneHomeViewModel$getSCAB$3(OneHomeViewModel oneHomeViewModel, OnePrepaidAuthorizationResponse.Data data) {
        super(1);
        this.this$0 = oneHomeViewModel;
        this.$authorize = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse) {
        invoke2(onePrepaidRegisterTGetScabResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidRegisterTGetScabResponse onePrepaidRegisterTGetScabResponse) {
        MutableLiveData mutableLiveData;
        mutableLiveData = this.this$0.f91259T;
        mutableLiveData.setValue(Resource.Companion.success(new OneAuthorizeScabData(this.$authorize, onePrepaidRegisterTGetScabResponse)));
    }
}