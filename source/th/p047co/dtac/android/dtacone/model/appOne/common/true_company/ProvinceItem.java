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
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B;\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0019H\u0016R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", LanguageSupport.LANG_TH, "", "districts", "", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/DistrictsItem;", LanguageSupport.LANG_EN, "id", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDistricts", "()Ljava/util/List;", "getEn", "()Ljava/lang/String;", "getId", "getTh", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem */
/* loaded from: classes8.dex */
public final class ProvinceItem implements Parcelable {
    @SerializedName("districts")
    @Nullable
    private final List<DistrictsItem> districts;
    @SerializedName(LanguageSupport.LANG_EN)
    @Nullable

    /* renamed from: en */
    private final String f85043en;
    @SerializedName("id")
    @Nullable

    /* renamed from: id */
    private final String f85044id;
    @SerializedName(LanguageSupport.LANG_TH)
    @Nullable

    /* renamed from: th */
    private final String f85045th;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<ProvinceItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ProvinceItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProvinceItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ProvinceItem[] newArray(int i) {
            return new ProvinceItem[i];
        }
    }

    public ProvinceItem() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProvinceItem copy$default(ProvinceItem provinceItem, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = provinceItem.f85045th;
        }
        if ((i & 2) != 0) {
            list = provinceItem.districts;
        }
        if ((i & 4) != 0) {
            str2 = provinceItem.f85043en;
        }
        if ((i & 8) != 0) {
            str3 = provinceItem.f85044id;
        }
        return provinceItem.copy(str, list, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f85045th;
    }

    @Nullable
    public final List<DistrictsItem> component2() {
        return this.districts;
    }

    @Nullable
    public final String component3() {
        return this.f85043en;
    }

    @Nullable
    public final String component4() {
        return this.f85044id;
    }

    @NotNull
    public final ProvinceItem copy(@Nullable String str, @Nullable List<DistrictsItem> list, @Nullable String str2, @Nullable String str3) {
        return new ProvinceItem(str, list, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvinceItem) {
            ProvinceItem provinceItem = (ProvinceItem) obj;
            return Intrinsics.areEqual(this.f85045th, provinceItem.f85045th) && Intrinsics.areEqual(this.districts, provinceItem.districts) && Intrinsics.areEqual(this.f85043en, provinceItem.f85043en) && Intrinsics.areEqual(this.f85044id, provinceItem.f85044id);
        }
        return false;
    }

    @Nullable
    public final List<DistrictsItem> getDistricts() {
        return this.districts;
    }

    @Nullable
    public final String getEn() {
        return this.f85043en;
    }

    @Nullable
    public final String getId() {
        return this.f85044id;
    }

    @Nullable
    public final String getTh() {
        return this.f85045th;
    }

    public int hashCode() {
        String str = this.f85045th;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<DistrictsItem> list = this.districts;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f85043en;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85044id;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f85045th;
        List<DistrictsItem> list = this.districts;
        String str2 = this.f85043en;
        String str3 = this.f85044id;
        return "ProvinceItem(th=" + str + ", districts=" + list + ", en=" + str2 + ", id=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f85045th);
        parcel.writeTypedList(this.districts);
        parcel.writeString(this.f85043en);
        parcel.writeString(this.f85044id);
    }

    public ProvinceItem(@Nullable String str, @Nullable List<DistrictsItem> list, @Nullable String str2, @Nullable String str3) {
        this.f85045th = str;
        this.districts = list;
        this.f85043en = str2;
        this.f85044id = str3;
    }

    public /* synthetic */ ProvinceItem(String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProvinceItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.createTypedArrayList(DistrictsItem.CREATOR), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
