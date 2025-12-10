package th.p047co.dtac.android.dtacone.model.postpaid.recommend_package;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0001JB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BÝ\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0018J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003Já\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010?\u001a\u00020@H\u0016J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020@HÖ\u0001J\t\u0010F\u001a\u00020\u0006HÖ\u0001J\u0018\u0010G\u001a\u00020H2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010I\u001a\u00020@H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a¨\u0006K"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/PackagesItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "voice", "", "wifiUnit", "wifi", "marketPrice", "data", "storage", "dataUnit", "storageUnit", "voiceUnit", "packageCode", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "billCycleUnit", "billCycle", "flowId", "marketPriceUnit", "campaignID", "offerPOID", "requesterLocation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillCycle", "()Ljava/lang/String;", "getBillCycleUnit", "getCampaignID", "getData", "getDataUnit", "getFlowId", "getMarketPrice", "getMarketPriceUnit", "getOfferPOID", "getPackageCode", "getPackageName", "getRequesterLocation", "getStorage", "getStorageUnit", "getVoice", "getVoiceUnit", "getWifi", "getWifiUnit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.recommend_package.PackagesItem */
/* loaded from: classes8.dex */
public final class PackagesItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("billCycle")
    @Nullable
    private final String billCycle;
    @SerializedName("billCycleUnit")
    @Nullable
    private final String billCycleUnit;
    @SerializedName("campaignID")
    @Nullable
    private final String campaignID;
    @SerializedName("data")
    @Nullable
    private final String data;
    @SerializedName("dataUnit")
    @Nullable
    private final String dataUnit;
    @SerializedName("flowId")
    @Nullable
    private final String flowId;
    @SerializedName("marketPrice")
    @Nullable
    private final String marketPrice;
    @SerializedName("marketPriceUnit")
    @Nullable
    private final String marketPriceUnit;
    @SerializedName("offerPOID")
    @Nullable
    private final String offerPOID;
    @SerializedName("packageCode")
    @Nullable
    private final String packageCode;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME)
    @Nullable
    private final String packageName;
    @SerializedName("requesterLocation")
    @Nullable
    private final String requesterLocation;
    @SerializedName("storage")
    @Nullable
    private final String storage;
    @SerializedName("storageUnit")
    @Nullable
    private final String storageUnit;
    @SerializedName("voice")
    @Nullable
    private final String voice;
    @SerializedName("voiceUnit")
    @Nullable
    private final String voiceUnit;
    @SerializedName("wifi")
    @Nullable
    private final String wifi;
    @SerializedName("wifiUnit")
    @Nullable
    private final String wifiUnit;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/PackagesItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/PackagesItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/PackagesItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.recommend_package.PackagesItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<PackagesItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PackagesItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PackagesItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PackagesItem[] newArray(int i) {
            return new PackagesItem[i];
        }
    }

    public PackagesItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    @Nullable
    public final String component1() {
        return this.voice;
    }

    @Nullable
    public final String component10() {
        return this.packageCode;
    }

    @Nullable
    public final String component11() {
        return this.packageName;
    }

    @Nullable
    public final String component12() {
        return this.billCycleUnit;
    }

    @Nullable
    public final String component13() {
        return this.billCycle;
    }

    @Nullable
    public final String component14() {
        return this.flowId;
    }

    @Nullable
    public final String component15() {
        return this.marketPriceUnit;
    }

    @Nullable
    public final String component16() {
        return this.campaignID;
    }

    @Nullable
    public final String component17() {
        return this.offerPOID;
    }

    @Nullable
    public final String component18() {
        return this.requesterLocation;
    }

    @Nullable
    public final String component2() {
        return this.wifiUnit;
    }

    @Nullable
    public final String component3() {
        return this.wifi;
    }

    @Nullable
    public final String component4() {
        return this.marketPrice;
    }

    @Nullable
    public final String component5() {
        return this.data;
    }

    @Nullable
    public final String component6() {
        return this.storage;
    }

    @Nullable
    public final String component7() {
        return this.dataUnit;
    }

    @Nullable
    public final String component8() {
        return this.storageUnit;
    }

    @Nullable
    public final String component9() {
        return this.voiceUnit;
    }

    @NotNull
    public final PackagesItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        return new PackagesItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackagesItem) {
            PackagesItem packagesItem = (PackagesItem) obj;
            return Intrinsics.areEqual(this.voice, packagesItem.voice) && Intrinsics.areEqual(this.wifiUnit, packagesItem.wifiUnit) && Intrinsics.areEqual(this.wifi, packagesItem.wifi) && Intrinsics.areEqual(this.marketPrice, packagesItem.marketPrice) && Intrinsics.areEqual(this.data, packagesItem.data) && Intrinsics.areEqual(this.storage, packagesItem.storage) && Intrinsics.areEqual(this.dataUnit, packagesItem.dataUnit) && Intrinsics.areEqual(this.storageUnit, packagesItem.storageUnit) && Intrinsics.areEqual(this.voiceUnit, packagesItem.voiceUnit) && Intrinsics.areEqual(this.packageCode, packagesItem.packageCode) && Intrinsics.areEqual(this.packageName, packagesItem.packageName) && Intrinsics.areEqual(this.billCycleUnit, packagesItem.billCycleUnit) && Intrinsics.areEqual(this.billCycle, packagesItem.billCycle) && Intrinsics.areEqual(this.flowId, packagesItem.flowId) && Intrinsics.areEqual(this.marketPriceUnit, packagesItem.marketPriceUnit) && Intrinsics.areEqual(this.campaignID, packagesItem.campaignID) && Intrinsics.areEqual(this.offerPOID, packagesItem.offerPOID) && Intrinsics.areEqual(this.requesterLocation, packagesItem.requesterLocation);
        }
        return false;
    }

    @Nullable
    public final String getBillCycle() {
        return this.billCycle;
    }

    @Nullable
    public final String getBillCycleUnit() {
        return this.billCycleUnit;
    }

    @Nullable
    public final String getCampaignID() {
        return this.campaignID;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getDataUnit() {
        return this.dataUnit;
    }

    @Nullable
    public final String getFlowId() {
        return this.flowId;
    }

    @Nullable
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    public final String getMarketPriceUnit() {
        return this.marketPriceUnit;
    }

    @Nullable
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @Nullable
    public final String getPackageCode() {
        return this.packageCode;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getRequesterLocation() {
        return this.requesterLocation;
    }

    @Nullable
    public final String getStorage() {
        return this.storage;
    }

    @Nullable
    public final String getStorageUnit() {
        return this.storageUnit;
    }

    @Nullable
    public final String getVoice() {
        return this.voice;
    }

    @Nullable
    public final String getVoiceUnit() {
        return this.voiceUnit;
    }

    @Nullable
    public final String getWifi() {
        return this.wifi;
    }

    @Nullable
    public final String getWifiUnit() {
        return this.wifiUnit;
    }

    public int hashCode() {
        String str = this.voice;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.wifiUnit;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wifi;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketPrice;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.data;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.storage;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dataUnit;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.storageUnit;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.voiceUnit;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.packageCode;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.packageName;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.billCycleUnit;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.billCycle;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.flowId;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.marketPriceUnit;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.campaignID;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.offerPOID;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.requesterLocation;
        return hashCode17 + (str18 != null ? str18.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.voice;
        String str2 = this.wifiUnit;
        String str3 = this.wifi;
        String str4 = this.marketPrice;
        String str5 = this.data;
        String str6 = this.storage;
        String str7 = this.dataUnit;
        String str8 = this.storageUnit;
        String str9 = this.voiceUnit;
        String str10 = this.packageCode;
        String str11 = this.packageName;
        String str12 = this.billCycleUnit;
        String str13 = this.billCycle;
        String str14 = this.flowId;
        String str15 = this.marketPriceUnit;
        String str16 = this.campaignID;
        String str17 = this.offerPOID;
        String str18 = this.requesterLocation;
        return "PackagesItem(voice=" + str + ", wifiUnit=" + str2 + ", wifi=" + str3 + ", marketPrice=" + str4 + ", data=" + str5 + ", storage=" + str6 + ", dataUnit=" + str7 + ", storageUnit=" + str8 + ", voiceUnit=" + str9 + ", packageCode=" + str10 + ", packageName=" + str11 + ", billCycleUnit=" + str12 + ", billCycle=" + str13 + ", flowId=" + str14 + ", marketPriceUnit=" + str15 + ", campaignID=" + str16 + ", offerPOID=" + str17 + ", requesterLocation=" + str18 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.voice);
        parcel.writeString(this.wifiUnit);
        parcel.writeString(this.wifi);
        parcel.writeString(this.marketPrice);
        parcel.writeString(this.data);
        parcel.writeString(this.storage);
        parcel.writeString(this.dataUnit);
        parcel.writeString(this.storageUnit);
        parcel.writeString(this.voiceUnit);
        parcel.writeString(this.packageCode);
        parcel.writeString(this.packageName);
        parcel.writeString(this.billCycleUnit);
        parcel.writeString(this.billCycle);
        parcel.writeString(this.flowId);
        parcel.writeString(this.marketPriceUnit);
        parcel.writeString(this.campaignID);
        parcel.writeString(this.offerPOID);
        parcel.writeString(this.requesterLocation);
    }

    public PackagesItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        this.voice = str;
        this.wifiUnit = str2;
        this.wifi = str3;
        this.marketPrice = str4;
        this.data = str5;
        this.storage = str6;
        this.dataUnit = str7;
        this.storageUnit = str8;
        this.voiceUnit = str9;
        this.packageCode = str10;
        this.packageName = str11;
        this.billCycleUnit = str12;
        this.billCycle = str13;
        this.flowId = str14;
        this.marketPriceUnit = str15;
        this.campaignID = str16;
        this.offerPOID = str17;
        this.requesterLocation = str18;
    }

    public /* synthetic */ PackagesItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) == 0 ? str18 : "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PackagesItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}