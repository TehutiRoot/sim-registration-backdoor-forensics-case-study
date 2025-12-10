package th.p047co.dtac.android.dtacone.app_one.model.registration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
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
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJl\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014R$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\u000f¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse;", "Landroid/os/Parcelable;", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterResponse */
/* loaded from: classes7.dex */
public final class CheckProfileRegisterResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<CheckProfileRegisterResponse> CREATOR = new Creator();
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f82156a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82157b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f82158c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f82159d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f82160e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f82161f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f82162g;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterResponse$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<CheckProfileRegisterResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckProfileRegisterResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckProfileRegisterResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckProfileRegisterResponse[] newArray(int i) {
            return new CheckProfileRegisterResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse$Data;", "Landroid/os/Parcelable;", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse$Data;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getStatus", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        @SerializedName(NotificationCompat.CATEGORY_STATUS)
        @Nullable

        /* renamed from: a */
        private final String f82163a;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterResponse$Data$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Data createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data() {
            this(null, 1, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.f82163a;
            }
            return data.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.f82163a;
        }

        @NotNull
        public final Data copy(@Nullable String str) {
            return new Data(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.areEqual(this.f82163a, ((Data) obj).f82163a);
        }

        @Nullable
        public final String getStatus() {
            return this.f82163a;
        }

        public int hashCode() {
            String str = this.f82163a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.f82163a;
            return "Data(status=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f82163a);
        }

        public Data(@Nullable String str) {
            this.f82163a = str;
        }

        public /* synthetic */ Data(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public CheckProfileRegisterResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CheckProfileRegisterResponse copy$default(CheckProfileRegisterResponse checkProfileRegisterResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkProfileRegisterResponse.f82156a;
        }
        if ((i & 2) != 0) {
            str2 = checkProfileRegisterResponse.f82157b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = checkProfileRegisterResponse.f82158c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = checkProfileRegisterResponse.f82159d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = checkProfileRegisterResponse.f82160e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = checkProfileRegisterResponse.f82161f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = checkProfileRegisterResponse.f82162g;
        }
        return checkProfileRegisterResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f82156a;
    }

    @Nullable
    public final String component2() {
        return this.f82157b;
    }

    @Nullable
    public final String component3() {
        return this.f82158c;
    }

    @Nullable
    public final String component4() {
        return this.f82159d;
    }

    @Nullable
    public final Data component5() {
        return this.f82160e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f82161f;
    }

    @Nullable
    public final String component7() {
        return this.f82162g;
    }

    @NotNull
    public final CheckProfileRegisterResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new CheckProfileRegisterResponse(str, str2, str3, str4, data, list, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckProfileRegisterResponse) {
            CheckProfileRegisterResponse checkProfileRegisterResponse = (CheckProfileRegisterResponse) obj;
            return Intrinsics.areEqual(this.f82156a, checkProfileRegisterResponse.f82156a) && Intrinsics.areEqual(this.f82157b, checkProfileRegisterResponse.f82157b) && Intrinsics.areEqual(this.f82158c, checkProfileRegisterResponse.f82158c) && Intrinsics.areEqual(this.f82159d, checkProfileRegisterResponse.f82159d) && Intrinsics.areEqual(this.f82160e, checkProfileRegisterResponse.f82160e) && Intrinsics.areEqual(this.f82161f, checkProfileRegisterResponse.f82161f) && Intrinsics.areEqual(this.f82162g, checkProfileRegisterResponse.f82162g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f82157b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f82158c;
    }

    @Nullable
    public final Data getData() {
        return this.f82160e;
    }

    @Nullable
    public final String getDesc() {
        return this.f82162g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f82161f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f82159d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f82156a;
    }

    public int hashCode() {
        String str = this.f82156a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82157b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82158c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82159d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f82160e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f82161f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f82162g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82156a;
        String str2 = this.f82157b;
        String str3 = this.f82158c;
        String str4 = this.f82159d;
        Data data = this.f82160e;
        List<String> list = this.f82161f;
        String str5 = this.f82162g;
        return "CheckProfileRegisterResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82156a);
        out.writeString(this.f82157b);
        out.writeString(this.f82158c);
        out.writeString(this.f82159d);
        Data data = this.f82160e;
        if (data == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            data.writeToParcel(out, i);
        }
        out.writeStringList(this.f82161f);
        out.writeString(this.f82162g);
    }

    public CheckProfileRegisterResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f82156a = str;
        this.f82157b = str2;
        this.f82158c = str3;
        this.f82159d = str4;
        this.f82160e = data;
        this.f82161f = list;
        this.f82162g = str5;
    }

    public /* synthetic */ CheckProfileRegisterResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}