package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundCallCustomerRequest;", "", "reminderId", "", "contactNumber", "ban", "productNumber", "firstName", "lastName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBan", "()Ljava/lang/String;", "getContactNumber", "getFirstName", "getLastName", "getProductNumber", "getReminderId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundCallCustomerRequest */
/* loaded from: classes8.dex */
public final class OneNadOutboundCallCustomerRequest {
    public static final int $stable = 0;
    @SerializedName("ban")
    @NotNull
    private final String ban;
    @SerializedName("contactNumber")
    @NotNull
    private final String contactNumber;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;
    @SerializedName("productNumber")
    @NotNull
    private final String productNumber;
    @SerializedName("reminderId")
    @NotNull
    private final String reminderId;

    public OneNadOutboundCallCustomerRequest(@NotNull String reminderId, @NotNull String contactNumber, @NotNull String ban, @NotNull String productNumber, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(reminderId, "reminderId");
        Intrinsics.checkNotNullParameter(contactNumber, "contactNumber");
        Intrinsics.checkNotNullParameter(ban, "ban");
        Intrinsics.checkNotNullParameter(productNumber, "productNumber");
        this.reminderId = reminderId;
        this.contactNumber = contactNumber;
        this.ban = ban;
        this.productNumber = productNumber;
        this.firstName = str;
        this.lastName = str2;
    }

    public static /* synthetic */ OneNadOutboundCallCustomerRequest copy$default(OneNadOutboundCallCustomerRequest oneNadOutboundCallCustomerRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNadOutboundCallCustomerRequest.reminderId;
        }
        if ((i & 2) != 0) {
            str2 = oneNadOutboundCallCustomerRequest.contactNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneNadOutboundCallCustomerRequest.ban;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneNadOutboundCallCustomerRequest.productNumber;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneNadOutboundCallCustomerRequest.firstName;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneNadOutboundCallCustomerRequest.lastName;
        }
        return oneNadOutboundCallCustomerRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.reminderId;
    }

    @NotNull
    public final String component2() {
        return this.contactNumber;
    }

    @NotNull
    public final String component3() {
        return this.ban;
    }

    @NotNull
    public final String component4() {
        return this.productNumber;
    }

    @Nullable
    public final String component5() {
        return this.firstName;
    }

    @Nullable
    public final String component6() {
        return this.lastName;
    }

    @NotNull
    public final OneNadOutboundCallCustomerRequest copy(@NotNull String reminderId, @NotNull String contactNumber, @NotNull String ban, @NotNull String productNumber, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(reminderId, "reminderId");
        Intrinsics.checkNotNullParameter(contactNumber, "contactNumber");
        Intrinsics.checkNotNullParameter(ban, "ban");
        Intrinsics.checkNotNullParameter(productNumber, "productNumber");
        return new OneNadOutboundCallCustomerRequest(reminderId, contactNumber, ban, productNumber, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundCallCustomerRequest) {
            OneNadOutboundCallCustomerRequest oneNadOutboundCallCustomerRequest = (OneNadOutboundCallCustomerRequest) obj;
            return Intrinsics.areEqual(this.reminderId, oneNadOutboundCallCustomerRequest.reminderId) && Intrinsics.areEqual(this.contactNumber, oneNadOutboundCallCustomerRequest.contactNumber) && Intrinsics.areEqual(this.ban, oneNadOutboundCallCustomerRequest.ban) && Intrinsics.areEqual(this.productNumber, oneNadOutboundCallCustomerRequest.productNumber) && Intrinsics.areEqual(this.firstName, oneNadOutboundCallCustomerRequest.firstName) && Intrinsics.areEqual(this.lastName, oneNadOutboundCallCustomerRequest.lastName);
        }
        return false;
    }

    @NotNull
    public final String getBan() {
        return this.ban;
    }

    @NotNull
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getProductNumber() {
        return this.productNumber;
    }

    @NotNull
    public final String getReminderId() {
        return this.reminderId;
    }

    public int hashCode() {
        int hashCode = ((((((this.reminderId.hashCode() * 31) + this.contactNumber.hashCode()) * 31) + this.ban.hashCode()) * 31) + this.productNumber.hashCode()) * 31;
        String str = this.firstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.reminderId;
        String str2 = this.contactNumber;
        String str3 = this.ban;
        String str4 = this.productNumber;
        String str5 = this.firstName;
        String str6 = this.lastName;
        return "OneNadOutboundCallCustomerRequest(reminderId=" + str + ", contactNumber=" + str2 + ", ban=" + str3 + ", productNumber=" + str4 + ", firstName=" + str5 + ", lastName=" + str6 + ")";
    }

    public /* synthetic */ OneNadOutboundCallCustomerRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}