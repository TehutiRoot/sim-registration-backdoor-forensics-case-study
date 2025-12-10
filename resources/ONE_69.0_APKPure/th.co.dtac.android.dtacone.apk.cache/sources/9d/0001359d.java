package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterCreateD1ProfileResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateD1ProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$onlineRegisterCreateD1Profile$1$1$4 */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel$onlineRegisterCreateD1Profile$1$1$4 extends Lambda implements Function1<OneOnlineRegisterCreateD1ProfileResponse, Unit> {
    final /* synthetic */ OneOnlineRegisterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegisterViewModel$onlineRegisterCreateD1Profile$1$1$4(OneOnlineRegisterViewModel oneOnlineRegisterViewModel) {
        super(1);
        this.this$0 = oneOnlineRegisterViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse) {
        invoke2(oneOnlineRegisterCreateD1ProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse) {
        MutableLiveData m12881V;
        m12881V = this.this$0.m12881V();
        m12881V.setValue(Resource.Companion.success(oneOnlineRegisterCreateD1ProfileResponse));
    }
}