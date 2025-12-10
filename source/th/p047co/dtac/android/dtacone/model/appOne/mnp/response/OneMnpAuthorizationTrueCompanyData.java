package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bk\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003Jt\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u000eH\u0016J\u0013\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\u0018\u00100\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u000eH\u0016R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u00064"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "redZone", "", "requireFaceRecognition", "", "dtrCode", "dtrName", "rtrType", "rtrName", "channelTypeId", "", "isAllowManualKYC", "isRequireLiveNess", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZ)V", "getChannelTypeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDtrCode", "()Ljava/lang/String;", "getDtrName", "()Z", "getRedZone", "getRequireFaceRecognition", "setRequireFaceRecognition", "(Z)V", "getRtrName", "getRtrType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZ)Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpAuthorizationTrueCompanyData */
/* loaded from: classes8.dex */
public final class OneMnpAuthorizationTrueCompanyData implements Parcelable {
    @SerializedName("channelTypeId")
    @Nullable
    private final Integer channelTypeId;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("dtrName")
    @Nullable
    private final String dtrName;
    @SerializedName("isAllowManualKYC")
    private final boolean isAllowManualKYC;
    @SerializedName("isRequireLiveness")
    private final boolean isRequireLiveNess;
    @SerializedName("redZone")
    @Nullable
    private final String redZone;
    @SerializedName("requireFaceRecognition")
    private boolean requireFaceRecognition;
    @SerializedName("rtrName")
    @Nullable
    private final String rtrName;
    @SerializedName("rtrType")
    @Nullable
    private final String rtrType;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyData;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpAuthorizationTrueCompanyData$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneMnpAuthorizationTrueCompanyData> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneMnpAuthorizationTrueCompanyData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneMnpAuthorizationTrueCompanyData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneMnpAuthorizationTrueCompanyData[] newArray(int i) {
            return new OneMnpAuthorizationTrueCompanyData[i];
        }
    }

    public OneMnpAuthorizationTrueCompanyData() {
        this(null, false, null, null, null, null, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    public final String component1() {
        return this.redZone;
    }

    public final boolean component2() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String component3() {
        return this.dtrCode;
    }

    @Nullable
    public final String component4() {
        return this.dtrName;
    }

    @Nullable
    public final String component5() {
        return this.rtrType;
    }

    @Nullable
    public final String component6() {
        return this.rtrName;
    }

    @Nullable
    public final Integer component7() {
        return this.channelTypeId;
    }

    public final boolean component8() {
        return this.isAllowManualKYC;
    }

    public final boolean component9() {
        return this.isRequireLiveNess;
    }

    @NotNull
    public final OneMnpAuthorizationTrueCompanyData copy(@Nullable String str, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, boolean z2, boolean z3) {
        return new OneMnpAuthorizationTrueCompanyData(str, z, str2, str3, str4, str5, num, z2, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpAuthorizationTrueCompanyData) {
            OneMnpAuthorizationTrueCompanyData oneMnpAuthorizationTrueCompanyData = (OneMnpAuthorizationTrueCompanyData) obj;
            return Intrinsics.areEqual(this.redZone, oneMnpAuthorizationTrueCompanyData.redZone) && this.requireFaceRecognition == oneMnpAuthorizationTrueCompanyData.requireFaceRecognition && Intrinsics.areEqual(this.dtrCode, oneMnpAuthorizationTrueCompanyData.dtrCode) && Intrinsics.areEqual(this.dtrName, oneMnpAuthorizationTrueCompanyData.dtrName) && Intrinsics.areEqual(this.rtrType, oneMnpAuthorizationTrueCompanyData.rtrType) && Intrinsics.areEqual(this.rtrName, oneMnpAuthorizationTrueCompanyData.rtrName) && Intrinsics.areEqual(this.channelTypeId, oneMnpAuthorizationTrueCompanyData.channelTypeId) && this.isAllowManualKYC == oneMnpAuthorizationTrueCompanyData.isAllowManualKYC && this.isRequireLiveNess == oneMnpAuthorizationTrueCompanyData.isRequireLiveNess;
        }
        return false;
    }

    @Nullable
    public final Integer getChannelTypeId() {
        return this.channelTypeId;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getDtrName() {
        return this.dtrName;
    }

    @Nullable
    public final String getRedZone() {
        return this.redZone;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String getRtrName() {
        return this.rtrName;
    }

    @Nullable
    public final String getRtrType() {
        return this.rtrType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.redZone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.requireFaceRecognition;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str2 = this.dtrCode;
        int hashCode2 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dtrName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rtrType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rtrName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.channelTypeId;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z2 = this.isAllowManualKYC;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode6 + i3) * 31;
        boolean z3 = this.isRequireLiveNess;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean isAllowManualKYC() {
        return this.isAllowManualKYC;
    }

    public final boolean isRequireLiveNess() {
        return this.isRequireLiveNess;
    }

    public final void setRequireFaceRecognition(boolean z) {
        this.requireFaceRecognition = z;
    }

    @NotNull
    public String toString() {
        String str = this.redZone;
        boolean z = this.requireFaceRecognition;
        String str2 = this.dtrCode;
        String str3 = this.dtrName;
        String str4 = this.rtrType;
        String str5 = this.rtrName;
        Integer num = this.channelTypeId;
        boolean z2 = this.isAllowManualKYC;
        boolean z3 = this.isRequireLiveNess;
        return "OneMnpAuthorizationTrueCompanyData(redZone=" + str + ", requireFaceRecognition=" + z + ", dtrCode=" + str2 + ", dtrName=" + str3 + ", rtrType=" + str4 + ", rtrName=" + str5 + ", channelTypeId=" + num + ", isAllowManualKYC=" + z2 + ", isRequireLiveNess=" + z3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.redZone);
        parcel.writeByte(this.requireFaceRecognition ? (byte) 1 : (byte) 0);
        parcel.writeString(this.dtrCode);
        parcel.writeString(this.dtrName);
        parcel.writeString(this.rtrType);
        parcel.writeString(this.rtrName);
        parcel.writeValue(this.channelTypeId);
        parcel.writeByte(this.isAllowManualKYC ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRequireLiveNess ? (byte) 1 : (byte) 0);
    }

    public OneMnpAuthorizationTrueCompanyData(@Nullable String str, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, boolean z2, boolean z3) {
        this.redZone = str;
        this.requireFaceRecognition = z;
        this.dtrCode = str2;
        this.dtrName = str3;
        this.rtrType = str4;
        this.rtrName = str5;
        this.channelTypeId = num;
        this.isAllowManualKYC = z2;
        this.isRequireLiveNess = z3;
    }

    public /* synthetic */ OneMnpAuthorizationTrueCompanyData(String str, boolean z, String str2, String str3, String str4, String str5, Integer num, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? num : null, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? z3 : false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneMnpAuthorizationTrueCompanyData(@org.jetbrains.annotations.NotNull android.os.Parcel r12) {
        /*
            r11 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r12.readString()
            byte r0 = r12.readByte()
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r4 = r12.readString()
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            java.lang.Class r8 = java.lang.Integer.TYPE
            java.lang.ClassLoader r8 = r8.getClassLoader()
            java.lang.Object r8 = r12.readValue(r8)
            boolean r9 = r8 instanceof java.lang.Integer
            if (r9 == 0) goto L35
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L36
        L35:
            r8 = 0
        L36:
            byte r9 = r12.readByte()
            if (r9 == 0) goto L3e
            r9 = 1
            goto L3f
        L3e:
            r9 = 0
        L3f:
            byte r12 = r12.readByte()
            if (r12 == 0) goto L47
            r10 = 1
            goto L48
        L47:
            r10 = 0
        L48:
            r1 = r11
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpAuthorizationTrueCompanyData.<init>(android.os.Parcel):void");
    }
}
