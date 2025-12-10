package th.p047co.dtac.android.dtacone.model.appOne.tol.discount;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountInfoItem;", "", "discountDesc", "", "discountPeriodUnit", "discountPeriodValue", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDiscountDesc", "()Ljava/lang/String;", "getDiscountPeriodUnit", "getDiscountPeriodValue", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.discount.DiscountInfoItem */
/* loaded from: classes8.dex */
public final class DiscountInfoItem {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @SerializedName("discountDesc")
    @NotNull
    private final String discountDesc;
    @SerializedName("discountPeriodUnit")
    @Nullable
    private final String discountPeriodUnit;
    @SerializedName("discountPeriodValue")
    private final int discountPeriodValue;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountInfoItem$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountInfoItem;", "value", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.discount.DiscountInfoItem$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiscountInfoItem mock(int i) {
            String str;
            String str2;
            int i2 = i % 12;
            if (i2 == 0) {
                str = "Year";
            } else if (i < 0) {
                str = null;
            } else {
                str = "Month";
            }
            if (i < 0) {
                str2 = "ไม่จำกัด";
            } else if (i2 == 0) {
                str2 = (i / 12) + " ปี";
            } else {
                str2 = i + " เดือน";
            }
            return new DiscountInfoItem(str2, str, i);
        }

        private Companion() {
        }
    }

    public DiscountInfoItem() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ DiscountInfoItem copy$default(DiscountInfoItem discountInfoItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = discountInfoItem.discountDesc;
        }
        if ((i2 & 2) != 0) {
            str2 = discountInfoItem.discountPeriodUnit;
        }
        if ((i2 & 4) != 0) {
            i = discountInfoItem.discountPeriodValue;
        }
        return discountInfoItem.copy(str, str2, i);
    }

    @NotNull
    public final String component1() {
        return this.discountDesc;
    }

    @Nullable
    public final String component2() {
        return this.discountPeriodUnit;
    }

    public final int component3() {
        return this.discountPeriodValue;
    }

    @NotNull
    public final DiscountInfoItem copy(@NotNull String discountDesc, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(discountDesc, "discountDesc");
        return new DiscountInfoItem(discountDesc, str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscountInfoItem) {
            DiscountInfoItem discountInfoItem = (DiscountInfoItem) obj;
            return Intrinsics.areEqual(this.discountDesc, discountInfoItem.discountDesc) && Intrinsics.areEqual(this.discountPeriodUnit, discountInfoItem.discountPeriodUnit) && this.discountPeriodValue == discountInfoItem.discountPeriodValue;
        }
        return false;
    }

    @NotNull
    public final String getDiscountDesc() {
        return this.discountDesc;
    }

    @Nullable
    public final String getDiscountPeriodUnit() {
        return this.discountPeriodUnit;
    }

    public final int getDiscountPeriodValue() {
        return this.discountPeriodValue;
    }

    public int hashCode() {
        int hashCode = this.discountDesc.hashCode() * 31;
        String str = this.discountPeriodUnit;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.discountPeriodValue;
    }

    @NotNull
    public String toString() {
        String str = this.discountDesc;
        String str2 = this.discountPeriodUnit;
        int i = this.discountPeriodValue;
        return "DiscountInfoItem(discountDesc=" + str + ", discountPeriodUnit=" + str2 + ", discountPeriodValue=" + i + ")";
    }

    public DiscountInfoItem(@NotNull String discountDesc, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(discountDesc, "discountDesc");
        this.discountDesc = discountDesc;
        this.discountPeriodUnit = str;
        this.discountPeriodValue = i;
    }

    public /* synthetic */ DiscountInfoItem(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i);
    }
}