package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetExtraAdvanceDetailResponse;", "", "extraAdvanceAmount", "", "extraAdvanceAmountText", "extraAdvancePackageCode", "extraAdvancePackageDescription", "extraDiscountPackageCode", "extraDiscountPackageDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExtraAdvanceAmount", "()Ljava/lang/String;", "getExtraAdvanceAmountText", "getExtraAdvancePackageCode", "getExtraAdvancePackageDescription", "getExtraDiscountPackageCode", "getExtraDiscountPackageDescription", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetExtraAdvanceDetailResponse */
/* loaded from: classes8.dex */
public final class GetExtraAdvanceDetailResponse {
    public static final int $stable = 0;
    @SerializedName("extraAdvanceAmount")
    @NotNull
    private final String extraAdvanceAmount;
    @SerializedName("extraAdvanceAmountText")
    @NotNull
    private final String extraAdvanceAmountText;
    @SerializedName("extraAdvancePackageCode")
    @NotNull
    private final String extraAdvancePackageCode;
    @SerializedName("extraAdvancePackageDescription")
    @NotNull
    private final String extraAdvancePackageDescription;
    @SerializedName("extraDiscountPackageCode")
    @NotNull
    private final String extraDiscountPackageCode;
    @SerializedName("extraDiscountPackageDescription")
    @NotNull
    private final String extraDiscountPackageDescription;

    public GetExtraAdvanceDetailResponse(@NotNull String extraAdvanceAmount, @NotNull String extraAdvanceAmountText, @NotNull String extraAdvancePackageCode, @NotNull String extraAdvancePackageDescription, @NotNull String extraDiscountPackageCode, @NotNull String extraDiscountPackageDescription) {
        Intrinsics.checkNotNullParameter(extraAdvanceAmount, "extraAdvanceAmount");
        Intrinsics.checkNotNullParameter(extraAdvanceAmountText, "extraAdvanceAmountText");
        Intrinsics.checkNotNullParameter(extraAdvancePackageCode, "extraAdvancePackageCode");
        Intrinsics.checkNotNullParameter(extraAdvancePackageDescription, "extraAdvancePackageDescription");
        Intrinsics.checkNotNullParameter(extraDiscountPackageCode, "extraDiscountPackageCode");
        Intrinsics.checkNotNullParameter(extraDiscountPackageDescription, "extraDiscountPackageDescription");
        this.extraAdvanceAmount = extraAdvanceAmount;
        this.extraAdvanceAmountText = extraAdvanceAmountText;
        this.extraAdvancePackageCode = extraAdvancePackageCode;
        this.extraAdvancePackageDescription = extraAdvancePackageDescription;
        this.extraDiscountPackageCode = extraDiscountPackageCode;
        this.extraDiscountPackageDescription = extraDiscountPackageDescription;
    }

    public static /* synthetic */ GetExtraAdvanceDetailResponse copy$default(GetExtraAdvanceDetailResponse getExtraAdvanceDetailResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getExtraAdvanceDetailResponse.extraAdvanceAmount;
        }
        if ((i & 2) != 0) {
            str2 = getExtraAdvanceDetailResponse.extraAdvanceAmountText;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getExtraAdvanceDetailResponse.extraAdvancePackageCode;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getExtraAdvanceDetailResponse.extraAdvancePackageDescription;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getExtraAdvanceDetailResponse.extraDiscountPackageCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getExtraAdvanceDetailResponse.extraDiscountPackageDescription;
        }
        return getExtraAdvanceDetailResponse.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.extraAdvanceAmount;
    }

    @NotNull
    public final String component2() {
        return this.extraAdvanceAmountText;
    }

    @NotNull
    public final String component3() {
        return this.extraAdvancePackageCode;
    }

    @NotNull
    public final String component4() {
        return this.extraAdvancePackageDescription;
    }

    @NotNull
    public final String component5() {
        return this.extraDiscountPackageCode;
    }

    @NotNull
    public final String component6() {
        return this.extraDiscountPackageDescription;
    }

    @NotNull
    public final GetExtraAdvanceDetailResponse copy(@NotNull String extraAdvanceAmount, @NotNull String extraAdvanceAmountText, @NotNull String extraAdvancePackageCode, @NotNull String extraAdvancePackageDescription, @NotNull String extraDiscountPackageCode, @NotNull String extraDiscountPackageDescription) {
        Intrinsics.checkNotNullParameter(extraAdvanceAmount, "extraAdvanceAmount");
        Intrinsics.checkNotNullParameter(extraAdvanceAmountText, "extraAdvanceAmountText");
        Intrinsics.checkNotNullParameter(extraAdvancePackageCode, "extraAdvancePackageCode");
        Intrinsics.checkNotNullParameter(extraAdvancePackageDescription, "extraAdvancePackageDescription");
        Intrinsics.checkNotNullParameter(extraDiscountPackageCode, "extraDiscountPackageCode");
        Intrinsics.checkNotNullParameter(extraDiscountPackageDescription, "extraDiscountPackageDescription");
        return new GetExtraAdvanceDetailResponse(extraAdvanceAmount, extraAdvanceAmountText, extraAdvancePackageCode, extraAdvancePackageDescription, extraDiscountPackageCode, extraDiscountPackageDescription);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetExtraAdvanceDetailResponse) {
            GetExtraAdvanceDetailResponse getExtraAdvanceDetailResponse = (GetExtraAdvanceDetailResponse) obj;
            return Intrinsics.areEqual(this.extraAdvanceAmount, getExtraAdvanceDetailResponse.extraAdvanceAmount) && Intrinsics.areEqual(this.extraAdvanceAmountText, getExtraAdvanceDetailResponse.extraAdvanceAmountText) && Intrinsics.areEqual(this.extraAdvancePackageCode, getExtraAdvanceDetailResponse.extraAdvancePackageCode) && Intrinsics.areEqual(this.extraAdvancePackageDescription, getExtraAdvanceDetailResponse.extraAdvancePackageDescription) && Intrinsics.areEqual(this.extraDiscountPackageCode, getExtraAdvanceDetailResponse.extraDiscountPackageCode) && Intrinsics.areEqual(this.extraDiscountPackageDescription, getExtraAdvanceDetailResponse.extraDiscountPackageDescription);
        }
        return false;
    }

    @NotNull
    public final String getExtraAdvanceAmount() {
        return this.extraAdvanceAmount;
    }

    @NotNull
    public final String getExtraAdvanceAmountText() {
        return this.extraAdvanceAmountText;
    }

    @NotNull
    public final String getExtraAdvancePackageCode() {
        return this.extraAdvancePackageCode;
    }

    @NotNull
    public final String getExtraAdvancePackageDescription() {
        return this.extraAdvancePackageDescription;
    }

    @NotNull
    public final String getExtraDiscountPackageCode() {
        return this.extraDiscountPackageCode;
    }

    @NotNull
    public final String getExtraDiscountPackageDescription() {
        return this.extraDiscountPackageDescription;
    }

    public int hashCode() {
        return (((((((((this.extraAdvanceAmount.hashCode() * 31) + this.extraAdvanceAmountText.hashCode()) * 31) + this.extraAdvancePackageCode.hashCode()) * 31) + this.extraAdvancePackageDescription.hashCode()) * 31) + this.extraDiscountPackageCode.hashCode()) * 31) + this.extraDiscountPackageDescription.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.extraAdvanceAmount;
        String str2 = this.extraAdvanceAmountText;
        String str3 = this.extraAdvancePackageCode;
        String str4 = this.extraAdvancePackageDescription;
        String str5 = this.extraDiscountPackageCode;
        String str6 = this.extraDiscountPackageDescription;
        return "GetExtraAdvanceDetailResponse(extraAdvanceAmount=" + str + ", extraAdvanceAmountText=" + str2 + ", extraAdvancePackageCode=" + str3 + ", extraAdvancePackageDescription=" + str4 + ", extraDiscountPackageCode=" + str5 + ", extraDiscountPackageDescription=" + str6 + ")";
    }
}