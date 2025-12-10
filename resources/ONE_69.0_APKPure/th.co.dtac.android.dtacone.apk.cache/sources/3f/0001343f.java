package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.repository;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.OneNadOutboundModel;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundInvoiceDataItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundInvoiceItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundInvoiceResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundInvoiceResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.repository.OneNadOutboundRepository$getOneNadOutboundInvoice$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundRepository$getOneNadOutboundInvoice$1 extends Lambda implements Function1<OneNadOutboundInvoiceResponse, OneNadOutboundInvoiceResponse> {
    final /* synthetic */ OneNadOutboundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundRepository$getOneNadOutboundInvoice$1(OneNadOutboundRepository oneNadOutboundRepository) {
        super(1);
        this.this$0 = oneNadOutboundRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneNadOutboundInvoiceResponse invoke(@NotNull OneNadOutboundInvoiceResponse response) {
        ArrayList<OneNadOutboundInvoiceItem> arrayList;
        Intrinsics.checkNotNullParameter(response, "response");
        this.this$0.getOneNadOutboundModel().setInvoiceNotFound(false);
        OneNadOutboundModel oneNadOutboundModel = this.this$0.getOneNadOutboundModel();
        OneNadOutboundInvoiceDataItem data = response.getData();
        if (data == null || (arrayList = data.getInvoiceList()) == null) {
            arrayList = new ArrayList<>();
        }
        oneNadOutboundModel.setInvoiceList(arrayList);
        return response;
    }
}