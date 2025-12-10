package th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/DataValidateConsent;", "", "result", "", "consentTMN", "", "resultDesc", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getConsentTMN", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getResult", "()Ljava/lang/String;", "getResultDesc", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/DataValidateConsent;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.validate.DataValidateConsent */
/* loaded from: classes8.dex */
public final class DataValidateConsent {
    public static final int $stable = 0;
    @SerializedName("consentTMN")
    @Nullable
    private final Boolean consentTMN;
    @SerializedName("result")
    @Nullable
    private final String result;
    @SerializedName("resultDesc")
    @Nullable
    private final String resultDesc;

    public DataValidateConsent() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DataValidateConsent copy$default(DataValidateConsent dataValidateConsent, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataValidateConsent.result;
        }
        if ((i & 2) != 0) {
            bool = dataValidateConsent.consentTMN;
        }
        if ((i & 4) != 0) {
            str2 = dataValidateConsent.resultDesc;
        }
        return dataValidateConsent.copy(str, bool, str2);
    }

    @Nullable
    public final String component1() {
        return this.result;
    }

    @Nullable
    public final Boolean component2() {
        return this.consentTMN;
    }

    @Nullable
    public final String component3() {
        return this.resultDesc;
    }

    @NotNull
    public final DataValidateConsent copy(@Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
        return new DataValidateConsent(str, bool, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataValidateConsent) {
            DataValidateConsent dataValidateConsent = (DataValidateConsent) obj;
            return Intrinsics.areEqual(this.result, dataValidateConsent.result) && Intrinsics.areEqual(this.consentTMN, dataValidateConsent.consentTMN) && Intrinsics.areEqual(this.resultDesc, dataValidateConsent.resultDesc);
        }
        return false;
    }

    @Nullable
    public final Boolean getConsentTMN() {
        return this.consentTMN;
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
        Boolean bool = this.consentTMN;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.resultDesc;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.result;
        Boolean bool = this.consentTMN;
        String str2 = this.resultDesc;
        return "DataValidateConsent(result=" + str + ", consentTMN=" + bool + ", resultDesc=" + str2 + ")";
    }

    public DataValidateConsent(@Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
        this.result = str;
        this.consentTMN = bool;
        this.resultDesc = str2;
    }

    public /* synthetic */ DataValidateConsent(String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2);
    }
}