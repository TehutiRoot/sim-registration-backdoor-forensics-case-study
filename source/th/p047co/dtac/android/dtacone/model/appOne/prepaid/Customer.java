package th.p047co.dtac.android.dtacone.model.appOne.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/prepaid/Customer;", "", "contactMedium", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/ContactMedium;", "individualIdentification", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/IndividualIdentification;", "type", "", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/ContactMedium;Lth/co/dtac/android/dtacone/model/appOne/prepaid/IndividualIdentification;Ljava/lang/String;)V", "getContactMedium", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/ContactMedium;", "getIndividualIdentification", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/IndividualIdentification;", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.prepaid.Customer */
/* loaded from: classes8.dex */
public final class Customer {
    public static final int $stable = 0;
    @SerializedName("contactMedium")
    @Nullable
    private final ContactMedium contactMedium;
    @SerializedName("individualIdentification")
    @Nullable
    private final IndividualIdentification individualIdentification;
    @SerializedName("type")
    @Nullable
    private final String type;

    public Customer() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Customer copy$default(Customer customer, ContactMedium contactMedium, IndividualIdentification individualIdentification, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            contactMedium = customer.contactMedium;
        }
        if ((i & 2) != 0) {
            individualIdentification = customer.individualIdentification;
        }
        if ((i & 4) != 0) {
            str = customer.type;
        }
        return customer.copy(contactMedium, individualIdentification, str);
    }

    @Nullable
    public final ContactMedium component1() {
        return this.contactMedium;
    }

    @Nullable
    public final IndividualIdentification component2() {
        return this.individualIdentification;
    }

    @Nullable
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final Customer copy(@Nullable ContactMedium contactMedium, @Nullable IndividualIdentification individualIdentification, @Nullable String str) {
        return new Customer(contactMedium, individualIdentification, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return Intrinsics.areEqual(this.contactMedium, customer.contactMedium) && Intrinsics.areEqual(this.individualIdentification, customer.individualIdentification) && Intrinsics.areEqual(this.type, customer.type);
        }
        return false;
    }

    @Nullable
    public final ContactMedium getContactMedium() {
        return this.contactMedium;
    }

    @Nullable
    public final IndividualIdentification getIndividualIdentification() {
        return this.individualIdentification;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        ContactMedium contactMedium = this.contactMedium;
        int hashCode = (contactMedium == null ? 0 : contactMedium.hashCode()) * 31;
        IndividualIdentification individualIdentification = this.individualIdentification;
        int hashCode2 = (hashCode + (individualIdentification == null ? 0 : individualIdentification.hashCode())) * 31;
        String str = this.type;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ContactMedium contactMedium = this.contactMedium;
        IndividualIdentification individualIdentification = this.individualIdentification;
        String str = this.type;
        return "Customer(contactMedium=" + contactMedium + ", individualIdentification=" + individualIdentification + ", type=" + str + ")";
    }

    public Customer(@Nullable ContactMedium contactMedium, @Nullable IndividualIdentification individualIdentification, @Nullable String str) {
        this.contactMedium = contactMedium;
        this.individualIdentification = individualIdentification;
        this.type = str;
    }

    public /* synthetic */ Customer(ContactMedium contactMedium, IndividualIdentification individualIdentification, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contactMedium, (i & 2) != 0 ? null : individualIdentification, (i & 4) != 0 ? null : str);
    }
}
