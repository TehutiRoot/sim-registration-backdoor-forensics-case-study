package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterData;", "", "size", "", "warningMessage", "", "productInfo", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getProductInfo", "()Ljava/util/List;", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWarningMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterData;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.ProductMasterData */
/* loaded from: classes8.dex */
public final class ProductMasterData {
    public static final int $stable = 8;
    @SerializedName("productInfo")
    @Nullable
    private final List<ProductMasterInfoItem> productInfo;
    @SerializedName("size")
    @Nullable
    private final Integer size;
    @SerializedName("warningMessage")
    @Nullable
    private final String warningMessage;

    public ProductMasterData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductMasterData copy$default(ProductMasterData productMasterData, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = productMasterData.size;
        }
        if ((i & 2) != 0) {
            str = productMasterData.warningMessage;
        }
        if ((i & 4) != 0) {
            list = productMasterData.productInfo;
        }
        return productMasterData.copy(num, str, list);
    }

    @Nullable
    public final Integer component1() {
        return this.size;
    }

    @Nullable
    public final String component2() {
        return this.warningMessage;
    }

    @Nullable
    public final List<ProductMasterInfoItem> component3() {
        return this.productInfo;
    }

    @NotNull
    public final ProductMasterData copy(@Nullable Integer num, @Nullable String str, @Nullable List<ProductMasterInfoItem> list) {
        return new ProductMasterData(num, str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductMasterData) {
            ProductMasterData productMasterData = (ProductMasterData) obj;
            return Intrinsics.areEqual(this.size, productMasterData.size) && Intrinsics.areEqual(this.warningMessage, productMasterData.warningMessage) && Intrinsics.areEqual(this.productInfo, productMasterData.productInfo);
        }
        return false;
    }

    @Nullable
    public final List<ProductMasterInfoItem> getProductInfo() {
        return this.productInfo;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    @Nullable
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        Integer num = this.size;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.warningMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ProductMasterInfoItem> list = this.productInfo;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.size;
        String str = this.warningMessage;
        List<ProductMasterInfoItem> list = this.productInfo;
        return "ProductMasterData(size=" + num + ", warningMessage=" + str + ", productInfo=" + list + ")";
    }

    public ProductMasterData(@Nullable Integer num, @Nullable String str, @Nullable List<ProductMasterInfoItem> list) {
        this.size = num;
        this.warningMessage = str;
        this.productInfo = list;
    }

    public /* synthetic */ ProductMasterData(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}