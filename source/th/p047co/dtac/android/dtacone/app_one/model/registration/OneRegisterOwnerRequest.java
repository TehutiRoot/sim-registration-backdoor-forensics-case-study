package th.p047co.dtac.android.dtacone.app_one.model.registration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\f¨\u00061"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerRequest;", "Landroid/os/Parcelable;", "", "rtrCode", HintConstants.AUTOFILL_HINT_PASSWORD, "idCard", "msisdn", "simR", "simRToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPassword", OperatorName.CURVE_TO, "getIdCard", "d", "getMsisdn", "e", "getSimR", OperatorName.FILL_NON_ZERO, "getSimRToken", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.OneRegisterOwnerRequest */
/* loaded from: classes7.dex */
public final class OneRegisterOwnerRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<OneRegisterOwnerRequest> CREATOR = new Creator();
    @SerializedName("rtrCode")
    @Nullable

    /* renamed from: a */
    private final String f82082a;
    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    @Nullable

    /* renamed from: b */
    private final String f82083b;
    @SerializedName("idCard")
    @Nullable

    /* renamed from: c */
    private final String f82084c;
    @SerializedName("msisdn")
    @Nullable

    /* renamed from: d */
    private final String f82085d;
    @SerializedName("simR")
    @Nullable

    /* renamed from: e */
    private final String f82086e;
    @SerializedName("simRToken")
    @Nullable

    /* renamed from: f */
    private final String f82087f;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.OneRegisterOwnerRequest$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OneRegisterOwnerRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneRegisterOwnerRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneRegisterOwnerRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneRegisterOwnerRequest[] newArray(int i) {
            return new OneRegisterOwnerRequest[i];
        }
    }

    public OneRegisterOwnerRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OneRegisterOwnerRequest copy$default(OneRegisterOwnerRequest oneRegisterOwnerRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneRegisterOwnerRequest.f82082a;
        }
        if ((i & 2) != 0) {
            str2 = oneRegisterOwnerRequest.f82083b;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneRegisterOwnerRequest.f82084c;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneRegisterOwnerRequest.f82085d;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneRegisterOwnerRequest.f82086e;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneRegisterOwnerRequest.f82087f;
        }
        return oneRegisterOwnerRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.f82082a;
    }

    @Nullable
    public final String component2() {
        return this.f82083b;
    }

    @Nullable
    public final String component3() {
        return this.f82084c;
    }

    @Nullable
    public final String component4() {
        return this.f82085d;
    }

    @Nullable
    public final String component5() {
        return this.f82086e;
    }

    @Nullable
    public final String component6() {
        return this.f82087f;
    }

    @NotNull
    public final OneRegisterOwnerRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OneRegisterOwnerRequest(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneRegisterOwnerRequest) {
            OneRegisterOwnerRequest oneRegisterOwnerRequest = (OneRegisterOwnerRequest) obj;
            return Intrinsics.areEqual(this.f82082a, oneRegisterOwnerRequest.f82082a) && Intrinsics.areEqual(this.f82083b, oneRegisterOwnerRequest.f82083b) && Intrinsics.areEqual(this.f82084c, oneRegisterOwnerRequest.f82084c) && Intrinsics.areEqual(this.f82085d, oneRegisterOwnerRequest.f82085d) && Intrinsics.areEqual(this.f82086e, oneRegisterOwnerRequest.f82086e) && Intrinsics.areEqual(this.f82087f, oneRegisterOwnerRequest.f82087f);
        }
        return false;
    }

    @Nullable
    public final String getIdCard() {
        return this.f82084c;
    }

    @Nullable
    public final String getMsisdn() {
        return this.f82085d;
    }

    @Nullable
    public final String getPassword() {
        return this.f82083b;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f82082a;
    }

    @Nullable
    public final String getSimR() {
        return this.f82086e;
    }

    @Nullable
    public final String getSimRToken() {
        return this.f82087f;
    }

    public int hashCode() {
        String str = this.f82082a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82083b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82084c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82085d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82086e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82087f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82082a;
        String str2 = this.f82083b;
        String str3 = this.f82084c;
        String str4 = this.f82085d;
        String str5 = this.f82086e;
        String str6 = this.f82087f;
        return "OneRegisterOwnerRequest(rtrCode=" + str + ", password=" + str2 + ", idCard=" + str3 + ", msisdn=" + str4 + ", simR=" + str5 + ", simRToken=" + str6 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82082a);
        out.writeString(this.f82083b);
        out.writeString(this.f82084c);
        out.writeString(this.f82085d);
        out.writeString(this.f82086e);
        out.writeString(this.f82087f);
    }

    public OneRegisterOwnerRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f82082a = str;
        this.f82083b = str2;
        this.f82084c = str3;
        this.f82085d = str4;
        this.f82086e = str5;
        this.f82087f = str6;
    }

    public /* synthetic */ OneRegisterOwnerRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
