package th.p047co.dtac.android.dtacone.view.appOne.eSign.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/response/IndividualVerification;", "", "", "confidence", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/eSign/response/IndividualVerification;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getConfidence", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getStatus", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.response.IndividualVerification */
/* loaded from: classes10.dex */
public final class IndividualVerification {
    public static final int $stable = 0;
    @SerializedName("confidence")
    @NotNull

    /* renamed from: a */
    private final String f90841a;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull

    /* renamed from: b */
    private final String f90842b;

    public IndividualVerification() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ IndividualVerification copy$default(IndividualVerification individualVerification, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = individualVerification.f90841a;
        }
        if ((i & 2) != 0) {
            str2 = individualVerification.f90842b;
        }
        return individualVerification.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f90841a;
    }

    @NotNull
    public final String component2() {
        return this.f90842b;
    }

    @NotNull
    public final IndividualVerification copy(@NotNull String confidence, @NotNull String status) {
        Intrinsics.checkNotNullParameter(confidence, "confidence");
        Intrinsics.checkNotNullParameter(status, "status");
        return new IndividualVerification(confidence, status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IndividualVerification) {
            IndividualVerification individualVerification = (IndividualVerification) obj;
            return Intrinsics.areEqual(this.f90841a, individualVerification.f90841a) && Intrinsics.areEqual(this.f90842b, individualVerification.f90842b);
        }
        return false;
    }

    @NotNull
    public final String getConfidence() {
        return this.f90841a;
    }

    @NotNull
    public final String getStatus() {
        return this.f90842b;
    }

    public int hashCode() {
        return (this.f90841a.hashCode() * 31) + this.f90842b.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f90841a;
        String str2 = this.f90842b;
        return "IndividualVerification(confidence=" + str + ", status=" + str2 + ")";
    }

    public IndividualVerification(@NotNull String confidence, @NotNull String status) {
        Intrinsics.checkNotNullParameter(confidence, "confidence");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f90841a = confidence;
        this.f90842b = status;
    }

    public /* synthetic */ IndividualVerification(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}