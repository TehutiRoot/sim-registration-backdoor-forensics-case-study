package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OnePaymentTypeListResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.activity.OneDeviceSaleActivity;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSaleCampaignListFragment;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OnePaymentTypeListResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$8 */
/* loaded from: classes10.dex */
public final class OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$8 extends Lambda implements Function1<Resource<? extends OnePaymentTypeListResponse>, Unit> {
    final /* synthetic */ OneDeviceSalePrepareProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSalePrepareProfileInfoFragment$setupObservers$1$8(OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment) {
        super(1);
        this.this$0 = oneDeviceSalePrepareProfileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OnePaymentTypeListResponse> resource) {
        invoke2((Resource<OnePaymentTypeListResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Resource<OnePaymentTypeListResponse> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getStatus() == StatusResource.SUCCESS) {
            FragmentActivity activity = this.this$0.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.device_sale.activity.OneDeviceSaleActivity");
            ((OneDeviceSaleActivity) activity).replaceFragment(OneDeviceSaleCampaignListFragment.Companion.newInstance());
        }
    }
}