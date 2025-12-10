package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostCustomerPreverifyRequest;", "", "accountCat", "", "channel", "companyCode", "idNumber", "activityFunction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountCat", "()Ljava/lang/String;", "getActivityFunction", "getChannel", "getCompanyCode", "getIdNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostCustomerPreverifyRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostCustomerPreverifyRequest {
    public static final int $stable = 0;
    @SerializedName("accountCat")
    @Nullable
    private final String accountCat;
    @SerializedName("activityFunction")
    @Nullable
    private final String activityFunction;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;

    public OnePre2PostCustomerPreverifyRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OnePre2PostCustomerPreverifyRequest copy$default(OnePre2PostCustomerPreverifyRequest onePre2PostCustomerPreverifyRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostCustomerPreverifyRequest.accountCat;
        }
        if ((i & 2) != 0) {
            str2 = onePre2PostCustomerPreverifyRequest.channel;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePre2PostCustomerPreverifyRequest.companyCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePre2PostCustomerPreverifyRequest.idNumber;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = onePre2PostCustomerPreverifyRequest.activityFunction;
        }
        return onePre2PostCustomerPreverifyRequest.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.accountCat;
    }

    @Nullable
    public final String component2() {
        return this.channel;
    }

    @Nullable
    public final String component3() {
        return this.companyCode;
    }

    @Nullable
    public final String component4() {
        return this.idNumber;
    }

    @Nullable
    public final String component5() {
        return this.activityFunction;
    }

    @NotNull
    public final OnePre2PostCustomerPreverifyRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new OnePre2PostCustomerPreverifyRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostCustomerPreverifyRequest) {
            OnePre2PostCustomerPreverifyRequest onePre2PostCustomerPreverifyRequest = (OnePre2PostCustomerPreverifyRequest) obj;
            return Intrinsics.areEqual(this.accountCat, onePre2PostCustomerPreverifyRequest.accountCat) && Intrinsics.areEqual(this.channel, onePre2PostCustomerPreverifyRequest.channel) && Intrinsics.areEqual(this.companyCode, onePre2PostCustomerPreverifyRequest.companyCode) && Intrinsics.areEqual(this.idNumber, onePre2PostCustomerPreverifyRequest.idNumber) && Intrinsics.areEqual(this.activityFunction, onePre2PostCustomerPreverifyRequest.activityFunction);
        }
        return false;
    }

    @Nullable
    public final String getAccountCat() {
        return this.accountCat;
    }

    @Nullable
    public final String getActivityFunction() {
        return this.activityFunction;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    public int hashCode() {
        String str = this.accountCat;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.companyCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.idNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.activityFunction;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accountCat;
        String str2 = this.channel;
        String str3 = this.companyCode;
        String str4 = this.idNumber;
        String str5 = this.activityFunction;
        return "OnePre2PostCustomerPreverifyRequest(accountCat=" + str + ", channel=" + str2 + ", companyCode=" + str3 + ", idNumber=" + str4 + ", activityFunction=" + str5 + ")";
    }

    public OnePre2PostCustomerPreverifyRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.accountCat = str;
        this.channel = str2;
        this.companyCode = str3;
        this.idNumber = str4;
        this.activityFunction = str5;
    }

    public /* synthetic */ OnePre2PostCustomerPreverifyRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
