package th.p047co.dtac.android.dtacone.model.appOne.common.true_company;

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
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B_\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003Jc\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020#H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006."}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "systemMessage", "", "code", "codeType", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/Data;", "replaceMessage", "", "desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/Data;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/Data;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse */
/* loaded from: classes8.dex */
public final class OneCommonTrueLocationResponse implements Parcelable {
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final Data data;
    @SerializedName("desc")
    @Nullable
    private final String desc;
    @SerializedName("replaceMessage")
    @Nullable
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @Nullable
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @Nullable
    private final String systemMessage;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OneCommonTrueLocationResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneCommonTrueLocationResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneCommonTrueLocationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneCommonTrueLocationResponse[] newArray(int i) {
            return new OneCommonTrueLocationResponse[i];
        }
    }

    public OneCommonTrueLocationResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneCommonTrueLocationResponse copy$default(OneCommonTrueLocationResponse oneCommonTrueLocationResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneCommonTrueLocationResponse.systemMessage;
        }
        if ((i & 2) != 0) {
            str2 = oneCommonTrueLocationResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneCommonTrueLocationResponse.codeType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneCommonTrueLocationResponse.responseDateTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = oneCommonTrueLocationResponse.data;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = oneCommonTrueLocationResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = oneCommonTrueLocationResponse.desc;
        }
        return oneCommonTrueLocationResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.systemMessage;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.codeType;
    }

    @Nullable
    public final String component4() {
        return this.responseDateTime;
    }

    @Nullable
    public final Data component5() {
        return this.data;
    }

    @Nullable
    public final List<String> component6() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component7() {
        return this.desc;
    }

    @NotNull
    public final OneCommonTrueLocationResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new OneCommonTrueLocationResponse(str, str2, str3, str4, data, list, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCommonTrueLocationResponse) {
            OneCommonTrueLocationResponse oneCommonTrueLocationResponse = (OneCommonTrueLocationResponse) obj;
            return Intrinsics.areEqual(this.systemMessage, oneCommonTrueLocationResponse.systemMessage) && Intrinsics.areEqual(this.code, oneCommonTrueLocationResponse.code) && Intrinsics.areEqual(this.codeType, oneCommonTrueLocationResponse.codeType) && Intrinsics.areEqual(this.responseDateTime, oneCommonTrueLocationResponse.responseDateTime) && Intrinsics.areEqual(this.data, oneCommonTrueLocationResponse.data) && Intrinsics.areEqual(this.replaceMessage, oneCommonTrueLocationResponse.replaceMessage) && Intrinsics.areEqual(this.desc, oneCommonTrueLocationResponse.desc);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        String str = this.systemMessage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.codeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.responseDateTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.data;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.desc;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.systemMessage;
        String str2 = this.code;
        String str3 = this.codeType;
        String str4 = this.responseDateTime;
        Data data = this.data;
        List<String> list = this.replaceMessage;
        String str5 = this.desc;
        return "OneCommonTrueLocationResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.systemMessage);
        parcel.writeString(this.code);
        parcel.writeString(this.codeType);
        parcel.writeString(this.responseDateTime);
        parcel.writeParcelable(this.data, i);
        parcel.writeStringList(this.replaceMessage);
        parcel.writeString(this.desc);
    }

    public OneCommonTrueLocationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.systemMessage = str;
        this.code = str2;
        this.codeType = str3;
        this.responseDateTime = str4;
        this.data = data;
        this.replaceMessage = list;
        this.desc = str5;
    }

    public /* synthetic */ OneCommonTrueLocationResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneCommonTrueLocationResponse(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Data) parcel.readParcelable(Data.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
