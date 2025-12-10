package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundSubmitRequest;", "", "productNumber", "", "ban", "reminderId", "firstName", "lastName", "product", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBan", "()Ljava/lang/String;", "getFirstName", "getLastName", "getProduct", "getProductNumber", "getReminderId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundSubmitRequest */
/* loaded from: classes8.dex */
public final class OneNadOutboundSubmitRequest {
    public static final int $stable = 0;
    @SerializedName("ban")
    @NotNull
    private final String ban;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;
    @SerializedName("product")
    @NotNull
    private final String product;
    @SerializedName("productNumber")
    @NotNull
    private final String productNumber;
    @SerializedName("reminderId")
    @NotNull
    private final String reminderId;

    public OneNadOutboundSubmitRequest(@NotNull String productNumber, @NotNull String ban, @NotNull String reminderId, @Nullable String str, @Nullable String str2, @NotNull String product) {
        Intrinsics.checkNotNullParameter(productNumber, "productNumber");
        Intrinsics.checkNotNullParameter(ban, "ban");
        Intrinsics.checkNotNullParameter(reminderId, "reminderId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.productNumber = productNumber;
        this.ban = ban;
        this.reminderId = reminderId;
        this.firstName = str;
        this.lastName = str2;
        this.product = product;
    }

    public static /* synthetic */ OneNadOutboundSubmitRequest copy$default(OneNadOutboundSubmitRequest oneNadOutboundSubmitRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNadOutboundSubmitRequest.productNumber;
        }
        if ((i & 2) != 0) {
            str2 = oneNadOutboundSubmitRequest.ban;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneNadOutboundSubmitRequest.reminderId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneNadOutboundSubmitRequest.firstName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneNadOutboundSubmitRequest.lastName;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneNadOutboundSubmitRequest.product;
        }
        return oneNadOutboundSubmitRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.productNumber;
    }

    @NotNull
    public final String component2() {
        return this.ban;
    }

    @NotNull
    public final String component3() {
        return this.reminderId;
    }

    @Nullable
    public final String component4() {
        return this.firstName;
    }

    @Nullable
    public final String component5() {
        return this.lastName;
    }

    @NotNull
    public final String component6() {
        return this.product;
    }

    @NotNull
    public final OneNadOutboundSubmitRequest copy(@NotNull String productNumber, @NotNull String ban, @NotNull String reminderId, @Nullable String str, @Nullable String str2, @NotNull String product) {
        Intrinsics.checkNotNullParameter(productNumber, "productNumber");
        Intrinsics.checkNotNullParameter(ban, "ban");
        Intrinsics.checkNotNullParameter(reminderId, "reminderId");
        Intrinsics.checkNotNullParameter(product, "product");
        return new OneNadOutboundSubmitRequest(productNumber, ban, reminderId, str, str2, product);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundSubmitRequest) {
            OneNadOutboundSubmitRequest oneNadOutboundSubmitRequest = (OneNadOutboundSubmitRequest) obj;
            return Intrinsics.areEqual(this.productNumber, oneNadOutboundSubmitRequest.productNumber) && Intrinsics.areEqual(this.ban, oneNadOutboundSubmitRequest.ban) && Intrinsics.areEqual(this.reminderId, oneNadOutboundSubmitRequest.reminderId) && Intrinsics.areEqual(this.firstName, oneNadOutboundSubmitRequest.firstName) && Intrinsics.areEqual(this.lastName, oneNadOutboundSubmitRequest.lastName) && Intrinsics.areEqual(this.product, oneNadOutboundSubmitRequest.product);
        }
        return false;
    }

    @NotNull
    public final String getBan() {
        return this.ban;
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
    public final String getProduct() {
        return this.product;
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
        int hashCode = ((((this.productNumber.hashCode() * 31) + this.ban.hashCode()) * 31) + this.reminderId.hashCode()) * 31;
        String str = this.firstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.product.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.productNumber;
        String str2 = this.ban;
        String str3 = this.reminderId;
        String str4 = this.firstName;
        String str5 = this.lastName;
        String str6 = this.product;
        return "OneNadOutboundSubmitRequest(productNumber=" + str + ", ban=" + str2 + ", reminderId=" + str3 + ", firstName=" + str4 + ", lastName=" + str5 + ", product=" + str6 + ")";
    }

    public /* synthetic */ OneNadOutboundSubmitRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6);
    }
}