package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b&\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u008d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010!R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b\u0012\u0010=¨\u0006?"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateInformationResponse;", "Landroid/os/Parcelable;", "", "rtrName", "rtrCode", "dtrCode", "address1", "address2", "subDistrict", "", "subDistrictId", "district", "districtId", "province", "provinceId", "postcode", "postcodeId", "", "isEditable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getRtrCode", OperatorName.CURVE_TO, "getDtrCode", "d", "getAddress1", "e", "getAddress2", OperatorName.FILL_NON_ZERO, "getSubDistrict", OperatorName.NON_STROKING_GRAY, "I", "getSubDistrictId", OperatorName.CLOSE_PATH, "getDistrict", "i", "getDistrictId", OperatorName.SET_LINE_JOINSTYLE, "getProvince", OperatorName.NON_STROKING_CMYK, "getProvinceId", OperatorName.LINE_TO, "getPostcode", OperatorName.MOVE_TO, "getPostcodeId", OperatorName.ENDPATH, "Z", "()Z", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateInformationResponse */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateInformationResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("rtrName")
    @Nullable

    /* renamed from: a */
    private final String f96973a;
    @SerializedName("rtrCode")
    @Nullable

    /* renamed from: b */
    private final String f96974b;
    @SerializedName("dtrCode")
    @Nullable

    /* renamed from: c */
    private final String f96975c;
    @SerializedName("address1")
    @Nullable

    /* renamed from: d */
    private final String f96976d;
    @SerializedName("address2")
    @Nullable

    /* renamed from: e */
    private final String f96977e;
    @SerializedName("subDistrict")
    @Nullable

    /* renamed from: f */
    private final String f96978f;
    @SerializedName("subDistrictId")

    /* renamed from: g */
    private final int f96979g;
    @SerializedName("district")
    @Nullable

    /* renamed from: h */
    private final String f96980h;
    @SerializedName("districtId")

    /* renamed from: i */
    private final int f96981i;
    @SerializedName("province")
    @Nullable

    /* renamed from: j */
    private final String f96982j;
    @SerializedName("provinceId")
    @Nullable

    /* renamed from: k */
    private final String f96983k;
    @SerializedName("postcode")
    @Nullable

    /* renamed from: l */
    private final String f96984l;
    @SerializedName("postcodeId")
    @Nullable

    /* renamed from: m */
    private final String f96985m;
    @SerializedName("isEditable")

    /* renamed from: n */
    private final boolean f96986n;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateInformationResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateInformationResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateInformationResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateInformationResponse$CREATOR */
    /* loaded from: classes10.dex */
    public static final class CREATOR implements Parcelable.Creator<OneRetailerProfileUpdateInformationResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneRetailerProfileUpdateInformationResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneRetailerProfileUpdateInformationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneRetailerProfileUpdateInformationResponse[] newArray(int i) {
            return new OneRetailerProfileUpdateInformationResponse[i];
        }
    }

    public OneRetailerProfileUpdateInformationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, @Nullable String str7, int i2, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z) {
        this.f96973a = str;
        this.f96974b = str2;
        this.f96975c = str3;
        this.f96976d = str4;
        this.f96977e = str5;
        this.f96978f = str6;
        this.f96979g = i;
        this.f96980h = str7;
        this.f96981i = i2;
        this.f96982j = str8;
        this.f96983k = str9;
        this.f96984l = str10;
        this.f96985m = str11;
        this.f96986n = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAddress1() {
        return this.f96976d;
    }

    @Nullable
    public final String getAddress2() {
        return this.f96977e;
    }

    @Nullable
    public final String getDistrict() {
        return this.f96980h;
    }

    public final int getDistrictId() {
        return this.f96981i;
    }

    @Nullable
    public final String getDtrCode() {
        return this.f96975c;
    }

    @Nullable
    public final String getPostcode() {
        return this.f96984l;
    }

    @Nullable
    public final String getPostcodeId() {
        return this.f96985m;
    }

    @Nullable
    public final String getProvince() {
        return this.f96982j;
    }

    @Nullable
    public final String getProvinceId() {
        return this.f96983k;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f96974b;
    }

    @Nullable
    public final String getRtrName() {
        return this.f96973a;
    }

    @Nullable
    public final String getSubDistrict() {
        return this.f96978f;
    }

    public final int getSubDistrictId() {
        return this.f96979g;
    }

    public final boolean isEditable() {
        return this.f96986n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f96973a);
        parcel.writeString(this.f96974b);
        parcel.writeString(this.f96975c);
        parcel.writeString(this.f96976d);
        parcel.writeString(this.f96977e);
        parcel.writeString(this.f96978f);
        parcel.writeInt(this.f96979g);
        parcel.writeString(this.f96980h);
        parcel.writeInt(this.f96981i);
        parcel.writeString(this.f96982j);
        parcel.writeString(this.f96983k);
        parcel.writeString(this.f96984l);
        parcel.writeString(this.f96985m);
        parcel.writeByte(this.f96986n ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneRetailerProfileUpdateInformationResponse(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readByte() != 0);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}