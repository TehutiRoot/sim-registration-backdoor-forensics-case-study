package th.p047co.dtac.android.dtacone.model.appOne.consent_tmn;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentResponse;", "", "consent", "", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "(Ljava/util/List;)V", "getConsent", "()Ljava/util/List;", "setConsent", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentResponse */
/* loaded from: classes8.dex */
public final class OneConsentResponse {
    public static final int $stable = 8;
    @SerializedName("consent")
    @Nullable
    private List<ConsentNonTelco> consent;

    public OneConsentResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneConsentResponse copy$default(OneConsentResponse oneConsentResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oneConsentResponse.consent;
        }
        return oneConsentResponse.copy(list);
    }

    @Nullable
    public final List<ConsentNonTelco> component1() {
        return this.consent;
    }

    @NotNull
    public final OneConsentResponse copy(@Nullable List<ConsentNonTelco> list) {
        return new OneConsentResponse(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneConsentResponse) && Intrinsics.areEqual(this.consent, ((OneConsentResponse) obj).consent);
    }

    @Nullable
    public final List<ConsentNonTelco> getConsent() {
        return this.consent;
    }

    public int hashCode() {
        List<ConsentNonTelco> list = this.consent;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setConsent(@Nullable List<ConsentNonTelco> list) {
        this.consent = list;
    }

    @NotNull
    public String toString() {
        List<ConsentNonTelco> list = this.consent;
        return "OneConsentResponse(consent=" + list + ")";
    }

    public OneConsentResponse(@Nullable List<ConsentNonTelco> list) {
        this.consent = list;
    }

    public /* synthetic */ OneConsentResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
