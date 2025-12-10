package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/CustomerValidateConsentViaAPIGW;", "", "firstName", "", "lastName", "customerType", "idType", "idTypeDesc", "idNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerType", "()Ljava/lang/String;", "getFirstName", "getIdNumber", "getIdType", "getIdTypeDesc", "getLastName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.CustomerValidateConsentViaAPIGW */
/* loaded from: classes8.dex */
public final class CustomerValidateConsentViaAPIGW {
    public static final int $stable = 0;
    @SerializedName("customerType")
    @Nullable
    private final String customerType;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("idType")
    @Nullable
    private final String idType;
    @SerializedName("idTypeDesc")
    @Nullable
    private final String idTypeDesc;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;

    public CustomerValidateConsentViaAPIGW() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CustomerValidateConsentViaAPIGW copy$default(CustomerValidateConsentViaAPIGW customerValidateConsentViaAPIGW, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerValidateConsentViaAPIGW.firstName;
        }
        if ((i & 2) != 0) {
            str2 = customerValidateConsentViaAPIGW.lastName;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = customerValidateConsentViaAPIGW.customerType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = customerValidateConsentViaAPIGW.idType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = customerValidateConsentViaAPIGW.idTypeDesc;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = customerValidateConsentViaAPIGW.idNumber;
        }
        return customerValidateConsentViaAPIGW.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.firstName;
    }

    @Nullable
    public final String component2() {
        return this.lastName;
    }

    @Nullable
    public final String component3() {
        return this.customerType;
    }

    @Nullable
    public final String component4() {
        return this.idType;
    }

    @Nullable
    public final String component5() {
        return this.idTypeDesc;
    }

    @Nullable
    public final String component6() {
        return this.idNumber;
    }

    @NotNull
    public final CustomerValidateConsentViaAPIGW copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new CustomerValidateConsentViaAPIGW(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerValidateConsentViaAPIGW) {
            CustomerValidateConsentViaAPIGW customerValidateConsentViaAPIGW = (CustomerValidateConsentViaAPIGW) obj;
            return Intrinsics.areEqual(this.firstName, customerValidateConsentViaAPIGW.firstName) && Intrinsics.areEqual(this.lastName, customerValidateConsentViaAPIGW.lastName) && Intrinsics.areEqual(this.customerType, customerValidateConsentViaAPIGW.customerType) && Intrinsics.areEqual(this.idType, customerValidateConsentViaAPIGW.idType) && Intrinsics.areEqual(this.idTypeDesc, customerValidateConsentViaAPIGW.idTypeDesc) && Intrinsics.areEqual(this.idNumber, customerValidateConsentViaAPIGW.idNumber);
        }
        return false;
    }

    @Nullable
    public final String getCustomerType() {
        return this.customerType;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
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
    public final String getIdTypeDesc() {
        return this.idTypeDesc;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.idType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.idTypeDesc;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.idNumber;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.customerType;
        String str4 = this.idType;
        String str5 = this.idTypeDesc;
        String str6 = this.idNumber;
        return "CustomerValidateConsentViaAPIGW(firstName=" + str + ", lastName=" + str2 + ", customerType=" + str3 + ", idType=" + str4 + ", idTypeDesc=" + str5 + ", idNumber=" + str6 + ")";
    }

    public CustomerValidateConsentViaAPIGW(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.firstName = str;
        this.lastName = str2;
        this.customerType = str3;
        this.idType = str4;
        this.idTypeDesc = str5;
        this.idNumber = str6;
    }

    public /* synthetic */ CustomerValidateConsentViaAPIGW(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
