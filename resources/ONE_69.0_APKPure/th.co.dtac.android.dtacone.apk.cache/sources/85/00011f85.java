package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardResponse;", "", "isNewOwner", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardResponse;", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardResponse */
/* loaded from: classes8.dex */
public final class ValidateCardResponse {
    public static final int $stable = 0;
    @SerializedName("isNewOwner")
    @Nullable
    private final Boolean isNewOwner;

    public ValidateCardResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ ValidateCardResponse copy$default(ValidateCardResponse validateCardResponse, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = validateCardResponse.isNewOwner;
        }
        return validateCardResponse.copy(bool);
    }

    @Nullable
    public final Boolean component1() {
        return this.isNewOwner;
    }

    @NotNull
    public final ValidateCardResponse copy(@Nullable Boolean bool) {
        return new ValidateCardResponse(bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidateCardResponse) && Intrinsics.areEqual(this.isNewOwner, ((ValidateCardResponse) obj).isNewOwner);
    }

    public int hashCode() {
        Boolean bool = this.isNewOwner;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Nullable
    public final Boolean isNewOwner() {
        return this.isNewOwner;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isNewOwner;
        return "ValidateCardResponse(isNewOwner=" + bool + ")";
    }

    public ValidateCardResponse(@Nullable Boolean bool) {
        this.isNewOwner = bool;
    }

    public /* synthetic */ ValidateCardResponse(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}