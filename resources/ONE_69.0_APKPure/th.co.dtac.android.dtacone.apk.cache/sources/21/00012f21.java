package th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneDeviceSaleCampaignResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleCampaignResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleCampaignResponse;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneDeviceSaleCampaignResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository$getDeviceSaleCampaign$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleRepository$getDeviceSaleCampaign$2 extends Lambda implements Function1<OneDeviceSaleCampaignResponse, DeviceSaleCampaignResponse> {
    public static final OneDeviceSaleRepository$getDeviceSaleCampaign$2 INSTANCE = new OneDeviceSaleRepository$getDeviceSaleCampaign$2();

    public OneDeviceSaleRepository$getDeviceSaleCampaign$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DeviceSaleCampaignResponse invoke(@NotNull OneDeviceSaleCampaignResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getData();
    }
}