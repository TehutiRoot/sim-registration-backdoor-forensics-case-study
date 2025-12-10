package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/BlackListResponse;", "", "blackListBy", "", "blackListDateTime", "blackListReasonCode", "blackListReasonDescription", "blackListSource", "customerFirstName", "customerNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBlackListBy", "()Ljava/lang/String;", "getBlackListDateTime", "getBlackListReasonCode", "getBlackListReasonDescription", "getBlackListSource", "getCustomerFirstName", "getCustomerNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.BlackListResponse */
/* loaded from: classes8.dex */
public final class BlackListResponse {
    public static final int $stable = 0;
    @SerializedName("blackListBy")
    @NotNull
    private final String blackListBy;
    @SerializedName("blackListDateTime")
    @NotNull
    private final String blackListDateTime;
    @SerializedName("blackListReasonCode")
    @NotNull
    private final String blackListReasonCode;
    @SerializedName("blackListReasonDescription")
    @NotNull
    private final String blackListReasonDescription;
    @SerializedName("blackListSource")
    @NotNull
    private final String blackListSource;
    @SerializedName("customerFirstName")
    @NotNull
    private final String customerFirstName;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;

    public BlackListResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ BlackListResponse copy$default(BlackListResponse blackListResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blackListResponse.blackListBy;
        }
        if ((i & 2) != 0) {
            str2 = blackListResponse.blackListDateTime;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = blackListResponse.blackListReasonCode;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = blackListResponse.blackListReasonDescription;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = blackListResponse.blackListSource;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = blackListResponse.customerFirstName;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = blackListResponse.customerNumber;
        }
        return blackListResponse.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.blackListBy;
    }

    @NotNull
    public final String component2() {
        return this.blackListDateTime;
    }

    @NotNull
    public final String component3() {
        return this.blackListReasonCode;
    }

    @NotNull
    public final String component4() {
        return this.blackListReasonDescription;
    }

    @NotNull
    public final String component5() {
        return this.blackListSource;
    }

    @NotNull
    public final String component6() {
        return this.customerFirstName;
    }

    @NotNull
    public final String component7() {
        return this.customerNumber;
    }

    @NotNull
    public final BlackListResponse copy(@NotNull String blackListBy, @NotNull String blackListDateTime, @NotNull String blackListReasonCode, @NotNull String blackListReasonDescription, @NotNull String blackListSource, @NotNull String customerFirstName, @NotNull String customerNumber) {
        Intrinsics.checkNotNullParameter(blackListBy, "blackListBy");
        Intrinsics.checkNotNullParameter(blackListDateTime, "blackListDateTime");
        Intrinsics.checkNotNullParameter(blackListReasonCode, "blackListReasonCode");
        Intrinsics.checkNotNullParameter(blackListReasonDescription, "blackListReasonDescription");
        Intrinsics.checkNotNullParameter(blackListSource, "blackListSource");
        Intrinsics.checkNotNullParameter(customerFirstName, "customerFirstName");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        return new BlackListResponse(blackListBy, blackListDateTime, blackListReasonCode, blackListReasonDescription, blackListSource, customerFirstName, customerNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlackListResponse) {
            BlackListResponse blackListResponse = (BlackListResponse) obj;
            return Intrinsics.areEqual(this.blackListBy, blackListResponse.blackListBy) && Intrinsics.areEqual(this.blackListDateTime, blackListResponse.blackListDateTime) && Intrinsics.areEqual(this.blackListReasonCode, blackListResponse.blackListReasonCode) && Intrinsics.areEqual(this.blackListReasonDescription, blackListResponse.blackListReasonDescription) && Intrinsics.areEqual(this.blackListSource, blackListResponse.blackListSource) && Intrinsics.areEqual(this.customerFirstName, blackListResponse.customerFirstName) && Intrinsics.areEqual(this.customerNumber, blackListResponse.customerNumber);
        }
        return false;
    }

    @NotNull
    public final String getBlackListBy() {
        return this.blackListBy;
    }

    @NotNull
    public final String getBlackListDateTime() {
        return this.blackListDateTime;
    }

    @NotNull
    public final String getBlackListReasonCode() {
        return this.blackListReasonCode;
    }

    @NotNull
    public final String getBlackListReasonDescription() {
        return this.blackListReasonDescription;
    }

    @NotNull
    public final String getBlackListSource() {
        return this.blackListSource;
    }

    @NotNull
    public final String getCustomerFirstName() {
        return this.customerFirstName;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    public int hashCode() {
        return (((((((((((this.blackListBy.hashCode() * 31) + this.blackListDateTime.hashCode()) * 31) + this.blackListReasonCode.hashCode()) * 31) + this.blackListReasonDescription.hashCode()) * 31) + this.blackListSource.hashCode()) * 31) + this.customerFirstName.hashCode()) * 31) + this.customerNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.blackListBy;
        String str2 = this.blackListDateTime;
        String str3 = this.blackListReasonCode;
        String str4 = this.blackListReasonDescription;
        String str5 = this.blackListSource;
        String str6 = this.customerFirstName;
        String str7 = this.customerNumber;
        return "BlackListResponse(blackListBy=" + str + ", blackListDateTime=" + str2 + ", blackListReasonCode=" + str3 + ", blackListReasonDescription=" + str4 + ", blackListSource=" + str5 + ", customerFirstName=" + str6 + ", customerNumber=" + str7 + ")";
    }

    public BlackListResponse(@NotNull String blackListBy, @NotNull String blackListDateTime, @NotNull String blackListReasonCode, @NotNull String blackListReasonDescription, @NotNull String blackListSource, @NotNull String customerFirstName, @NotNull String customerNumber) {
        Intrinsics.checkNotNullParameter(blackListBy, "blackListBy");
        Intrinsics.checkNotNullParameter(blackListDateTime, "blackListDateTime");
        Intrinsics.checkNotNullParameter(blackListReasonCode, "blackListReasonCode");
        Intrinsics.checkNotNullParameter(blackListReasonDescription, "blackListReasonDescription");
        Intrinsics.checkNotNullParameter(blackListSource, "blackListSource");
        Intrinsics.checkNotNullParameter(customerFirstName, "customerFirstName");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        this.blackListBy = blackListBy;
        this.blackListDateTime = blackListDateTime;
        this.blackListReasonCode = blackListReasonCode;
        this.blackListReasonDescription = blackListReasonDescription;
        this.blackListSource = blackListSource;
        this.customerFirstName = customerFirstName;
        this.customerNumber = customerNumber;
    }

    public /* synthetic */ BlackListResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
