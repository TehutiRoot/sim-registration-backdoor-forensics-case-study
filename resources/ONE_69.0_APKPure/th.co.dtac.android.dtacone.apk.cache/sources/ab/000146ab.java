package th.p047co.dtac.android.dtacone.view.appOne.topup.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModel$checkSubscriberPrepaid$3 */
/* loaded from: classes10.dex */
public final class OneTopUpViewModel$checkSubscriberPrepaid$3 extends Lambda implements Function1<OneTopUpCheckSubscriberResponse, Unit> {
    final /* synthetic */ String $subscriberNumberEncrypted;
    final /* synthetic */ OneTopUpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopUpViewModel$checkSubscriberPrepaid$3(OneTopUpViewModel oneTopUpViewModel, String str) {
        super(1);
        this.this$0 = oneTopUpViewModel;
        this.$subscriberNumberEncrypted = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneTopUpCheckSubscriberResponse oneTopUpCheckSubscriberResponse) {
        invoke2(oneTopUpCheckSubscriberResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneTopUpCheckSubscriberResponse oneTopUpCheckSubscriberResponse) {
        MutableLiveData m9221S;
        OneTopUpCheckSubscriberDataResponse oneTopUpCheckSubscriberDataResponse = oneTopUpCheckSubscriberResponse.getOneTopUpCheckSubscriberDataResponse();
        m9221S = this.this$0.m9221S();
        m9221S.setValue(Resource.Companion.success(new Pair(this.$subscriberNumberEncrypted, oneTopUpCheckSubscriberDataResponse)));
    }
}