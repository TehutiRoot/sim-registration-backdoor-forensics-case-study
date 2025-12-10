package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostAuthorizationRequest;", "", "featureCode", "", "rtrCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureCode", "()Ljava/lang/String;", "getRtrCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostAuthorizationRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostAuthorizationRequest {
    public static final int $stable = 0;
    @SerializedName("featureCode")
    @NotNull
    private final String featureCode;
    @SerializedName("rtrCode")
    @NotNull
    private final String rtrCode;

    public OnePre2PostAuthorizationRequest(@NotNull String featureCode, @NotNull String rtrCode) {
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        this.featureCode = featureCode;
        this.rtrCode = rtrCode;
    }

    public static /* synthetic */ OnePre2PostAuthorizationRequest copy$default(OnePre2PostAuthorizationRequest onePre2PostAuthorizationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostAuthorizationRequest.featureCode;
        }
        if ((i & 2) != 0) {
            str2 = onePre2PostAuthorizationRequest.rtrCode;
        }
        return onePre2PostAuthorizationRequest.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.featureCode;
    }

    @NotNull
    public final String component2() {
        return this.rtrCode;
    }

    @NotNull
    public final OnePre2PostAuthorizationRequest copy(@NotNull String featureCode, @NotNull String rtrCode) {
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        return new OnePre2PostAuthorizationRequest(featureCode, rtrCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostAuthorizationRequest) {
            OnePre2PostAuthorizationRequest onePre2PostAuthorizationRequest = (OnePre2PostAuthorizationRequest) obj;
            return Intrinsics.areEqual(this.featureCode, onePre2PostAuthorizationRequest.featureCode) && Intrinsics.areEqual(this.rtrCode, onePre2PostAuthorizationRequest.rtrCode);
        }
        return false;
    }

    @NotNull
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    public int hashCode() {
        return (this.featureCode.hashCode() * 31) + this.rtrCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.featureCode;
        String str2 = this.rtrCode;
        return "OnePre2PostAuthorizationRequest(featureCode=" + str + ", rtrCode=" + str2 + ")";
    }
}
