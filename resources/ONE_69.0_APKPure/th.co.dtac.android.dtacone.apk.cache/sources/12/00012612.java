package th.p047co.dtac.android.dtacone.repository.device_sale;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.device_sale.Campaign;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.model.device_sale.GetDiscountResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/device_sale/GetDiscountResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSaleRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSaleRepository.kt\nth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository$getDiscountListAPI$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1078:1\n766#2:1079\n857#2,2:1080\n1855#2,2:1082\n*S KotlinDebug\n*F\n+ 1 DeviceSaleRepository.kt\nth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository$getDiscountListAPI$1\n*L\n405#1:1079\n405#1:1080,2\n413#1:1082,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository$getDiscountListAPI$1 */
/* loaded from: classes8.dex */
public final class DeviceSaleRepository$getDiscountListAPI$1 extends Lambda implements Function1<GetDiscountResponse, GetDiscountResponse> {
    final /* synthetic */ DeviceSaleRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleRepository$getDiscountListAPI$1(DeviceSaleRepository deviceSaleRepository) {
        super(1);
        this.this$0 = deviceSaleRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GetDiscountResponse invoke(@NotNull GetDiscountResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<Discount> discounts = it.getDiscounts();
        if (discounts == null) {
            discounts = null;
        } else if (!this.this$0.isDeviceWithContract()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : discounts) {
                if (Intrinsics.areEqual(((Discount) obj).getIfrs(), "0")) {
                    arrayList.add(obj);
                }
            }
            discounts = arrayList;
        }
        it.setDiscounts(discounts);
        List<Discount> discounts2 = it.getDiscounts();
        if (discounts2 != null) {
            DeviceSaleRepository deviceSaleRepository = this.this$0;
            for (Discount discount : discounts2) {
                Campaign campaign = deviceSaleRepository.getModel().getCampaign();
                String str = "";
                discount.setCampaignType((campaign == null || (r3 = campaign.getType()) == null) ? "" : "");
                Campaign campaign2 = deviceSaleRepository.getModel().getCampaign();
                discount.setCampaignTypeDisplay((campaign2 == null || (r3 = campaign2.getTypeDisplay()) == null) ? "" : "");
                String campaignCode = it.getCampaignCode();
                if (campaignCode != null) {
                    str = campaignCode;
                }
                discount.setCampaignNameCode(str);
            }
        }
        return it;
    }
}