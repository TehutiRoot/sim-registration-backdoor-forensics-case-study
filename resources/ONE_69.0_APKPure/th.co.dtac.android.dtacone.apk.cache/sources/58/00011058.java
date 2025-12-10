package th.p047co.dtac.android.dtacone.app_one.model.forgotPassword;

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
@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jl\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u000fR$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0017¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse;", "Landroid/os/Parcelable;", "", "codeType", "code", "desc", "systemMessage", "", "replaceMessage", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse$Data;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse$Data;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse$Data;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse$Data;)Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCodeType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getDesc", "d", "getSystemMessage", "e", "Ljava/util/List;", "getReplaceMessage", OperatorName.FILL_NON_ZERO, "getResponseDateTime", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse$Data;", "getData", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordResponse */
/* loaded from: classes7.dex */
public final class ForgotPasswordResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<ForgotPasswordResponse> CREATOR = new Creator();
    @SerializedName("codeType")
    @Nullable

    /* renamed from: a */
    private final String f81786a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81787b;
    @SerializedName("desc")
    @Nullable

    /* renamed from: c */
    private final String f81788c;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: d */
    private final String f81789d;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: e */
    private final List<String> f81790e;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: f */
    private final String f81791f;
    @SerializedName("data")
    @Nullable

    /* renamed from: g */
    private final Data f81792g;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordResponse$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ForgotPasswordResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ForgotPasswordResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ForgotPasswordResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ForgotPasswordResponse[] newArray(int i) {
            return new ForgotPasswordResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse$Data;", "Landroid/os/Parcelable;", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse$Data;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getStatus", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        @SerializedName(NotificationCompat.CATEGORY_STATUS)
        @Nullable

        /* renamed from: a */
        private final String f81793a;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordResponse$Data$Creator */
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
                str = data.f81793a;
            }
            return data.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.f81793a;
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
            return (obj instanceof Data) && Intrinsics.areEqual(this.f81793a, ((Data) obj).f81793a);
        }

        @Nullable
        public final String getStatus() {
            return this.f81793a;
        }

        public int hashCode() {
            String str = this.f81793a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.f81793a;
            return "Data(status=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f81793a);
        }

        public Data(@Nullable String str) {
            this.f81793a = str;
        }

        public /* synthetic */ Data(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public ForgotPasswordResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ForgotPasswordResponse copy$default(ForgotPasswordResponse forgotPasswordResponse, String str, String str2, String str3, String str4, List list, String str5, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forgotPasswordResponse.f81786a;
        }
        if ((i & 2) != 0) {
            str2 = forgotPasswordResponse.f81787b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = forgotPasswordResponse.f81788c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = forgotPasswordResponse.f81789d;
        }
        String str8 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = forgotPasswordResponse.f81790e;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str5 = forgotPasswordResponse.f81791f;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            data = forgotPasswordResponse.f81792g;
        }
        return forgotPasswordResponse.copy(str, str6, str7, str8, list3, str9, data);
    }

    @Nullable
    public final String component1() {
        return this.f81786a;
    }

    @Nullable
    public final String component2() {
        return this.f81787b;
    }

    @Nullable
    public final String component3() {
        return this.f81788c;
    }

    @Nullable
    public final String component4() {
        return this.f81789d;
    }

    @Nullable
    public final List<String> component5() {
        return this.f81790e;
    }

    @Nullable
    public final String component6() {
        return this.f81791f;
    }

    @Nullable
    public final Data component7() {
        return this.f81792g;
    }

    @NotNull
    public final ForgotPasswordResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable Data data) {
        return new ForgotPasswordResponse(str, str2, str3, str4, list, str5, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForgotPasswordResponse) {
            ForgotPasswordResponse forgotPasswordResponse = (ForgotPasswordResponse) obj;
            return Intrinsics.areEqual(this.f81786a, forgotPasswordResponse.f81786a) && Intrinsics.areEqual(this.f81787b, forgotPasswordResponse.f81787b) && Intrinsics.areEqual(this.f81788c, forgotPasswordResponse.f81788c) && Intrinsics.areEqual(this.f81789d, forgotPasswordResponse.f81789d) && Intrinsics.areEqual(this.f81790e, forgotPasswordResponse.f81790e) && Intrinsics.areEqual(this.f81791f, forgotPasswordResponse.f81791f) && Intrinsics.areEqual(this.f81792g, forgotPasswordResponse.f81792g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81787b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81786a;
    }

    @Nullable
    public final Data getData() {
        return this.f81792g;
    }

    @Nullable
    public final String getDesc() {
        return this.f81788c;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81790e;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81791f;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81789d;
    }

    public int hashCode() {
        String str = this.f81786a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81787b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81788c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81789d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.f81790e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81791f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Data data = this.f81792g;
        return hashCode6 + (data != null ? data.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81786a;
        String str2 = this.f81787b;
        String str3 = this.f81788c;
        String str4 = this.f81789d;
        List<String> list = this.f81790e;
        String str5 = this.f81791f;
        Data data = this.f81792g;
        return "ForgotPasswordResponse(codeType=" + str + ", code=" + str2 + ", desc=" + str3 + ", systemMessage=" + str4 + ", replaceMessage=" + list + ", responseDateTime=" + str5 + ", data=" + data + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f81786a);
        out.writeString(this.f81787b);
        out.writeString(this.f81788c);
        out.writeString(this.f81789d);
        out.writeStringList(this.f81790e);
        out.writeString(this.f81791f);
        Data data = this.f81792g;
        if (data == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        data.writeToParcel(out, i);
    }

    public ForgotPasswordResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable Data data) {
        this.f81786a = str;
        this.f81787b = str2;
        this.f81788c = str3;
        this.f81789d = str4;
        this.f81790e = list;
        this.f81791f = str5;
        this.f81792g = data;
    }

    public /* synthetic */ ForgotPasswordResponse(String str, String str2, String str3, String str4, List list, String str5, Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : data);
    }
}