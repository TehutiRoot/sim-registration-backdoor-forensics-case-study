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
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\b¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePermissionsItem;", "Landroid/os/Parcelable;", "", "code", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePermissionsItem;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getName", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePermissionsItem */
/* loaded from: classes7.dex */
public final class OnePermissionsItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<OnePermissionsItem> CREATOR = new Creator();
    @SerializedName("code")
    @Nullable

    /* renamed from: a */
    private final String f81853a;
    @SerializedName("name")
    @Nullable

    /* renamed from: b */
    private final String f81854b;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePermissionsItem$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OnePermissionsItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnePermissionsItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnePermissionsItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnePermissionsItem[] newArray(int i) {
            return new OnePermissionsItem[i];
        }
    }

    public OnePermissionsItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OnePermissionsItem copy$default(OnePermissionsItem onePermissionsItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePermissionsItem.f81853a;
        }
        if ((i & 2) != 0) {
            str2 = onePermissionsItem.f81854b;
        }
        return onePermissionsItem.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f81853a;
    }

    @Nullable
    public final String component2() {
        return this.f81854b;
    }

    @NotNull
    public final OnePermissionsItem copy(@Nullable String str, @Nullable String str2) {
        return new OnePermissionsItem(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePermissionsItem) {
            OnePermissionsItem onePermissionsItem = (OnePermissionsItem) obj;
            return Intrinsics.areEqual(this.f81853a, onePermissionsItem.f81853a) && Intrinsics.areEqual(this.f81854b, onePermissionsItem.f81854b);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81853a;
    }

    @Nullable
    public final String getName() {
        return this.f81854b;
    }

    public int hashCode() {
        String str = this.f81853a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81854b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81853a;
        String str2 = this.f81854b;
        return "OnePermissionsItem(code=" + str + ", name=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f81853a);
        out.writeString(this.f81854b);
    }

    public OnePermissionsItem(@Nullable String str, @Nullable String str2) {
        this.f81853a = str;
        this.f81854b = str2;
    }

    public /* synthetic */ OnePermissionsItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
