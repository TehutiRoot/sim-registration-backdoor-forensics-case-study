package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000fHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/SaleOrderReceiptInfo;", "", "address1", "", "address2", "provinceName", "amphurName", "postcode", "idType", "idNumber", "branchName", MessageBundle.TITLE_ENTRY, "firstName", "lastName", "isExistingProfile", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAddress1", "()Ljava/lang/String;", "getAddress2", "getAmphurName", "getBranchName", "getFirstName", "getIdNumber", "getIdType", "()Z", "getLastName", "getPostcode", "getProvinceName", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.SaleOrderReceiptInfo */
/* loaded from: classes8.dex */
public final class SaleOrderReceiptInfo {
    public static final int $stable = 0;
    @SerializedName("address1")
    @NotNull
    private final String address1;
    @SerializedName("address2")
    @NotNull
    private final String address2;
    @SerializedName("amphurName")
    @NotNull
    private final String amphurName;
    @SerializedName("branchName")
    @NotNull
    private final String branchName;
    @SerializedName("firstName")
    @NotNull
    private final String firstName;
    @SerializedName("idNumber")
    @NotNull
    private final String idNumber;
    @SerializedName("idType")
    @NotNull
    private final String idType;
    @SerializedName("isExistingProfile")
    private final boolean isExistingProfile;
    @SerializedName("lastName")
    @NotNull
    private final String lastName;
    @SerializedName("postcode")
    @NotNull
    private final String postcode;
    @SerializedName("provinceName")
    @NotNull
    private final String provinceName;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @NotNull
    private final String title;

    public SaleOrderReceiptInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, 4095, null);
    }

    @NotNull
    public final String component1() {
        return this.address1;
    }

    @NotNull
    public final String component10() {
        return this.firstName;
    }

    @NotNull
    public final String component11() {
        return this.lastName;
    }

    public final boolean component12() {
        return this.isExistingProfile;
    }

    @NotNull
    public final String component2() {
        return this.address2;
    }

    @NotNull
    public final String component3() {
        return this.provinceName;
    }

    @NotNull
    public final String component4() {
        return this.amphurName;
    }

    @NotNull
    public final String component5() {
        return this.postcode;
    }

    @NotNull
    public final String component6() {
        return this.idType;
    }

    @NotNull
    public final String component7() {
        return this.idNumber;
    }

    @NotNull
    public final String component8() {
        return this.branchName;
    }

    @NotNull
    public final String component9() {
        return this.title;
    }

    @NotNull
    public final SaleOrderReceiptInfo copy(@NotNull String address1, @NotNull String address2, @NotNull String provinceName, @NotNull String amphurName, @NotNull String postcode, @NotNull String idType, @NotNull String idNumber, @NotNull String branchName, @NotNull String title, @NotNull String firstName, @NotNull String lastName, boolean z) {
        Intrinsics.checkNotNullParameter(address1, "address1");
        Intrinsics.checkNotNullParameter(address2, "address2");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(amphurName, "amphurName");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(branchName, "branchName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new SaleOrderReceiptInfo(address1, address2, provinceName, amphurName, postcode, idType, idNumber, branchName, title, firstName, lastName, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaleOrderReceiptInfo) {
            SaleOrderReceiptInfo saleOrderReceiptInfo = (SaleOrderReceiptInfo) obj;
            return Intrinsics.areEqual(this.address1, saleOrderReceiptInfo.address1) && Intrinsics.areEqual(this.address2, saleOrderReceiptInfo.address2) && Intrinsics.areEqual(this.provinceName, saleOrderReceiptInfo.provinceName) && Intrinsics.areEqual(this.amphurName, saleOrderReceiptInfo.amphurName) && Intrinsics.areEqual(this.postcode, saleOrderReceiptInfo.postcode) && Intrinsics.areEqual(this.idType, saleOrderReceiptInfo.idType) && Intrinsics.areEqual(this.idNumber, saleOrderReceiptInfo.idNumber) && Intrinsics.areEqual(this.branchName, saleOrderReceiptInfo.branchName) && Intrinsics.areEqual(this.title, saleOrderReceiptInfo.title) && Intrinsics.areEqual(this.firstName, saleOrderReceiptInfo.firstName) && Intrinsics.areEqual(this.lastName, saleOrderReceiptInfo.lastName) && this.isExistingProfile == saleOrderReceiptInfo.isExistingProfile;
        }
        return false;
    }

    @NotNull
    public final String getAddress1() {
        return this.address1;
    }

    @NotNull
    public final String getAddress2() {
        return this.address2;
    }

    @NotNull
    public final String getAmphurName() {
        return this.amphurName;
    }

    @NotNull
    public final String getBranchName() {
        return this.branchName;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getIdType() {
        return this.idType;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getPostcode() {
        return this.postcode;
    }

    @NotNull
    public final String getProvinceName() {
        return this.provinceName;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.address1.hashCode() * 31) + this.address2.hashCode()) * 31) + this.provinceName.hashCode()) * 31) + this.amphurName.hashCode()) * 31) + this.postcode.hashCode()) * 31) + this.idType.hashCode()) * 31) + this.idNumber.hashCode()) * 31) + this.branchName.hashCode()) * 31) + this.title.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31;
        boolean z = this.isExistingProfile;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isExistingProfile() {
        return this.isExistingProfile;
    }

    @NotNull
    public String toString() {
        String str = this.address1;
        String str2 = this.address2;
        String str3 = this.provinceName;
        String str4 = this.amphurName;
        String str5 = this.postcode;
        String str6 = this.idType;
        String str7 = this.idNumber;
        String str8 = this.branchName;
        String str9 = this.title;
        String str10 = this.firstName;
        String str11 = this.lastName;
        boolean z = this.isExistingProfile;
        return "SaleOrderReceiptInfo(address1=" + str + ", address2=" + str2 + ", provinceName=" + str3 + ", amphurName=" + str4 + ", postcode=" + str5 + ", idType=" + str6 + ", idNumber=" + str7 + ", branchName=" + str8 + ", title=" + str9 + ", firstName=" + str10 + ", lastName=" + str11 + ", isExistingProfile=" + z + ")";
    }

    public SaleOrderReceiptInfo(@NotNull String address1, @NotNull String address2, @NotNull String provinceName, @NotNull String amphurName, @NotNull String postcode, @NotNull String idType, @NotNull String idNumber, @NotNull String branchName, @NotNull String title, @NotNull String firstName, @NotNull String lastName, boolean z) {
        Intrinsics.checkNotNullParameter(address1, "address1");
        Intrinsics.checkNotNullParameter(address2, "address2");
        Intrinsics.checkNotNullParameter(provinceName, "provinceName");
        Intrinsics.checkNotNullParameter(amphurName, "amphurName");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(branchName, "branchName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.address1 = address1;
        this.address2 = address2;
        this.provinceName = provinceName;
        this.amphurName = amphurName;
        this.postcode = postcode;
        this.idType = idType;
        this.idNumber = idNumber;
        this.branchName = branchName;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isExistingProfile = z;
    }

    public /* synthetic */ SaleOrderReceiptInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "", (i & 2048) != 0 ? false : z);
    }
}