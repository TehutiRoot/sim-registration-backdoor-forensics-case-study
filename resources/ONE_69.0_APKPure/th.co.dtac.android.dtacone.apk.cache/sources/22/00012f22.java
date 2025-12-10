package th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneGetDiscountResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.Campaign;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.model.device_sale.GetDiscountResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneGetDiscountResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDeviceSaleRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleRepository.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository$getDiscountListAPI$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1143:1\n766#2:1144\n857#2,2:1145\n1855#2,2:1147\n*S KotlinDebug\n*F\n+ 1 OneDeviceSaleRepository.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository$getDiscountListAPI$1\n*L\n731#1:1144\n731#1:1145,2\n739#1:1147,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository$getDiscountListAPI$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleRepository$getDiscountListAPI$1 extends Lambda implements Function1<OneGetDiscountResponse, OneGetDiscountResponse> {
    final /* synthetic */ OneDeviceSaleRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleRepository$getDiscountListAPI$1(OneDeviceSaleRepository oneDeviceSaleRepository) {
        super(1);
        this.this$0 = oneDeviceSaleRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneGetDiscountResponse invoke(@NotNull OneGetDiscountResponse it) {
        List<Discount> discounts;
        String campaignCode;
        List<Discount> list;
        Intrinsics.checkNotNullParameter(it, "it");
        GetDiscountResponse data = it.getData();
        if (data != null) {
            GetDiscountResponse data2 = it.getData();
            if (data2 == null || (list = data2.getDiscounts()) == null) {
                list = null;
            } else if (!this.this$0.isDeviceWithContract()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.areEqual(((Discount) obj).getIfrs(), "0")) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            data.setDiscounts(list);
        }
        GetDiscountResponse data3 = it.getData();
        if (data3 != null && (discounts = data3.getDiscounts()) != null) {
            OneDeviceSaleRepository oneDeviceSaleRepository = this.this$0;
            for (Discount discount : discounts) {
                Campaign campaign = oneDeviceSaleRepository.getModel().getCampaign();
                String str = "";
                discount.setCampaignType((campaign == null || (r3 = campaign.getType()) == null) ? "" : "");
                Campaign campaign2 = oneDeviceSaleRepository.getModel().getCampaign();
                discount.setCampaignTypeDisplay((campaign2 == null || (r3 = campaign2.getTypeDisplay()) == null) ? "" : "");
                GetDiscountResponse data4 = it.getData();
                if (data4 != null && (campaignCode = data4.getCampaignCode()) != null) {
                    str = campaignCode;
                }
                discount.setCampaignNameCode(str);
            }
        }
        return it;
    }
}