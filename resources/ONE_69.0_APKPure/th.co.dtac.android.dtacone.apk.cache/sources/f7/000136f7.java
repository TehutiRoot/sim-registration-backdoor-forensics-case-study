package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.dm7.barcodescanner.core.ZXingScannerView;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidScanIMEIFragment$onError$1$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidScanIMEIFragment$onError$1$1 extends Lambda implements Function1<ErrorCollection, Unit> {
    final /* synthetic */ OnePostpaidScanIMEIFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidScanIMEIFragment$onError$1$1(OnePostpaidScanIMEIFragment onePostpaidScanIMEIFragment) {
        super(1);
        this.this$0 = onePostpaidScanIMEIFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(OnePostpaidScanIMEIFragment this$0) {
        ZXingScannerView zXingScannerView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zXingScannerView = this$0.f93596j;
        if (zXingScannerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerView");
            zXingScannerView = null;
        }
        zXingScannerView.resumeCameraPreview(this$0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ErrorCollection errorCollection) {
        invoke2(errorCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ErrorCollection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Handler handler = new Handler(Looper.getMainLooper());
        final OnePostpaidScanIMEIFragment onePostpaidScanIMEIFragment = this.this$0;
        handler.postDelayed(new Runnable() { // from class: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.a
            @Override // java.lang.Runnable
            public final void run() {
                OnePostpaidScanIMEIFragment$onError$1$1.invoke$lambda$0(OnePostpaidScanIMEIFragment.this);
            }
        }, 1000L);
    }
}