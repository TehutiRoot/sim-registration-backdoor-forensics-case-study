package th.p047co.dtac.android.dtacone.model.postpaid.save_postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveMailingAddress;", "", "houseNo", "", "provinceName", "district", "subDistrict", "postCode", "postCodeSeqn", "email", "mailingAddressType", "invoiceLanguage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDistrict", "()Ljava/lang/String;", "getEmail", "getHouseNo", "getInvoiceLanguage", "getMailingAddressType", "getPostCode", "getPostCodeSeqn", "getProvinceName", "getSubDistrict", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.save_postpaid.SaveMailingAddress */
/* loaded from: classes8.dex */
public final class SaveMailingAddress {
    public static final int $stable = 0;
    @SerializedName("district")
    @Nullable
    private final String district;
    @SerializedName("email")
    @Nullable
    private final String email;
    @SerializedName("houseNo")
    @NotNull
    private final String houseNo;
    @SerializedName("invoiceLanguage")
    @NotNull
    private final String invoiceLanguage;
    @SerializedName("mailingAddressType")
    @NotNull
    private final String mailingAddressType;
    @SerializedName("postCode")
    @Nullable
    private final String postCode;
    @SerializedName("postCodeSeqn")
    @Nullable
    private final String postCodeSeqn;
    @SerializedName("province")
    @Nullable
    private final String provinceName;
    @SerializedName("subDistrict")
    @Nullable
    private final String subDistrict;

    public SaveMailingAddress(@NotNull String houseNo, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull String mailingAddressType, @NotNull String invoiceLanguage) {
        Intrinsics.checkNotNullParameter(houseNo, "houseNo");
        Intrinsics.checkNotNullParameter(mailingAddressType, "mailingAddressType");
        Intrinsics.checkNotNullParameter(invoiceLanguage, "invoiceLanguage");
        this.houseNo = houseNo;
        this.provinceName = str;
        this.district = str2;
        this.subDistrict = str3;
        this.postCode = str4;
        this.postCodeSeqn = str5;
        this.email = str6;
        this.mailingAddressType = mailingAddressType;
        this.invoiceLanguage = invoiceLanguage;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getHouseNo() {
        return this.houseNo;
    }

    @NotNull
    public final String getInvoiceLanguage() {
        return this.invoiceLanguage;
    }

    @NotNull
    public final String getMailingAddressType() {
        return this.mailingAddressType;
    }

    @Nullable
    public final String getPostCode() {
        return this.postCode;
    }

    @Nullable
    public final String getPostCodeSeqn() {
        return this.postCodeSeqn;
    }

    @Nullable
    public final String getProvinceName() {
        return this.provinceName;
    }

    @Nullable
    public final String getSubDistrict() {
        return this.subDistrict;
    }
}