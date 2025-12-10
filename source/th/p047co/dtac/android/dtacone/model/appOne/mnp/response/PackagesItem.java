package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PackagesItem;", "", "internetData", "", "pricePlanDesc", FirebaseAnalytics.Param.PRICE, "pricePlanName", "voiceData", "pricePlanCode", "wifiData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInternetData", "()Ljava/lang/String;", "getPrice", "getPricePlanCode", "getPricePlanDesc", "getPricePlanName", "getVoiceData", "getWifiData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.PackagesItem */
/* loaded from: classes8.dex */
public final class PackagesItem {
    public static final int $stable = 0;
    @SerializedName("internetData")
    @Nullable
    private final String internetData;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable
    private final String price;
    @SerializedName("pricePlanCode")
    @Nullable
    private final String pricePlanCode;
    @SerializedName("pricePlanDesc")
    @Nullable
    private final String pricePlanDesc;
    @SerializedName("pricePlanName")
    @Nullable
    private final String pricePlanName;
    @SerializedName("voiceData")
    @Nullable
    private final String voiceData;
    @SerializedName("wifiData")
    @Nullable
    private final String wifiData;

    public PackagesItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ PackagesItem copy$default(PackagesItem packagesItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packagesItem.internetData;
        }
        if ((i & 2) != 0) {
            str2 = packagesItem.pricePlanDesc;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = packagesItem.price;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = packagesItem.pricePlanName;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = packagesItem.voiceData;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = packagesItem.pricePlanCode;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = packagesItem.wifiData;
        }
        return packagesItem.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    public final String component1() {
        return this.internetData;
    }

    @Nullable
    public final String component2() {
        return this.pricePlanDesc;
    }

    @Nullable
    public final String component3() {
        return this.price;
    }

    @Nullable
    public final String component4() {
        return this.pricePlanName;
    }

    @Nullable
    public final String component5() {
        return this.voiceData;
    }

    @Nullable
    public final String component6() {
        return this.pricePlanCode;
    }

    @Nullable
    public final String component7() {
        return this.wifiData;
    }

    @NotNull
    public final PackagesItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new PackagesItem(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackagesItem) {
            PackagesItem packagesItem = (PackagesItem) obj;
            return Intrinsics.areEqual(this.internetData, packagesItem.internetData) && Intrinsics.areEqual(this.pricePlanDesc, packagesItem.pricePlanDesc) && Intrinsics.areEqual(this.price, packagesItem.price) && Intrinsics.areEqual(this.pricePlanName, packagesItem.pricePlanName) && Intrinsics.areEqual(this.voiceData, packagesItem.voiceData) && Intrinsics.areEqual(this.pricePlanCode, packagesItem.pricePlanCode) && Intrinsics.areEqual(this.wifiData, packagesItem.wifiData);
        }
        return false;
    }

    @Nullable
    public final String getInternetData() {
        return this.internetData;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPricePlanCode() {
        return this.pricePlanCode;
    }

    @Nullable
    public final String getPricePlanDesc() {
        return this.pricePlanDesc;
    }

    @Nullable
    public final String getPricePlanName() {
        return this.pricePlanName;
    }

    @Nullable
    public final String getVoiceData() {
        return this.voiceData;
    }

    @Nullable
    public final String getWifiData() {
        return this.wifiData;
    }

    public int hashCode() {
        String str = this.internetData;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pricePlanDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.price;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pricePlanName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.voiceData;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pricePlanCode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.wifiData;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.internetData;
        String str2 = this.pricePlanDesc;
        String str3 = this.price;
        String str4 = this.pricePlanName;
        String str5 = this.voiceData;
        String str6 = this.pricePlanCode;
        String str7 = this.wifiData;
        return "PackagesItem(internetData=" + str + ", pricePlanDesc=" + str2 + ", price=" + str3 + ", pricePlanName=" + str4 + ", voiceData=" + str5 + ", pricePlanCode=" + str6 + ", wifiData=" + str7 + ")";
    }

    public PackagesItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.internetData = str;
        this.pricePlanDesc = str2;
        this.price = str3;
        this.pricePlanName = str4;
        this.voiceData = str5;
        this.pricePlanCode = str6;
        this.wifiData = str7;
    }

    public /* synthetic */ PackagesItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
