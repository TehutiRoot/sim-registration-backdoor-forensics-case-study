package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BA\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0019H\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpValidateOperatorResponseData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "msisdn", "", "prefix", "operatorCode", "operatorDesc", "zone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getOperatorCode", "getOperatorDesc", "getPrefix", "getZone", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpValidateOperatorResponseData */
/* loaded from: classes8.dex */
public final class OneMnpValidateOperatorResponseData implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("msisdn")
    @Nullable
    private final String msisdn;
    @SerializedName("operatorCode")
    @Nullable
    private final String operatorCode;
    @SerializedName("operatorDesc")
    @Nullable
    private final String operatorDesc;
    @SerializedName("prefix")
    @Nullable
    private final String prefix;
    @SerializedName("zone")
    @Nullable
    private final String zone;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpValidateOperatorResponseData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpValidateOperatorResponseData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpValidateOperatorResponseData;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpValidateOperatorResponseData$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneMnpValidateOperatorResponseData> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneMnpValidateOperatorResponseData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneMnpValidateOperatorResponseData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneMnpValidateOperatorResponseData[] newArray(int i) {
            return new OneMnpValidateOperatorResponseData[i];
        }
    }

    public OneMnpValidateOperatorResponseData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OneMnpValidateOperatorResponseData copy$default(OneMnpValidateOperatorResponseData oneMnpValidateOperatorResponseData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneMnpValidateOperatorResponseData.msisdn;
        }
        if ((i & 2) != 0) {
            str2 = oneMnpValidateOperatorResponseData.prefix;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneMnpValidateOperatorResponseData.operatorCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneMnpValidateOperatorResponseData.operatorDesc;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = oneMnpValidateOperatorResponseData.zone;
        }
        return oneMnpValidateOperatorResponseData.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.msisdn;
    }

    @Nullable
    public final String component2() {
        return this.prefix;
    }

    @Nullable
    public final String component3() {
        return this.operatorCode;
    }

    @Nullable
    public final String component4() {
        return this.operatorDesc;
    }

    @Nullable
    public final String component5() {
        return this.zone;
    }

    @NotNull
    public final OneMnpValidateOperatorResponseData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new OneMnpValidateOperatorResponseData(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpValidateOperatorResponseData) {
            OneMnpValidateOperatorResponseData oneMnpValidateOperatorResponseData = (OneMnpValidateOperatorResponseData) obj;
            return Intrinsics.areEqual(this.msisdn, oneMnpValidateOperatorResponseData.msisdn) && Intrinsics.areEqual(this.prefix, oneMnpValidateOperatorResponseData.prefix) && Intrinsics.areEqual(this.operatorCode, oneMnpValidateOperatorResponseData.operatorCode) && Intrinsics.areEqual(this.operatorDesc, oneMnpValidateOperatorResponseData.operatorDesc) && Intrinsics.areEqual(this.zone, oneMnpValidateOperatorResponseData.zone);
        }
        return false;
    }

    @Nullable
    public final String getMsisdn() {
        return this.msisdn;
    }

    @Nullable
    public final String getOperatorCode() {
        return this.operatorCode;
    }

    @Nullable
    public final String getOperatorDesc() {
        return this.operatorDesc;
    }

    @Nullable
    public final String getPrefix() {
        return this.prefix;
    }

    @Nullable
    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        String str = this.msisdn;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prefix;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operatorCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.operatorDesc;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zone;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.msisdn;
        String str2 = this.prefix;
        String str3 = this.operatorCode;
        String str4 = this.operatorDesc;
        String str5 = this.zone;
        return "OneMnpValidateOperatorResponseData(msisdn=" + str + ", prefix=" + str2 + ", operatorCode=" + str3 + ", operatorDesc=" + str4 + ", zone=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.msisdn);
        parcel.writeString(this.prefix);
        parcel.writeString(this.operatorCode);
        parcel.writeString(this.operatorDesc);
        parcel.writeString(this.zone);
    }

    public OneMnpValidateOperatorResponseData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.msisdn = str;
        this.prefix = str2;
        this.operatorCode = str3;
        this.operatorDesc = str4;
        this.zone = str5;
    }

    public /* synthetic */ OneMnpValidateOperatorResponseData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneMnpValidateOperatorResponseData(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}