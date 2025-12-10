package th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneDirectAccountListModel;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00030\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel$_gotoVerifyOTPLiveData$2 */
/* loaded from: classes10.dex */
public final class OneBuyDolViewModel$_gotoVerifyOTPLiveData$2 extends Lambda implements Function0<MutableLiveData<Resource<? extends Pair<? extends Boolean, ? extends Pair<? extends RequestOtpResponse, ? extends OneDirectAccountListModel>>>>> {
    public static final OneBuyDolViewModel$_gotoVerifyOTPLiveData$2 INSTANCE = new OneBuyDolViewModel$_gotoVerifyOTPLiveData$2();

    public OneBuyDolViewModel$_gotoVerifyOTPLiveData$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final MutableLiveData<Resource<? extends Pair<? extends Boolean, ? extends Pair<? extends RequestOtpResponse, ? extends OneDirectAccountListModel>>>> invoke2() {
        return new MutableLiveData<>();
    }
}