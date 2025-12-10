package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BG\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0012JP\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u000bH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\u0018\u0010&\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000bH\u0016R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "province", "", "amphoeList", "", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationAmphoeResponse;", "provinceId", "", "postCodeValue", "postCodeId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getAmphoeList", "()Ljava/util/List;", "getPostCodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPostCodeValue", "()Ljava/lang/String;", "getProvince", "getProvinceId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationGetAddressFromPostcodeResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegistrationGetAddressFromPostcodeResponse implements Parcelable {
    @SerializedName("amphur")
    @Nullable
    private final List<OneOnlineRegistrationAmphoeResponse> amphoeList;
    @SerializedName("postCodeId")
    @Nullable
    private final Integer postCodeId;
    @SerializedName("postCodeValue")
    @Nullable
    private final String postCodeValue;
    @SerializedName("province")
    @Nullable
    private final String province;
    @SerializedName("provinceId")
    @Nullable
    private final Integer provinceId;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationGetAddressFromPostcodeResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneOnlineRegistrationGetAddressFromPostcodeResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOnlineRegistrationGetAddressFromPostcodeResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneOnlineRegistrationGetAddressFromPostcodeResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOnlineRegistrationGetAddressFromPostcodeResponse[] newArray(int i) {
            return new OneOnlineRegistrationGetAddressFromPostcodeResponse[i];
        }
    }

    public OneOnlineRegistrationGetAddressFromPostcodeResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OneOnlineRegistrationGetAddressFromPostcodeResponse copy$default(OneOnlineRegistrationGetAddressFromPostcodeResponse oneOnlineRegistrationGetAddressFromPostcodeResponse, String str, List list, Integer num, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneOnlineRegistrationGetAddressFromPostcodeResponse.province;
        }
        List<OneOnlineRegistrationAmphoeResponse> list2 = list;
        if ((i & 2) != 0) {
            list2 = oneOnlineRegistrationGetAddressFromPostcodeResponse.amphoeList;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            num = oneOnlineRegistrationGetAddressFromPostcodeResponse.provinceId;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            str2 = oneOnlineRegistrationGetAddressFromPostcodeResponse.postCodeValue;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            num2 = oneOnlineRegistrationGetAddressFromPostcodeResponse.postCodeId;
        }
        return oneOnlineRegistrationGetAddressFromPostcodeResponse.copy(str, list3, num3, str3, num2);
    }

    @Nullable
    public final String component1() {
        return this.province;
    }

    @Nullable
    public final List<OneOnlineRegistrationAmphoeResponse> component2() {
        return this.amphoeList;
    }

    @Nullable
    public final Integer component3() {
        return this.provinceId;
    }

    @Nullable
    public final String component4() {
        return this.postCodeValue;
    }

    @Nullable
    public final Integer component5() {
        return this.postCodeId;
    }

    @NotNull
    public final OneOnlineRegistrationGetAddressFromPostcodeResponse copy(@Nullable String str, @Nullable List<OneOnlineRegistrationAmphoeResponse> list, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2) {
        return new OneOnlineRegistrationGetAddressFromPostcodeResponse(str, list, num, str2, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegistrationGetAddressFromPostcodeResponse) {
            OneOnlineRegistrationGetAddressFromPostcodeResponse oneOnlineRegistrationGetAddressFromPostcodeResponse = (OneOnlineRegistrationGetAddressFromPostcodeResponse) obj;
            return Intrinsics.areEqual(this.province, oneOnlineRegistrationGetAddressFromPostcodeResponse.province) && Intrinsics.areEqual(this.amphoeList, oneOnlineRegistrationGetAddressFromPostcodeResponse.amphoeList) && Intrinsics.areEqual(this.provinceId, oneOnlineRegistrationGetAddressFromPostcodeResponse.provinceId) && Intrinsics.areEqual(this.postCodeValue, oneOnlineRegistrationGetAddressFromPostcodeResponse.postCodeValue) && Intrinsics.areEqual(this.postCodeId, oneOnlineRegistrationGetAddressFromPostcodeResponse.postCodeId);
        }
        return false;
    }

    @Nullable
    public final List<OneOnlineRegistrationAmphoeResponse> getAmphoeList() {
        return this.amphoeList;
    }

    @Nullable
    public final Integer getPostCodeId() {
        return this.postCodeId;
    }

    @Nullable
    public final String getPostCodeValue() {
        return this.postCodeValue;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    @Nullable
    public final Integer getProvinceId() {
        return this.provinceId;
    }

    public int hashCode() {
        String str = this.province;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OneOnlineRegistrationAmphoeResponse> list = this.amphoeList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.provinceId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.postCodeValue;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.postCodeId;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.province;
        List<OneOnlineRegistrationAmphoeResponse> list = this.amphoeList;
        Integer num = this.provinceId;
        String str2 = this.postCodeValue;
        Integer num2 = this.postCodeId;
        return "OneOnlineRegistrationGetAddressFromPostcodeResponse(province=" + str + ", amphoeList=" + list + ", provinceId=" + num + ", postCodeValue=" + str2 + ", postCodeId=" + num2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.province);
        parcel.writeTypedList(this.amphoeList);
        parcel.writeValue(this.provinceId);
        parcel.writeString(this.postCodeValue);
        parcel.writeValue(this.postCodeId);
    }

    public OneOnlineRegistrationGetAddressFromPostcodeResponse(@Nullable String str, @Nullable List<OneOnlineRegistrationAmphoeResponse> list, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2) {
        this.province = str;
        this.amphoeList = list;
        this.provinceId = num;
        this.postCodeValue = str2;
        this.postCodeId = num2;
    }

    public /* synthetic */ OneOnlineRegistrationGetAddressFromPostcodeResponse(String str, List list, Integer num, String str2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneOnlineRegistrationGetAddressFromPostcodeResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r2 = r8.readString()
            th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationAmphoeResponse$CREATOR r0 = th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationAmphoeResponse.CREATOR
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
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationGetAddressFromPostcodeResponse.<init>(android.os.Parcel):void");
    }
}