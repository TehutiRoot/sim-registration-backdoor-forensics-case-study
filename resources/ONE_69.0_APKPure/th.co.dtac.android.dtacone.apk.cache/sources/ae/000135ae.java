package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterValidateNumberResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterValidateNumberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$validateDtacNumber$4 */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel$validateDtacNumber$4 extends Lambda implements Function1<OneOnlineRegisterValidateNumberResponse, Unit> {
    final /* synthetic */ boolean $isValidateAll;
    final /* synthetic */ OneOnlineRegisterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegisterViewModel$validateDtacNumber$4(OneOnlineRegisterViewModel oneOnlineRegisterViewModel, boolean z) {
        super(1);
        this.this$0 = oneOnlineRegisterViewModel;
        this.$isValidateAll = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneOnlineRegisterValidateNumberResponse oneOnlineRegisterValidateNumberResponse) {
        invoke2(oneOnlineRegisterValidateNumberResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneOnlineRegisterValidateNumberResponse oneOnlineRegisterValidateNumberResponse) {
        MutableLiveData m12874b0;
        m12874b0 = this.this$0.m12874b0();
        m12874b0.setValue(Resource.Companion.success(new Pair(StatusResource.SUCCESS, Boolean.valueOf(this.$isValidateAll))));
    }
}