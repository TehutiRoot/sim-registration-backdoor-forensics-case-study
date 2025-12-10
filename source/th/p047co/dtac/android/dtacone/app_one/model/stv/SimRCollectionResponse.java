package th.p047co.dtac.android.dtacone.app_one.model.stv;

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
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJl\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014R$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\u000f¨\u0006<"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "Landroid/os/Parcelable;", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.SimRCollectionResponse */
/* loaded from: classes7.dex */
public final class SimRCollectionResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<SimRCollectionResponse> CREATOR = new Creator();
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f82286a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82287b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f82288c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f82289d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f82290e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f82291f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f82292g;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.SimRCollectionResponse$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<SimRCollectionResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SimRCollectionResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimRCollectionResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SimRCollectionResponse[] newArray(int i) {
            return new SimRCollectionResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse$Data;", "Landroid/os/Parcelable;", "", "", "simRList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse$Data;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getSimRList", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.SimRCollectionResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data implements Parcelable {
        public static final int $stable = 8;
        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        @SerializedName("simRList")
        @Nullable

        /* renamed from: a */
        private final List<String> f82293a;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.SimRCollectionResponse$Data$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Data createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.createStringArrayList());
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

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = data.f82293a;
            }
            return data.copy(list);
        }

        @Nullable
        public final List<String> component1() {
            return this.f82293a;
        }

        @NotNull
        public final Data copy(@Nullable List<String> list) {
            return new Data(list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.areEqual(this.f82293a, ((Data) obj).f82293a);
        }

        @Nullable
        public final List<String> getSimRList() {
            return this.f82293a;
        }

        public int hashCode() {
            List<String> list = this.f82293a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            List<String> list = this.f82293a;
            return "Data(simRList=" + list + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeStringList(this.f82293a);
        }

        public Data(@Nullable List<String> list) {
            this.f82293a = list;
        }

        public /* synthetic */ Data(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    public SimRCollectionResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ SimRCollectionResponse copy$default(SimRCollectionResponse simRCollectionResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simRCollectionResponse.f82286a;
        }
        if ((i & 2) != 0) {
            str2 = simRCollectionResponse.f82287b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = simRCollectionResponse.f82288c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = simRCollectionResponse.f82289d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = simRCollectionResponse.f82290e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = simRCollectionResponse.f82291f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = simRCollectionResponse.f82292g;
        }
        return simRCollectionResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f82286a;
    }

    @Nullable
    public final String component2() {
        return this.f82287b;
    }

    @Nullable
    public final String component3() {
        return this.f82288c;
    }

    @Nullable
    public final String component4() {
        return this.f82289d;
    }

    @Nullable
    public final Data component5() {
        return this.f82290e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f82291f;
    }

    @Nullable
    public final String component7() {
        return this.f82292g;
    }

    @NotNull
    public final SimRCollectionResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new SimRCollectionResponse(str, str2, str3, str4, data, list, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimRCollectionResponse) {
            SimRCollectionResponse simRCollectionResponse = (SimRCollectionResponse) obj;
            return Intrinsics.areEqual(this.f82286a, simRCollectionResponse.f82286a) && Intrinsics.areEqual(this.f82287b, simRCollectionResponse.f82287b) && Intrinsics.areEqual(this.f82288c, simRCollectionResponse.f82288c) && Intrinsics.areEqual(this.f82289d, simRCollectionResponse.f82289d) && Intrinsics.areEqual(this.f82290e, simRCollectionResponse.f82290e) && Intrinsics.areEqual(this.f82291f, simRCollectionResponse.f82291f) && Intrinsics.areEqual(this.f82292g, simRCollectionResponse.f82292g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f82287b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f82288c;
    }

    @Nullable
    public final Data getData() {
        return this.f82290e;
    }

    @Nullable
    public final String getDesc() {
        return this.f82292g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f82291f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f82289d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f82286a;
    }

    public int hashCode() {
        String str = this.f82286a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82287b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82288c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82289d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f82290e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f82291f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f82292g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82286a;
        String str2 = this.f82287b;
        String str3 = this.f82288c;
        String str4 = this.f82289d;
        Data data = this.f82290e;
        List<String> list = this.f82291f;
        String str5 = this.f82292g;
        return "SimRCollectionResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82286a);
        out.writeString(this.f82287b);
        out.writeString(this.f82288c);
        out.writeString(this.f82289d);
        Data data = this.f82290e;
        if (data == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            data.writeToParcel(out, i);
        }
        out.writeStringList(this.f82291f);
        out.writeString(this.f82292g);
    }

    public SimRCollectionResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f82286a = str;
        this.f82287b = str2;
        this.f82288c = str3;
        this.f82289d = str4;
        this.f82290e = data;
        this.f82291f = list;
        this.f82292g = str5;
    }

    public /* synthetic */ SimRCollectionResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
