package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JD\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeRequest;", "", "productCode", "", FirebaseAnalytics.Param.QUANTITY, "", "verification", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeRequest$VerificationItem;", "campaignCode", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getCampaignCode", "()Ljava/lang/String;", "getProductCode", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVerification", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeRequest;", "equals", "", "other", "hashCode", "toString", "VerificationItem", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeRequest */
/* loaded from: classes8.dex */
public final class OneCheckPrivilegeRequest {
    public static final int $stable = 8;
    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;
    @SerializedName("productCode")
    @Nullable
    private final String productCode;
    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    @Nullable
    private final Integer quantity;
    @SerializedName("verification")
    @Nullable
    private final List<VerificationItem> verification;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeRequest$VerificationItem;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "setValue", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeRequest$VerificationItem */
    /* loaded from: classes8.dex */
    public static final class VerificationItem {
        public static final int $stable = 8;
        @SerializedName("name")
        @Nullable
        private final String name;
        @SerializedName("value")
        @Nullable
        private String value;

        public VerificationItem() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ VerificationItem copy$default(VerificationItem verificationItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verificationItem.name;
            }
            if ((i & 2) != 0) {
                str2 = verificationItem.value;
            }
            return verificationItem.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.name;
        }

        @Nullable
        public final String component2() {
            return this.value;
        }

        @NotNull
        public final VerificationItem copy(@Nullable String str, @Nullable String str2) {
            return new VerificationItem(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VerificationItem) {
                VerificationItem verificationItem = (VerificationItem) obj;
                return Intrinsics.areEqual(this.name, verificationItem.name) && Intrinsics.areEqual(this.value, verificationItem.value);
            }
            return false;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.value;
            return "VerificationItem(name=" + str + ", value=" + str2 + ")";
        }

        public VerificationItem(@Nullable String str, @Nullable String str2) {
            this.name = str;
            this.value = str2;
        }

        public /* synthetic */ VerificationItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    public OneCheckPrivilegeRequest() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneCheckPrivilegeRequest copy$default(OneCheckPrivilegeRequest oneCheckPrivilegeRequest, String str, Integer num, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneCheckPrivilegeRequest.productCode;
        }
        if ((i & 2) != 0) {
            num = oneCheckPrivilegeRequest.quantity;
        }
        if ((i & 4) != 0) {
            list = oneCheckPrivilegeRequest.verification;
        }
        if ((i & 8) != 0) {
            str2 = oneCheckPrivilegeRequest.campaignCode;
        }
        return oneCheckPrivilegeRequest.copy(str, num, list, str2);
    }

    @Nullable
    public final String component1() {
        return this.productCode;
    }

    @Nullable
    public final Integer component2() {
        return this.quantity;
    }

    @Nullable
    public final List<VerificationItem> component3() {
        return this.verification;
    }

    @Nullable
    public final String component4() {
        return this.campaignCode;
    }

    @NotNull
    public final OneCheckPrivilegeRequest copy(@Nullable String str, @Nullable Integer num, @Nullable List<VerificationItem> list, @Nullable String str2) {
        return new OneCheckPrivilegeRequest(str, num, list, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCheckPrivilegeRequest) {
            OneCheckPrivilegeRequest oneCheckPrivilegeRequest = (OneCheckPrivilegeRequest) obj;
            return Intrinsics.areEqual(this.productCode, oneCheckPrivilegeRequest.productCode) && Intrinsics.areEqual(this.quantity, oneCheckPrivilegeRequest.quantity) && Intrinsics.areEqual(this.verification, oneCheckPrivilegeRequest.verification) && Intrinsics.areEqual(this.campaignCode, oneCheckPrivilegeRequest.campaignCode);
        }
        return false;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getProductCode() {
        return this.productCode;
    }

    @Nullable
    public final Integer getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final List<VerificationItem> getVerification() {
        return this.verification;
    }

    public int hashCode() {
        String str = this.productCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quantity;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<VerificationItem> list = this.verification;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.campaignCode;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.productCode;
        Integer num = this.quantity;
        List<VerificationItem> list = this.verification;
        String str2 = this.campaignCode;
        return "OneCheckPrivilegeRequest(productCode=" + str + ", quantity=" + num + ", verification=" + list + ", campaignCode=" + str2 + ")";
    }

    public OneCheckPrivilegeRequest(@Nullable String str, @Nullable Integer num, @Nullable List<VerificationItem> list, @Nullable String str2) {
        this.productCode = str;
        this.quantity = num;
        this.verification = list;
        this.campaignCode = str2;
    }

    public /* synthetic */ OneCheckPrivilegeRequest(String str, Integer num, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2);
    }
}