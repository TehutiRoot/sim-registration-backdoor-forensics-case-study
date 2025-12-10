package th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/Data;", "", "customer", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/CustomerItem;", "number", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/NumberItem;", "(Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/CustomerItem;Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/NumberItem;)V", "getCustomer", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/CustomerItem;", "getNumber", "()Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/NumberItem;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.Data */
/* loaded from: classes8.dex */
public final class Data {
    public static final int $stable = 0;
    @SerializedName("customer")
    @Nullable
    private final CustomerItem customer;
    @SerializedName("number")
    @Nullable
    private final NumberItem number;

    public Data() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Data copy$default(Data data, CustomerItem customerItem, NumberItem numberItem, int i, Object obj) {
        if ((i & 1) != 0) {
            customerItem = data.customer;
        }
        if ((i & 2) != 0) {
            numberItem = data.number;
        }
        return data.copy(customerItem, numberItem);
    }

    @Nullable
    public final CustomerItem component1() {
        return this.customer;
    }

    @Nullable
    public final NumberItem component2() {
        return this.number;
    }

    @NotNull
    public final Data copy(@Nullable CustomerItem customerItem, @Nullable NumberItem numberItem) {
        return new Data(customerItem, numberItem);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.customer, data.customer) && Intrinsics.areEqual(this.number, data.number);
        }
        return false;
    }

    @Nullable
    public final CustomerItem getCustomer() {
        return this.customer;
    }

    @Nullable
    public final NumberItem getNumber() {
        return this.number;
    }

    public int hashCode() {
        CustomerItem customerItem = this.customer;
        int hashCode = (customerItem == null ? 0 : customerItem.hashCode()) * 31;
        NumberItem numberItem = this.number;
        return hashCode + (numberItem != null ? numberItem.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CustomerItem customerItem = this.customer;
        NumberItem numberItem = this.number;
        return "Data(customer=" + customerItem + ", number=" + numberItem + ")";
    }

    public Data(@Nullable CustomerItem customerItem, @Nullable NumberItem numberItem) {
        this.customer = customerItem;
        this.number = numberItem;
    }

    public /* synthetic */ Data(CustomerItem customerItem, NumberItem numberItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customerItem, (i & 2) != 0 ? null : numberItem);
    }
}