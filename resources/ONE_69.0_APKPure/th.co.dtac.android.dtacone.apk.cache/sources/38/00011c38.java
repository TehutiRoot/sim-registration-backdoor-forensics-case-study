package th.p047co.dtac.android.dtacone.model.appOne.tol.discount;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountData;", "", NotificationCompat.CATEGORY_STATUS, "", "discountList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountItem;", "(Ljava/lang/String;Ljava/util/List;)V", "getDiscountList", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.discount.DiscountData */
/* loaded from: classes8.dex */
public final class DiscountData {
    @SerializedName("discountList")
    @NotNull
    private final List<DiscountItem> discountList;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountData$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountData;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nDiscountData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscountData.kt\nth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountData$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1549#2:30\n1620#2,3:31\n1549#2:34\n1620#2,3:35\n*S KotlinDebug\n*F\n+ 1 DiscountData.kt\nth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountData$Companion\n*L\n17#1:30\n17#1:31,3\n23#1:34\n23#1:35,3\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.discount.DiscountData$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiscountData mock() {
            List<Number> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, -1});
            ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(listOf, 10));
            for (Number number : listOf) {
                arrayList.add(DiscountInfoItem.Companion.mock(number.intValue()));
            }
            DiscountItem discountItem = new DiscountItem("DC100BA", "DC100BA : TrueOnline Special Discount -  TOL Fix Amount (DC100BA)", arrayList);
            List<Number> listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{12, -1});
            ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(listOf2, 10));
            for (Number number2 : listOf2) {
                arrayList2.add(DiscountInfoItem.Companion.mock(number2.intValue()));
            }
            return new DiscountData("Success", CollectionsKt__CollectionsKt.listOf((Object[]) new DiscountItem[]{discountItem, new DiscountItem("DCFAL0450B01", "DCFAL0450B01 : Special Discount 450B (DCFAL0450B01)", arrayList2)}));
        }

        private Companion() {
        }
    }

    public DiscountData() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscountData copy$default(DiscountData discountData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discountData.status;
        }
        if ((i & 2) != 0) {
            list = discountData.discountList;
        }
        return discountData.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final List<DiscountItem> component2() {
        return this.discountList;
    }

    @NotNull
    public final DiscountData copy(@NotNull String status, @NotNull List<DiscountItem> discountList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(discountList, "discountList");
        return new DiscountData(status, discountList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscountData) {
            DiscountData discountData = (DiscountData) obj;
            return Intrinsics.areEqual(this.status, discountData.status) && Intrinsics.areEqual(this.discountList, discountData.discountList);
        }
        return false;
    }

    @NotNull
    public final List<DiscountItem> getDiscountList() {
        return this.discountList;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.discountList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.status;
        List<DiscountItem> list = this.discountList;
        return "DiscountData(status=" + str + ", discountList=" + list + ")";
    }

    public DiscountData(@NotNull String status, @NotNull List<DiscountItem> discountList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(discountList, "discountList");
        this.status = status;
        this.discountList = discountList;
    }

    public /* synthetic */ DiscountData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}