package th.p047co.dtac.android.dtacone.view.appOne.eSign.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/response/IndividualIdentification;", "", "", "identificationId", "identificationType", "identificationVerificationId", "issuingDate", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ValidFor;", "validFor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ValidFor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ValidFor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ValidFor;)Lth/co/dtac/android/dtacone/view/appOne/eSign/response/IndividualIdentification;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getIdentificationId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getIdentificationType", OperatorName.CURVE_TO, "getIdentificationVerificationId", "d", "getIssuingDate", "e", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ValidFor;", "getValidFor", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.response.IndividualIdentification */
/* loaded from: classes10.dex */
public final class IndividualIdentification {
    public static final int $stable = 0;
    @SerializedName("identificationId")
    @NotNull

    /* renamed from: a */
    private final String f90827a;
    @SerializedName("identificationType")
    @NotNull

    /* renamed from: b */
    private final String f90828b;
    @SerializedName("identificationVerificationId")
    @NotNull

    /* renamed from: c */
    private final String f90829c;
    @SerializedName("issuingDate")
    @NotNull

    /* renamed from: d */
    private final String f90830d;
    @SerializedName("validFor")
    @NotNull

    /* renamed from: e */
    private final ValidFor f90831e;

    public IndividualIdentification() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ IndividualIdentification copy$default(IndividualIdentification individualIdentification, String str, String str2, String str3, String str4, ValidFor validFor, int i, Object obj) {
        if ((i & 1) != 0) {
            str = individualIdentification.f90827a;
        }
        if ((i & 2) != 0) {
            str2 = individualIdentification.f90828b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = individualIdentification.f90829c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = individualIdentification.f90830d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            validFor = individualIdentification.f90831e;
        }
        return individualIdentification.copy(str, str5, str6, str7, validFor);
    }

    @NotNull
    public final String component1() {
        return this.f90827a;
    }

    @NotNull
    public final String component2() {
        return this.f90828b;
    }

    @NotNull
    public final String component3() {
        return this.f90829c;
    }

    @NotNull
    public final String component4() {
        return this.f90830d;
    }

    @NotNull
    public final ValidFor component5() {
        return this.f90831e;
    }

    @NotNull
    public final IndividualIdentification copy(@NotNull String identificationId, @NotNull String identificationType, @NotNull String identificationVerificationId, @NotNull String issuingDate, @NotNull ValidFor validFor) {
        Intrinsics.checkNotNullParameter(identificationId, "identificationId");
        Intrinsics.checkNotNullParameter(identificationType, "identificationType");
        Intrinsics.checkNotNullParameter(identificationVerificationId, "identificationVerificationId");
        Intrinsics.checkNotNullParameter(issuingDate, "issuingDate");
        Intrinsics.checkNotNullParameter(validFor, "validFor");
        return new IndividualIdentification(identificationId, identificationType, identificationVerificationId, issuingDate, validFor);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IndividualIdentification) {
            IndividualIdentification individualIdentification = (IndividualIdentification) obj;
            return Intrinsics.areEqual(this.f90827a, individualIdentification.f90827a) && Intrinsics.areEqual(this.f90828b, individualIdentification.f90828b) && Intrinsics.areEqual(this.f90829c, individualIdentification.f90829c) && Intrinsics.areEqual(this.f90830d, individualIdentification.f90830d) && Intrinsics.areEqual(this.f90831e, individualIdentification.f90831e);
        }
        return false;
    }

    @NotNull
    public final String getIdentificationId() {
        return this.f90827a;
    }

    @NotNull
    public final String getIdentificationType() {
        return this.f90828b;
    }

    @NotNull
    public final String getIdentificationVerificationId() {
        return this.f90829c;
    }

    @NotNull
    public final String getIssuingDate() {
        return this.f90830d;
    }

    @NotNull
    public final ValidFor getValidFor() {
        return this.f90831e;
    }

    public int hashCode() {
        return (((((((this.f90827a.hashCode() * 31) + this.f90828b.hashCode()) * 31) + this.f90829c.hashCode()) * 31) + this.f90830d.hashCode()) * 31) + this.f90831e.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f90827a;
        String str2 = this.f90828b;
        String str3 = this.f90829c;
        String str4 = this.f90830d;
        ValidFor validFor = this.f90831e;
        return "IndividualIdentification(identificationId=" + str + ", identificationType=" + str2 + ", identificationVerificationId=" + str3 + ", issuingDate=" + str4 + ", validFor=" + validFor + ")";
    }

    public IndividualIdentification(@NotNull String identificationId, @NotNull String identificationType, @NotNull String identificationVerificationId, @NotNull String issuingDate, @NotNull ValidFor validFor) {
        Intrinsics.checkNotNullParameter(identificationId, "identificationId");
        Intrinsics.checkNotNullParameter(identificationType, "identificationType");
        Intrinsics.checkNotNullParameter(identificationVerificationId, "identificationVerificationId");
        Intrinsics.checkNotNullParameter(issuingDate, "issuingDate");
        Intrinsics.checkNotNullParameter(validFor, "validFor");
        this.f90827a = identificationId;
        this.f90828b = identificationType;
        this.f90829c = identificationVerificationId;
        this.f90830d = issuingDate;
        this.f90831e = validFor;
    }

    public /* synthetic */ IndividualIdentification(String str, String str2, String str3, String str4, ValidFor validFor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? new ValidFor(null, 1, null) : validFor);
    }
}