package th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization;

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
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B;\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001dH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0005\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isCheckSIMStock", "", "invoiceAlertMethod", "", "isAllowManualKYC", "isRequireLiveNess", "requireFaceRecognition", "(Ljava/lang/Boolean;Ljava/lang/String;ZZZ)V", "getInvoiceAlertMethod", "()Ljava/lang/String;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRequireFaceRecognition", "setRequireFaceRecognition", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;ZZZ)Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse */
/* loaded from: classes8.dex */
public final class MnpAuthorizationResponse implements Parcelable {
    @SerializedName("invoiceAlertMethod")
    @Nullable
    private final String invoiceAlertMethod;
    @SerializedName("isAllowManualKYC")
    private final boolean isAllowManualKYC;
    @SerializedName("isCheckSIMStock")
    @Nullable
    private final Boolean isCheckSIMStock;
    @SerializedName("isRequireLiveness")
    private final boolean isRequireLiveNess;
    @SerializedName("requireFaceRecognition")
    private boolean requireFaceRecognition;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<MnpAuthorizationResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public MnpAuthorizationResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MnpAuthorizationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public MnpAuthorizationResponse[] newArray(int i) {
            return new MnpAuthorizationResponse[i];
        }
    }

    public MnpAuthorizationResponse() {
        this(null, null, false, false, false, 31, null);
    }

    public static /* synthetic */ MnpAuthorizationResponse copy$default(MnpAuthorizationResponse mnpAuthorizationResponse, Boolean bool, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = mnpAuthorizationResponse.isCheckSIMStock;
        }
        if ((i & 2) != 0) {
            str = mnpAuthorizationResponse.invoiceAlertMethod;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = mnpAuthorizationResponse.isAllowManualKYC;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = mnpAuthorizationResponse.isRequireLiveNess;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = mnpAuthorizationResponse.requireFaceRecognition;
        }
        return mnpAuthorizationResponse.copy(bool, str2, z4, z5, z3);
    }

    @Nullable
    public final Boolean component1() {
        return this.isCheckSIMStock;
    }

    @Nullable
    public final String component2() {
        return this.invoiceAlertMethod;
    }

    public final boolean component3() {
        return this.isAllowManualKYC;
    }

    public final boolean component4() {
        return this.isRequireLiveNess;
    }

    public final boolean component5() {
        return this.requireFaceRecognition;
    }

    @NotNull
    public final MnpAuthorizationResponse copy(@Nullable Boolean bool, @Nullable String str, boolean z, boolean z2, boolean z3) {
        return new MnpAuthorizationResponse(bool, str, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MnpAuthorizationResponse) {
            MnpAuthorizationResponse mnpAuthorizationResponse = (MnpAuthorizationResponse) obj;
            return Intrinsics.areEqual(this.isCheckSIMStock, mnpAuthorizationResponse.isCheckSIMStock) && Intrinsics.areEqual(this.invoiceAlertMethod, mnpAuthorizationResponse.invoiceAlertMethod) && this.isAllowManualKYC == mnpAuthorizationResponse.isAllowManualKYC && this.isRequireLiveNess == mnpAuthorizationResponse.isRequireLiveNess && this.requireFaceRecognition == mnpAuthorizationResponse.requireFaceRecognition;
        }
        return false;
    }

    @Nullable
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Boolean bool = this.isCheckSIMStock;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.invoiceAlertMethod;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.isAllowManualKYC;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.isRequireLiveNess;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.requireFaceRecognition;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean isAllowManualKYC() {
        return this.isAllowManualKYC;
    }

    @Nullable
    public final Boolean isCheckSIMStock() {
        return this.isCheckSIMStock;
    }

    public final boolean isRequireLiveNess() {
        return this.isRequireLiveNess;
    }

    public final void setRequireFaceRecognition(boolean z) {
        this.requireFaceRecognition = z;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isCheckSIMStock;
        String str = this.invoiceAlertMethod;
        boolean z = this.isAllowManualKYC;
        boolean z2 = this.isRequireLiveNess;
        boolean z3 = this.requireFaceRecognition;
        return "MnpAuthorizationResponse(isCheckSIMStock=" + bool + ", invoiceAlertMethod=" + str + ", isAllowManualKYC=" + z + ", isRequireLiveNess=" + z2 + ", requireFaceRecognition=" + z3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.isCheckSIMStock);
        parcel.writeString(this.invoiceAlertMethod);
        parcel.writeByte(this.isAllowManualKYC ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRequireLiveNess ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.requireFaceRecognition ? (byte) 1 : (byte) 0);
    }

    public MnpAuthorizationResponse(@Nullable Boolean bool, @Nullable String str, boolean z, boolean z2, boolean z3) {
        this.isCheckSIMStock = bool;
        this.invoiceAlertMethod = str;
        this.isAllowManualKYC = z;
        this.isRequireLiveNess = z2;
        this.requireFaceRecognition = z3;
    }

    public /* synthetic */ MnpAuthorizationResponse(Boolean bool, String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) == 0 ? str : null, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MnpAuthorizationResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r8.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L17
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L15:
            r2 = r0
            goto L19
        L17:
            r0 = 0
            goto L15
        L19:
            java.lang.String r3 = r8.readString()
            byte r0 = r8.readByte()
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            byte r5 = r8.readByte()
            if (r5 == 0) goto L30
            r5 = 1
            goto L31
        L30:
            r5 = 0
        L31:
            byte r8 = r8.readByte()
            if (r8 == 0) goto L39
            r6 = 1
            goto L3a
        L39:
            r6 = 0
        L3a:
            r1 = r7
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse.<init>(android.os.Parcel):void");
    }
}