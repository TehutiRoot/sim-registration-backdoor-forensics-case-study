package th.p047co.dtac.android.dtacone.view.appOne.eSign.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ProductOrderItem;", "", "", "id", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ProductOrderItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDescription", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.response.ProductOrderItem */
/* loaded from: classes10.dex */
public final class ProductOrderItem {
    public static final int $stable = 0;
    @SerializedName("id")
    @NotNull

    /* renamed from: a */
    private final String f90866a;
    @SerializedName("description")
    @NotNull

    /* renamed from: b */
    private final String f90867b;

    public ProductOrderItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ProductOrderItem copy$default(ProductOrderItem productOrderItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productOrderItem.f90866a;
        }
        if ((i & 2) != 0) {
            str2 = productOrderItem.f90867b;
        }
        return productOrderItem.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f90866a;
    }

    @NotNull
    public final String component2() {
        return this.f90867b;
    }

    @NotNull
    public final ProductOrderItem copy(@NotNull String id2, @NotNull String description) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ProductOrderItem(id2, description);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductOrderItem) {
            ProductOrderItem productOrderItem = (ProductOrderItem) obj;
            return Intrinsics.areEqual(this.f90866a, productOrderItem.f90866a) && Intrinsics.areEqual(this.f90867b, productOrderItem.f90867b);
        }
        return false;
    }

    @NotNull
    public final String getDescription() {
        return this.f90867b;
    }

    @NotNull
    public final String getId() {
        return this.f90866a;
    }

    public int hashCode() {
        return (this.f90866a.hashCode() * 31) + this.f90867b.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f90866a;
        String str2 = this.f90867b;
        return "ProductOrderItem(id=" + str + ", description=" + str2 + ")";
    }

    public ProductOrderItem(@NotNull String id2, @NotNull String description) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f90866a = id2;
        this.f90867b = description;
    }

    public /* synthetic */ ProductOrderItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}