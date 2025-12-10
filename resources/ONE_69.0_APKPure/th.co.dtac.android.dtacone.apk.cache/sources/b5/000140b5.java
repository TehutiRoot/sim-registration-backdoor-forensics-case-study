package th.p047co.dtac.android.dtacone.view.appOne.tol.model;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/ProductTypeItem;", "", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/ProductType;", "type", "", "name", "", "options", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/ProductType;ILjava/util/List;)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/tol/model/ProductType;", "component2", "()I", "component3", "()Ljava/util/List;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/ProductType;ILjava/util/List;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/ProductTypeItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/tol/model/ProductType;", "getType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getName", OperatorName.CURVE_TO, "Ljava/util/List;", "getOptions", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.ProductTypeItem */
/* loaded from: classes10.dex */
public final class ProductTypeItem {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ProductType f97914a;

    /* renamed from: b */
    public final int f97915b;

    /* renamed from: c */
    public final List f97916c;

    public ProductTypeItem(@NotNull ProductType type, @StringRes int i, @NotNull List<Integer> options) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f97914a = type;
        this.f97915b = i;
        this.f97916c = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductTypeItem copy$default(ProductTypeItem productTypeItem, ProductType productType, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            productType = productTypeItem.f97914a;
        }
        if ((i2 & 2) != 0) {
            i = productTypeItem.f97915b;
        }
        if ((i2 & 4) != 0) {
            list = productTypeItem.f97916c;
        }
        return productTypeItem.copy(productType, i, list);
    }

    @NotNull
    public final ProductType component1() {
        return this.f97914a;
    }

    public final int component2() {
        return this.f97915b;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.f97916c;
    }

    @NotNull
    public final ProductTypeItem copy(@NotNull ProductType type, @StringRes int i, @NotNull List<Integer> options) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(options, "options");
        return new ProductTypeItem(type, i, options);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductTypeItem) {
            ProductTypeItem productTypeItem = (ProductTypeItem) obj;
            return this.f97914a == productTypeItem.f97914a && this.f97915b == productTypeItem.f97915b && Intrinsics.areEqual(this.f97916c, productTypeItem.f97916c);
        }
        return false;
    }

    public final int getName() {
        return this.f97915b;
    }

    @NotNull
    public final List<Integer> getOptions() {
        return this.f97916c;
    }

    @NotNull
    public final ProductType getType() {
        return this.f97914a;
    }

    public int hashCode() {
        return (((this.f97914a.hashCode() * 31) + this.f97915b) * 31) + this.f97916c.hashCode();
    }

    @NotNull
    public String toString() {
        ProductType productType = this.f97914a;
        int i = this.f97915b;
        List list = this.f97916c;
        return "ProductTypeItem(type=" + productType + ", name=" + i + ", options=" + list + ")";
    }
}