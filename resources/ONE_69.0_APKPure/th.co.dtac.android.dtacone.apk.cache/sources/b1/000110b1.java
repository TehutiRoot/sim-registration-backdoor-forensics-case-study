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
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJl\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014R$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\u000f¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "Landroid/os/Parcelable;", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.BalanceResponse */
/* loaded from: classes7.dex */
public final class BalanceResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<BalanceResponse> CREATOR = new Creator();
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f82191a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82192b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f82193c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f82194d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f82195e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f82196f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f82197g;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.BalanceResponse$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<BalanceResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BalanceResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BalanceResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BalanceResponse[] newArray(int i) {
            return new BalanceResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\n¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse$Data;", "Landroid/os/Parcelable;", "", "dateTime", "balance", "lastUpdate", "displayDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse$Data;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getDateTime", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBalance", OperatorName.CURVE_TO, "getLastUpdate", "d", "getDisplayDate", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.BalanceResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        @SerializedName("dateTime")
        @Nullable

        /* renamed from: a */
        private final String f82198a;
        @SerializedName("balance")
        @Nullable

        /* renamed from: b */
        private final String f82199b;
        @SerializedName("lastUpdate")
        @Nullable

        /* renamed from: c */
        private final String f82200c;
        @SerializedName("displayDate")
        @Nullable

        /* renamed from: d */
        private final String f82201d;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.BalanceResponse$Data$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Data createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.f82198a;
            }
            if ((i & 2) != 0) {
                str2 = data.f82199b;
            }
            if ((i & 4) != 0) {
                str3 = data.f82200c;
            }
            if ((i & 8) != 0) {
                str4 = data.f82201d;
            }
            return data.copy(str, str2, str3, str4);
        }

        @Nullable
        public final String component1() {
            return this.f82198a;
        }

        @Nullable
        public final String component2() {
            return this.f82199b;
        }

        @Nullable
        public final String component3() {
            return this.f82200c;
        }

        @Nullable
        public final String component4() {
            return this.f82201d;
        }

        @NotNull
        public final Data copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            return new Data(str, str2, str3, str4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Data) {
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.f82198a, data.f82198a) && Intrinsics.areEqual(this.f82199b, data.f82199b) && Intrinsics.areEqual(this.f82200c, data.f82200c) && Intrinsics.areEqual(this.f82201d, data.f82201d);
            }
            return false;
        }

        @Nullable
        public final String getBalance() {
            return this.f82199b;
        }

        @Nullable
        public final String getDateTime() {
            return this.f82198a;
        }

        @Nullable
        public final String getDisplayDate() {
            return this.f82201d;
        }

        @Nullable
        public final String getLastUpdate() {
            return this.f82200c;
        }

        public int hashCode() {
            String str = this.f82198a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f82199b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f82200c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f82201d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.f82198a;
            String str2 = this.f82199b;
            String str3 = this.f82200c;
            String str4 = this.f82201d;
            return "Data(dateTime=" + str + ", balance=" + str2 + ", lastUpdate=" + str3 + ", displayDate=" + str4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f82198a);
            out.writeString(this.f82199b);
            out.writeString(this.f82200c);
            out.writeString(this.f82201d);
        }

        public Data(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f82198a = str;
            this.f82199b = str2;
            this.f82200c = str3;
            this.f82201d = str4;
        }

        public /* synthetic */ Data(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    public BalanceResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ BalanceResponse copy$default(BalanceResponse balanceResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = balanceResponse.f82191a;
        }
        if ((i & 2) != 0) {
            str2 = balanceResponse.f82192b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = balanceResponse.f82193c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = balanceResponse.f82194d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = balanceResponse.f82195e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = balanceResponse.f82196f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = balanceResponse.f82197g;
        }
        return balanceResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f82191a;
    }

    @Nullable
    public final String component2() {
        return this.f82192b;
    }

    @Nullable
    public final String component3() {
        return this.f82193c;
    }

    @Nullable
    public final String component4() {
        return this.f82194d;
    }

    @Nullable
    public final Data component5() {
        return this.f82195e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f82196f;
    }

    @Nullable
    public final String component7() {
        return this.f82197g;
    }

    @NotNull
    public final BalanceResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new BalanceResponse(str, str2, str3, str4, data, list, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BalanceResponse) {
            BalanceResponse balanceResponse = (BalanceResponse) obj;
            return Intrinsics.areEqual(this.f82191a, balanceResponse.f82191a) && Intrinsics.areEqual(this.f82192b, balanceResponse.f82192b) && Intrinsics.areEqual(this.f82193c, balanceResponse.f82193c) && Intrinsics.areEqual(this.f82194d, balanceResponse.f82194d) && Intrinsics.areEqual(this.f82195e, balanceResponse.f82195e) && Intrinsics.areEqual(this.f82196f, balanceResponse.f82196f) && Intrinsics.areEqual(this.f82197g, balanceResponse.f82197g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f82192b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f82193c;
    }

    @Nullable
    public final Data getData() {
        return this.f82195e;
    }

    @Nullable
    public final String getDesc() {
        return this.f82197g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f82196f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f82194d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f82191a;
    }

    public int hashCode() {
        String str = this.f82191a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82192b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82193c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82194d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f82195e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f82196f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f82197g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82191a;
        String str2 = this.f82192b;
        String str3 = this.f82193c;
        String str4 = this.f82194d;
        Data data = this.f82195e;
        List<String> list = this.f82196f;
        String str5 = this.f82197g;
        return "BalanceResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82191a);
        out.writeString(this.f82192b);
        out.writeString(this.f82193c);
        out.writeString(this.f82194d);
        Data data = this.f82195e;
        if (data == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            data.writeToParcel(out, i);
        }
        out.writeStringList(this.f82196f);
        out.writeString(this.f82197g);
    }

    public BalanceResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f82191a = str;
        this.f82192b = str2;
        this.f82193c = str3;
        this.f82194d = str4;
        this.f82195e = data;
        this.f82196f = list;
        this.f82197g = str5;
    }

    public /* synthetic */ BalanceResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}