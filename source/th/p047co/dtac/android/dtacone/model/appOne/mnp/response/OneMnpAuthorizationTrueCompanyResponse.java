package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyResponse;", "", "data", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyData;", "(Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyData;)V", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpAuthorizationTrueCompanyResponse */
/* loaded from: classes8.dex */
public final class OneMnpAuthorizationTrueCompanyResponse {
    public static final int $stable = 8;
    @SerializedName("data")
    @Nullable
    private final OneMnpAuthorizationTrueCompanyData data;

    public OneMnpAuthorizationTrueCompanyResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneMnpAuthorizationTrueCompanyResponse copy$default(OneMnpAuthorizationTrueCompanyResponse oneMnpAuthorizationTrueCompanyResponse, OneMnpAuthorizationTrueCompanyData oneMnpAuthorizationTrueCompanyData, int i, Object obj) {
        if ((i & 1) != 0) {
            oneMnpAuthorizationTrueCompanyData = oneMnpAuthorizationTrueCompanyResponse.data;
        }
        return oneMnpAuthorizationTrueCompanyResponse.copy(oneMnpAuthorizationTrueCompanyData);
    }

    @Nullable
    public final OneMnpAuthorizationTrueCompanyData component1() {
        return this.data;
    }

    @NotNull
    public final OneMnpAuthorizationTrueCompanyResponse copy(@Nullable OneMnpAuthorizationTrueCompanyData oneMnpAuthorizationTrueCompanyData) {
        return new OneMnpAuthorizationTrueCompanyResponse(oneMnpAuthorizationTrueCompanyData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneMnpAuthorizationTrueCompanyResponse) && Intrinsics.areEqual(this.data, ((OneMnpAuthorizationTrueCompanyResponse) obj).data);
    }

    @Nullable
    public final OneMnpAuthorizationTrueCompanyData getData() {
        return this.data;
    }

    public int hashCode() {
        OneMnpAuthorizationTrueCompanyData oneMnpAuthorizationTrueCompanyData = this.data;
        if (oneMnpAuthorizationTrueCompanyData == null) {
            return 0;
        }
        return oneMnpAuthorizationTrueCompanyData.hashCode();
    }

    @NotNull
    public String toString() {
        OneMnpAuthorizationTrueCompanyData oneMnpAuthorizationTrueCompanyData = this.data;
        return "OneMnpAuthorizationTrueCompanyResponse(data=" + oneMnpAuthorizationTrueCompanyData + ")";
    }

    public OneMnpAuthorizationTrueCompanyResponse(@Nullable OneMnpAuthorizationTrueCompanyData oneMnpAuthorizationTrueCompanyData) {
        this.data = oneMnpAuthorizationTrueCompanyData;
    }

    public /* synthetic */ OneMnpAuthorizationTrueCompanyResponse(OneMnpAuthorizationTrueCompanyData oneMnpAuthorizationTrueCompanyData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneMnpAuthorizationTrueCompanyData);
    }
}
