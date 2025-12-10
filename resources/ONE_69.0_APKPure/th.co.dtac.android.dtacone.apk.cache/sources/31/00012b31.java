package th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model;

import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem;
import th.p047co.dtac.android.dtacone.model.campaign.image.Data;
import th.p047co.dtac.android.dtacone.model.campaign.image.OneTrueCampaignImageResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/campaign/image/OneTrueCampaignImageResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel$getTrueCampaignImageForList$2 */
/* loaded from: classes10.dex */
public final class OneCampaignViewModel$getTrueCampaignImageForList$2 extends Lambda implements Function1<OneTrueCampaignImageResponse, Unit> {
    final /* synthetic */ DataItem $campaign;
    final /* synthetic */ ImageView $view;
    final /* synthetic */ OneCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCampaignViewModel$getTrueCampaignImageForList$2(DataItem dataItem, OneCampaignViewModel oneCampaignViewModel, ImageView imageView) {
        super(1);
        this.$campaign = dataItem;
        this.this$0 = oneCampaignViewModel;
        this.$view = imageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneTrueCampaignImageResponse oneTrueCampaignImageResponse) {
        invoke2(oneTrueCampaignImageResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneTrueCampaignImageResponse oneTrueCampaignImageResponse) {
        MutableLiveData mutableLiveData;
        DataItem dataItem = this.$campaign;
        Data data = oneTrueCampaignImageResponse.getData();
        dataItem.setBase64Image(data != null ? data.getCpPhotoBase64() : null);
        mutableLiveData = this.this$0.f88986R;
        Resource.Companion companion = Resource.Companion;
        Data data2 = oneTrueCampaignImageResponse.getData();
        mutableLiveData.setValue(companion.success(new Pair((data2 == null || (r5 = data2.getCpPhotoBase64()) == null) ? "" : "", this.$view)));
    }
}