package th.p047co.dtac.android.dtacone.model.appOne.consent_tmn;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneCreateConsentTMNRequest;", "", Scopes.PROFILE, "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/Profile;", "transactionId", "", "timestamp", "(Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/Profile;Ljava/lang/String;Ljava/lang/String;)V", "getProfile", "()Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/Profile;", "getTimestamp", "()Ljava/lang/String;", "getTransactionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.consent_tmn.OneCreateConsentTMNRequest */
/* loaded from: classes8.dex */
public final class OneCreateConsentTMNRequest {
    public static final int $stable = 0;
    @SerializedName(Scopes.PROFILE)
    @Nullable
    private final Profile profile;
    @SerializedName("timestamp")
    @Nullable
    private final String timestamp;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;

    public OneCreateConsentTMNRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneCreateConsentTMNRequest copy$default(OneCreateConsentTMNRequest oneCreateConsentTMNRequest, Profile profile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            profile = oneCreateConsentTMNRequest.profile;
        }
        if ((i & 2) != 0) {
            str = oneCreateConsentTMNRequest.transactionId;
        }
        if ((i & 4) != 0) {
            str2 = oneCreateConsentTMNRequest.timestamp;
        }
        return oneCreateConsentTMNRequest.copy(profile, str, str2);
    }

    @Nullable
    public final Profile component1() {
        return this.profile;
    }

    @Nullable
    public final String component2() {
        return this.transactionId;
    }

    @Nullable
    public final String component3() {
        return this.timestamp;
    }

    @NotNull
    public final OneCreateConsentTMNRequest copy(@Nullable Profile profile, @Nullable String str, @Nullable String str2) {
        return new OneCreateConsentTMNRequest(profile, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCreateConsentTMNRequest) {
            OneCreateConsentTMNRequest oneCreateConsentTMNRequest = (OneCreateConsentTMNRequest) obj;
            return Intrinsics.areEqual(this.profile, oneCreateConsentTMNRequest.profile) && Intrinsics.areEqual(this.transactionId, oneCreateConsentTMNRequest.transactionId) && Intrinsics.areEqual(this.timestamp, oneCreateConsentTMNRequest.timestamp);
        }
        return false;
    }

    @Nullable
    public final Profile getProfile() {
        return this.profile;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        Profile profile = this.profile;
        int hashCode = (profile == null ? 0 : profile.hashCode()) * 31;
        String str = this.transactionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timestamp;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Profile profile = this.profile;
        String str = this.transactionId;
        String str2 = this.timestamp;
        return "OneCreateConsentTMNRequest(profile=" + profile + ", transactionId=" + str + ", timestamp=" + str2 + ")";
    }

    public OneCreateConsentTMNRequest(@Nullable Profile profile, @Nullable String str, @Nullable String str2) {
        this.profile = profile;
        this.transactionId = str;
        this.timestamp = str2;
    }

    public /* synthetic */ OneCreateConsentTMNRequest(Profile profile, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : profile, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
