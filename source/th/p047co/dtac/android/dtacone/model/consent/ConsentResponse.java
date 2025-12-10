package th.p047co.dtac.android.dtacone.model.consent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/consent/ConsentResponse;", "", "mrtrConsentId", "", "consent", "", "consentVersionLabel", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getConsent", "()Ljava/lang/String;", "setConsent", "(Ljava/lang/String;)V", "getConsentVersionLabel", "getMrtrConsentId", "()Ljava/lang/Long;", "setMrtrConsentId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/consent/ConsentResponse;", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.consent.ConsentResponse */
/* loaded from: classes8.dex */
public final class ConsentResponse {
    public static final int $stable = 8;
    @SerializedName("consent")
    @Nullable
    private String consent;
    @SerializedName("consentVersionLabel")
    @Nullable
    private final String consentVersionLabel;
    @SerializedName("mrtrConsentId")
    @Nullable
    private Long mrtrConsentId;

    public ConsentResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ConsentResponse copy$default(ConsentResponse consentResponse, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = consentResponse.mrtrConsentId;
        }
        if ((i & 2) != 0) {
            str = consentResponse.consent;
        }
        if ((i & 4) != 0) {
            str2 = consentResponse.consentVersionLabel;
        }
        return consentResponse.copy(l, str, str2);
    }

    @Nullable
    public final Long component1() {
        return this.mrtrConsentId;
    }

    @Nullable
    public final String component2() {
        return this.consent;
    }

    @Nullable
    public final String component3() {
        return this.consentVersionLabel;
    }

    @NotNull
    public final ConsentResponse copy(@Nullable Long l, @Nullable String str, @Nullable String str2) {
        return new ConsentResponse(l, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentResponse) {
            ConsentResponse consentResponse = (ConsentResponse) obj;
            return Intrinsics.areEqual(this.mrtrConsentId, consentResponse.mrtrConsentId) && Intrinsics.areEqual(this.consent, consentResponse.consent) && Intrinsics.areEqual(this.consentVersionLabel, consentResponse.consentVersionLabel);
        }
        return false;
    }

    @Nullable
    public final String getConsent() {
        return this.consent;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @Nullable
    public final Long getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    public int hashCode() {
        Long l = this.mrtrConsentId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.consent;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consentVersionLabel;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setConsent(@Nullable String str) {
        this.consent = str;
    }

    public final void setMrtrConsentId(@Nullable Long l) {
        this.mrtrConsentId = l;
    }

    @NotNull
    public String toString() {
        Long l = this.mrtrConsentId;
        String str = this.consent;
        String str2 = this.consentVersionLabel;
        return "ConsentResponse(mrtrConsentId=" + l + ", consent=" + str + ", consentVersionLabel=" + str2 + ")";
    }

    public ConsentResponse(@Nullable Long l, @Nullable String str, @Nullable String str2) {
        this.mrtrConsentId = l;
        this.consent = str;
        this.consentVersionLabel = str2;
    }

    public /* synthetic */ ConsentResponse(Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
