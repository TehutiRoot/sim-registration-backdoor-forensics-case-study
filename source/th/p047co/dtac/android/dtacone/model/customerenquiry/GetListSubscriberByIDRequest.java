package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetListSubscriberByIDRequest;", "", "userLan", "", "userCode", "idNumber", "omrLocation", "userFormatType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "setIdNumber", "(Ljava/lang/String;)V", "getOmrLocation", "setOmrLocation", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetListSubscriberByIDRequest */
/* loaded from: classes8.dex */
public final class GetListSubscriberByIDRequest {
    public static final int $stable = 8;
    @SerializedName("idNumber")
    @NotNull
    private String idNumber;
    @SerializedName("omrLocation")
    @NotNull
    private String omrLocation;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;

    public GetListSubscriberByIDRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String idNumber, @NotNull String omrLocation, @NotNull String userFormatType) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(omrLocation, "omrLocation");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        this.userLan = userLan;
        this.userCode = userCode;
        this.idNumber = idNumber;
        this.omrLocation = omrLocation;
        this.userFormatType = userFormatType;
    }

    public static /* synthetic */ GetListSubscriberByIDRequest copy$default(GetListSubscriberByIDRequest getListSubscriberByIDRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getListSubscriberByIDRequest.userLan;
        }
        if ((i & 2) != 0) {
            str2 = getListSubscriberByIDRequest.userCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = getListSubscriberByIDRequest.idNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = getListSubscriberByIDRequest.omrLocation;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = getListSubscriberByIDRequest.userFormatType;
        }
        return getListSubscriberByIDRequest.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.idNumber;
    }

    @NotNull
    public final String component4() {
        return this.omrLocation;
    }

    @NotNull
    public final String component5() {
        return this.userFormatType;
    }

    @NotNull
    public final GetListSubscriberByIDRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String idNumber, @NotNull String omrLocation, @NotNull String userFormatType) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(omrLocation, "omrLocation");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        return new GetListSubscriberByIDRequest(userLan, userCode, idNumber, omrLocation, userFormatType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetListSubscriberByIDRequest) {
            GetListSubscriberByIDRequest getListSubscriberByIDRequest = (GetListSubscriberByIDRequest) obj;
            return Intrinsics.areEqual(this.userLan, getListSubscriberByIDRequest.userLan) && Intrinsics.areEqual(this.userCode, getListSubscriberByIDRequest.userCode) && Intrinsics.areEqual(this.idNumber, getListSubscriberByIDRequest.idNumber) && Intrinsics.areEqual(this.omrLocation, getListSubscriberByIDRequest.omrLocation) && Intrinsics.areEqual(this.userFormatType, getListSubscriberByIDRequest.userFormatType);
        }
        return false;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getOmrLocation() {
        return this.omrLocation;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.idNumber.hashCode()) * 31) + this.omrLocation.hashCode()) * 31) + this.userFormatType.hashCode();
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumber = str;
    }

    public final void setOmrLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.omrLocation = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserFormatType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userFormatType = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.idNumber;
        String str4 = this.omrLocation;
        String str5 = this.userFormatType;
        return "GetListSubscriberByIDRequest(userLan=" + str + ", userCode=" + str2 + ", idNumber=" + str3 + ", omrLocation=" + str4 + ", userFormatType=" + str5 + ")";
    }

    public /* synthetic */ GetListSubscriberByIDRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, str5);
    }
}
