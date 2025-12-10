package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign;

import androidx.cardview.widget.CardView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.device_sale.MrtrDiscountItem;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/model/device_sale/MrtrDiscountItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSalePromotionalFragment$initView$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePromotionalFragment$initView$2 extends Lambda implements Function1<List<? extends MrtrDiscountItem>, Unit> {
    final /* synthetic */ OneDeviceSalePromotionalFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePromotionalFragment$initView$2(OneDeviceSalePromotionalFragment oneDeviceSalePromotionalFragment) {
        super(1);
        this.this$0 = oneDeviceSalePromotionalFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends MrtrDiscountItem> list) {
        invoke2((List<MrtrDiscountItem>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MrtrDiscountItem> list) {
        OneFontTextView oneFontTextView;
        CardView cardView;
        List<MrtrDiscountItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            oneFontTextView = this.this$0.f90478k;
            CardView cardView2 = null;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewDiscountItem");
                oneFontTextView = null;
            }
            ViewVisibleExtKt.toVisible(oneFontTextView);
            cardView = this.this$0.f90480m;
            if (cardView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("campaignGroup");
            } else {
                cardView2 = cardView;
            }
            ViewVisibleExtKt.toGone(cardView2);
            return;
        }
        this.this$0.m14531s(list);
    }
}