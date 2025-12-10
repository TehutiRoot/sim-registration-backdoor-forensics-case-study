package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel$callRedeemNoti$1 */
/* loaded from: classes10.dex */
public final class OneHomeViewModel$callRedeemNoti$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneHomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneHomeViewModel$callRedeemNoti$1(OneHomeViewModel oneHomeViewModel) {
        super(1);
        this.this$0 = oneHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        PreferencesRepository preferencesRepository;
        PreferencesRepository preferencesRepository2;
        PreferencesRepository preferencesRepository3;
        PreferencesRepository preferencesRepository4;
        MutableLiveData m14072J;
        Intrinsics.checkNotNullParameter(it, "it");
        preferencesRepository = this.this$0.f91264e;
        preferencesRepository.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_REDEMPTION, true);
        preferencesRepository2 = this.this$0.f91264e;
        preferencesRepository2.setBoolean(Constant.CAMPAIGN_REDEMPTION, false);
        preferencesRepository3 = this.this$0.f91264e;
        preferencesRepository3.setString(Constant.NOTI_MESSAGE, "");
        preferencesRepository4 = this.this$0.f91264e;
        preferencesRepository4.setString(Constant.TEXT_BUTTON, "");
        m14072J = this.this$0.m14072J();
        m14072J.setValue(Resource.Companion.success(Boolean.FALSE));
    }
}