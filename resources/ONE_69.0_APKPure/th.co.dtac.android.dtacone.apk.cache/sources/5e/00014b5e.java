package th.p047co.dtac.android.dtacone.view.fragment.device_sale;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.PaymentTypeListResponse;
import th.p047co.dtac.android.dtacone.view.activity.device_sale.DeviceSaleActivity;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/device_sale/PaymentTypeListResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.DeviceSalePrepareProfileInfoFragment$onViewCreated$5$8 */
/* loaded from: classes9.dex */
public final class DeviceSalePrepareProfileInfoFragment$onViewCreated$5$8 extends Lambda implements Function1<Resource<? extends PaymentTypeListResponse>, Unit> {
    final /* synthetic */ DeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSalePrepareProfileInfoFragment$onViewCreated$5$8(DeviceSalePrepareProfileInfoFragment deviceSalePrepareProfileInfoFragment) {
        super(1);
        this.this$0 = deviceSalePrepareProfileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends PaymentTypeListResponse> resource) {
        invoke2((Resource<PaymentTypeListResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Resource<PaymentTypeListResponse> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getStatus() == StatusResource.SUCCESS) {
            FragmentActivity activity = this.this$0.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.device_sale.DeviceSaleActivity");
            ((DeviceSaleActivity) activity).replaceFragment(DeviceSalePaymentTypeFragment.Companion.newInstance());
        }
    }
}