package th.p047co.dtac.android.dtacone.app_one.model.registration;

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
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\u000f¨\u0006;"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerResponse;", "Landroid/os/Parcelable;", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/registration/Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/registration/Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/registration/Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/registration/Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/registration/Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerResponse */
/* loaded from: classes7.dex */
public final class ListSIMRetailerResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<ListSIMRetailerResponse> CREATOR = new Creator();
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f82075a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82076b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f82077c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f82078d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f82079e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f82080f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f82081g;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerResponse$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ListSIMRetailerResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ListSIMRetailerResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ListSIMRetailerResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ListSIMRetailerResponse[] newArray(int i) {
            return new ListSIMRetailerResponse[i];
        }
    }

    public ListSIMRetailerResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ListSIMRetailerResponse copy$default(ListSIMRetailerResponse listSIMRetailerResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listSIMRetailerResponse.f82075a;
        }
        if ((i & 2) != 0) {
            str2 = listSIMRetailerResponse.f82076b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = listSIMRetailerResponse.f82077c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = listSIMRetailerResponse.f82078d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = listSIMRetailerResponse.f82079e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = listSIMRetailerResponse.f82080f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = listSIMRetailerResponse.f82081g;
        }
        return listSIMRetailerResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f82075a;
    }

    @Nullable
    public final String component2() {
        return this.f82076b;
    }

    @Nullable
    public final String component3() {
        return this.f82077c;
    }

    @Nullable
    public final String component4() {
        return this.f82078d;
    }

    @Nullable
    public final Data component5() {
        return this.f82079e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f82080f;
    }

    @Nullable
    public final String component7() {
        return this.f82081g;
    }

    @NotNull
    public final ListSIMRetailerResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new ListSIMRetailerResponse(str, str2, str3, str4, data, list, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListSIMRetailerResponse) {
            ListSIMRetailerResponse listSIMRetailerResponse = (ListSIMRetailerResponse) obj;
            return Intrinsics.areEqual(this.f82075a, listSIMRetailerResponse.f82075a) && Intrinsics.areEqual(this.f82076b, listSIMRetailerResponse.f82076b) && Intrinsics.areEqual(this.f82077c, listSIMRetailerResponse.f82077c) && Intrinsics.areEqual(this.f82078d, listSIMRetailerResponse.f82078d) && Intrinsics.areEqual(this.f82079e, listSIMRetailerResponse.f82079e) && Intrinsics.areEqual(this.f82080f, listSIMRetailerResponse.f82080f) && Intrinsics.areEqual(this.f82081g, listSIMRetailerResponse.f82081g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f82076b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f82077c;
    }

    @Nullable
    public final Data getData() {
        return this.f82079e;
    }

    @Nullable
    public final String getDesc() {
        return this.f82081g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f82080f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f82078d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f82075a;
    }

    public int hashCode() {
        String str = this.f82075a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82076b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82077c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82078d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f82079e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f82080f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f82081g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82075a;
        String str2 = this.f82076b;
        String str3 = this.f82077c;
        String str4 = this.f82078d;
        Data data = this.f82079e;
        List<String> list = this.f82080f;
        String str5 = this.f82081g;
        return "ListSIMRetailerResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82075a);
        out.writeString(this.f82076b);
        out.writeString(this.f82077c);
        out.writeString(this.f82078d);
        Data data = this.f82079e;
        if (data == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            data.writeToParcel(out, i);
        }
        out.writeStringList(this.f82080f);
        out.writeString(this.f82081g);
    }

    public ListSIMRetailerResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f82075a = str;
        this.f82076b = str2;
        this.f82077c = str3;
        this.f82078d = str4;
        this.f82079e = data;
        this.f82080f = list;
        this.f82081g = str5;
    }

    public /* synthetic */ ListSIMRetailerResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
