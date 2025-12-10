package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleProfileInfoViewModel$showImeiSection$concatBrandModel$1 */
/* loaded from: classes10.dex */
public final class C14644x5a6af11b extends Lambda implements Function0<String> {
    final /* synthetic */ OneDeviceSaleProfileInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14644x5a6af11b(OneDeviceSaleProfileInfoViewModel oneDeviceSaleProfileInfoViewModel) {
        super(0);
        this.this$0 = oneDeviceSaleProfileInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        OneDeviceSaleRepository oneDeviceSaleRepository;
        String brand;
        String model;
        oneDeviceSaleRepository = this.this$0.f90631b;
        DeviceSaleVerifySubrResponse verifySubrResponse = oneDeviceSaleRepository.getVerifySubrResponse();
        if (verifySubrResponse == null || (brand = verifySubrResponse.getCustomerProfile().getSubscriber().getBrand()) == null || (model = verifySubrResponse.getCustomerProfile().getSubscriber().getModel()) == null) {
            return HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        String str = brand + " / " + model;
        return str == null ? HelpFormatter.DEFAULT_OPT_PREFIX : str;
    }
}