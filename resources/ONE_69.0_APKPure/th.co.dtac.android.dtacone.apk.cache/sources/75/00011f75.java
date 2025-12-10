package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.register;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/FaceCompareResponseSubmit;", "", "confidence", "", "attempted", "", "message", "knowYourCustomer", "", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAttempted", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConfidence", "()Ljava/lang/String;", "getKnowYourCustomer", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/register/FaceCompareResponseSubmit;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.register.FaceCompareResponseSubmit */
/* loaded from: classes8.dex */
public final class FaceCompareResponseSubmit {
    public static final int $stable = 0;
    @SerializedName("attempted")
    @Nullable
    private final Integer attempted;
    @SerializedName("confidence")
    @Nullable
    private final String confidence;
    @SerializedName("knowYourCustomer")
    @Nullable
    private final Boolean knowYourCustomer;
    @SerializedName("message")
    @Nullable
    private final String message;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    public FaceCompareResponseSubmit() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FaceCompareResponseSubmit copy$default(FaceCompareResponseSubmit faceCompareResponseSubmit, String str, Integer num, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceCompareResponseSubmit.confidence;
        }
        if ((i & 2) != 0) {
            num = faceCompareResponseSubmit.attempted;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = faceCompareResponseSubmit.message;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            bool = faceCompareResponseSubmit.knowYourCustomer;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str3 = faceCompareResponseSubmit.status;
        }
        return faceCompareResponseSubmit.copy(str, num2, str4, bool2, str3);
    }

    @Nullable
    public final String component1() {
        return this.confidence;
    }

    @Nullable
    public final Integer component2() {
        return this.attempted;
    }

    @Nullable
    public final String component3() {
        return this.message;
    }

    @Nullable
    public final Boolean component4() {
        return this.knowYourCustomer;
    }

    @Nullable
    public final String component5() {
        return this.status;
    }

    @NotNull
    public final FaceCompareResponseSubmit copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        return new FaceCompareResponseSubmit(str, num, str2, bool, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaceCompareResponseSubmit) {
            FaceCompareResponseSubmit faceCompareResponseSubmit = (FaceCompareResponseSubmit) obj;
            return Intrinsics.areEqual(this.confidence, faceCompareResponseSubmit.confidence) && Intrinsics.areEqual(this.attempted, faceCompareResponseSubmit.attempted) && Intrinsics.areEqual(this.message, faceCompareResponseSubmit.message) && Intrinsics.areEqual(this.knowYourCustomer, faceCompareResponseSubmit.knowYourCustomer) && Intrinsics.areEqual(this.status, faceCompareResponseSubmit.status);
        }
        return false;
    }

    @Nullable
    public final Integer getAttempted() {
        return this.attempted;
    }

    @Nullable
    public final String getConfidence() {
        return this.confidence;
    }

    @Nullable
    public final Boolean getKnowYourCustomer() {
        return this.knowYourCustomer;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.confidence;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.attempted;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.knowYourCustomer;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.status;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.confidence;
        Integer num = this.attempted;
        String str2 = this.message;
        Boolean bool = this.knowYourCustomer;
        String str3 = this.status;
        return "FaceCompareResponseSubmit(confidence=" + str + ", attempted=" + num + ", message=" + str2 + ", knowYourCustomer=" + bool + ", status=" + str3 + ")";
    }

    public FaceCompareResponseSubmit(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        this.confidence = str;
        this.attempted = num;
        this.message = str2;
        this.knowYourCustomer = bool;
        this.status = str3;
    }

    public /* synthetic */ FaceCompareResponseSubmit(String str, Integer num, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str3);
    }
}