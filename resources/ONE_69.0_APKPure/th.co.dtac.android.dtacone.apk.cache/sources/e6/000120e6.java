package th.p047co.dtac.android.dtacone.model.upPass;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/ValidateDopaRequest;", "", "pId", "", "chipId", "bp1Number", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBp1Number", "()Ljava/lang/String;", "getChipId", "getPId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.ValidateDopaRequest */
/* loaded from: classes8.dex */
public final class ValidateDopaRequest {
    public static final int $stable = 0;
    @SerializedName("bp1Number")
    @NotNull
    private final String bp1Number;
    @SerializedName("chipId")
    @NotNull
    private final String chipId;
    @SerializedName("pId")
    @NotNull
    private final String pId;

    public ValidateDopaRequest(@NotNull String pId, @NotNull String chipId, @NotNull String bp1Number) {
        Intrinsics.checkNotNullParameter(pId, "pId");
        Intrinsics.checkNotNullParameter(chipId, "chipId");
        Intrinsics.checkNotNullParameter(bp1Number, "bp1Number");
        this.pId = pId;
        this.chipId = chipId;
        this.bp1Number = bp1Number;
    }

    public static /* synthetic */ ValidateDopaRequest copy$default(ValidateDopaRequest validateDopaRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateDopaRequest.pId;
        }
        if ((i & 2) != 0) {
            str2 = validateDopaRequest.chipId;
        }
        if ((i & 4) != 0) {
            str3 = validateDopaRequest.bp1Number;
        }
        return validateDopaRequest.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.pId;
    }

    @NotNull
    public final String component2() {
        return this.chipId;
    }

    @NotNull
    public final String component3() {
        return this.bp1Number;
    }

    @NotNull
    public final ValidateDopaRequest copy(@NotNull String pId, @NotNull String chipId, @NotNull String bp1Number) {
        Intrinsics.checkNotNullParameter(pId, "pId");
        Intrinsics.checkNotNullParameter(chipId, "chipId");
        Intrinsics.checkNotNullParameter(bp1Number, "bp1Number");
        return new ValidateDopaRequest(pId, chipId, bp1Number);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateDopaRequest) {
            ValidateDopaRequest validateDopaRequest = (ValidateDopaRequest) obj;
            return Intrinsics.areEqual(this.pId, validateDopaRequest.pId) && Intrinsics.areEqual(this.chipId, validateDopaRequest.chipId) && Intrinsics.areEqual(this.bp1Number, validateDopaRequest.bp1Number);
        }
        return false;
    }

    @NotNull
    public final String getBp1Number() {
        return this.bp1Number;
    }

    @NotNull
    public final String getChipId() {
        return this.chipId;
    }

    @NotNull
    public final String getPId() {
        return this.pId;
    }

    public int hashCode() {
        return (((this.pId.hashCode() * 31) + this.chipId.hashCode()) * 31) + this.bp1Number.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.pId;
        String str2 = this.chipId;
        String str3 = this.bp1Number;
        return "ValidateDopaRequest(pId=" + str + ", chipId=" + str2 + ", bp1Number=" + str3 + ")";
    }
}