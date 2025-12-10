package th.p047co.dtac.android.dtacone.model.change_pro_happy.submit.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001a"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/request/OrderItems;", "", "subscriber", "", "pricePlan", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "readSmartCard", "isEsignature", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "getPackageName", "getPricePlan", "getReadSmartCard", "getSubscriber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pro_happy.submit.request.OrderItems */
/* loaded from: classes8.dex */
public final class OrderItems {
    public static final int $stable = 0;
    @SerializedName("isEsignature")
    @Nullable
    private final String isEsignature;
    @SerializedName(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME)
    @Nullable
    private final String packageName;
    @SerializedName("pricePlan")
    @Nullable
    private final String pricePlan;
    @SerializedName("readSmartCard")
    @Nullable
    private final String readSmartCard;
    @SerializedName("subscriber")
    @Nullable
    private final String subscriber;

    public OrderItems() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OrderItems copy$default(OrderItems orderItems, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderItems.subscriber;
        }
        if ((i & 2) != 0) {
            str2 = orderItems.pricePlan;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = orderItems.packageName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = orderItems.readSmartCard;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = orderItems.isEsignature;
        }
        return orderItems.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.subscriber;
    }

    @Nullable
    public final String component2() {
        return this.pricePlan;
    }

    @Nullable
    public final String component3() {
        return this.packageName;
    }

    @Nullable
    public final String component4() {
        return this.readSmartCard;
    }

    @Nullable
    public final String component5() {
        return this.isEsignature;
    }

    @NotNull
    public final OrderItems copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new OrderItems(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderItems) {
            OrderItems orderItems = (OrderItems) obj;
            return Intrinsics.areEqual(this.subscriber, orderItems.subscriber) && Intrinsics.areEqual(this.pricePlan, orderItems.pricePlan) && Intrinsics.areEqual(this.packageName, orderItems.packageName) && Intrinsics.areEqual(this.readSmartCard, orderItems.readSmartCard) && Intrinsics.areEqual(this.isEsignature, orderItems.isEsignature);
        }
        return false;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getPricePlan() {
        return this.pricePlan;
    }

    @Nullable
    public final String getReadSmartCard() {
        return this.readSmartCard;
    }

    @Nullable
    public final String getSubscriber() {
        return this.subscriber;
    }

    public int hashCode() {
        String str = this.subscriber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pricePlan;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packageName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.readSmartCard;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.isEsignature;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Nullable
    public final String isEsignature() {
        return this.isEsignature;
    }

    @NotNull
    public String toString() {
        String str = this.subscriber;
        String str2 = this.pricePlan;
        String str3 = this.packageName;
        String str4 = this.readSmartCard;
        String str5 = this.isEsignature;
        return "OrderItems(subscriber=" + str + ", pricePlan=" + str2 + ", packageName=" + str3 + ", readSmartCard=" + str4 + ", isEsignature=" + str5 + ")";
    }

    public OrderItems(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.subscriber = str;
        this.pricePlan = str2;
        this.packageName = str3;
        this.readSmartCard = str4;
        this.isEsignature = str5;
    }

    public /* synthetic */ OrderItems(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
