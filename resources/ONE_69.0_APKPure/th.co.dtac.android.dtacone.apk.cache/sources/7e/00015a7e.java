package th.p047co.dtac.android.dtacone.viewmodel.news;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignMissionListResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignMissionListResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.news.DynamicCampaignViewModel$getOneMissionList$3 */
/* loaded from: classes9.dex */
public final class DynamicCampaignViewModel$getOneMissionList$3 extends Lambda implements Function1<OneCampaignMissionListResponse, Unit> {
    final /* synthetic */ String $option;
    final /* synthetic */ DynamicCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicCampaignViewModel$getOneMissionList$3(String str, DynamicCampaignViewModel dynamicCampaignViewModel) {
        super(1);
        this.$option = str;
        this.this$0 = dynamicCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCampaignMissionListResponse oneCampaignMissionListResponse) {
        invoke2(oneCampaignMissionListResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCampaignMissionListResponse oneCampaignMissionListResponse) {
        MutableLiveData m1953g;
        MutableLiveData m1954f;
        if (!Intrinsics.areEqual(this.$option, Constant.MissionOption.trophy)) {
            m1953g = this.this$0.m1953g();
            m1953g.postValue(Resource.Companion.success(oneCampaignMissionListResponse.getData()));
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m1954f = this.this$0.m1954f();
        m1954f.postValue(Resource.Companion.success(oneCampaignMissionListResponse.getData()));
    }
}