package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterCreateRetailerProfileResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateRetailerProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$createRetailerProfile$1$3 */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel$createRetailerProfile$1$3 extends Lambda implements Function1<OneOnlineRegisterCreateRetailerProfileResponse, Unit> {
    final /* synthetic */ OneOnlineRegisterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegisterViewModel$createRetailerProfile$1$3(OneOnlineRegisterViewModel oneOnlineRegisterViewModel) {
        super(1);
        this.this$0 = oneOnlineRegisterViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse) {
        invoke2(oneOnlineRegisterCreateRetailerProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse) {
        MutableLiveData m12887P;
        OneErrorService oneErrorService;
        MutableLiveData m12887P2;
        if (oneOnlineRegisterCreateRetailerProfileResponse.getRtrCode().length() > 0) {
            if (!Intrinsics.areEqual(oneOnlineRegisterCreateRetailerProfileResponse.getMessage(), "Success")) {
                m12887P = this.this$0.m12887P();
                m12887P.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
                oneErrorService = this.this$0.f92946g;
                oneErrorService.handleException(new Throwable(), new OneErrorService.ExceptionHandler[0]);
                return;
            }
            this.this$0.setSubmitResponse(oneOnlineRegisterCreateRetailerProfileResponse);
            m12887P2 = this.this$0.m12887P();
            m12887P2.setValue(Resource.Companion.success(oneOnlineRegisterCreateRetailerProfileResponse));
        }
    }
}