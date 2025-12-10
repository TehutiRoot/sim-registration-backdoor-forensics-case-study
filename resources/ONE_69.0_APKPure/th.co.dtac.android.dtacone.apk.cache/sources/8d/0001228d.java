package th.p047co.dtac.android.dtacone.presenter.campaign.list;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.campaign.list.CampaignItem;
import th.p047co.dtac.android.dtacone.presenter.campaign.list.CampaignListPresenter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/model/campaign/list/CampaignItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.list.CampaignListPresenter$getMyCampaignList$2 */
/* loaded from: classes8.dex */
public final class CampaignListPresenter$getMyCampaignList$2 extends Lambda implements Function1<List<? extends CampaignItem>, Unit> {
    final /* synthetic */ CampaignListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignListPresenter$getMyCampaignList$2(CampaignListPresenter campaignListPresenter) {
        super(1);
        this.this$0 = campaignListPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends CampaignItem> list) {
        invoke2((List<CampaignItem>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<CampaignItem> list) {
        CampaignListPresenter.View view;
        CampaignListPresenter.View view2;
        CampaignListPresenter.View view3;
        CampaignListPresenter.View view4;
        CampaignListPresenter.View view5;
        CampaignListPresenter.View view6;
        CampaignListPresenter.View view7;
        CampaignListPresenter.View view8;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<CampaignItem> it = list.iterator();
        while (true) {
            view = null;
            if (!it.hasNext()) {
                break;
            }
            CampaignItem next = it.next();
            if (Intrinsics.areEqual(next.isRedemption(), Boolean.TRUE)) {
                arrayList.add(next);
            } else if (AbstractC19741eO1.equals$default(next.getOptInStatus(), "1", false, 2, null)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
            view8 = this.this$0.f85567d;
            if (view8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view = view8;
            }
            view.onGetAllCampaignListEmpty();
            return;
        }
        if (arrayList.isEmpty()) {
            view7 = this.this$0.f85567d;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view7 = null;
            }
            view7.onGetCampaignRedemptionListEmpty();
        } else {
            view2 = this.this$0.f85567d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view2 = null;
            }
            view2.onGetCampaignRedemptionListSuccess(arrayList);
        }
        if (arrayList2.isEmpty()) {
            view6 = this.this$0.f85567d;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view6 = null;
            }
            view6.onGetMyCampaignListEmpty();
        } else {
            view3 = this.this$0.f85567d;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view3 = null;
            }
            view3.onGetMyCampaignListSuccess(arrayList2);
        }
        if (arrayList3.isEmpty()) {
            view5 = this.this$0.f85567d;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view = view5;
            }
            view.onGetNewCampaignListEmpty();
            return;
        }
        view4 = this.this$0.f85567d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view = view4;
        }
        view.onGetNewCampaignListSuccess(arrayList3);
    }
}