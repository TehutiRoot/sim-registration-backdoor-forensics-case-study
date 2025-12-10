package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.activity.OneDeviceSaleActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleInputIMEIFragment$onStart$1$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleInputIMEIFragment$onStart$1$3 extends Lambda implements Function1<Resource<? extends GetNewIMEIResponse>, Unit> {
    final /* synthetic */ OneDeviceSaleInputIMEIFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleInputIMEIFragment$onStart$1$3(OneDeviceSaleInputIMEIFragment oneDeviceSaleInputIMEIFragment) {
        super(1);
        this.this$0 = oneDeviceSaleInputIMEIFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetNewIMEIResponse> resource) {
        invoke2((Resource<GetNewIMEIResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<GetNewIMEIResponse> resource) {
        Resource<GetNewIMEIResponse> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneDeviceSaleInputIMEIFragment oneDeviceSaleInputIMEIFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            oneDeviceSaleInputIMEIFragment.hideKeyboard();
            GetNewIMEIResponse data = resourceContentIfNotHandled.getData();
            if (data != null) {
                FragmentActivity requireActivity = oneDeviceSaleInputIMEIFragment.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.device_sale.activity.OneDeviceSaleActivity");
                String hardwareNumber = data.getHardwareNumber();
                String brandName = data.getBrandName();
                String modelName = data.getModelName();
                ((OneDeviceSaleActivity) requireActivity).showDialogChangeIMEI(hardwareNumber, brandName + " / " + modelName, data.isDtacDevice());
            }
        }
    }
}