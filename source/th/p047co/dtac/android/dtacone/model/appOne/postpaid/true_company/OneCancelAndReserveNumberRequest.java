package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCancelAndReserveNumberRequest;", "", "idType", "", "dtrCode", "msisdnCancel", "msisdn", "idNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDtrCode", "()Ljava/lang/String;", "getIdNumber", "getIdType", "getMsisdn", "getMsisdnCancel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCancelAndReserveNumberRequest */
/* loaded from: classes8.dex */
public final class OneCancelAndReserveNumberRequest {
    public static final int $stable = 0;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("idType")
    @Nullable
    private final String idType;
    @SerializedName("msisdn")
    @Nullable
    private final String msisdn;
    @SerializedName("msisdnCancel")
    @Nullable
    private final String msisdnCancel;

    public OneCancelAndReserveNumberRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OneCancelAndReserveNumberRequest copy$default(OneCancelAndReserveNumberRequest oneCancelAndReserveNumberRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneCancelAndReserveNumberRequest.idType;
        }
        if ((i & 2) != 0) {
            str2 = oneCancelAndReserveNumberRequest.dtrCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneCancelAndReserveNumberRequest.msisdnCancel;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneCancelAndReserveNumberRequest.msisdn;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = oneCancelAndReserveNumberRequest.idNumber;
        }
        return oneCancelAndReserveNumberRequest.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.idType;
    }

    @Nullable
    public final String component2() {
        return this.dtrCode;
    }

    @Nullable
    public final String component3() {
        return this.msisdnCancel;
    }

    @Nullable
    public final String component4() {
        return this.msisdn;
    }

    @Nullable
    public final String component5() {
        return this.idNumber;
    }

    @NotNull
    public final OneCancelAndReserveNumberRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new OneCancelAndReserveNumberRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCancelAndReserveNumberRequest) {
            OneCancelAndReserveNumberRequest oneCancelAndReserveNumberRequest = (OneCancelAndReserveNumberRequest) obj;
            return Intrinsics.areEqual(this.idType, oneCancelAndReserveNumberRequest.idType) && Intrinsics.areEqual(this.dtrCode, oneCancelAndReserveNumberRequest.dtrCode) && Intrinsics.areEqual(this.msisdnCancel, oneCancelAndReserveNumberRequest.msisdnCancel) && Intrinsics.areEqual(this.msisdn, oneCancelAndReserveNumberRequest.msisdn) && Intrinsics.areEqual(this.idNumber, oneCancelAndReserveNumberRequest.idNumber);
        }
        return false;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final String getMsisdn() {
        return this.msisdn;
    }

    @Nullable
    public final String getMsisdnCancel() {
        return this.msisdnCancel;
    }

    public int hashCode() {
        String str = this.idType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dtrCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.msisdnCancel;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.msisdn;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.idNumber;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.idType;
        String str2 = this.dtrCode;
        String str3 = this.msisdnCancel;
        String str4 = this.msisdn;
        String str5 = this.idNumber;
        return "OneCancelAndReserveNumberRequest(idType=" + str + ", dtrCode=" + str2 + ", msisdnCancel=" + str3 + ", msisdn=" + str4 + ", idNumber=" + str5 + ")";
    }

    public OneCancelAndReserveNumberRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.idType = str;
        this.dtrCode = str2;
        this.msisdnCancel = str3;
        this.msisdn = str4;
        this.idNumber = str5;
    }

    public /* synthetic */ OneCancelAndReserveNumberRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
