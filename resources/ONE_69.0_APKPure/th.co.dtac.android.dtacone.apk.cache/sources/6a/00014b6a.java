package th.p047co.dtac.android.dtacone.view.fragment.device_sale;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.dm7.barcodescanner.core.ZXingScannerView;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.ToastMessage;
import th.p047co.dtac.android.dtacone.util.UpdateIMEIAlert;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleScanIMEIFragment$onStart$1$5;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleScanIMEIFragment$onStart$1$5 */
/* loaded from: classes9.dex */
public final class DeviceSaleScanIMEIFragment$onStart$1$5 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceSaleScanIMEIFragment f99986a;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleScanIMEIFragment$onStart$1$5$WhenMappings */
    /* loaded from: classes9.dex */
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

    public DeviceSaleScanIMEIFragment$onStart$1$5(DeviceSaleScanIMEIFragment deviceSaleScanIMEIFragment) {
        this.f99986a = deviceSaleScanIMEIFragment;
    }

    /* renamed from: c */
    public static final void m8077c(DeviceSaleScanIMEIFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ZXingScannerView zXingScannerView = this$0.f99976j;
        if (zXingScannerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerView");
            zXingScannerView = null;
        }
        zXingScannerView.resumeCameraPreview(this$0);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: b */
    public final void onChanged(Resource resource) {
        Resource resourceContentIfNotHandled;
        FragmentManager supportFragmentManager;
        DeviceSaleViewModel deviceSaleViewModel;
        if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
            final DeviceSaleScanIMEIFragment deviceSaleScanIMEIFragment = this.f99986a;
            int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        deviceSaleScanIMEIFragment.dismissSecondaryLoading();
                        new Handler().postDelayed(new Runnable() { // from class: YH
                            @Override // java.lang.Runnable
                            public final void run() {
                                DeviceSaleScanIMEIFragment$onStart$1$5.m8077c(deviceSaleScanIMEIFragment);
                            }
                        }, 1000L);
                        return;
                    }
                    return;
                }
                deviceSaleScanIMEIFragment.showSecondaryLoading();
                return;
            }
            FragmentActivity ctx = deviceSaleScanIMEIFragment.getActivity();
            if (ctx != null) {
                Intrinsics.checkNotNullExpressionValue(ctx, "ctx");
                ToastMessage toastMessage = new ToastMessage(ctx);
                toastMessage.setState(new UpdateIMEIAlert());
                deviceSaleViewModel = deviceSaleScanIMEIFragment.f99975i;
                if (deviceSaleViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deviceSaleViewModel");
                    deviceSaleViewModel = null;
                }
                deviceSaleViewModel.showToastUpdatedVerify().postValue(new Event<>(toastMessage));
            }
            deviceSaleScanIMEIFragment.dismissSecondaryLoading();
            FragmentActivity activity = deviceSaleScanIMEIFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.popBackStackImmediate();
            }
        }
    }
}