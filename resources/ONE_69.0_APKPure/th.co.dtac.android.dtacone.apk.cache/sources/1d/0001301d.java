package th.p047co.dtac.android.dtacone.view.appOne.eSign.request;

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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/request/ConsentNoticeDocData;", "", "", NotificationCompat.CATEGORY_STATUS, "pdf", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/eSign/request/ConsentNoticeDocData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getStatus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPdf", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.request.ConsentNoticeDocData */
/* loaded from: classes10.dex */
public final class ConsentNoticeDocData {
    public static final int $stable = 0;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull

    /* renamed from: a */
    private final String f90791a;
    @SerializedName("pdf")
    @NotNull

    /* renamed from: b */
    private final String f90792b;

    public ConsentNoticeDocData() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ConsentNoticeDocData copy$default(ConsentNoticeDocData consentNoticeDocData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consentNoticeDocData.f90791a;
        }
        if ((i & 2) != 0) {
            str2 = consentNoticeDocData.f90792b;
        }
        return consentNoticeDocData.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f90791a;
    }

    @NotNull
    public final String component2() {
        return this.f90792b;
    }

    @NotNull
    public final ConsentNoticeDocData copy(@NotNull String status, @NotNull String pdf) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(pdf, "pdf");
        return new ConsentNoticeDocData(status, pdf);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentNoticeDocData) {
            ConsentNoticeDocData consentNoticeDocData = (ConsentNoticeDocData) obj;
            return Intrinsics.areEqual(this.f90791a, consentNoticeDocData.f90791a) && Intrinsics.areEqual(this.f90792b, consentNoticeDocData.f90792b);
        }
        return false;
    }

    @NotNull
    public final String getPdf() {
        return this.f90792b;
    }

    @NotNull
    public final String getStatus() {
        return this.f90791a;
    }

    public int hashCode() {
        return (this.f90791a.hashCode() * 31) + this.f90792b.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f90791a;
        String str2 = this.f90792b;
        return "ConsentNoticeDocData(status=" + str + ", pdf=" + str2 + ")";
    }

    public ConsentNoticeDocData(@NotNull String status, @NotNull String pdf) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(pdf, "pdf");
        this.f90791a = status;
        this.f90792b = pdf;
    }

    public /* synthetic */ ConsentNoticeDocData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}