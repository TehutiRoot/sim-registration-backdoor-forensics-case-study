package th.p047co.dtac.android.dtacone.model.appOne.consent_tmn;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/DataCreate;", "", "result", "", "preregisterId", "verificationStatus", "resultDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPreregisterId", "()Ljava/lang/String;", "getResult", "getResultDesc", "getVerificationStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.consent_tmn.DataCreate */
/* loaded from: classes8.dex */
public final class DataCreate {
    public static final int $stable = 0;
    @SerializedName("preregisterId")
    @Nullable
    private final String preregisterId;
    @SerializedName("result")
    @Nullable
    private final String result;
    @SerializedName("resultDesc")
    @Nullable
    private final String resultDesc;
    @SerializedName("verificationStatus")
    @Nullable
    private final String verificationStatus;

    public DataCreate() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DataCreate copy$default(DataCreate dataCreate, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataCreate.result;
        }
        if ((i & 2) != 0) {
            str2 = dataCreate.preregisterId;
        }
        if ((i & 4) != 0) {
            str3 = dataCreate.verificationStatus;
        }
        if ((i & 8) != 0) {
            str4 = dataCreate.resultDesc;
        }
        return dataCreate.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.result;
    }

    @Nullable
    public final String component2() {
        return this.preregisterId;
    }

    @Nullable
    public final String component3() {
        return this.verificationStatus;
    }

    @Nullable
    public final String component4() {
        return this.resultDesc;
    }

    @NotNull
    public final DataCreate copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new DataCreate(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataCreate) {
            DataCreate dataCreate = (DataCreate) obj;
            return Intrinsics.areEqual(this.result, dataCreate.result) && Intrinsics.areEqual(this.preregisterId, dataCreate.preregisterId) && Intrinsics.areEqual(this.verificationStatus, dataCreate.verificationStatus) && Intrinsics.areEqual(this.resultDesc, dataCreate.resultDesc);
        }
        return false;
    }

    @Nullable
    public final String getPreregisterId() {
        return this.preregisterId;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    @Nullable
    public final String getResultDesc() {
        return this.resultDesc;
    }

    @Nullable
    public final String getVerificationStatus() {
        return this.verificationStatus;
    }

    public int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preregisterId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verificationStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.resultDesc;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.result;
        String str2 = this.preregisterId;
        String str3 = this.verificationStatus;
        String str4 = this.resultDesc;
        return "DataCreate(result=" + str + ", preregisterId=" + str2 + ", verificationStatus=" + str3 + ", resultDesc=" + str4 + ")";
    }

    public DataCreate(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.result = str;
        this.preregisterId = str2;
        this.verificationStatus = str3;
        this.resultDesc = str4;
    }

    public /* synthetic */ DataCreate(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
