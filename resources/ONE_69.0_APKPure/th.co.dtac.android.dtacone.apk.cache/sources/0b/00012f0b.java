package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.MrtrDiscountItem;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/device_sale/MrtrDiscountItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSalePromotionalFragment$initView$5 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePromotionalFragment$initView$5 extends Lambda implements Function1<Resource<? extends List<? extends MrtrDiscountItem>>, Unit> {
    final /* synthetic */ OneDeviceSalePromotionalFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePromotionalFragment$initView$5(OneDeviceSalePromotionalFragment oneDeviceSalePromotionalFragment) {
        super(1);
        this.this$0 = oneDeviceSalePromotionalFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends MrtrDiscountItem>> resource) {
        invoke2((Resource<? extends List<MrtrDiscountItem>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<MrtrDiscountItem>> resource) {
        Resource<? extends List<MrtrDiscountItem>> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneDeviceSalePromotionalFragment oneDeviceSalePromotionalFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            oneDeviceSalePromotionalFragment.m14531s(resourceContentIfNotHandled.getData());
        }
    }
}