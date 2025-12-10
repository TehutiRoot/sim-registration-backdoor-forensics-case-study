package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.device_sale.InputField;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/device_sale/InputField;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleCampaignViewModel$callVerifyIDPin$1 */
/* loaded from: classes9.dex */
public final class DeviceSaleCampaignViewModel$callVerifyIDPin$1 extends Lambda implements Function1<InputField, ObservableSource<? extends ResponseBody>> {
    final /* synthetic */ DeviceSaleCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleCampaignViewModel$callVerifyIDPin$1(DeviceSaleCampaignViewModel deviceSaleCampaignViewModel) {
        super(1);
        this.this$0 = deviceSaleCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends ResponseBody> invoke(@NotNull InputField it) {
        DeviceSaleRepository deviceSaleRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        deviceSaleRepository = this.this$0.f105445b;
        String value = it.getValue();
        if (value == null) {
            value = "";
        }
        return deviceSaleRepository.verifyIDPin(value);
    }
}