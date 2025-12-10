package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.topup.offer.TopupOfferResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$setUpViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$setUpViewModel$1$2 extends Lambda implements Function1<Resource<? extends TopupOfferResponse>, Unit> {
    final /* synthetic */ OneTopupPriceListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopupPriceListFragment$setUpViewModel$1$2(OneTopupPriceListFragment oneTopupPriceListFragment) {
        super(1);
        this.this$0 = oneTopupPriceListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends TopupOfferResponse> resource) {
        invoke2((Resource<TopupOfferResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<TopupOfferResponse> resource) {
        LinearLayoutCompat linearLayoutCompat;
        TopupOfferResponse topupOfferResponse;
        if (resource != null) {
            OneTopupPriceListFragment oneTopupPriceListFragment = this.this$0;
            if (resource.getStatus() == StatusResource.SUCCESS) {
                TopupOfferResponse data = resource.getData();
                if (data != null) {
                    oneTopupPriceListFragment.f98469a0 = data;
                    oneTopupPriceListFragment.f98470b0 = data.getMsisdn();
                    topupOfferResponse = oneTopupPriceListFragment.f98469a0;
                    oneTopupPriceListFragment.m9265l0(topupOfferResponse);
                }
            } else if (resource.getStatus() == StatusResource.ERROR) {
                LinearLayoutCompat linearLayoutCompat2 = null;
                oneTopupPriceListFragment.f98469a0 = null;
                linearLayoutCompat = oneTopupPriceListFragment.f98485r;
                if (linearLayoutCompat == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutRootOffer");
                } else {
                    linearLayoutCompat2 = linearLayoutCompat;
                }
                linearLayoutCompat2.setVisibility(8);
            }
            oneTopupPriceListFragment.m9287P();
        }
    }
}