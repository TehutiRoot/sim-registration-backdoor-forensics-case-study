package th.p047co.dtac.android.dtacone.model.change_pro_happy.validateProfile.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J{\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pro_happy/validateProfile/response/Customer;", "", "firstname", "", "installedProducts", "", "Lth/co/dtac/android/dtacone/model/change_pro_happy/validateProfile/response/InstalledProductsItem;", "idNumber", "customerId", "titleCode", "contactNumber", MessageBundle.TITLE_ENTRY, "lastname", "idType", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContactNumber", "()Ljava/lang/String;", "getCustomerId", "getFirstname", "getIdNumber", "getIdType", "getInstalledProducts", "()Ljava/util/List;", "getLastname", "getTitle", "getTitleCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pro_happy.validateProfile.response.Customer */
/* loaded from: classes8.dex */
public final class Customer {
    public static final int $stable = 8;
    @SerializedName("contact-number")
    @Nullable
    private final String contactNumber;
    @SerializedName("customer-id")
    @Nullable
    private final String customerId;
    @SerializedName("firstname")
    @Nullable
    private final String firstname;
    @SerializedName("id-number")
    @Nullable
    private final String idNumber;
    @SerializedName("id-type")
    @Nullable
    private final String idType;
    @SerializedName("installed-products")
    @Nullable
    private final List<InstalledProductsItem> installedProducts;
    @SerializedName("lastname")
    @Nullable
    private final String lastname;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;
    @SerializedName("title-code")
    @Nullable
    private final String titleCode;

    public Customer() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    public final String component1() {
        return this.firstname;
    }

    @Nullable
    public final List<InstalledProductsItem> component2() {
        return this.installedProducts;
    }

    @Nullable
    public final String component3() {
        return this.idNumber;
    }

    @Nullable
    public final String component4() {
        return this.customerId;
    }

    @Nullable
    public final String component5() {
        return this.titleCode;
    }

    @Nullable
    public final String component6() {
        return this.contactNumber;
    }

    @Nullable
    public final String component7() {
        return this.title;
    }

    @Nullable
    public final String component8() {
        return this.lastname;
    }

    @Nullable
    public final String component9() {
        return this.idType;
    }

    @NotNull
    public final Customer copy(@Nullable String str, @Nullable List<InstalledProductsItem> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        return new Customer(str, list, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return Intrinsics.areEqual(this.firstname, customer.firstname) && Intrinsics.areEqual(this.installedProducts, customer.installedProducts) && Intrinsics.areEqual(this.idNumber, customer.idNumber) && Intrinsics.areEqual(this.customerId, customer.customerId) && Intrinsics.areEqual(this.titleCode, customer.titleCode) && Intrinsics.areEqual(this.contactNumber, customer.contactNumber) && Intrinsics.areEqual(this.title, customer.title) && Intrinsics.areEqual(this.lastname, customer.lastname) && Intrinsics.areEqual(this.idType, customer.idType);
        }
        return false;
    }

    @Nullable
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getFirstname() {
        return this.firstname;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final List<InstalledProductsItem> getInstalledProducts() {
        return this.installedProducts;
    }

    @Nullable
    public final String getLastname() {
        return this.lastname;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitleCode() {
        return this.titleCode;
    }

    public int hashCode() {
        String str = this.firstname;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<InstalledProductsItem> list = this.installedProducts;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.idNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.contactNumber;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastname;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.idType;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.firstname;
        List<InstalledProductsItem> list = this.installedProducts;
        String str2 = this.idNumber;
        String str3 = this.customerId;
        String str4 = this.titleCode;
        String str5 = this.contactNumber;
        String str6 = this.title;
        String str7 = this.lastname;
        String str8 = this.idType;
        return "Customer(firstname=" + str + ", installedProducts=" + list + ", idNumber=" + str2 + ", customerId=" + str3 + ", titleCode=" + str4 + ", contactNumber=" + str5 + ", title=" + str6 + ", lastname=" + str7 + ", idType=" + str8 + ")";
    }

    public Customer(@Nullable String str, @Nullable List<InstalledProductsItem> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.firstname = str;
        this.installedProducts = list;
        this.idNumber = str2;
        this.customerId = str3;
        this.titleCode = str4;
        this.contactNumber = str5;
        this.title = str6;
        this.lastname = str7;
        this.idType = str8;
    }

    public /* synthetic */ Customer(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? str8 : null);
    }
}
