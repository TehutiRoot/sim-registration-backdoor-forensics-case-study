package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import io.reactivex.SingleSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.request.OneOnlineRegisterValidateNumberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterValidateNumberResponse;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.repository.OneOnlineRegisterRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterValidateNumberResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$validateDtacNumber$1 */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel$validateDtacNumber$1 extends Lambda implements Function1<OneOnlineRegisterValidateNumberResponse, SingleSource<? extends OneOnlineRegisterValidateNumberResponse>> {
    final /* synthetic */ String $simRNumber;
    final /* synthetic */ OneOnlineRegisterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegisterViewModel$validateDtacNumber$1(OneOnlineRegisterViewModel oneOnlineRegisterViewModel, String str) {
        super(1);
        this.this$0 = oneOnlineRegisterViewModel;
        this.$simRNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SingleSource<? extends OneOnlineRegisterValidateNumberResponse> invoke(@NotNull OneOnlineRegisterValidateNumberResponse it) {
        OneOnlineRegisterRepository oneOnlineRegisterRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        oneOnlineRegisterRepository = this.this$0.f92941b;
        return oneOnlineRegisterRepository.checkSimR(new OneOnlineRegisterValidateNumberRequest(this.this$0.encryptCBC(this.$simRNumber)));
    }
}