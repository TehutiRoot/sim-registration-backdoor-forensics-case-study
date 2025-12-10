package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidRegisterType;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OnePrepaidStatusResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OnePrepaidStatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$acceptConsent$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$acceptConsent$2 extends Lambda implements Function1<OnePrepaidStatusResponse, Unit> {
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$acceptConsent$2(OnePrepaidViewModel onePrepaidViewModel) {
        super(1);
        this.this$0 = onePrepaidViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidStatusResponse onePrepaidStatusResponse) {
        invoke2(onePrepaidStatusResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidStatusResponse onePrepaidStatusResponse) {
        if (Intrinsics.areEqual(this.this$0.getRegisterType(), PrepaidRegisterType.REGISTER_ONLY)) {
            this.this$0.submitPrepaid(PrepaidRegisterType.REGISTER_ONLY, null);
        } else if (Intrinsics.areEqual(this.this$0.getRegisterType(), PrepaidRegisterType.REGISTER_ACTIVATION) && (this.this$0.isBelow10Age() || this.this$0.isNotFoundBirthDate())) {
            this.this$0.submitPrepaid(PrepaidRegisterType.REGISTER_ACTIVATION, null);
        } else {
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            this.this$0.navigateToNonTelcoPage();
        }
    }
}