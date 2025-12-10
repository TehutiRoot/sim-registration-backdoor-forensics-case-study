package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.ImeiSectionModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1 */
/* loaded from: classes9.dex */
public final class DeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ DeviceSaleProfileInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1(DeviceSaleProfileInfoViewModel deviceSaleProfileInfoViewModel) {
        super(0);
        this.this$0 = deviceSaleProfileInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableLiveData m3020c;
        m3020c = this.this$0.m3020c();
        m3020c.setValue(new ImeiSectionModel(HelpFormatter.DEFAULT_OPT_PREFIX, HelpFormatter.DEFAULT_OPT_PREFIX));
    }
}