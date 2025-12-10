package th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationRequest;", "", "featureCode", "", "rtrCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureCode", "()Ljava/lang/String;", "setFeatureCode", "(Ljava/lang/String;)V", "getRtrCode", "setRtrCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationRequest */
/* loaded from: classes8.dex */
public final class MnpAuthorizationRequest {
    public static final int $stable = 8;
    @SerializedName("featureCode")
    @Nullable
    private String featureCode;
    @SerializedName("rtrCode")
    @Nullable
    private String rtrCode;

    public MnpAuthorizationRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MnpAuthorizationRequest copy$default(MnpAuthorizationRequest mnpAuthorizationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mnpAuthorizationRequest.featureCode;
        }
        if ((i & 2) != 0) {
            str2 = mnpAuthorizationRequest.rtrCode;
        }
        return mnpAuthorizationRequest.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.featureCode;
    }

    @Nullable
    public final String component2() {
        return this.rtrCode;
    }

    @NotNull
    public final MnpAuthorizationRequest copy(@Nullable String str, @Nullable String str2) {
        return new MnpAuthorizationRequest(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MnpAuthorizationRequest) {
            MnpAuthorizationRequest mnpAuthorizationRequest = (MnpAuthorizationRequest) obj;
            return Intrinsics.areEqual(this.featureCode, mnpAuthorizationRequest.featureCode) && Intrinsics.areEqual(this.rtrCode, mnpAuthorizationRequest.rtrCode);
        }
        return false;
    }

    @Nullable
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @Nullable
    public final String getRtrCode() {
        return this.rtrCode;
    }

    public int hashCode() {
        String str = this.featureCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rtrCode;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFeatureCode(@Nullable String str) {
        this.featureCode = str;
    }

    public final void setRtrCode(@Nullable String str) {
        this.rtrCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.featureCode;
        String str2 = this.rtrCode;
        return "MnpAuthorizationRequest(featureCode=" + str + ", rtrCode=" + str2 + ")";
    }

    public MnpAuthorizationRequest(@Nullable String str, @Nullable String str2) {
        this.featureCode = str;
        this.rtrCode = str2;
    }

    public /* synthetic */ MnpAuthorizationRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}