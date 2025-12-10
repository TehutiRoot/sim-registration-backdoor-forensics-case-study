package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/SaleAgentData;", "", "name", "", "channel", "partnerCode", "partnerName", "saleCode", "partnerType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getName", "getPartnerCode", "getPartnerName", "getPartnerType", "getSaleCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.SaleAgentData */
/* loaded from: classes8.dex */
public final class SaleAgentData {
    public static final int $stable = 0;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("name")
    @Nullable
    private final String name;
    @SerializedName("partnerCode")
    @Nullable
    private final String partnerCode;
    @SerializedName("partnerName")
    @Nullable
    private final String partnerName;
    @SerializedName("partnerType")
    @Nullable
    private final String partnerType;
    @SerializedName("saleCode")
    @Nullable
    private final String saleCode;

    public SaleAgentData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SaleAgentData copy$default(SaleAgentData saleAgentData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saleAgentData.name;
        }
        if ((i & 2) != 0) {
            str2 = saleAgentData.channel;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = saleAgentData.partnerCode;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = saleAgentData.partnerName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = saleAgentData.saleCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = saleAgentData.partnerType;
        }
        return saleAgentData.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.channel;
    }

    @Nullable
    public final String component3() {
        return this.partnerCode;
    }

    @Nullable
    public final String component4() {
        return this.partnerName;
    }

    @Nullable
    public final String component5() {
        return this.saleCode;
    }

    @Nullable
    public final String component6() {
        return this.partnerType;
    }

    @NotNull
    public final SaleAgentData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new SaleAgentData(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaleAgentData) {
            SaleAgentData saleAgentData = (SaleAgentData) obj;
            return Intrinsics.areEqual(this.name, saleAgentData.name) && Intrinsics.areEqual(this.channel, saleAgentData.channel) && Intrinsics.areEqual(this.partnerCode, saleAgentData.partnerCode) && Intrinsics.areEqual(this.partnerName, saleAgentData.partnerName) && Intrinsics.areEqual(this.saleCode, saleAgentData.saleCode) && Intrinsics.areEqual(this.partnerType, saleAgentData.partnerType);
        }
        return false;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    @Nullable
    public final String getPartnerName() {
        return this.partnerName;
    }

    @Nullable
    public final String getPartnerType() {
        return this.partnerType;
    }

    @Nullable
    public final String getSaleCode() {
        return this.saleCode;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnerCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.partnerName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.saleCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.partnerType;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.channel;
        String str3 = this.partnerCode;
        String str4 = this.partnerName;
        String str5 = this.saleCode;
        String str6 = this.partnerType;
        return "SaleAgentData(name=" + str + ", channel=" + str2 + ", partnerCode=" + str3 + ", partnerName=" + str4 + ", saleCode=" + str5 + ", partnerType=" + str6 + ")";
    }

    public SaleAgentData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.name = str;
        this.channel = str2;
        this.partnerCode = str3;
        this.partnerName = str4;
        this.saleCode = str5;
        this.partnerType = str6;
    }

    public /* synthetic */ SaleAgentData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
