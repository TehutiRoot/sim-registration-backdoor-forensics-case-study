package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePermissionActivationResponse;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePermissionActivationResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$getPermissionList$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$getPermissionList$3 extends Lambda implements Function1<OnePermissionActivationResponse, Unit> {
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$getPermissionList$3(OnePrepaidViewModel onePrepaidViewModel) {
        super(1);
        this.this$0 = onePrepaidViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePermissionActivationResponse onePermissionActivationResponse) {
        invoke2(onePermissionActivationResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePermissionActivationResponse onePermissionActivationResponse) {
        OnePrepaidRepository onePrepaidRepository;
        onePrepaidRepository = this.this$0.f95986b;
        OnePermissionActivationResponse.Data data = onePermissionActivationResponse.getData();
        onePrepaidRepository.setPermissions(data != null ? data.getPermissions() : null);
        this.this$0.navigateToSuccessPage();
    }
}