package th.p047co.dtac.android.dtacone.model.appOne.pre2post.response;

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
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0019H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006#"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "requireFaceRecognition", "", "invoiceAlertMethod", "", "dtrCode", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getDtrCode", "()Ljava/lang/String;", "getInvoiceAlertMethod", "getRequireFaceRecognition", "()Ljava/lang/Boolean;", "setRequireFaceRecognition", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostAuthorizationDataResponse */
/* loaded from: classes8.dex */
public final class OnePre2PostAuthorizationDataResponse implements Parcelable {
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("invoiceAlertMethod")
    @Nullable
    private final String invoiceAlertMethod;
    @SerializedName("requireFaceRecognition")
    @Nullable
    private Boolean requireFaceRecognition;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostAuthorizationDataResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OnePre2PostAuthorizationDataResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePre2PostAuthorizationDataResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnePre2PostAuthorizationDataResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePre2PostAuthorizationDataResponse[] newArray(int i) {
            return new OnePre2PostAuthorizationDataResponse[i];
        }
    }

    public OnePre2PostAuthorizationDataResponse(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.requireFaceRecognition = bool;
        this.invoiceAlertMethod = str;
        this.dtrCode = str2;
    }

    public static /* synthetic */ OnePre2PostAuthorizationDataResponse copy$default(OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = onePre2PostAuthorizationDataResponse.requireFaceRecognition;
        }
        if ((i & 2) != 0) {
            str = onePre2PostAuthorizationDataResponse.invoiceAlertMethod;
        }
        if ((i & 4) != 0) {
            str2 = onePre2PostAuthorizationDataResponse.dtrCode;
        }
        return onePre2PostAuthorizationDataResponse.copy(bool, str, str2);
    }

    @Nullable
    public final Boolean component1() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final String component2() {
        return this.invoiceAlertMethod;
    }

    @Nullable
    public final String component3() {
        return this.dtrCode;
    }

    @NotNull
    public final OnePre2PostAuthorizationDataResponse copy(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        return new OnePre2PostAuthorizationDataResponse(bool, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostAuthorizationDataResponse) {
            OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse = (OnePre2PostAuthorizationDataResponse) obj;
            return Intrinsics.areEqual(this.requireFaceRecognition, onePre2PostAuthorizationDataResponse.requireFaceRecognition) && Intrinsics.areEqual(this.invoiceAlertMethod, onePre2PostAuthorizationDataResponse.invoiceAlertMethod) && Intrinsics.areEqual(this.dtrCode, onePre2PostAuthorizationDataResponse.dtrCode);
        }
        return false;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    @Nullable
    public final Boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    public int hashCode() {
        Boolean bool = this.requireFaceRecognition;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.invoiceAlertMethod;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dtrCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setRequireFaceRecognition(@Nullable Boolean bool) {
        this.requireFaceRecognition = bool;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.requireFaceRecognition;
        String str = this.invoiceAlertMethod;
        String str2 = this.dtrCode;
        return "OnePre2PostAuthorizationDataResponse(requireFaceRecognition=" + bool + ", invoiceAlertMethod=" + str + ", dtrCode=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.requireFaceRecognition);
        parcel.writeString(this.invoiceAlertMethod);
        parcel.writeString(this.dtrCode);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OnePre2PostAuthorizationDataResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r3.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L16
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.String r1 = r3.readString()
            java.lang.String r3 = r3.readString()
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostAuthorizationDataResponse.<init>(android.os.Parcel):void");
    }
}
