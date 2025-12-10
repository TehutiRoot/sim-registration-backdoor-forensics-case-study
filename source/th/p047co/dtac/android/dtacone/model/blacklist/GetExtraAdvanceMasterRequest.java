package th.p047co.dtac.android.dtacone.model.blacklist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/GetExtraAdvanceMasterRequest;", "", "userFormatType", "", "userCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserCode", "()Ljava/lang/String;", "getUserFormatType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.blacklist.GetExtraAdvanceMasterRequest */
/* loaded from: classes8.dex */
public final class GetExtraAdvanceMasterRequest {
    public static final int $stable = 0;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private final String userFormatType;

    public GetExtraAdvanceMasterRequest(@NotNull String userFormatType, @NotNull String userCode) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        this.userFormatType = userFormatType;
        this.userCode = userCode;
    }

    public static /* synthetic */ GetExtraAdvanceMasterRequest copy$default(GetExtraAdvanceMasterRequest getExtraAdvanceMasterRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getExtraAdvanceMasterRequest.userFormatType;
        }
        if ((i & 2) != 0) {
            str2 = getExtraAdvanceMasterRequest.userCode;
        }
        return getExtraAdvanceMasterRequest.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.userFormatType;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final GetExtraAdvanceMasterRequest copy(@NotNull String userFormatType, @NotNull String userCode) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return new GetExtraAdvanceMasterRequest(userFormatType, userCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetExtraAdvanceMasterRequest) {
            GetExtraAdvanceMasterRequest getExtraAdvanceMasterRequest = (GetExtraAdvanceMasterRequest) obj;
            return Intrinsics.areEqual(this.userFormatType, getExtraAdvanceMasterRequest.userFormatType) && Intrinsics.areEqual(this.userCode, getExtraAdvanceMasterRequest.userCode);
        }
        return false;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    public int hashCode() {
        return (this.userFormatType.hashCode() * 31) + this.userCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userFormatType;
        String str2 = this.userCode;
        return "GetExtraAdvanceMasterRequest(userFormatType=" + str + ", userCode=" + str2 + ")";
    }
}
