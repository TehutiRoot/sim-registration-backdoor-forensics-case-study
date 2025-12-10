package th.p047co.dtac.android.dtacone.app_one.model.address;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJR\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0017R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u001b¨\u00065"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/address/OneGetAddressFromPostcodeResponse;", "Landroid/os/Parcelable;", "", "province", "", "Lth/co/dtac/android/dtacone/app_one/model/address/OneAmphoeResponse;", "amphoeList", "", "provinceId", "postCodeValue", "postCodeId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/app_one/model/address/OneGetAddressFromPostcodeResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getProvince", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getAmphoeList", OperatorName.CURVE_TO, "Ljava/lang/Integer;", "getProvinceId", "d", "getPostCodeValue", "e", "getPostCodeId", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.address.OneGetAddressFromPostcodeResponse */
/* loaded from: classes7.dex */
public final class OneGetAddressFromPostcodeResponse implements Parcelable {
    @SerializedName("province")
    @Nullable

    /* renamed from: a */
    private final String f81587a;
    @SerializedName("amphur")
    @Nullable

    /* renamed from: b */
    private final List<OneAmphoeResponse> f81588b;
    @SerializedName("provinceId")
    @Nullable

    /* renamed from: c */
    private final Integer f81589c;
    @SerializedName("postCodeValue")
    @Nullable

    /* renamed from: d */
    private final String f81590d;
    @SerializedName("postCodeId")
    @Nullable

    /* renamed from: e */
    private final Integer f81591e;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/address/OneGetAddressFromPostcodeResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/app_one/model/address/OneGetAddressFromPostcodeResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/app_one/model/address/OneGetAddressFromPostcodeResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.address.OneGetAddressFromPostcodeResponse$CREATOR */
    /* loaded from: classes7.dex */
    public static final class CREATOR implements Parcelable.Creator<OneGetAddressFromPostcodeResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneGetAddressFromPostcodeResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneGetAddressFromPostcodeResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneGetAddressFromPostcodeResponse[] newArray(int i) {
            return new OneGetAddressFromPostcodeResponse[i];
        }
    }

    public OneGetAddressFromPostcodeResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OneGetAddressFromPostcodeResponse copy$default(OneGetAddressFromPostcodeResponse oneGetAddressFromPostcodeResponse, String str, List list, Integer num, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneGetAddressFromPostcodeResponse.f81587a;
        }
        List<OneAmphoeResponse> list2 = list;
        if ((i & 2) != 0) {
            list2 = oneGetAddressFromPostcodeResponse.f81588b;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            num = oneGetAddressFromPostcodeResponse.f81589c;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            str2 = oneGetAddressFromPostcodeResponse.f81590d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            num2 = oneGetAddressFromPostcodeResponse.f81591e;
        }
        return oneGetAddressFromPostcodeResponse.copy(str, list3, num3, str3, num2);
    }

    @Nullable
    public final String component1() {
        return this.f81587a;
    }

    @Nullable
    public final List<OneAmphoeResponse> component2() {
        return this.f81588b;
    }

    @Nullable
    public final Integer component3() {
        return this.f81589c;
    }

    @Nullable
    public final String component4() {
        return this.f81590d;
    }

    @Nullable
    public final Integer component5() {
        return this.f81591e;
    }

    @NotNull
    public final OneGetAddressFromPostcodeResponse copy(@Nullable String str, @Nullable List<OneAmphoeResponse> list, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2) {
        return new OneGetAddressFromPostcodeResponse(str, list, num, str2, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneGetAddressFromPostcodeResponse) {
            OneGetAddressFromPostcodeResponse oneGetAddressFromPostcodeResponse = (OneGetAddressFromPostcodeResponse) obj;
            return Intrinsics.areEqual(this.f81587a, oneGetAddressFromPostcodeResponse.f81587a) && Intrinsics.areEqual(this.f81588b, oneGetAddressFromPostcodeResponse.f81588b) && Intrinsics.areEqual(this.f81589c, oneGetAddressFromPostcodeResponse.f81589c) && Intrinsics.areEqual(this.f81590d, oneGetAddressFromPostcodeResponse.f81590d) && Intrinsics.areEqual(this.f81591e, oneGetAddressFromPostcodeResponse.f81591e);
        }
        return false;
    }

    @Nullable
    public final List<OneAmphoeResponse> getAmphoeList() {
        return this.f81588b;
    }

    @Nullable
    public final Integer getPostCodeId() {
        return this.f81591e;
    }

    @Nullable
    public final String getPostCodeValue() {
        return this.f81590d;
    }

    @Nullable
    public final String getProvince() {
        return this.f81587a;
    }

    @Nullable
    public final Integer getProvinceId() {
        return this.f81589c;
    }

    public int hashCode() {
        String str = this.f81587a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OneAmphoeResponse> list = this.f81588b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f81589c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f81590d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f81591e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81587a;
        List<OneAmphoeResponse> list = this.f81588b;
        Integer num = this.f81589c;
        String str2 = this.f81590d;
        Integer num2 = this.f81591e;
        return "OneGetAddressFromPostcodeResponse(province=" + str + ", amphoeList=" + list + ", provinceId=" + num + ", postCodeValue=" + str2 + ", postCodeId=" + num2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f81587a);
        parcel.writeTypedList(this.f81588b);
        parcel.writeValue(this.f81589c);
        parcel.writeString(this.f81590d);
        parcel.writeValue(this.f81591e);
    }

    public OneGetAddressFromPostcodeResponse(@Nullable String str, @Nullable List<OneAmphoeResponse> list, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2) {
        this.f81587a = str;
        this.f81588b = list;
        this.f81589c = num;
        this.f81590d = str2;
        this.f81591e = num2;
    }

    public /* synthetic */ OneGetAddressFromPostcodeResponse(String str, List list, Integer num, String str2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneGetAddressFromPostcodeResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r2 = r8.readString()
            th.co.dtac.android.dtacone.app_one.model.address.OneAmphoeResponse$CREATOR r0 = th.p047co.dtac.android.dtacone.app_one.model.address.OneAmphoeResponse.CREATOR
            java.util.ArrayList r3 = r8.createTypedArrayList(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r8.readValue(r1)
            boolean r4 = r1 instanceof java.lang.Integer
            r5 = 0
            if (r4 == 0) goto L22
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4 = r1
            goto L23
        L22:
            r4 = r5
        L23:
            java.lang.String r6 = r8.readString()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r8 = r8.readValue(r0)
            boolean r0 = r8 instanceof java.lang.Integer
            if (r0 == 0) goto L36
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L37
        L36:
            r8 = r5
        L37:
            r1 = r7
            r5 = r6
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.model.address.OneGetAddressFromPostcodeResponse.<init>(android.os.Parcel):void");
    }
}
