package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneVerifyIDPinResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.InputField;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneVerifyIDPinResponse;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/device_sale/InputField;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleCampaignViewModel$callVerifyIDPin$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCampaignViewModel$callVerifyIDPin$1 extends Lambda implements Function1<InputField, ObservableSource<? extends OneVerifyIDPinResponse>> {
    final /* synthetic */ OneDeviceSaleCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleCampaignViewModel$callVerifyIDPin$1(OneDeviceSaleCampaignViewModel oneDeviceSaleCampaignViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends OneVerifyIDPinResponse> invoke(@NotNull InputField it) {
        OneDeviceSaleRepository oneDeviceSaleRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        oneDeviceSaleRepository = this.this$0.f90547b;
        String value = it.getValue();
        if (value == null) {
            value = "";
        }
        return oneDeviceSaleRepository.verifyIDPin(value);
    }
}