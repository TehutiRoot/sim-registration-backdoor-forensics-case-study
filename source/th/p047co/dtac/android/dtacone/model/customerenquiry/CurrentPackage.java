package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/CurrentPackage;", "", "packageGroupCode", "", "mainPackage", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageItem;", "additionalPackage", "packageGroupDescription", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAdditionalPackage", "()Ljava/util/List;", "getMainPackage", "getPackageGroupCode", "()Ljava/lang/String;", "getPackageGroupDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.CurrentPackage */
/* loaded from: classes8.dex */
public final class CurrentPackage {
    public static final int $stable = 8;
    @SerializedName("additionalPackage")
    @Nullable
    private final List<PackageItem> additionalPackage;
    @SerializedName("mainPackage")
    @Nullable
    private final List<PackageItem> mainPackage;
    @SerializedName("packageGroupCode")
    @Nullable
    private final String packageGroupCode;
    @SerializedName("packageGroupDescription")
    @Nullable
    private final String packageGroupDescription;

    public CurrentPackage() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentPackage copy$default(CurrentPackage currentPackage, String str, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentPackage.packageGroupCode;
        }
        if ((i & 2) != 0) {
            list = currentPackage.mainPackage;
        }
        if ((i & 4) != 0) {
            list2 = currentPackage.additionalPackage;
        }
        if ((i & 8) != 0) {
            str2 = currentPackage.packageGroupDescription;
        }
        return currentPackage.copy(str, list, list2, str2);
    }

    @Nullable
    public final String component1() {
        return this.packageGroupCode;
    }

    @Nullable
    public final List<PackageItem> component2() {
        return this.mainPackage;
    }

    @Nullable
    public final List<PackageItem> component3() {
        return this.additionalPackage;
    }

    @Nullable
    public final String component4() {
        return this.packageGroupDescription;
    }

    @NotNull
    public final CurrentPackage copy(@Nullable String str, @Nullable List<PackageItem> list, @Nullable List<PackageItem> list2, @Nullable String str2) {
        return new CurrentPackage(str, list, list2, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CurrentPackage) {
            CurrentPackage currentPackage = (CurrentPackage) obj;
            return Intrinsics.areEqual(this.packageGroupCode, currentPackage.packageGroupCode) && Intrinsics.areEqual(this.mainPackage, currentPackage.mainPackage) && Intrinsics.areEqual(this.additionalPackage, currentPackage.additionalPackage) && Intrinsics.areEqual(this.packageGroupDescription, currentPackage.packageGroupDescription);
        }
        return false;
    }

    @Nullable
    public final List<PackageItem> getAdditionalPackage() {
        return this.additionalPackage;
    }

    @Nullable
    public final List<PackageItem> getMainPackage() {
        return this.mainPackage;
    }

    @Nullable
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String getPackageGroupDescription() {
        return this.packageGroupDescription;
    }

    public int hashCode() {
        String str = this.packageGroupCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PackageItem> list = this.mainPackage;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PackageItem> list2 = this.additionalPackage;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.packageGroupDescription;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupCode;
        List<PackageItem> list = this.mainPackage;
        List<PackageItem> list2 = this.additionalPackage;
        String str2 = this.packageGroupDescription;
        return "CurrentPackage(packageGroupCode=" + str + ", mainPackage=" + list + ", additionalPackage=" + list2 + ", packageGroupDescription=" + str2 + ")";
    }

    public CurrentPackage(@Nullable String str, @Nullable List<PackageItem> list, @Nullable List<PackageItem> list2, @Nullable String str2) {
        this.packageGroupCode = str;
        this.mainPackage = list;
        this.additionalPackage = list2;
        this.packageGroupDescription = str2;
    }

    public /* synthetic */ CurrentPackage(String str, List list, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2);
    }
}
