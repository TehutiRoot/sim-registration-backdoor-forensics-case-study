package th.p047co.dtac.android.dtacone.model.appOne.pre2post.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidateConsentResponse;", "", "data", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidateConsentDataResponse;", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidateConsentDataResponse;)V", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidateConsentDataResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostValidateConsentResponse */
/* loaded from: classes8.dex */
public final class OnePre2PostValidateConsentResponse {
    public static final int $stable = 0;
    @SerializedName("data")
    @NotNull
    private final OnePre2PostValidateConsentDataResponse data;

    public OnePre2PostValidateConsentResponse(@NotNull OnePre2PostValidateConsentDataResponse data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ OnePre2PostValidateConsentResponse copy$default(OnePre2PostValidateConsentResponse onePre2PostValidateConsentResponse, OnePre2PostValidateConsentDataResponse onePre2PostValidateConsentDataResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            onePre2PostValidateConsentDataResponse = onePre2PostValidateConsentResponse.data;
        }
        return onePre2PostValidateConsentResponse.copy(onePre2PostValidateConsentDataResponse);
    }

    @NotNull
    public final OnePre2PostValidateConsentDataResponse component1() {
        return this.data;
    }

    @NotNull
    public final OnePre2PostValidateConsentResponse copy(@NotNull OnePre2PostValidateConsentDataResponse data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new OnePre2PostValidateConsentResponse(data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnePre2PostValidateConsentResponse) && Intrinsics.areEqual(this.data, ((OnePre2PostValidateConsentResponse) obj).data);
    }

    @NotNull
    public final OnePre2PostValidateConsentDataResponse getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        OnePre2PostValidateConsentDataResponse onePre2PostValidateConsentDataResponse = this.data;
        return "OnePre2PostValidateConsentResponse(data=" + onePre2PostValidateConsentDataResponse + ")";
    }
}
