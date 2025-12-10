package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist;

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
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bg\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011Jv\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0016J\u0013\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020!H\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u0011R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\f\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\n\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\r\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "requireFaceRecognition", "", "isCutSim", "isCheckSim", "airportShop", "isAutoTransferEDMS", "isOverruleXSim", "isAllowManualKYC", "isRequireLiveness", "isAllowKYC2ndLine", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAirportShop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getRequireFaceRecognition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse */
/* loaded from: classes8.dex */
public final class GetAuthorizationByRtrResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("airportShop")
    @Nullable
    private final Boolean airportShop;
    @SerializedName("isAllowKYC2ndLine")
    @Nullable
    private final Boolean isAllowKYC2ndLine;
    @SerializedName("isAllowManualKYC")
    @Nullable
    private final Boolean isAllowManualKYC;
    @SerializedName("isAutoTransferEDMS")
    @Nullable
    private final Boolean isAutoTransferEDMS;
    @SerializedName("isCheckSim")
    @Nullable
    private final Boolean isCheckSim;
    @SerializedName("isCutSim")
    @Nullable
    private final Boolean isCutSim;
    @SerializedName("isOverruleXSim")
    private final boolean isOverruleXSim;
    @SerializedName("isRequireLiveness")
    @Nullable
    private final Boolean isRequireLiveness;
    @SerializedName("requireFaceRecognition")
    private final boolean requireFaceRecognition;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<GetAuthorizationByRtrResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetAuthorizationByRtrResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GetAuthorizationByRtrResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetAuthorizationByRtrResponse[] newArray(int i) {
            return new GetAuthorizationByRtrResponse[i];
        }
    }

    public GetAuthorizationByRtrResponse(boolean z, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, boolean z2, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7) {
        this.requireFaceRecognition = z;
        this.isCutSim = bool;
        this.isCheckSim = bool2;
        this.airportShop = bool3;
        this.isAutoTransferEDMS = bool4;
        this.isOverruleXSim = z2;
        this.isAllowManualKYC = bool5;
        this.isRequireLiveness = bool6;
        this.isAllowKYC2ndLine = bool7;
    }

    public final boolean component1() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final Boolean component2() {
        return this.isCutSim;
    }

    @Nullable
    public final Boolean component3() {
        return this.isCheckSim;
    }

    @Nullable
    public final Boolean component4() {
        return this.airportShop;
    }

    @Nullable
    public final Boolean component5() {
        return this.isAutoTransferEDMS;
    }

    public final boolean component6() {
        return this.isOverruleXSim;
    }

    @Nullable
    public final Boolean component7() {
        return this.isAllowManualKYC;
    }

    @Nullable
    public final Boolean component8() {
        return this.isRequireLiveness;
    }

    @Nullable
    public final Boolean component9() {
        return this.isAllowKYC2ndLine;
    }

    @NotNull
    public final GetAuthorizationByRtrResponse copy(boolean z, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, boolean z2, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7) {
        return new GetAuthorizationByRtrResponse(z, bool, bool2, bool3, bool4, z2, bool5, bool6, bool7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAuthorizationByRtrResponse) {
            GetAuthorizationByRtrResponse getAuthorizationByRtrResponse = (GetAuthorizationByRtrResponse) obj;
            return this.requireFaceRecognition == getAuthorizationByRtrResponse.requireFaceRecognition && Intrinsics.areEqual(this.isCutSim, getAuthorizationByRtrResponse.isCutSim) && Intrinsics.areEqual(this.isCheckSim, getAuthorizationByRtrResponse.isCheckSim) && Intrinsics.areEqual(this.airportShop, getAuthorizationByRtrResponse.airportShop) && Intrinsics.areEqual(this.isAutoTransferEDMS, getAuthorizationByRtrResponse.isAutoTransferEDMS) && this.isOverruleXSim == getAuthorizationByRtrResponse.isOverruleXSim && Intrinsics.areEqual(this.isAllowManualKYC, getAuthorizationByRtrResponse.isAllowManualKYC) && Intrinsics.areEqual(this.isRequireLiveness, getAuthorizationByRtrResponse.isRequireLiveness) && Intrinsics.areEqual(this.isAllowKYC2ndLine, getAuthorizationByRtrResponse.isAllowKYC2ndLine);
        }
        return false;
    }

    @Nullable
    public final Boolean getAirportShop() {
        return this.airportShop;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    public int hashCode() {
        boolean z = this.requireFaceRecognition;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.isCutSim;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCheckSim;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.airportShop;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isAutoTransferEDMS;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        boolean z2 = this.isOverruleXSim;
        int i2 = (hashCode4 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Boolean bool5 = this.isAllowManualKYC;
        int hashCode5 = (i2 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isRequireLiveness;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isAllowKYC2ndLine;
        return hashCode6 + (bool7 != null ? bool7.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAllowKYC2ndLine() {
        return this.isAllowKYC2ndLine;
    }

    @Nullable
    public final Boolean isAllowManualKYC() {
        return this.isAllowManualKYC;
    }

    @Nullable
    public final Boolean isAutoTransferEDMS() {
        return this.isAutoTransferEDMS;
    }

    @Nullable
    public final Boolean isCheckSim() {
        return this.isCheckSim;
    }

    @Nullable
    public final Boolean isCutSim() {
        return this.isCutSim;
    }

    public final boolean isOverruleXSim() {
        return this.isOverruleXSim;
    }

    @Nullable
    public final Boolean isRequireLiveness() {
        return this.isRequireLiveness;
    }

    @NotNull
    public String toString() {
        boolean z = this.requireFaceRecognition;
        Boolean bool = this.isCutSim;
        Boolean bool2 = this.isCheckSim;
        Boolean bool3 = this.airportShop;
        Boolean bool4 = this.isAutoTransferEDMS;
        boolean z2 = this.isOverruleXSim;
        Boolean bool5 = this.isAllowManualKYC;
        Boolean bool6 = this.isRequireLiveness;
        Boolean bool7 = this.isAllowKYC2ndLine;
        return "GetAuthorizationByRtrResponse(requireFaceRecognition=" + z + ", isCutSim=" + bool + ", isCheckSim=" + bool2 + ", airportShop=" + bool3 + ", isAutoTransferEDMS=" + bool4 + ", isOverruleXSim=" + z2 + ", isAllowManualKYC=" + bool5 + ", isRequireLiveness=" + bool6 + ", isAllowKYC2ndLine=" + bool7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(this.requireFaceRecognition ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.isCutSim);
        parcel.writeValue(this.isCheckSim);
        parcel.writeValue(this.airportShop);
        parcel.writeValue(this.isAutoTransferEDMS);
        parcel.writeByte(this.isOverruleXSim ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.isAllowManualKYC);
        parcel.writeValue(this.isRequireLiveness);
        parcel.writeValue(this.isAllowKYC2ndLine);
    }

    public /* synthetic */ GetAuthorizationByRtrResponse(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z2, Boolean bool5, Boolean bool6, Boolean bool7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, bool, bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? null : bool6, (i & 256) != 0 ? null : bool7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GetAuthorizationByRtrResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            byte r0 = r14.readByte()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Object r3 = r14.readValue(r3)
            boolean r5 = r3 instanceof java.lang.Boolean
            r6 = 0
            if (r5 == 0) goto L23
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r5 = r3
            goto L24
        L23:
            r5 = r6
        L24:
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Object r3 = r14.readValue(r3)
            boolean r7 = r3 instanceof java.lang.Boolean
            if (r7 == 0) goto L34
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r7 = r3
            goto L35
        L34:
            r7 = r6
        L35:
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Object r3 = r14.readValue(r3)
            boolean r8 = r3 instanceof java.lang.Boolean
            if (r8 == 0) goto L45
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r8 = r3
            goto L46
        L45:
            r8 = r6
        L46:
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Object r3 = r14.readValue(r3)
            boolean r9 = r3 instanceof java.lang.Boolean
            if (r9 == 0) goto L56
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r9 = r3
            goto L57
        L56:
            r9 = r6
        L57:
            byte r3 = r14.readByte()
            if (r3 == 0) goto L5e
            r1 = 1
        L5e:
            java.lang.ClassLoader r2 = r0.getClassLoader()
            java.lang.Object r2 = r14.readValue(r2)
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L6e
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r10 = r2
            goto L6f
        L6e:
            r10 = r6
        L6f:
            java.lang.ClassLoader r2 = r0.getClassLoader()
            java.lang.Object r2 = r14.readValue(r2)
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L7f
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r11 = r2
            goto L80
        L7f:
            r11 = r6
        L80:
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r14 = r14.readValue(r0)
            boolean r0 = r14 instanceof java.lang.Boolean
            if (r0 == 0) goto L90
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r12 = r14
            goto L91
        L90:
            r12 = r6
        L91:
            r3 = r13
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse.<init>(android.os.Parcel):void");
    }
}