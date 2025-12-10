package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003Jm\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0017\"\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/BundleItem;", "", "itemCode", "", "itemName", "itemPrice", "", "lineAmount", "", FirebaseAnalytics.Param.QUANTITY, "amount", "serialized", "imeiNumber", "isCheck", "", "isVerified", "(Ljava/lang/String;Ljava/lang/String;IFIFLjava/lang/String;Ljava/lang/String;ZZ)V", "getAmount", "()F", "getImeiNumber", "()Ljava/lang/String;", "setImeiNumber", "(Ljava/lang/String;)V", "()Z", "setCheck", "(Z)V", "setVerified", "getItemCode", "getItemName", "getItemPrice", "()I", "getLineAmount", "getQuantity", "getSerialized", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.BundleItem */
/* loaded from: classes8.dex */
public final class BundleItem {
    public static final int $stable = 8;
    @SerializedName("amount")
    private final float amount;
    @SerializedName("imeiNumber")
    @NotNull
    private String imeiNumber;
    private transient boolean isCheck;
    private transient boolean isVerified;
    @SerializedName("itemCode")
    @NotNull
    private final String itemCode;
    @SerializedName("itemName")
    @NotNull
    private final String itemName;
    @SerializedName("itemPrice")
    private final int itemPrice;
    @SerializedName("lineAmount")
    private final float lineAmount;
    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private final int quantity;
    @SerializedName("serialized")
    @NotNull
    private final String serialized;

    public BundleItem(@NotNull String itemCode, @NotNull String itemName, int i, float f, int i2, float f2, @NotNull String serialized, @NotNull String imeiNumber, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(itemCode, "itemCode");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(serialized, "serialized");
        Intrinsics.checkNotNullParameter(imeiNumber, "imeiNumber");
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = i;
        this.lineAmount = f;
        this.quantity = i2;
        this.amount = f2;
        this.serialized = serialized;
        this.imeiNumber = imeiNumber;
        this.isCheck = z;
        this.isVerified = z2;
    }

    @NotNull
    public final String component1() {
        return this.itemCode;
    }

    public final boolean component10() {
        return this.isVerified;
    }

    @NotNull
    public final String component2() {
        return this.itemName;
    }

    public final int component3() {
        return this.itemPrice;
    }

    public final float component4() {
        return this.lineAmount;
    }

    public final int component5() {
        return this.quantity;
    }

    public final float component6() {
        return this.amount;
    }

    @NotNull
    public final String component7() {
        return this.serialized;
    }

    @NotNull
    public final String component8() {
        return this.imeiNumber;
    }

    public final boolean component9() {
        return this.isCheck;
    }

    @NotNull
    public final BundleItem copy(@NotNull String itemCode, @NotNull String itemName, int i, float f, int i2, float f2, @NotNull String serialized, @NotNull String imeiNumber, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(itemCode, "itemCode");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(serialized, "serialized");
        Intrinsics.checkNotNullParameter(imeiNumber, "imeiNumber");
        return new BundleItem(itemCode, itemName, i, f, i2, f2, serialized, imeiNumber, z, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BundleItem) {
            BundleItem bundleItem = (BundleItem) obj;
            return Intrinsics.areEqual(this.itemCode, bundleItem.itemCode) && Intrinsics.areEqual(this.itemName, bundleItem.itemName) && this.itemPrice == bundleItem.itemPrice && Float.compare(this.lineAmount, bundleItem.lineAmount) == 0 && this.quantity == bundleItem.quantity && Float.compare(this.amount, bundleItem.amount) == 0 && Intrinsics.areEqual(this.serialized, bundleItem.serialized) && Intrinsics.areEqual(this.imeiNumber, bundleItem.imeiNumber) && this.isCheck == bundleItem.isCheck && this.isVerified == bundleItem.isVerified;
        }
        return false;
    }

    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getImeiNumber() {
        return this.imeiNumber;
    }

    @NotNull
    public final String getItemCode() {
        return this.itemCode;
    }

    @NotNull
    public final String getItemName() {
        return this.itemName;
    }

    public final int getItemPrice() {
        return this.itemPrice;
    }

    public final float getLineAmount() {
        return this.lineAmount;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getSerialized() {
        return this.serialized;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.itemCode.hashCode() * 31) + this.itemName.hashCode()) * 31) + this.itemPrice) * 31) + Float.floatToIntBits(this.lineAmount)) * 31) + this.quantity) * 31) + Float.floatToIntBits(this.amount)) * 31) + this.serialized.hashCode()) * 31) + this.imeiNumber.hashCode()) * 31;
        boolean z = this.isCheck;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.isVerified;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }

    public final void setImeiNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imeiNumber = str;
    }

    public final void setVerified(boolean z) {
        this.isVerified = z;
    }

    @NotNull
    public String toString() {
        String str = this.itemCode;
        String str2 = this.itemName;
        int i = this.itemPrice;
        float f = this.lineAmount;
        int i2 = this.quantity;
        float f2 = this.amount;
        String str3 = this.serialized;
        String str4 = this.imeiNumber;
        boolean z = this.isCheck;
        boolean z2 = this.isVerified;
        return "BundleItem(itemCode=" + str + ", itemName=" + str2 + ", itemPrice=" + i + ", lineAmount=" + f + ", quantity=" + i2 + ", amount=" + f2 + ", serialized=" + str3 + ", imeiNumber=" + str4 + ", isCheck=" + z + ", isVerified=" + z2 + ")";
    }

    public /* synthetic */ BundleItem(String str, String str2, int i, float f, int i2, float f2, String str3, String str4, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, f, i2, (i3 & 32) != 0 ? 0.0f : f2, str3, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? false : z2);
    }
}