package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/AdditionalPackageList;", "", "additionalPackage", "", "Lth/co/dtac/android/dtacone/model/device_sale/AdditionalPackageModel;", "warningMessage", "", "total", "", "(Ljava/util/List;Ljava/lang/String;I)V", "getAdditionalPackage", "()Ljava/util/List;", "getTotal", "()I", "getWarningMessage", "()Ljava/lang/String;", "setWarningMessage", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.AdditionalPackageList */
/* loaded from: classes8.dex */
public final class AdditionalPackageList {
    public static final int $stable = 8;
    @SerializedName("additionalPackage")
    @NotNull
    private final List<AdditionalPackageModel> additionalPackage;
    @SerializedName("total")
    private final int total;
    @SerializedName("warningMessage")
    @Nullable
    private String warningMessage;

    public AdditionalPackageList(@NotNull List<AdditionalPackageModel> additionalPackage, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(additionalPackage, "additionalPackage");
        this.additionalPackage = additionalPackage;
        this.warningMessage = str;
        this.total = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdditionalPackageList copy$default(AdditionalPackageList additionalPackageList, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = additionalPackageList.additionalPackage;
        }
        if ((i2 & 2) != 0) {
            str = additionalPackageList.warningMessage;
        }
        if ((i2 & 4) != 0) {
            i = additionalPackageList.total;
        }
        return additionalPackageList.copy(list, str, i);
    }

    @NotNull
    public final List<AdditionalPackageModel> component1() {
        return this.additionalPackage;
    }

    @Nullable
    public final String component2() {
        return this.warningMessage;
    }

    public final int component3() {
        return this.total;
    }

    @NotNull
    public final AdditionalPackageList copy(@NotNull List<AdditionalPackageModel> additionalPackage, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(additionalPackage, "additionalPackage");
        return new AdditionalPackageList(additionalPackage, str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdditionalPackageList) {
            AdditionalPackageList additionalPackageList = (AdditionalPackageList) obj;
            return Intrinsics.areEqual(this.additionalPackage, additionalPackageList.additionalPackage) && Intrinsics.areEqual(this.warningMessage, additionalPackageList.warningMessage) && this.total == additionalPackageList.total;
        }
        return false;
    }

    @NotNull
    public final List<AdditionalPackageModel> getAdditionalPackage() {
        return this.additionalPackage;
    }

    public final int getTotal() {
        return this.total;
    }

    @Nullable
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        int hashCode = this.additionalPackage.hashCode() * 31;
        String str = this.warningMessage;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.total;
    }

    public final void setWarningMessage(@Nullable String str) {
        this.warningMessage = str;
    }

    @NotNull
    public String toString() {
        List<AdditionalPackageModel> list = this.additionalPackage;
        String str = this.warningMessage;
        int i = this.total;
        return "AdditionalPackageList(additionalPackage=" + list + ", warningMessage=" + str + ", total=" + i + ")";
    }

    public /* synthetic */ AdditionalPackageList(List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? "" : str, i);
    }
}