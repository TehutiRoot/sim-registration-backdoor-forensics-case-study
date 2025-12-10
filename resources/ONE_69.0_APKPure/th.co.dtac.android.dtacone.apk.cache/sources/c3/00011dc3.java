package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GrayListResponse;", "", "GrayListBy", "", "GrayListDateTime", "GrayListReasonCode", "GrayListReasonDescription", "GrayListSource", "CustomerFirstName", "CustomerNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerFirstName", "()Ljava/lang/String;", "getCustomerNumber", "getGrayListBy", "getGrayListDateTime", "getGrayListReasonCode", "getGrayListReasonDescription", "getGrayListSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GrayListResponse */
/* loaded from: classes8.dex */
public final class GrayListResponse {
    public static final int $stable = 0;
    @SerializedName("customerFirstName")
    @NotNull
    private final String CustomerFirstName;
    @SerializedName("customerNumber")
    @NotNull
    private final String CustomerNumber;
    @SerializedName("grayListBy")
    @NotNull
    private final String GrayListBy;
    @SerializedName("grayListDateTime")
    @NotNull
    private final String GrayListDateTime;
    @SerializedName("grayListReasonCode")
    @NotNull
    private final String GrayListReasonCode;
    @SerializedName("grayListReasonDescription")
    @NotNull
    private final String GrayListReasonDescription;
    @SerializedName("grayListSource")
    @NotNull
    private final String GrayListSource;

    public GrayListResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ GrayListResponse copy$default(GrayListResponse grayListResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = grayListResponse.GrayListBy;
        }
        if ((i & 2) != 0) {
            str2 = grayListResponse.GrayListDateTime;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = grayListResponse.GrayListReasonCode;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = grayListResponse.GrayListReasonDescription;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = grayListResponse.GrayListSource;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = grayListResponse.CustomerFirstName;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = grayListResponse.CustomerNumber;
        }
        return grayListResponse.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.GrayListBy;
    }

    @NotNull
    public final String component2() {
        return this.GrayListDateTime;
    }

    @NotNull
    public final String component3() {
        return this.GrayListReasonCode;
    }

    @NotNull
    public final String component4() {
        return this.GrayListReasonDescription;
    }

    @NotNull
    public final String component5() {
        return this.GrayListSource;
    }

    @NotNull
    public final String component6() {
        return this.CustomerFirstName;
    }

    @NotNull
    public final String component7() {
        return this.CustomerNumber;
    }

    @NotNull
    public final GrayListResponse copy(@NotNull String GrayListBy, @NotNull String GrayListDateTime, @NotNull String GrayListReasonCode, @NotNull String GrayListReasonDescription, @NotNull String GrayListSource, @NotNull String CustomerFirstName, @NotNull String CustomerNumber) {
        Intrinsics.checkNotNullParameter(GrayListBy, "GrayListBy");
        Intrinsics.checkNotNullParameter(GrayListDateTime, "GrayListDateTime");
        Intrinsics.checkNotNullParameter(GrayListReasonCode, "GrayListReasonCode");
        Intrinsics.checkNotNullParameter(GrayListReasonDescription, "GrayListReasonDescription");
        Intrinsics.checkNotNullParameter(GrayListSource, "GrayListSource");
        Intrinsics.checkNotNullParameter(CustomerFirstName, "CustomerFirstName");
        Intrinsics.checkNotNullParameter(CustomerNumber, "CustomerNumber");
        return new GrayListResponse(GrayListBy, GrayListDateTime, GrayListReasonCode, GrayListReasonDescription, GrayListSource, CustomerFirstName, CustomerNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GrayListResponse) {
            GrayListResponse grayListResponse = (GrayListResponse) obj;
            return Intrinsics.areEqual(this.GrayListBy, grayListResponse.GrayListBy) && Intrinsics.areEqual(this.GrayListDateTime, grayListResponse.GrayListDateTime) && Intrinsics.areEqual(this.GrayListReasonCode, grayListResponse.GrayListReasonCode) && Intrinsics.areEqual(this.GrayListReasonDescription, grayListResponse.GrayListReasonDescription) && Intrinsics.areEqual(this.GrayListSource, grayListResponse.GrayListSource) && Intrinsics.areEqual(this.CustomerFirstName, grayListResponse.CustomerFirstName) && Intrinsics.areEqual(this.CustomerNumber, grayListResponse.CustomerNumber);
        }
        return false;
    }

    @NotNull
    public final String getCustomerFirstName() {
        return this.CustomerFirstName;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.CustomerNumber;
    }

    @NotNull
    public final String getGrayListBy() {
        return this.GrayListBy;
    }

    @NotNull
    public final String getGrayListDateTime() {
        return this.GrayListDateTime;
    }

    @NotNull
    public final String getGrayListReasonCode() {
        return this.GrayListReasonCode;
    }

    @NotNull
    public final String getGrayListReasonDescription() {
        return this.GrayListReasonDescription;
    }

    @NotNull
    public final String getGrayListSource() {
        return this.GrayListSource;
    }

    public int hashCode() {
        return (((((((((((this.GrayListBy.hashCode() * 31) + this.GrayListDateTime.hashCode()) * 31) + this.GrayListReasonCode.hashCode()) * 31) + this.GrayListReasonDescription.hashCode()) * 31) + this.GrayListSource.hashCode()) * 31) + this.CustomerFirstName.hashCode()) * 31) + this.CustomerNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.GrayListBy;
        String str2 = this.GrayListDateTime;
        String str3 = this.GrayListReasonCode;
        String str4 = this.GrayListReasonDescription;
        String str5 = this.GrayListSource;
        String str6 = this.CustomerFirstName;
        String str7 = this.CustomerNumber;
        return "GrayListResponse(GrayListBy=" + str + ", GrayListDateTime=" + str2 + ", GrayListReasonCode=" + str3 + ", GrayListReasonDescription=" + str4 + ", GrayListSource=" + str5 + ", CustomerFirstName=" + str6 + ", CustomerNumber=" + str7 + ")";
    }

    public GrayListResponse(@NotNull String GrayListBy, @NotNull String GrayListDateTime, @NotNull String GrayListReasonCode, @NotNull String GrayListReasonDescription, @NotNull String GrayListSource, @NotNull String CustomerFirstName, @NotNull String CustomerNumber) {
        Intrinsics.checkNotNullParameter(GrayListBy, "GrayListBy");
        Intrinsics.checkNotNullParameter(GrayListDateTime, "GrayListDateTime");
        Intrinsics.checkNotNullParameter(GrayListReasonCode, "GrayListReasonCode");
        Intrinsics.checkNotNullParameter(GrayListReasonDescription, "GrayListReasonDescription");
        Intrinsics.checkNotNullParameter(GrayListSource, "GrayListSource");
        Intrinsics.checkNotNullParameter(CustomerFirstName, "CustomerFirstName");
        Intrinsics.checkNotNullParameter(CustomerNumber, "CustomerNumber");
        this.GrayListBy = GrayListBy;
        this.GrayListDateTime = GrayListDateTime;
        this.GrayListReasonCode = GrayListReasonCode;
        this.GrayListReasonDescription = GrayListReasonDescription;
        this.GrayListSource = GrayListSource;
        this.CustomerFirstName = CustomerFirstName;
        this.CustomerNumber = CustomerNumber;
    }

    public /* synthetic */ GrayListResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}