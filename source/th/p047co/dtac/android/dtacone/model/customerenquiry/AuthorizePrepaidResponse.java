package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/AuthorizePrepaidResponse;", "", "code", "", "description", "amount", "", "(Ljava/lang/String;Ljava/lang/String;F)V", "getAmount", "()F", "getCode", "()Ljava/lang/String;", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.AuthorizePrepaidResponse */
/* loaded from: classes8.dex */
public final class AuthorizePrepaidResponse {
    public static final int $stable = 0;
    @SerializedName("amount")
    private final float amount;
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("description")
    @NotNull
    private final String description;

    public AuthorizePrepaidResponse() {
        this(null, null, 0.0f, 7, null);
    }

    public static /* synthetic */ AuthorizePrepaidResponse copy$default(AuthorizePrepaidResponse authorizePrepaidResponse, String str, String str2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizePrepaidResponse.code;
        }
        if ((i & 2) != 0) {
            str2 = authorizePrepaidResponse.description;
        }
        if ((i & 4) != 0) {
            f = authorizePrepaidResponse.amount;
        }
        return authorizePrepaidResponse.copy(str, str2, f);
    }

    @NotNull
    public final String component1() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    public final float component3() {
        return this.amount;
    }

    @NotNull
    public final AuthorizePrepaidResponse copy(@NotNull String code, @NotNull String description, float f) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(description, "description");
        return new AuthorizePrepaidResponse(code, description, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthorizePrepaidResponse) {
            AuthorizePrepaidResponse authorizePrepaidResponse = (AuthorizePrepaidResponse) obj;
            return Intrinsics.areEqual(this.code, authorizePrepaidResponse.code) && Intrinsics.areEqual(this.description, authorizePrepaidResponse.description) && Float.compare(this.amount, authorizePrepaidResponse.amount) == 0;
        }
        return false;
    }

    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.description.hashCode()) * 31) + Float.floatToIntBits(this.amount);
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.description;
        float f = this.amount;
        return "AuthorizePrepaidResponse(code=" + str + ", description=" + str2 + ", amount=" + f + ")";
    }

    public AuthorizePrepaidResponse(@NotNull String code, @NotNull String description, float f) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(description, "description");
        this.code = code;
        this.description = description;
        this.amount = f;
    }

    public /* synthetic */ AuthorizePrepaidResponse(String str, String str2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0f : f);
    }
}
