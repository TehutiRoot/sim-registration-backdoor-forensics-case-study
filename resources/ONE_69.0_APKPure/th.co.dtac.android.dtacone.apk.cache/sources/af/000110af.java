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
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010\n¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/registration/RetailerProfileItem;", "Landroid/os/Parcelable;", "", "rtrCode", "", "simRList", "company", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/registration/RetailerProfileItem;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getSimRList", OperatorName.CURVE_TO, "getCompany", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.RetailerProfileItem */
/* loaded from: classes7.dex */
public final class RetailerProfileItem implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<RetailerProfileItem> CREATOR = new Creator();
    @SerializedName("rtrCode")
    @Nullable

    /* renamed from: a */
    private final String f82188a;
    @SerializedName("simRList")
    @Nullable

    /* renamed from: b */
    private final List<String> f82189b;
    @SerializedName("company")
    @Nullable

    /* renamed from: c */
    private final String f82190c;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.RetailerProfileItem$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<RetailerProfileItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RetailerProfileItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RetailerProfileItem(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RetailerProfileItem[] newArray(int i) {
            return new RetailerProfileItem[i];
        }
    }

    public RetailerProfileItem() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetailerProfileItem copy$default(RetailerProfileItem retailerProfileItem, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retailerProfileItem.f82188a;
        }
        if ((i & 2) != 0) {
            list = retailerProfileItem.f82189b;
        }
        if ((i & 4) != 0) {
            str2 = retailerProfileItem.f82190c;
        }
        return retailerProfileItem.copy(str, list, str2);
    }

    @Nullable
    public final String component1() {
        return this.f82188a;
    }

    @Nullable
    public final List<String> component2() {
        return this.f82189b;
    }

    @Nullable
    public final String component3() {
        return this.f82190c;
    }

    @NotNull
    public final RetailerProfileItem copy(@Nullable String str, @Nullable List<String> list, @Nullable String str2) {
        return new RetailerProfileItem(str, list, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RetailerProfileItem) {
            RetailerProfileItem retailerProfileItem = (RetailerProfileItem) obj;
            return Intrinsics.areEqual(this.f82188a, retailerProfileItem.f82188a) && Intrinsics.areEqual(this.f82189b, retailerProfileItem.f82189b) && Intrinsics.areEqual(this.f82190c, retailerProfileItem.f82190c);
        }
        return false;
    }

    @Nullable
    public final String getCompany() {
        return this.f82190c;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f82188a;
    }

    @Nullable
    public final List<String> getSimRList() {
        return this.f82189b;
    }

    public int hashCode() {
        String str = this.f82188a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.f82189b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f82190c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82188a;
        List<String> list = this.f82189b;
        String str2 = this.f82190c;
        return "RetailerProfileItem(rtrCode=" + str + ", simRList=" + list + ", company=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82188a);
        out.writeStringList(this.f82189b);
        out.writeString(this.f82190c);
    }

    public RetailerProfileItem(@Nullable String str, @Nullable List<String> list, @Nullable String str2) {
        this.f82188a = str;
        this.f82189b = list;
        this.f82190c = str2;
    }

    public /* synthetic */ RetailerProfileItem(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}