package th.p047co.dtac.android.dtacone.model.esim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/PackageBenefitItem;", "Landroid/os/Parcelable;", "benefitName", "", "benefitDesc", LogFactory.PRIORITY_KEY, "", "benefitQuota", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBenefitDesc", "()Ljava/lang/String;", "getBenefitName", "getBenefitQuota", "getPriority", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/esim/PackageBenefitItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.PackageBenefitItem */
/* loaded from: classes8.dex */
public final class PackageBenefitItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<PackageBenefitItem> CREATOR = new Creator();
    @SerializedName("benefitDesc")
    @Nullable
    private final String benefitDesc;
    @SerializedName("benefitName")
    @Nullable
    private final String benefitName;
    @SerializedName("benefitQuota")
    @Nullable
    private final String benefitQuota;
    @SerializedName(LogFactory.PRIORITY_KEY)
    @Nullable
    private final Integer priority;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.esim.PackageBenefitItem$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PackageBenefitItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PackageBenefitItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PackageBenefitItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PackageBenefitItem[] newArray(int i) {
            return new PackageBenefitItem[i];
        }
    }

    public PackageBenefitItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ PackageBenefitItem copy$default(PackageBenefitItem packageBenefitItem, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packageBenefitItem.benefitName;
        }
        if ((i & 2) != 0) {
            str2 = packageBenefitItem.benefitDesc;
        }
        if ((i & 4) != 0) {
            num = packageBenefitItem.priority;
        }
        if ((i & 8) != 0) {
            str3 = packageBenefitItem.benefitQuota;
        }
        return packageBenefitItem.copy(str, str2, num, str3);
    }

    @Nullable
    public final String component1() {
        return this.benefitName;
    }

    @Nullable
    public final String component2() {
        return this.benefitDesc;
    }

    @Nullable
    public final Integer component3() {
        return this.priority;
    }

    @Nullable
    public final String component4() {
        return this.benefitQuota;
    }

    @NotNull
    public final PackageBenefitItem copy(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
        return new PackageBenefitItem(str, str2, num, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackageBenefitItem) {
            PackageBenefitItem packageBenefitItem = (PackageBenefitItem) obj;
            return Intrinsics.areEqual(this.benefitName, packageBenefitItem.benefitName) && Intrinsics.areEqual(this.benefitDesc, packageBenefitItem.benefitDesc) && Intrinsics.areEqual(this.priority, packageBenefitItem.priority) && Intrinsics.areEqual(this.benefitQuota, packageBenefitItem.benefitQuota);
        }
        return false;
    }

    @Nullable
    public final String getBenefitDesc() {
        return this.benefitDesc;
    }

    @Nullable
    public final String getBenefitName() {
        return this.benefitName;
    }

    @Nullable
    public final String getBenefitQuota() {
        return this.benefitQuota;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    public int hashCode() {
        String str = this.benefitName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.benefitDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.priority;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.benefitQuota;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.benefitName;
        String str2 = this.benefitDesc;
        Integer num = this.priority;
        String str3 = this.benefitQuota;
        return "PackageBenefitItem(benefitName=" + str + ", benefitDesc=" + str2 + ", priority=" + num + ", benefitQuota=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.benefitName);
        out.writeString(this.benefitDesc);
        Integer num = this.priority;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.benefitQuota);
    }

    public PackageBenefitItem(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
        this.benefitName = str;
        this.benefitDesc = str2;
        this.priority = num;
        this.benefitQuota = str3;
    }

    public /* synthetic */ PackageBenefitItem(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}