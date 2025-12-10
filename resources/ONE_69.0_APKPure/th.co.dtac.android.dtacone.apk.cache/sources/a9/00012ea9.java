package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.dm7.barcodescanner.core.ZXingScannerView;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleScanIMEIFragment$onStart$1$6 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleScanIMEIFragment$onStart$1$6 extends Lambda implements Function1<Resource<? extends Boolean>, Unit> {
    final /* synthetic */ OneDeviceSaleScanIMEIFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleScanIMEIFragment$onStart$1$6(OneDeviceSaleScanIMEIFragment oneDeviceSaleScanIMEIFragment) {
        super(1);
        this.this$0 = oneDeviceSaleScanIMEIFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(OneDeviceSaleScanIMEIFragment this$0) {
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
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Boolean> resource) {
        invoke2((Resource<Boolean>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Boolean> resource) {
        Resource<Boolean> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        final OneDeviceSaleScanIMEIFragment oneDeviceSaleScanIMEIFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS && Intrinsics.areEqual(resourceContentIfNotHandled.getData(), Boolean.TRUE)) {
            new Handler().postDelayed(new Runnable() { // from class: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.e
                @Override // java.lang.Runnable
                public final void run() {
                    OneDeviceSaleScanIMEIFragment$onStart$1$6.invoke$lambda$1$lambda$0(OneDeviceSaleScanIMEIFragment.this);
                }
            }, 1000L);
        }
    }
}