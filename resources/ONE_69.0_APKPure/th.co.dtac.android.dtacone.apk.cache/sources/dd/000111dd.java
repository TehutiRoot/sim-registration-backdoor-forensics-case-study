package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResp;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneTrueRecommendPackageAdditionalResponse;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResponse;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneTrueRecommendPackageAdditionalResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$getProsermRecommendForTrue$3 */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel$getProsermRecommendForTrue$3 extends Lambda implements Function1<Pair<? extends OneStvRecommendPackageResponse, ? extends OneTrueRecommendPackageAdditionalResponse>, Unit> {
    final /* synthetic */ OneStvProsermOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvProsermOnlineViewModel$getProsermRecommendForTrue$3(OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel) {
        super(1);
        this.this$0 = oneStvProsermOnlineViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends OneStvRecommendPackageResponse, ? extends OneTrueRecommendPackageAdditionalResponse> pair) {
        invoke2((Pair<OneStvRecommendPackageResponse, OneTrueRecommendPackageAdditionalResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<OneStvRecommendPackageResponse, OneTrueRecommendPackageAdditionalResponse> pair) {
        MutableLiveData mutableLiveData;
        MutableLiveData m20167H0;
        mutableLiveData = this.this$0.f82758M;
        OneStvRecommendPackageResp recommendedPackage = pair.getFirst().getRecommendedPackage();
        mutableLiveData.setValue(recommendedPackage != null ? recommendedPackage.getIpkCode() : null);
        m20167H0 = this.this$0.m20167H0();
        m20167H0.setValue(Resource.Companion.success(new Pair(pair.getFirst(), pair.getSecond())));
        OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel = this.this$0;
        OneStvRecommendPackageResp recommendedPackage2 = pair.getFirst().getRecommendedPackage();
        oneStvProsermOnlineViewModel.callGetSTVPackagesTrueCompany(recommendedPackage2 != null ? recommendedPackage2.getSubscriberGroup() : null);
    }
}