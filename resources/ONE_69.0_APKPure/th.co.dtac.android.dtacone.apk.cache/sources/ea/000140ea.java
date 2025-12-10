package th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryData;", "", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryStatus;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryStatus;)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryStatus;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryStatus;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/tol/model/paymentSummary/PaymentSummaryStatus;", "getStatus", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryData */
/* loaded from: classes10.dex */
public final class PaymentSummaryData {
    public static final int $stable = 0;

    /* renamed from: a */
    public final PaymentSummaryStatus f98047a;

    public PaymentSummaryData(@NotNull PaymentSummaryStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f98047a = status;
    }

    public static /* synthetic */ PaymentSummaryData copy$default(PaymentSummaryData paymentSummaryData, PaymentSummaryStatus paymentSummaryStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentSummaryStatus = paymentSummaryData.f98047a;
        }
        return paymentSummaryData.copy(paymentSummaryStatus);
    }

    @NotNull
    public final PaymentSummaryStatus component1() {
        return this.f98047a;
    }

    @NotNull
    public final PaymentSummaryData copy(@NotNull PaymentSummaryStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new PaymentSummaryData(status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentSummaryData) && this.f98047a == ((PaymentSummaryData) obj).f98047a;
    }

    @NotNull
    public final PaymentSummaryStatus getStatus() {
        return this.f98047a;
    }

    public int hashCode() {
        return this.f98047a.hashCode();
    }

    @NotNull
    public String toString() {
        PaymentSummaryStatus paymentSummaryStatus = this.f98047a;
        return "PaymentSummaryData(status=" + paymentSummaryStatus + ")";
    }
}