package th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignListResponse;
import th.p047co.dtac.android.dtacone.model.campaign.list.CampaignItem;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignListResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel$getCampaignList$3 */
/* loaded from: classes10.dex */
public final class OneCampaignViewModel$getCampaignList$3 extends Lambda implements Function1<OneCampaignListResponse, Unit> {
    final /* synthetic */ OneCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCampaignViewModel$getCampaignList$3(OneCampaignViewModel oneCampaignViewModel) {
        super(1);
        this.this$0 = oneCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCampaignListResponse oneCampaignListResponse) {
        invoke2(oneCampaignListResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCampaignListResponse oneCampaignListResponse) {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData mutableLiveData6;
        MutableLiveData mutableLiveData7;
        List<CampaignItem> data = oneCampaignListResponse.getData();
        if (data == null) {
            data = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (CampaignItem campaignItem : data) {
            if (Intrinsics.areEqual(campaignItem.isRedemption(), Boolean.TRUE)) {
                arrayList.add(campaignItem);
            } else if (AbstractC19741eO1.equals$default(campaignItem.getOptInStatus(), "1", false, 2, null)) {
                arrayList2.add(campaignItem);
            } else {
                arrayList3.add(campaignItem);
            }
        }
        if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
            mutableLiveData7 = this.this$0.f88996j;
            mutableLiveData7.setValue(Resource.Companion.success(CollectionsKt__CollectionsKt.emptyList()));
        } else {
            if (arrayList.isEmpty()) {
                mutableLiveData6 = this.this$0.f88998l;
                mutableLiveData6.setValue(Resource.Companion.error$default(Resource.Companion, "", CollectionsKt__CollectionsKt.emptyList(), null, 4, null));
            } else {
                mutableLiveData = this.this$0.f88998l;
                mutableLiveData.setValue(Resource.Companion.success(arrayList));
            }
            if (arrayList2.isEmpty()) {
                mutableLiveData5 = this.this$0.f89000n;
                mutableLiveData5.setValue(Resource.Companion.error$default(Resource.Companion, "", CollectionsKt__CollectionsKt.emptyList(), null, 4, null));
            } else {
                mutableLiveData2 = this.this$0.f89000n;
                mutableLiveData2.setValue(Resource.Companion.success(arrayList2));
            }
            if (arrayList3.isEmpty()) {
                mutableLiveData4 = this.this$0.f89002p;
                mutableLiveData4.setValue(Resource.Companion.error$default(Resource.Companion, "", CollectionsKt__CollectionsKt.emptyList(), null, 4, null));
            } else {
                mutableLiveData3 = this.this$0.f89002p;
                mutableLiveData3.setValue(Resource.Companion.success(arrayList3));
            }
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}