package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneToast;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OneScanBarcodeSimFragment$setUpViewModel$1$3 */
/* loaded from: classes10.dex */
public final class OneScanBarcodeSimFragment$setUpViewModel$1$3 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneScanBarcodeSimFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneScanBarcodeSimFragment$setUpViewModel$1$3(OneScanBarcodeSimFragment oneScanBarcodeSimFragment) {
        super(1);
        this.this$0 = oneScanBarcodeSimFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1$lambda$0(OneScanBarcodeSimFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f95754n = true;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        Resource<String> resourceContentIfNotHandled;
        OnePrepaidRegistrationActivity m10674p;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        final OneScanBarcodeSimFragment oneScanBarcodeSimFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() != StatusResource.SUCCESS || resourceContentIfNotHandled.getData() == null) {
            return;
        }
        oneScanBarcodeSimFragment.f95754n = false;
        OneToast oneToast = new OneToast();
        m10674p = oneScanBarcodeSimFragment.m10674p();
        oneToast.createToastTop(m10674p, oneScanBarcodeSimFragment.getString(R.string.prepaid_ocr_barcode_warning)).show();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.a
            @Override // java.lang.Runnable
            public final void run() {
                OneScanBarcodeSimFragment$setUpViewModel$1$3.invoke$lambda$2$lambda$1$lambda$0(OneScanBarcodeSimFragment.this);
            }
        }, 3500L);
        OneScanBarcodeSimFragment.m10670t(oneScanBarcodeSimFragment, 0L, 1, null);
    }
}