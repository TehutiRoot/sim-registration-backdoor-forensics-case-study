package th.p047co.dtac.android.dtacone.view.appOne.topup.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.util.constant.Status;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OnePrepaidStatusResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OnePrepaidStatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModel$acceptBuyDOLConsent$3 */
/* loaded from: classes10.dex */
public final class OneTopUpViewModel$acceptBuyDOLConsent$3 extends Lambda implements Function1<OnePrepaidStatusResponse, Unit> {
    final /* synthetic */ String $feature;
    final /* synthetic */ OneTopUpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopUpViewModel$acceptBuyDOLConsent$3(OneTopUpViewModel oneTopUpViewModel, String str) {
        super(1);
        this.this$0 = oneTopUpViewModel;
        this.$feature = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidStatusResponse onePrepaidStatusResponse) {
        invoke2(onePrepaidStatusResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidStatusResponse onePrepaidStatusResponse) {
        ServerErrorService serverErrorService;
        MutableLiveData m9223Q;
        if (Intrinsics.areEqual(onePrepaidStatusResponse.getStatus(), Status.getSUCCESS())) {
            m9223Q = this.this$0.m9223Q();
            m9223Q.setValue(Resource.Companion.success(this.$feature));
            return;
        }
        serverErrorService = this.this$0.f98541i;
        serverErrorService.handleException(new Throwable(), new ServerErrorService.ExceptionHandler[0]);
    }
}