package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.GetReceiptBase64Response;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/GetReceiptBase64Response;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$printReceipt$6 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$printReceipt$6 extends Lambda implements Function1<GetReceiptBase64Response, Unit> {
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$printReceipt$6(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidMultiSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetReceiptBase64Response getReceiptBase64Response) {
        invoke2(getReceiptBase64Response);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetReceiptBase64Response getReceiptBase64Response) {
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository;
        if (getReceiptBase64Response.getBase64().length() > 0) {
            mrtrPrepaidMultiSimRepository = this.this$0.f106670b;
            mrtrPrepaidMultiSimRepository.getReceiptBase64List().add(getReceiptBase64Response.getBase64());
        }
    }
}