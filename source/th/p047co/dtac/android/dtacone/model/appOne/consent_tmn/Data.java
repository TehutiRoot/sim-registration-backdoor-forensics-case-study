package th.p047co.dtac.android.dtacone.model.appOne.consent_tmn;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/Data;", "", "result", "", "consentStatus", "displayConsent", "", "resultDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getConsentStatus", "()Ljava/lang/String;", "getDisplayConsent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getResult", "getResultDesc", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/Data;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.consent_tmn.Data */
/* loaded from: classes8.dex */
public final class Data {
    public static final int $stable = 0;
    @SerializedName("consentStatus")
    @Nullable
    private final String consentStatus;
    @SerializedName("displayConsent")
    @Nullable
    private final Boolean displayConsent;
    @SerializedName("result")
    @Nullable
    private final String result;
    @SerializedName("resultDesc")
    @Nullable
    private final String resultDesc;

    public Data() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = data.result;
        }
        if ((i & 2) != 0) {
            str2 = data.consentStatus;
        }
        if ((i & 4) != 0) {
            bool = data.displayConsent;
        }
        if ((i & 8) != 0) {
            str3 = data.resultDesc;
        }
        return data.copy(str, str2, bool, str3);
    }

    @Nullable
    public final String component1() {
        return this.result;
    }

    @Nullable
    public final String component2() {
        return this.consentStatus;
    }

    @Nullable
    public final Boolean component3() {
        return this.displayConsent;
    }

    @Nullable
    public final String component4() {
        return this.resultDesc;
    }

    @NotNull
    public final Data copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        return new Data(str, str2, bool, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.result, data.result) && Intrinsics.areEqual(this.consentStatus, data.consentStatus) && Intrinsics.areEqual(this.displayConsent, data.displayConsent) && Intrinsics.areEqual(this.resultDesc, data.resultDesc);
        }
        return false;
    }

    @Nullable
    public final String getConsentStatus() {
        return this.consentStatus;
    }

    @Nullable
    public final Boolean getDisplayConsent() {
        return this.displayConsent;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    @Nullable
    public final String getResultDesc() {
        return this.resultDesc;
    }

    public int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.consentStatus;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.displayConsent;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.resultDesc;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.result;
        String str2 = this.consentStatus;
        Boolean bool = this.displayConsent;
        String str3 = this.resultDesc;
        return "Data(result=" + str + ", consentStatus=" + str2 + ", displayConsent=" + bool + ", resultDesc=" + str3 + ")";
    }

    public Data(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        this.result = str;
        this.consentStatus = str2;
        this.displayConsent = bool;
        this.resultDesc = str3;
    }

    public /* synthetic */ Data(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3);
    }
}
