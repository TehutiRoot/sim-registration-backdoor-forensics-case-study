package th.p047co.dtac.android.dtacone.model.esim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/ActivationCodeRequest;", "", "simCardNumber", "", "userLAN", "userFormatType", "userCode", "pendingEsimCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPendingEsimCard", "()Ljava/lang/String;", "getSimCardNumber", "getUserCode", "getUserFormatType", "getUserLAN", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.ActivationCodeRequest */
/* loaded from: classes8.dex */
public final class ActivationCodeRequest {
    public static final int $stable = 0;
    @SerializedName("pendingEsimCard")
    @NotNull
    private final String pendingEsimCard;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userLAN")
    @Nullable
    private final String userLAN;

    public ActivationCodeRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ActivationCodeRequest copy$default(ActivationCodeRequest activationCodeRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activationCodeRequest.simCardNumber;
        }
        if ((i & 2) != 0) {
            str2 = activationCodeRequest.userLAN;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = activationCodeRequest.userFormatType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = activationCodeRequest.userCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = activationCodeRequest.pendingEsimCard;
        }
        return activationCodeRequest.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component2() {
        return this.userLAN;
    }

    @Nullable
    public final String component3() {
        return this.userFormatType;
    }

    @Nullable
    public final String component4() {
        return this.userCode;
    }

    @NotNull
    public final String component5() {
        return this.pendingEsimCard;
    }

    @NotNull
    public final ActivationCodeRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String pendingEsimCard) {
        Intrinsics.checkNotNullParameter(pendingEsimCard, "pendingEsimCard");
        return new ActivationCodeRequest(str, str2, str3, str4, pendingEsimCard);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivationCodeRequest) {
            ActivationCodeRequest activationCodeRequest = (ActivationCodeRequest) obj;
            return Intrinsics.areEqual(this.simCardNumber, activationCodeRequest.simCardNumber) && Intrinsics.areEqual(this.userLAN, activationCodeRequest.userLAN) && Intrinsics.areEqual(this.userFormatType, activationCodeRequest.userFormatType) && Intrinsics.areEqual(this.userCode, activationCodeRequest.userCode) && Intrinsics.areEqual(this.pendingEsimCard, activationCodeRequest.pendingEsimCard);
        }
        return false;
    }

    @NotNull
    public final String getPendingEsimCard() {
        return this.pendingEsimCard;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserLAN() {
        return this.userLAN;
    }

    public int hashCode() {
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userLAN;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userFormatType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userCode;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.pendingEsimCard.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.userLAN;
        String str3 = this.userFormatType;
        String str4 = this.userCode;
        String str5 = this.pendingEsimCard;
        return "ActivationCodeRequest(simCardNumber=" + str + ", userLAN=" + str2 + ", userFormatType=" + str3 + ", userCode=" + str4 + ", pendingEsimCard=" + str5 + ")";
    }

    public ActivationCodeRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String pendingEsimCard) {
        Intrinsics.checkNotNullParameter(pendingEsimCard, "pendingEsimCard");
        this.simCardNumber = str;
        this.userLAN = str2;
        this.userFormatType = str3;
        this.userCode = str4;
        this.pendingEsimCard = pendingEsimCard;
    }

    public /* synthetic */ ActivationCodeRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? "" : str5);
    }
}