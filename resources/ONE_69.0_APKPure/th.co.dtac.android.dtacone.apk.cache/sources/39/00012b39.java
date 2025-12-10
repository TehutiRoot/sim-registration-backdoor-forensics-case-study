package th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataCampaign;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.OneCampaignListTrueResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/OneCampaignListTrueResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel$getTrueCampaignList$3 */
/* loaded from: classes10.dex */
public final class OneCampaignViewModel$getTrueCampaignList$3 extends Lambda implements Function1<OneCampaignListTrueResponse, Unit> {
    final /* synthetic */ OneCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCampaignViewModel$getTrueCampaignList$3(OneCampaignViewModel oneCampaignViewModel) {
        super(1);
        this.this$0 = oneCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCampaignListTrueResponse oneCampaignListTrueResponse) {
        invoke2(oneCampaignListTrueResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCampaignListTrueResponse oneCampaignListTrueResponse) {
        List<DataItem> alreadyRegister;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData mutableLiveData6;
        DataCampaign data = oneCampaignListTrueResponse.getData();
        if (data != null) {
            OneCampaignViewModel oneCampaignViewModel = this.this$0;
            List<DataItem> notRegister = data.getNotRegister();
            if ((notRegister == null || notRegister.isEmpty()) && ((alreadyRegister = data.getAlreadyRegister()) == null || alreadyRegister.isEmpty())) {
                mutableLiveData = oneCampaignViewModel.f88996j;
                mutableLiveData.setValue(Resource.Companion.success(CollectionsKt__CollectionsKt.emptyList()));
            } else {
                mutableLiveData2 = oneCampaignViewModel.f88998l;
                Resource.Companion companion = Resource.Companion;
                mutableLiveData2.setValue(Resource.Companion.error$default(companion, "", CollectionsKt__CollectionsKt.emptyList(), null, 4, null));
                List<DataItem> alreadyRegister2 = data.getAlreadyRegister();
                if (alreadyRegister2 == null || alreadyRegister2.isEmpty()) {
                    mutableLiveData3 = oneCampaignViewModel.f89004r;
                    mutableLiveData3.setValue(Resource.Companion.error$default(companion, "", CollectionsKt__CollectionsKt.emptyList(), null, 4, null));
                } else {
                    mutableLiveData6 = oneCampaignViewModel.f89004r;
                    mutableLiveData6.setValue(companion.success(data.getAlreadyRegister()));
                }
                List<DataItem> notRegister2 = data.getNotRegister();
                if (notRegister2 == null || notRegister2.isEmpty()) {
                    mutableLiveData4 = oneCampaignViewModel.f89006t;
                    mutableLiveData4.setValue(Resource.Companion.error$default(companion, "", CollectionsKt__CollectionsKt.emptyList(), null, 4, null));
                } else {
                    mutableLiveData5 = oneCampaignViewModel.f89006t;
                    mutableLiveData5.setValue(companion.success(data.getNotRegister()));
                }
            }
        }
        this.this$0.getLiveDataCampaignListState().setValue(StatusResource.DISMISS);
    }
}