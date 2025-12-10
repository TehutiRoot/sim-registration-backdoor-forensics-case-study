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
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J:\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006-"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/address/OneAmphoeResponse;", "Landroid/os/Parcelable;", "", "Lth/co/dtac/android/dtacone/app_one/model/address/OneTambonResponse;", "tumbonList", "", "amphoeId", "", "amphoeName", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/address/OneAmphoeResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getTumbonList", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Integer;", "getAmphoeId", OperatorName.CURVE_TO, "Ljava/lang/String;", "getAmphoeName", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.address.OneAmphoeResponse */
/* loaded from: classes7.dex */
public final class OneAmphoeResponse implements Parcelable {
    @SerializedName("tumbon")
    @Nullable

    /* renamed from: a */
    private final List<OneTambonResponse> f81584a;
    @SerializedName("amphurId")
    @Nullable

    /* renamed from: b */
    private final Integer f81585b;
    @SerializedName("amphurName")
    @Nullable

    /* renamed from: c */
    private final String f81586c;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/address/OneAmphoeResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/app_one/model/address/OneAmphoeResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/app_one/model/address/OneAmphoeResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.address.OneAmphoeResponse$CREATOR */
    /* loaded from: classes7.dex */
    public static final class CREATOR implements Parcelable.Creator<OneAmphoeResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneAmphoeResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneAmphoeResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneAmphoeResponse[] newArray(int i) {
            return new OneAmphoeResponse[i];
        }
    }

    public OneAmphoeResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneAmphoeResponse copy$default(OneAmphoeResponse oneAmphoeResponse, List list, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oneAmphoeResponse.f81584a;
        }
        if ((i & 2) != 0) {
            num = oneAmphoeResponse.f81585b;
        }
        if ((i & 4) != 0) {
            str = oneAmphoeResponse.f81586c;
        }
        return oneAmphoeResponse.copy(list, num, str);
    }

    @Nullable
    public final List<OneTambonResponse> component1() {
        return this.f81584a;
    }

    @Nullable
    public final Integer component2() {
        return this.f81585b;
    }

    @Nullable
    public final String component3() {
        return this.f81586c;
    }

    @NotNull
    public final OneAmphoeResponse copy(@Nullable List<OneTambonResponse> list, @Nullable Integer num, @Nullable String str) {
        return new OneAmphoeResponse(list, num, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneAmphoeResponse) {
            OneAmphoeResponse oneAmphoeResponse = (OneAmphoeResponse) obj;
            return Intrinsics.areEqual(this.f81584a, oneAmphoeResponse.f81584a) && Intrinsics.areEqual(this.f81585b, oneAmphoeResponse.f81585b) && Intrinsics.areEqual(this.f81586c, oneAmphoeResponse.f81586c);
        }
        return false;
    }

    @Nullable
    public final Integer getAmphoeId() {
        return this.f81585b;
    }

    @Nullable
    public final String getAmphoeName() {
        return this.f81586c;
    }

    @Nullable
    public final List<OneTambonResponse> getTumbonList() {
        return this.f81584a;
    }

    public int hashCode() {
        List<OneTambonResponse> list = this.f81584a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f81585b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f81586c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<OneTambonResponse> list = this.f81584a;
        Integer num = this.f81585b;
        String str = this.f81586c;
        return "OneAmphoeResponse(tumbonList=" + list + ", amphoeId=" + num + ", amphoeName=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.f81584a);
        parcel.writeValue(this.f81585b);
        parcel.writeString(this.f81586c);
    }

    public OneAmphoeResponse(@Nullable List<OneTambonResponse> list, @Nullable Integer num, @Nullable String str) {
        this.f81584a = list;
        this.f81585b = num;
        this.f81586c = str;
    }

    public /* synthetic */ OneAmphoeResponse(List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneAmphoeResponse(@org.jetbrains.annotations.NotNull android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            th.co.dtac.android.dtacone.app_one.model.address.OneTambonResponse$CREATOR r0 = th.p047co.dtac.android.dtacone.app_one.model.address.OneTambonResponse.CREATOR
            java.util.ArrayList r0 = r4.createTypedArrayList(r0)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r4.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L1c
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            java.lang.String r4 = r4.readString()
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.model.address.OneAmphoeResponse.<init>(android.os.Parcel):void");
    }
}
