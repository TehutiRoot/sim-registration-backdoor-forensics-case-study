package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderConsentInfo;", "", "isConsent", "", "consentResult", "isEsign", "esignResult", "isTmnConsent", "tmnResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConsentResult", "()Ljava/lang/String;", "getEsignResult", "getTmnResult", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderConsentInfo */
/* loaded from: classes8.dex */
public final class SaveOrderConsentInfo {
    public static final int $stable = 0;
    @SerializedName("consentResult")
    @NotNull
    private final String consentResult;
    @SerializedName("esignResult")
    @NotNull
    private final String esignResult;
    @SerializedName("isConsent")
    @NotNull
    private final String isConsent;
    @SerializedName("isEsign")
    @NotNull
    private final String isEsign;
    @SerializedName("isTmnConsent")
    @NotNull
    private final String isTmnConsent;
    @SerializedName("tmnResult")
    @NotNull
    private final String tmnResult;

    public SaveOrderConsentInfo(@NotNull String isConsent, @NotNull String consentResult, @NotNull String isEsign, @NotNull String esignResult, @NotNull String isTmnConsent, @NotNull String tmnResult) {
        Intrinsics.checkNotNullParameter(isConsent, "isConsent");
        Intrinsics.checkNotNullParameter(consentResult, "consentResult");
        Intrinsics.checkNotNullParameter(isEsign, "isEsign");
        Intrinsics.checkNotNullParameter(esignResult, "esignResult");
        Intrinsics.checkNotNullParameter(isTmnConsent, "isTmnConsent");
        Intrinsics.checkNotNullParameter(tmnResult, "tmnResult");
        this.isConsent = isConsent;
        this.consentResult = consentResult;
        this.isEsign = isEsign;
        this.esignResult = esignResult;
        this.isTmnConsent = isTmnConsent;
        this.tmnResult = tmnResult;
    }

    public static /* synthetic */ SaveOrderConsentInfo copy$default(SaveOrderConsentInfo saveOrderConsentInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveOrderConsentInfo.isConsent;
        }
        if ((i & 2) != 0) {
            str2 = saveOrderConsentInfo.consentResult;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = saveOrderConsentInfo.isEsign;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = saveOrderConsentInfo.esignResult;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = saveOrderConsentInfo.isTmnConsent;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = saveOrderConsentInfo.tmnResult;
        }
        return saveOrderConsentInfo.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.isConsent;
    }

    @NotNull
    public final String component2() {
        return this.consentResult;
    }

    @NotNull
    public final String component3() {
        return this.isEsign;
    }

    @NotNull
    public final String component4() {
        return this.esignResult;
    }

    @NotNull
    public final String component5() {
        return this.isTmnConsent;
    }

    @NotNull
    public final String component6() {
        return this.tmnResult;
    }

    @NotNull
    public final SaveOrderConsentInfo copy(@NotNull String isConsent, @NotNull String consentResult, @NotNull String isEsign, @NotNull String esignResult, @NotNull String isTmnConsent, @NotNull String tmnResult) {
        Intrinsics.checkNotNullParameter(isConsent, "isConsent");
        Intrinsics.checkNotNullParameter(consentResult, "consentResult");
        Intrinsics.checkNotNullParameter(isEsign, "isEsign");
        Intrinsics.checkNotNullParameter(esignResult, "esignResult");
        Intrinsics.checkNotNullParameter(isTmnConsent, "isTmnConsent");
        Intrinsics.checkNotNullParameter(tmnResult, "tmnResult");
        return new SaveOrderConsentInfo(isConsent, consentResult, isEsign, esignResult, isTmnConsent, tmnResult);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveOrderConsentInfo) {
            SaveOrderConsentInfo saveOrderConsentInfo = (SaveOrderConsentInfo) obj;
            return Intrinsics.areEqual(this.isConsent, saveOrderConsentInfo.isConsent) && Intrinsics.areEqual(this.consentResult, saveOrderConsentInfo.consentResult) && Intrinsics.areEqual(this.isEsign, saveOrderConsentInfo.isEsign) && Intrinsics.areEqual(this.esignResult, saveOrderConsentInfo.esignResult) && Intrinsics.areEqual(this.isTmnConsent, saveOrderConsentInfo.isTmnConsent) && Intrinsics.areEqual(this.tmnResult, saveOrderConsentInfo.tmnResult);
        }
        return false;
    }

    @NotNull
    public final String getConsentResult() {
        return this.consentResult;
    }

    @NotNull
    public final String getEsignResult() {
        return this.esignResult;
    }

    @NotNull
    public final String getTmnResult() {
        return this.tmnResult;
    }

    public int hashCode() {
        return (((((((((this.isConsent.hashCode() * 31) + this.consentResult.hashCode()) * 31) + this.isEsign.hashCode()) * 31) + this.esignResult.hashCode()) * 31) + this.isTmnConsent.hashCode()) * 31) + this.tmnResult.hashCode();
    }

    @NotNull
    public final String isConsent() {
        return this.isConsent;
    }

    @NotNull
    public final String isEsign() {
        return this.isEsign;
    }

    @NotNull
    public final String isTmnConsent() {
        return this.isTmnConsent;
    }

    @NotNull
    public String toString() {
        String str = this.isConsent;
        String str2 = this.consentResult;
        String str3 = this.isEsign;
        String str4 = this.esignResult;
        String str5 = this.isTmnConsent;
        String str6 = this.tmnResult;
        return "SaveOrderConsentInfo(isConsent=" + str + ", consentResult=" + str2 + ", isEsign=" + str3 + ", esignResult=" + str4 + ", isTmnConsent=" + str5 + ", tmnResult=" + str6 + ")";
    }
}
