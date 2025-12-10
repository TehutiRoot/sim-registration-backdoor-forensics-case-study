package th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;", "", "rtrTransactionId", "", NotificationCompat.CATEGORY_STATUS, "isActivateFlag", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRtrTransactionId", "()Ljava/lang/String;", "setRtrTransactionId", "(Ljava/lang/String;)V", "getStatus", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid.register.response.MrtrPrepaidRegisterResponse */
/* loaded from: classes8.dex */
public final class MrtrPrepaidRegisterResponse {
    public static final int $stable = 8;
    @SerializedName("isActivateFlag")
    @Nullable
    private final Boolean isActivateFlag;
    @SerializedName("rtrTransactionId")
    @Nullable
    private String rtrTransactionId;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    public MrtrPrepaidRegisterResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MrtrPrepaidRegisterResponse copy$default(MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mrtrPrepaidRegisterResponse.rtrTransactionId;
        }
        if ((i & 2) != 0) {
            str2 = mrtrPrepaidRegisterResponse.status;
        }
        if ((i & 4) != 0) {
            bool = mrtrPrepaidRegisterResponse.isActivateFlag;
        }
        return mrtrPrepaidRegisterResponse.copy(str, str2, bool);
    }

    @Nullable
    public final String component1() {
        return this.rtrTransactionId;
    }

    @Nullable
    public final String component2() {
        return this.status;
    }

    @Nullable
    public final Boolean component3() {
        return this.isActivateFlag;
    }

    @NotNull
    public final MrtrPrepaidRegisterResponse copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        return new MrtrPrepaidRegisterResponse(str, str2, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPrepaidRegisterResponse) {
            MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse = (MrtrPrepaidRegisterResponse) obj;
            return Intrinsics.areEqual(this.rtrTransactionId, mrtrPrepaidRegisterResponse.rtrTransactionId) && Intrinsics.areEqual(this.status, mrtrPrepaidRegisterResponse.status) && Intrinsics.areEqual(this.isActivateFlag, mrtrPrepaidRegisterResponse.isActivateFlag);
        }
        return false;
    }

    @Nullable
    public final String getRtrTransactionId() {
        return this.rtrTransactionId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.rtrTransactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isActivateFlag;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isActivateFlag() {
        return this.isActivateFlag;
    }

    public final void setRtrTransactionId(@Nullable String str) {
        this.rtrTransactionId = str;
    }

    @NotNull
    public String toString() {
        String str = this.rtrTransactionId;
        String str2 = this.status;
        Boolean bool = this.isActivateFlag;
        return "MrtrPrepaidRegisterResponse(rtrTransactionId=" + str + ", status=" + str2 + ", isActivateFlag=" + bool + ")";
    }

    public MrtrPrepaidRegisterResponse(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.rtrTransactionId = str;
        this.status = str2;
        this.isActivateFlag = bool;
    }

    public /* synthetic */ MrtrPrepaidRegisterResponse(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}