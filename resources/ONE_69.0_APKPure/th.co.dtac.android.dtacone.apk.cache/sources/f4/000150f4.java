package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.dm7.barcodescanner.core.ZXingScannerView;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostScanIMEIFragment$onStart$1$2;

/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostScanIMEIFragment$onStart$1$2 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostScanIMEIFragment$onStart$1$2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MrtrPre2PostScanIMEIFragment f103285a;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostScanIMEIFragment$onStart$1$2$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MrtrPre2PostScanIMEIFragment$onStart$1$2(MrtrPre2PostScanIMEIFragment mrtrPre2PostScanIMEIFragment) {
        this.f103285a = mrtrPre2PostScanIMEIFragment;
    }

    /* renamed from: c */
    public static final void m5067c(MrtrPre2PostScanIMEIFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ZXingScannerView zXingScannerView = this$0.f103277j;
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
        if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
            final MrtrPre2PostScanIMEIFragment mrtrPre2PostScanIMEIFragment = this.f103285a;
            int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        mrtrPre2PostScanIMEIFragment.dismissSecondaryLoading();
                        new Handler().postDelayed(new Runnable() { // from class: fC0
                            @Override // java.lang.Runnable
                            public final void run() {
                                MrtrPre2PostScanIMEIFragment$onStart$1$2.m5067c(mrtrPre2PostScanIMEIFragment);
                            }
                        }, 1000L);
                        return;
                    }
                    return;
                }
                mrtrPre2PostScanIMEIFragment.dismissSecondaryLoading();
                GetNewIMEIResponse getNewIMEIResponse = (GetNewIMEIResponse) resourceContentIfNotHandled.getData();
                if (getNewIMEIResponse != null) {
                    FragmentActivity requireActivity = mrtrPre2PostScanIMEIFragment.requireActivity();
                    Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity");
                    String hardwareNumber = getNewIMEIResponse.getHardwareNumber();
                    String brandName = getNewIMEIResponse.getBrandName();
                    String modelName = getNewIMEIResponse.getModelName();
                    ((MrtrPre2PostActivity) requireActivity).showDialogChangeIMEI(hardwareNumber, brandName + " / " + modelName, getNewIMEIResponse.isDtacDevice());
                    return;
                }
                return;
            }
            mrtrPre2PostScanIMEIFragment.showSecondaryLoading();
        }
    }
}