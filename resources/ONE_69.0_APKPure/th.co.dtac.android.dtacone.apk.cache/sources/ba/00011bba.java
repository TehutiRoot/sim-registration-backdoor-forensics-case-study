package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\f¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;", "", "matCode", "", "displayDesc", "matDesc", "warningMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayDesc", "()Ljava/lang/String;", "getMatCode", "setMatCode", "(Ljava/lang/String;)V", "getMatDesc", "getWarningMessage", "setWarningMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.ProductMasterInfoItem */
/* loaded from: classes8.dex */
public final class ProductMasterInfoItem {
    public static final int $stable = 8;
    @SerializedName("displayDesc")
    @Nullable
    private final String displayDesc;
    @SerializedName("matCode")
    @Nullable
    private String matCode;
    @SerializedName("matDesc")
    @Nullable
    private final String matDesc;
    @Nullable
    private String warningMessage;

    public ProductMasterInfoItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ProductMasterInfoItem copy$default(ProductMasterInfoItem productMasterInfoItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productMasterInfoItem.matCode;
        }
        if ((i & 2) != 0) {
            str2 = productMasterInfoItem.displayDesc;
        }
        if ((i & 4) != 0) {
            str3 = productMasterInfoItem.matDesc;
        }
        if ((i & 8) != 0) {
            str4 = productMasterInfoItem.warningMessage;
        }
        return productMasterInfoItem.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.matCode;
    }

    @Nullable
    public final String component2() {
        return this.displayDesc;
    }

    @Nullable
    public final String component3() {
        return this.matDesc;
    }

    @Nullable
    public final String component4() {
        return this.warningMessage;
    }

    @NotNull
    public final ProductMasterInfoItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new ProductMasterInfoItem(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductMasterInfoItem) {
            ProductMasterInfoItem productMasterInfoItem = (ProductMasterInfoItem) obj;
            return Intrinsics.areEqual(this.matCode, productMasterInfoItem.matCode) && Intrinsics.areEqual(this.displayDesc, productMasterInfoItem.displayDesc) && Intrinsics.areEqual(this.matDesc, productMasterInfoItem.matDesc) && Intrinsics.areEqual(this.warningMessage, productMasterInfoItem.warningMessage);
        }
        return false;
    }

    @Nullable
    public final String getDisplayDesc() {
        return this.displayDesc;
    }

    @Nullable
    public final String getMatCode() {
        return this.matCode;
    }

    @Nullable
    public final String getMatDesc() {
        return this.matDesc;
    }

    @Nullable
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        String str = this.matCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matDesc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.warningMessage;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setMatCode(@Nullable String str) {
        this.matCode = str;
    }

    public final void setWarningMessage(@Nullable String str) {
        this.warningMessage = str;
    }

    @NotNull
    public String toString() {
        String str = this.matCode;
        String str2 = this.displayDesc;
        String str3 = this.matDesc;
        String str4 = this.warningMessage;
        return "ProductMasterInfoItem(matCode=" + str + ", displayDesc=" + str2 + ", matDesc=" + str3 + ", warningMessage=" + str4 + ")";
    }

    public ProductMasterInfoItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.matCode = str;
        this.displayDesc = str2;
        this.matDesc = str3;
        this.warningMessage = str4;
    }

    public /* synthetic */ ProductMasterInfoItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}