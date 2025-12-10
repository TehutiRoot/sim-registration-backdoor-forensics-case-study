package th.p047co.dtac.android.dtacone.model.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0087\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020.H\u0016R\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 R&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010 R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018¨\u00064"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "packageCode", "voice", "voiceUnit", "data", "dataUnit", "wifi", "wifiUnit", "storage", "storageUnit", "marketPrice", "marketPriceUnit", "billCycle", "billCycleUnit", "packageDescription", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBillCycle", "()Ljava/lang/String;", "getBillCycleUnit", "getData", "getDataUnit", "getMarketPrice", "getMarketPriceUnit", "getPackageCode", "setPackageCode", "(Ljava/lang/String;)V", "getPackageDescription", "()Ljava/util/List;", "setPackageDescription", "(Ljava/util/List;)V", "getPackageName", "setPackageName", "getStorage", "getStorageUnit", "getVoice", "getVoiceUnit", "getWifi", "getWifiUnit", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.PackageSet */
/* loaded from: classes8.dex */
public final class PackageSet implements Parcelable {
    @SerializedName("billCycle")
    @NotNull
    private final String billCycle;
    @SerializedName("billCycleUnit")
    @NotNull
    private final String billCycleUnit;
    @SerializedName("data")
    @NotNull
    private final String data;
    @SerializedName("dataUnit")
    @NotNull
    private final String dataUnit;
    @SerializedName("marketPrice")
    @NotNull
    private final String marketPrice;
    @SerializedName("marketPriceUnit")
    @NotNull
    private final String marketPriceUnit;
    @SerializedName("packageCode")
    @NotNull
    private String packageCode;
    @SerializedName("packageDescriptions")
    @Nullable
    private List<String> packageDescription;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME)
    @Nullable
    private String packageName;
    @SerializedName("storage")
    @NotNull
    private final String storage;
    @SerializedName("storageUnit")
    @NotNull
    private final String storageUnit;
    @SerializedName("voice")
    @NotNull
    private final String voice;
    @SerializedName("voiceUnit")
    @NotNull
    private final String voiceUnit;
    @SerializedName("wifi")
    @NotNull
    private final String wifi;
    @SerializedName("wifiUnit")
    @NotNull
    private final String wifiUnit;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<PackageSet> CREATOR = new Parcelable.Creator<PackageSet>() { // from class: th.co.dtac.android.dtacone.model.postpaid.PackageSet$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PackageSet createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new PackageSet(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PackageSet[] newArray(int i) {
            return new PackageSet[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/PackageSet$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.PackageSet$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PackageSet(@Nullable String str, @NotNull String packageCode, @NotNull String voice, @NotNull String voiceUnit, @NotNull String data, @NotNull String dataUnit, @NotNull String wifi, @NotNull String wifiUnit, @NotNull String storage, @NotNull String storageUnit, @NotNull String marketPrice, @NotNull String marketPriceUnit, @NotNull String billCycle, @NotNull String billCycleUnit, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(voice, "voice");
        Intrinsics.checkNotNullParameter(voiceUnit, "voiceUnit");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dataUnit, "dataUnit");
        Intrinsics.checkNotNullParameter(wifi, "wifi");
        Intrinsics.checkNotNullParameter(wifiUnit, "wifiUnit");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(storageUnit, "storageUnit");
        Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
        Intrinsics.checkNotNullParameter(marketPriceUnit, "marketPriceUnit");
        Intrinsics.checkNotNullParameter(billCycle, "billCycle");
        Intrinsics.checkNotNullParameter(billCycleUnit, "billCycleUnit");
        this.packageName = str;
        this.packageCode = packageCode;
        this.voice = voice;
        this.voiceUnit = voiceUnit;
        this.data = data;
        this.dataUnit = dataUnit;
        this.wifi = wifi;
        this.wifiUnit = wifiUnit;
        this.storage = storage;
        this.storageUnit = storageUnit;
        this.marketPrice = marketPrice;
        this.marketPriceUnit = marketPriceUnit;
        this.billCycle = billCycle;
        this.billCycleUnit = billCycleUnit;
        this.packageDescription = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getBillCycle() {
        return this.billCycle;
    }

    @NotNull
    public final String getBillCycleUnit() {
        return this.billCycleUnit;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getDataUnit() {
        return this.dataUnit;
    }

    @NotNull
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @NotNull
    public final String getMarketPriceUnit() {
        return this.marketPriceUnit;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @Nullable
    public final List<String> getPackageDescription() {
        return this.packageDescription;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getStorage() {
        return this.storage;
    }

    @NotNull
    public final String getStorageUnit() {
        return this.storageUnit;
    }

    @NotNull
    public final String getVoice() {
        return this.voice;
    }

    @NotNull
    public final String getVoiceUnit() {
        return this.voiceUnit;
    }

    @NotNull
    public final String getWifi() {
        return this.wifi;
    }

    @NotNull
    public final String getWifiUnit() {
        return this.wifiUnit;
    }

    public final void setPackageCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageCode = str;
    }

    public final void setPackageDescription(@Nullable List<String> list) {
        this.packageDescription = list;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.packageName);
        dest.writeString(this.packageCode);
        dest.writeString(this.voice);
        dest.writeString(this.voiceUnit);
        dest.writeString(this.data);
        dest.writeString(this.dataUnit);
        dest.writeString(this.wifi);
        dest.writeString(this.wifiUnit);
        dest.writeString(this.storage);
        dest.writeString(this.storageUnit);
        dest.writeString(this.marketPrice);
        dest.writeString(this.marketPriceUnit);
        dest.writeString(this.billCycle);
        dest.writeString(this.billCycleUnit);
        dest.writeStringList(this.packageDescription);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PackageSet(@org.jetbrains.annotations.NotNull android.os.Parcel r18) {
        /*
            r17 = this;
            java.lang.String r0 = "source"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r2 = r18.readString()
            java.lang.String r0 = r18.readString()
            java.lang.String r3 = ""
            if (r0 != 0) goto L14
            r0 = r3
        L14:
            java.lang.String r4 = r18.readString()
            if (r4 != 0) goto L1b
            r4 = r3
        L1b:
            java.lang.String r5 = r18.readString()
            if (r5 != 0) goto L22
            r5 = r3
        L22:
            java.lang.String r6 = r18.readString()
            if (r6 != 0) goto L29
            r6 = r3
        L29:
            java.lang.String r7 = r18.readString()
            if (r7 != 0) goto L30
            r7 = r3
        L30:
            java.lang.String r8 = r18.readString()
            if (r8 != 0) goto L37
            r8 = r3
        L37:
            java.lang.String r9 = r18.readString()
            if (r9 != 0) goto L3e
            r9 = r3
        L3e:
            java.lang.String r10 = r18.readString()
            if (r10 != 0) goto L45
            r10 = r3
        L45:
            java.lang.String r11 = r18.readString()
            if (r11 != 0) goto L4c
            r11 = r3
        L4c:
            java.lang.String r12 = r18.readString()
            if (r12 != 0) goto L53
            r12 = r3
        L53:
            java.lang.String r13 = r18.readString()
            if (r13 != 0) goto L5a
            r13 = r3
        L5a:
            java.lang.String r14 = r18.readString()
            if (r14 != 0) goto L61
            r14 = r3
        L61:
            java.lang.String r15 = r18.readString()
            if (r15 != 0) goto L68
            r15 = r3
        L68:
            java.util.ArrayList r16 = r18.createStringArrayList()
            r1 = r17
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.postpaid.PackageSet.<init>(android.os.Parcel):void");
    }
}