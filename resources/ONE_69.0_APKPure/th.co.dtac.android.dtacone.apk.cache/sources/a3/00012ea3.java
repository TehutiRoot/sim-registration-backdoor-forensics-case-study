package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.dm7.barcodescanner.core.ZXingScannerView;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.activity.OneDeviceSaleActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleScanIMEIFragment$onStart$1$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleScanIMEIFragment$onStart$1$3 extends Lambda implements Function1<Resource<? extends GetNewIMEIResponse>, Unit> {
    final /* synthetic */ OneDeviceSaleScanIMEIFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleScanIMEIFragment$onStart$1$3$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusResource.DISMISS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleScanIMEIFragment$onStart$1$3(OneDeviceSaleScanIMEIFragment oneDeviceSaleScanIMEIFragment) {
        super(1);
        this.this$0 = oneDeviceSaleScanIMEIFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(OneDeviceSaleScanIMEIFragment this$0) {
        ZXingScannerView zXingScannerView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zXingScannerView = this$0.f90269j;
        if (zXingScannerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerView");
            zXingScannerView = null;
        }
        zXingScannerView.resumeCameraPreview(this$0);
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
        final OneDeviceSaleScanIMEIFragment oneDeviceSaleScanIMEIFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneDeviceSaleScanIMEIFragment.showSecondaryLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneDeviceSaleScanIMEIFragment.dismissSecondaryLoading();
                new Handler().postDelayed(new Runnable() { // from class: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        OneDeviceSaleScanIMEIFragment$onStart$1$3.invoke$lambda$2$lambda$1(OneDeviceSaleScanIMEIFragment.this);
                    }
                }, 1000L);
                return;
            }
        }
        GetNewIMEIResponse data = resourceContentIfNotHandled.getData();
        if (data != null) {
            FragmentActivity requireActivity = oneDeviceSaleScanIMEIFragment.requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.device_sale.activity.OneDeviceSaleActivity");
            String hardwareNumber = data.getHardwareNumber();
            String brandName = data.getBrandName();
            String modelName = data.getModelName();
            ((OneDeviceSaleActivity) requireActivity).showDialogChangeIMEI(hardwareNumber, brandName + " / " + modelName, data.isDtacDevice());
        }
    }
}