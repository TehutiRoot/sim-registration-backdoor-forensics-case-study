package th.p047co.dtac.android.dtacone.model.consent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/consent/GetConsentVersionTypeResponse;", "", "consentVersion", "", "consentType", "isShowConsent", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getConsentType", "()Ljava/lang/String;", "getConsentVersion", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/consent/GetConsentVersionTypeResponse;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.consent.GetConsentVersionTypeResponse */
/* loaded from: classes8.dex */
public final class GetConsentVersionTypeResponse {
    public static final int $stable = 0;
    @SerializedName("consentType")
    @Nullable
    private final String consentType;
    @SerializedName("consentVersion")
    @Nullable
    private final String consentVersion;
    @SerializedName("isShowConsent")
    @Nullable
    private final Boolean isShowConsent;

    public GetConsentVersionTypeResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ GetConsentVersionTypeResponse copy$default(GetConsentVersionTypeResponse getConsentVersionTypeResponse, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getConsentVersionTypeResponse.consentVersion;
        }
        if ((i & 2) != 0) {
            str2 = getConsentVersionTypeResponse.consentType;
        }
        if ((i & 4) != 0) {
            bool = getConsentVersionTypeResponse.isShowConsent;
        }
        return getConsentVersionTypeResponse.copy(str, str2, bool);
    }

    @Nullable
    public final String component1() {
        return this.consentVersion;
    }

    @Nullable
    public final String component2() {
        return this.consentType;
    }

    @Nullable
    public final Boolean component3() {
        return this.isShowConsent;
    }

    @NotNull
    public final GetConsentVersionTypeResponse copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        return new GetConsentVersionTypeResponse(str, str2, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentVersionTypeResponse) {
            GetConsentVersionTypeResponse getConsentVersionTypeResponse = (GetConsentVersionTypeResponse) obj;
            return Intrinsics.areEqual(this.consentVersion, getConsentVersionTypeResponse.consentVersion) && Intrinsics.areEqual(this.consentType, getConsentVersionTypeResponse.consentType) && Intrinsics.areEqual(this.isShowConsent, getConsentVersionTypeResponse.isShowConsent);
        }
        return false;
    }

    @Nullable
    public final String getConsentType() {
        return this.consentType;
    }

    @Nullable
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    public int hashCode() {
        String str = this.consentVersion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.consentType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isShowConsent;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isShowConsent() {
        return this.isShowConsent;
    }

    @NotNull
    public String toString() {
        String str = this.consentVersion;
        String str2 = this.consentType;
        Boolean bool = this.isShowConsent;
        return "GetConsentVersionTypeResponse(consentVersion=" + str + ", consentType=" + str2 + ", isShowConsent=" + bool + ")";
    }

    public GetConsentVersionTypeResponse(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.consentVersion = str;
        this.consentType = str2;
        this.isShowConsent = bool;
    }

    public /* synthetic */ GetConsentVersionTypeResponse(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}