package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.OnePrepaidSubmitOrderResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/OnePrepaidSubmitOrderResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$submitTrueCompany$1 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$submitTrueCompany$1 extends Lambda implements Function1<OnePrepaidSubmitOrderResponse, OnePrepaidSubmitOrderResponse> {
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$submitTrueCompany$1(OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.this$0 = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnePrepaidSubmitOrderResponse invoke(@NotNull OnePrepaidSubmitOrderResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneMnpViewModel oneMnpViewModel = this.this$0;
        Data data = it.getData();
        oneMnpViewModel.setOrderId(data != null ? data.getOrderId() : null);
        OneMnpViewModel oneMnpViewModel2 = this.this$0;
        Data data2 = it.getData();
        oneMnpViewModel2.setTrackingId(data2 != null ? data2.getTrackingId() : null);
        return it;
    }
}