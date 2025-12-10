package th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary;

import kotlin.Metadata;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryStatus;", "", "selectedImageResourceId", "", "unselectedImageResourceId", "(Ljava/lang/String;III)V", "getSelectedImageResourceId", "()I", "getUnselectedImageResourceId", "ONE_TRUE_ONLINE", "ONE_TRUE_ONLINE_FIXED_LINE_PLUS", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryStatus */
/* loaded from: classes10.dex */
public enum PaymentSummaryStatus {
    ONE_TRUE_ONLINE(R.drawable.ic_true_online_flp, R.drawable.ic_true_online_flp_grey),
    ONE_TRUE_ONLINE_FIXED_LINE_PLUS(R.drawable.ic_true_flp, R.drawable.ic_true_flp_grey);
    
    private final int selectedImageResourceId;
    private final int unselectedImageResourceId;

    PaymentSummaryStatus(int i, int i2) {
        this.selectedImageResourceId = i;
        this.unselectedImageResourceId = i2;
    }

    public final int getSelectedImageResourceId() {
        return this.selectedImageResourceId;
    }

    public final int getUnselectedImageResourceId() {
        return this.unselectedImageResourceId;
    }
}