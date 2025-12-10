package co.omise.android.p009ui;

import androidx.activity.OnBackPressedCallback;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m28850d2 = {"co/omise/android/ui/GooglePayActivity$onBackPressedCallback$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.GooglePayActivity$onBackPressedCallback$1 */
/* loaded from: classes3.dex */
public final class GooglePayActivity$onBackPressedCallback$1 extends OnBackPressedCallback {
    final /* synthetic */ GooglePayActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayActivity$onBackPressedCallback$1(GooglePayActivity googlePayActivity) {
        super(true);
        this.this$0 = googlePayActivity;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        this.this$0.setResult(0);
        this.this$0.finish();
    }
}
