package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTCheckPrivilegeResponse;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$callCheckPrivilege$3 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$callCheckPrivilege$3 extends Lambda implements Function1<OnePrepaidRegisterTCheckPrivilegeResponse, Unit> {
    final /* synthetic */ Boolean $isRetry;
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$callCheckPrivilege$3(OneMnpViewModel oneMnpViewModel, Boolean bool) {
        super(1);
        this.this$0 = oneMnpViewModel;
        this.$isRetry = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse) {
        invoke2(onePrepaidRegisterTCheckPrivilegeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidRegisterTCheckPrivilegeResponse onePrepaidRegisterTCheckPrivilegeResponse) {
        MutableLiveData m13398y1;
        ConfigurationRepository configurationRepository;
        this.this$0.f92049K0 = onePrepaidRegisterTCheckPrivilegeResponse;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (Intrinsics.areEqual(this.$isRetry, Boolean.TRUE)) {
            m13398y1 = this.this$0.m13398y1();
            Resource.Companion companion = Resource.Companion;
            configurationRepository = this.this$0.f92128f;
            m13398y1.setValue(companion.success(Integer.valueOf(configurationRepository.prepaidRegistrationReferenceDocMax())));
            return;
        }
        OneMnpViewModel oneMnpViewModel = this.this$0;
        oneMnpViewModel.m13529O1(oneMnpViewModel.isSmartCard());
    }
}