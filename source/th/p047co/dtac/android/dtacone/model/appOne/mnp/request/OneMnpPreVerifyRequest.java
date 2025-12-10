package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPreVerifyRequest;", "", "transactionId", "", "flow", "identityNumber", "identityType", "msisdnReserve", "dtrCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDtrCode", "()Ljava/lang/String;", "getFlow", "getIdentityNumber", "getIdentityType", "getMsisdnReserve", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpPreVerifyRequest */
/* loaded from: classes8.dex */
public final class OneMnpPreVerifyRequest {
    public static final int $stable = 0;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("flow")
    @Nullable
    private final String flow;
    @SerializedName("identityNumber")
    @Nullable
    private final String identityNumber;
    @SerializedName("identityType")
    @Nullable
    private final String identityType;
    @SerializedName("msisdnReserve")
    @Nullable
    private final String msisdnReserve;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;

    public OneMnpPreVerifyRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OneMnpPreVerifyRequest copy$default(OneMnpPreVerifyRequest oneMnpPreVerifyRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneMnpPreVerifyRequest.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = oneMnpPreVerifyRequest.flow;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneMnpPreVerifyRequest.identityNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneMnpPreVerifyRequest.identityType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneMnpPreVerifyRequest.msisdnReserve;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneMnpPreVerifyRequest.dtrCode;
        }
        return oneMnpPreVerifyRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.transactionId;
    }

    @Nullable
    public final String component2() {
        return this.flow;
    }

    @Nullable
    public final String component3() {
        return this.identityNumber;
    }

    @Nullable
    public final String component4() {
        return this.identityType;
    }

    @Nullable
    public final String component5() {
        return this.msisdnReserve;
    }

    @Nullable
    public final String component6() {
        return this.dtrCode;
    }

    @NotNull
    public final OneMnpPreVerifyRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OneMnpPreVerifyRequest(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpPreVerifyRequest) {
            OneMnpPreVerifyRequest oneMnpPreVerifyRequest = (OneMnpPreVerifyRequest) obj;
            return Intrinsics.areEqual(this.transactionId, oneMnpPreVerifyRequest.transactionId) && Intrinsics.areEqual(this.flow, oneMnpPreVerifyRequest.flow) && Intrinsics.areEqual(this.identityNumber, oneMnpPreVerifyRequest.identityNumber) && Intrinsics.areEqual(this.identityType, oneMnpPreVerifyRequest.identityType) && Intrinsics.areEqual(this.msisdnReserve, oneMnpPreVerifyRequest.msisdnReserve) && Intrinsics.areEqual(this.dtrCode, oneMnpPreVerifyRequest.dtrCode);
        }
        return false;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getFlow() {
        return this.flow;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    public final String getMsisdnReserve() {
        return this.msisdnReserve;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.transactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.identityNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.identityType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.msisdnReserve;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dtrCode;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.transactionId;
        String str2 = this.flow;
        String str3 = this.identityNumber;
        String str4 = this.identityType;
        String str5 = this.msisdnReserve;
        String str6 = this.dtrCode;
        return "OneMnpPreVerifyRequest(transactionId=" + str + ", flow=" + str2 + ", identityNumber=" + str3 + ", identityType=" + str4 + ", msisdnReserve=" + str5 + ", dtrCode=" + str6 + ")";
    }

    public OneMnpPreVerifyRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.transactionId = str;
        this.flow = str2;
        this.identityNumber = str3;
        this.identityType = str4;
        this.msisdnReserve = str5;
        this.dtrCode = str6;
    }

    public /* synthetic */ OneMnpPreVerifyRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
