package th.p047co.dtac.android.dtacone.model.mrtr_postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JX\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0004\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\r¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/GetAuthorizationByRtrPostpaidResponse;", "Landroid/os/Parcelable;", "isFaceRecog", "", "isCheckSimStock", "invoiceAlertMethod", "", "defaultPaymentFreeSim", "isAllowManualKYC", "isRequireLiveness", "isOverruleXSim", "(ZLjava/lang/Boolean;Ljava/lang/String;ZZZZ)V", "getDefaultPaymentFreeSim", "()Z", "getInvoiceAlertMethod", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/Boolean;Ljava/lang/String;ZZZZ)Lth/co/dtac/android/dtacone/model/mrtr_postpaid/GetAuthorizationByRtrPostpaidResponse;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.GetAuthorizationByRtrPostpaidResponse */
/* loaded from: classes8.dex */
public final class GetAuthorizationByRtrPostpaidResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<GetAuthorizationByRtrPostpaidResponse> CREATOR = new Creator();
    @SerializedName("defaultPaymentFreeSim")
    private final boolean defaultPaymentFreeSim;
    @SerializedName("invoiceAlertMethod")
    @Nullable
    private final String invoiceAlertMethod;
    @SerializedName("isAllowManualKYC")
    private final boolean isAllowManualKYC;
    @SerializedName("isCheckSim")
    @Nullable
    private final Boolean isCheckSimStock;
    @SerializedName("requireFaceRecognition")
    private final boolean isFaceRecog;
    @SerializedName("isOverruleXSim")
    private final boolean isOverruleXSim;
    @SerializedName("isRequireLiveness")
    private final boolean isRequireLiveness;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.GetAuthorizationByRtrPostpaidResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<GetAuthorizationByRtrPostpaidResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GetAuthorizationByRtrPostpaidResponse createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GetAuthorizationByRtrPostpaidResponse(z, valueOf, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GetAuthorizationByRtrPostpaidResponse[] newArray(int i) {
            return new GetAuthorizationByRtrPostpaidResponse[i];
        }
    }

    public GetAuthorizationByRtrPostpaidResponse() {
        this(false, null, null, false, false, false, false, 127, null);
    }

    public static /* synthetic */ GetAuthorizationByRtrPostpaidResponse copy$default(GetAuthorizationByRtrPostpaidResponse getAuthorizationByRtrPostpaidResponse, boolean z, Boolean bool, String str, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getAuthorizationByRtrPostpaidResponse.isFaceRecog;
        }
        if ((i & 2) != 0) {
            bool = getAuthorizationByRtrPostpaidResponse.isCheckSimStock;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            str = getAuthorizationByRtrPostpaidResponse.invoiceAlertMethod;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z2 = getAuthorizationByRtrPostpaidResponse.defaultPaymentFreeSim;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = getAuthorizationByRtrPostpaidResponse.isAllowManualKYC;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = getAuthorizationByRtrPostpaidResponse.isRequireLiveness;
        }
        boolean z8 = z4;
        if ((i & 64) != 0) {
            z5 = getAuthorizationByRtrPostpaidResponse.isOverruleXSim;
        }
        return getAuthorizationByRtrPostpaidResponse.copy(z, bool2, str2, z6, z7, z8, z5);
    }

    public final boolean component1() {
        return this.isFaceRecog;
    }

    @Nullable
    public final Boolean component2() {
        return this.isCheckSimStock;
    }

    @Nullable
    public final String component3() {
        return this.invoiceAlertMethod;
    }

    public final boolean component4() {
        return this.defaultPaymentFreeSim;
    }

    public final boolean component5() {
        return this.isAllowManualKYC;
    }

    public final boolean component6() {
        return this.isRequireLiveness;
    }

    public final boolean component7() {
        return this.isOverruleXSim;
    }

    @NotNull
    public final GetAuthorizationByRtrPostpaidResponse copy(boolean z, @Nullable Boolean bool, @Nullable String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new GetAuthorizationByRtrPostpaidResponse(z, bool, str, z2, z3, z4, z5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAuthorizationByRtrPostpaidResponse) {
            GetAuthorizationByRtrPostpaidResponse getAuthorizationByRtrPostpaidResponse = (GetAuthorizationByRtrPostpaidResponse) obj;
            return this.isFaceRecog == getAuthorizationByRtrPostpaidResponse.isFaceRecog && Intrinsics.areEqual(this.isCheckSimStock, getAuthorizationByRtrPostpaidResponse.isCheckSimStock) && Intrinsics.areEqual(this.invoiceAlertMethod, getAuthorizationByRtrPostpaidResponse.invoiceAlertMethod) && this.defaultPaymentFreeSim == getAuthorizationByRtrPostpaidResponse.defaultPaymentFreeSim && this.isAllowManualKYC == getAuthorizationByRtrPostpaidResponse.isAllowManualKYC && this.isRequireLiveness == getAuthorizationByRtrPostpaidResponse.isRequireLiveness && this.isOverruleXSim == getAuthorizationByRtrPostpaidResponse.isOverruleXSim;
        }
        return false;
    }

    public final boolean getDefaultPaymentFreeSim() {
        return this.defaultPaymentFreeSim;
    }

    @Nullable
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.isFaceRecog;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.isCheckSimStock;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.invoiceAlertMethod;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ?? r2 = this.defaultPaymentFreeSim;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        ?? r22 = this.isAllowManualKYC;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.isRequireLiveness;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z2 = this.isOverruleXSim;
        return i7 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isAllowManualKYC() {
        return this.isAllowManualKYC;
    }

    @Nullable
    public final Boolean isCheckSimStock() {
        return this.isCheckSimStock;
    }

    public final boolean isFaceRecog() {
        return this.isFaceRecog;
    }

    public final boolean isOverruleXSim() {
        return this.isOverruleXSim;
    }

    public final boolean isRequireLiveness() {
        return this.isRequireLiveness;
    }

    @NotNull
    public String toString() {
        boolean z = this.isFaceRecog;
        Boolean bool = this.isCheckSimStock;
        String str = this.invoiceAlertMethod;
        boolean z2 = this.defaultPaymentFreeSim;
        boolean z3 = this.isAllowManualKYC;
        boolean z4 = this.isRequireLiveness;
        boolean z5 = this.isOverruleXSim;
        return "GetAuthorizationByRtrPostpaidResponse(isFaceRecog=" + z + ", isCheckSimStock=" + bool + ", invoiceAlertMethod=" + str + ", defaultPaymentFreeSim=" + z2 + ", isAllowManualKYC=" + z3 + ", isRequireLiveness=" + z4 + ", isOverruleXSim=" + z5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.isFaceRecog ? 1 : 0);
        Boolean bool = this.isCheckSimStock;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.invoiceAlertMethod);
        out.writeInt(this.defaultPaymentFreeSim ? 1 : 0);
        out.writeInt(this.isAllowManualKYC ? 1 : 0);
        out.writeInt(this.isRequireLiveness ? 1 : 0);
        out.writeInt(this.isOverruleXSim ? 1 : 0);
    }

    public GetAuthorizationByRtrPostpaidResponse(boolean z, @Nullable Boolean bool, @Nullable String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isFaceRecog = z;
        this.isCheckSimStock = bool;
        this.invoiceAlertMethod = str;
        this.defaultPaymentFreeSim = z2;
        this.isAllowManualKYC = z3;
        this.isRequireLiveness = z4;
        this.isOverruleXSim = z5;
    }

    public /* synthetic */ GetAuthorizationByRtrPostpaidResponse(boolean z, Boolean bool, String str, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? Constant.EInvoice.SMS_ONLY : str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5);
    }
}