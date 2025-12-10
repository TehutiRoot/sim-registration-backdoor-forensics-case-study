package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MultiSimTotalCountPayment;", "", "countProductPrice", "", "countDiscountPrice", "totalProductPrice", "totalDiscountPrice", "discountList", "", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MultiSimDisCountItem;", "(IIIILjava/util/List;)V", "getCountDiscountPrice", "()I", "setCountDiscountPrice", "(I)V", "getCountProductPrice", "setCountProductPrice", "getDiscountList", "()Ljava/util/List;", "setDiscountList", "(Ljava/util/List;)V", "getTotalDiscountPrice", "setTotalDiscountPrice", "getTotalProductPrice", "setTotalProductPrice", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSimTotalCountPayment */
/* loaded from: classes8.dex */
public final class MultiSimTotalCountPayment {
    public static final int $stable = 8;
    private int countDiscountPrice;
    private int countProductPrice;
    @NotNull
    private List<MultiSimDisCountItem> discountList;
    private int totalDiscountPrice;
    private int totalProductPrice;

    public MultiSimTotalCountPayment() {
        this(0, 0, 0, 0, null, 31, null);
    }

    public static /* synthetic */ MultiSimTotalCountPayment copy$default(MultiSimTotalCountPayment multiSimTotalCountPayment, int i, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = multiSimTotalCountPayment.countProductPrice;
        }
        if ((i5 & 2) != 0) {
            i2 = multiSimTotalCountPayment.countDiscountPrice;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = multiSimTotalCountPayment.totalProductPrice;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = multiSimTotalCountPayment.totalDiscountPrice;
        }
        int i8 = i4;
        List<MultiSimDisCountItem> list2 = list;
        if ((i5 & 16) != 0) {
            list2 = multiSimTotalCountPayment.discountList;
        }
        return multiSimTotalCountPayment.copy(i, i6, i7, i8, list2);
    }

    public final int component1() {
        return this.countProductPrice;
    }

    public final int component2() {
        return this.countDiscountPrice;
    }

    public final int component3() {
        return this.totalProductPrice;
    }

    public final int component4() {
        return this.totalDiscountPrice;
    }

    @NotNull
    public final List<MultiSimDisCountItem> component5() {
        return this.discountList;
    }

    @NotNull
    public final MultiSimTotalCountPayment copy(int i, int i2, int i3, int i4, @NotNull List<MultiSimDisCountItem> discountList) {
        Intrinsics.checkNotNullParameter(discountList, "discountList");
        return new MultiSimTotalCountPayment(i, i2, i3, i4, discountList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiSimTotalCountPayment) {
            MultiSimTotalCountPayment multiSimTotalCountPayment = (MultiSimTotalCountPayment) obj;
            return this.countProductPrice == multiSimTotalCountPayment.countProductPrice && this.countDiscountPrice == multiSimTotalCountPayment.countDiscountPrice && this.totalProductPrice == multiSimTotalCountPayment.totalProductPrice && this.totalDiscountPrice == multiSimTotalCountPayment.totalDiscountPrice && Intrinsics.areEqual(this.discountList, multiSimTotalCountPayment.discountList);
        }
        return false;
    }

    public final int getCountDiscountPrice() {
        return this.countDiscountPrice;
    }

    public final int getCountProductPrice() {
        return this.countProductPrice;
    }

    @NotNull
    public final List<MultiSimDisCountItem> getDiscountList() {
        return this.discountList;
    }

    public final int getTotalDiscountPrice() {
        return this.totalDiscountPrice;
    }

    public final int getTotalProductPrice() {
        return this.totalProductPrice;
    }

    public int hashCode() {
        return (((((((this.countProductPrice * 31) + this.countDiscountPrice) * 31) + this.totalProductPrice) * 31) + this.totalDiscountPrice) * 31) + this.discountList.hashCode();
    }

    public final void setCountDiscountPrice(int i) {
        this.countDiscountPrice = i;
    }

    public final void setCountProductPrice(int i) {
        this.countProductPrice = i;
    }

    public final void setDiscountList(@NotNull List<MultiSimDisCountItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.discountList = list;
    }

    public final void setTotalDiscountPrice(int i) {
        this.totalDiscountPrice = i;
    }

    public final void setTotalProductPrice(int i) {
        this.totalProductPrice = i;
    }

    @NotNull
    public String toString() {
        int i = this.countProductPrice;
        int i2 = this.countDiscountPrice;
        int i3 = this.totalProductPrice;
        int i4 = this.totalDiscountPrice;
        List<MultiSimDisCountItem> list = this.discountList;
        return "MultiSimTotalCountPayment(countProductPrice=" + i + ", countDiscountPrice=" + i2 + ", totalProductPrice=" + i3 + ", totalDiscountPrice=" + i4 + ", discountList=" + list + ")";
    }

    public MultiSimTotalCountPayment(int i, int i2, int i3, int i4, @NotNull List<MultiSimDisCountItem> discountList) {
        Intrinsics.checkNotNullParameter(discountList, "discountList");
        this.countProductPrice = i;
        this.countDiscountPrice = i2;
        this.totalProductPrice = i3;
        this.totalDiscountPrice = i4;
        this.discountList = discountList;
    }

    public /* synthetic */ MultiSimTotalCountPayment(int i, int i2, int i3, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? new ArrayList() : list);
    }
}