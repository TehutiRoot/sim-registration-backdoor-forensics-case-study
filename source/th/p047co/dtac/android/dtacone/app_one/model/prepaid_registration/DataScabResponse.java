package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010\r¨\u00065"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/DataScabResponse;", "Landroid/os/Parcelable;", "", "code", "districtName", "scabCode", "description", "provinceName", "subdistrictName", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/DataScabResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDistrictName", OperatorName.CURVE_TO, "getScabCode", "d", "getDescription", "e", "getProvinceName", OperatorName.FILL_NON_ZERO, "getSubdistrictName", OperatorName.NON_STROKING_GRAY, "getTimestamp", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.DataScabResponse */
/* loaded from: classes7.dex */
public final class DataScabResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<DataScabResponse> CREATOR = new Creator();
    @SerializedName("code")
    @Nullable

    /* renamed from: a */
    private final String f81824a;
    @SerializedName("districtName")
    @Nullable

    /* renamed from: b */
    private final String f81825b;
    @SerializedName("scabCode")
    @Nullable

    /* renamed from: c */
    private final String f81826c;
    @SerializedName("description")
    @Nullable

    /* renamed from: d */
    private final String f81827d;
    @SerializedName("provinceName")
    @Nullable

    /* renamed from: e */
    private final String f81828e;
    @SerializedName("subdistrictName")
    @Nullable

    /* renamed from: f */
    private final String f81829f;
    @SerializedName("timestamp")
    @Nullable

    /* renamed from: g */
    private final String f81830g;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.DataScabResponse$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<DataScabResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DataScabResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataScabResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DataScabResponse[] newArray(int i) {
            return new DataScabResponse[i];
        }
    }

    public DataScabResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ DataScabResponse copy$default(DataScabResponse dataScabResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataScabResponse.f81824a;
        }
        if ((i & 2) != 0) {
            str2 = dataScabResponse.f81825b;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = dataScabResponse.f81826c;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = dataScabResponse.f81827d;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = dataScabResponse.f81828e;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = dataScabResponse.f81829f;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = dataScabResponse.f81830g;
        }
        return dataScabResponse.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    public final String component1() {
        return this.f81824a;
    }

    @Nullable
    public final String component2() {
        return this.f81825b;
    }

    @Nullable
    public final String component3() {
        return this.f81826c;
    }

    @Nullable
    public final String component4() {
        return this.f81827d;
    }

    @Nullable
    public final String component5() {
        return this.f81828e;
    }

    @Nullable
    public final String component6() {
        return this.f81829f;
    }

    @Nullable
    public final String component7() {
        return this.f81830g;
    }

    @NotNull
    public final DataScabResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new DataScabResponse(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataScabResponse) {
            DataScabResponse dataScabResponse = (DataScabResponse) obj;
            return Intrinsics.areEqual(this.f81824a, dataScabResponse.f81824a) && Intrinsics.areEqual(this.f81825b, dataScabResponse.f81825b) && Intrinsics.areEqual(this.f81826c, dataScabResponse.f81826c) && Intrinsics.areEqual(this.f81827d, dataScabResponse.f81827d) && Intrinsics.areEqual(this.f81828e, dataScabResponse.f81828e) && Intrinsics.areEqual(this.f81829f, dataScabResponse.f81829f) && Intrinsics.areEqual(this.f81830g, dataScabResponse.f81830g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81824a;
    }

    @Nullable
    public final String getDescription() {
        return this.f81827d;
    }

    @Nullable
    public final String getDistrictName() {
        return this.f81825b;
    }

    @Nullable
    public final String getProvinceName() {
        return this.f81828e;
    }

    @Nullable
    public final String getScabCode() {
        return this.f81826c;
    }

    @Nullable
    public final String getSubdistrictName() {
        return this.f81829f;
    }

    @Nullable
    public final String getTimestamp() {
        return this.f81830g;
    }

    public int hashCode() {
        String str = this.f81824a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81825b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81826c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81827d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f81828e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f81829f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f81830g;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81824a;
        String str2 = this.f81825b;
        String str3 = this.f81826c;
        String str4 = this.f81827d;
        String str5 = this.f81828e;
        String str6 = this.f81829f;
        String str7 = this.f81830g;
        return "DataScabResponse(code=" + str + ", districtName=" + str2 + ", scabCode=" + str3 + ", description=" + str4 + ", provinceName=" + str5 + ", subdistrictName=" + str6 + ", timestamp=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f81824a);
        out.writeString(this.f81825b);
        out.writeString(this.f81826c);
        out.writeString(this.f81827d);
        out.writeString(this.f81828e);
        out.writeString(this.f81829f);
        out.writeString(this.f81830g);
    }

    public DataScabResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.f81824a = str;
        this.f81825b = str2;
        this.f81826c = str3;
        this.f81827d = str4;
        this.f81828e = str5;
        this.f81829f = str6;
        this.f81830g = str7;
    }

    public /* synthetic */ DataScabResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
