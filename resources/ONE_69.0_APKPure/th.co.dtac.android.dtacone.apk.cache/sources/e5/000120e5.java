package th.p047co.dtac.android.dtacone.model.upPass;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/ValidateDopaData;", "", NotificationCompat.CATEGORY_STATUS, "", "dopaStatus", "dopaFlag", "isDopaByPass", "", "verificationDopa", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getDopaFlag", "()Ljava/lang/String;", "getDopaStatus", "()Z", "getStatus", "getVerificationDopa", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.ValidateDopaData */
/* loaded from: classes8.dex */
public final class ValidateDopaData {
    public static final int $stable = 0;
    @SerializedName("dopaFlag")
    @NotNull
    private final String dopaFlag;
    @SerializedName("dopaStatus")
    @NotNull
    private final String dopaStatus;
    @SerializedName("isDopaByPass")
    private final boolean isDopaByPass;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;
    @SerializedName("verificationDopa")
    @Nullable
    private final String verificationDopa;

    public ValidateDopaData() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ ValidateDopaData copy$default(ValidateDopaData validateDopaData, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateDopaData.status;
        }
        if ((i & 2) != 0) {
            str2 = validateDopaData.dopaStatus;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = validateDopaData.dopaFlag;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = validateDopaData.isDopaByPass;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = validateDopaData.verificationDopa;
        }
        return validateDopaData.copy(str, str5, str6, z2, str4);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.dopaStatus;
    }

    @NotNull
    public final String component3() {
        return this.dopaFlag;
    }

    public final boolean component4() {
        return this.isDopaByPass;
    }

    @Nullable
    public final String component5() {
        return this.verificationDopa;
    }

    @NotNull
    public final ValidateDopaData copy(@NotNull String status, @NotNull String dopaStatus, @NotNull String dopaFlag, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(dopaStatus, "dopaStatus");
        Intrinsics.checkNotNullParameter(dopaFlag, "dopaFlag");
        return new ValidateDopaData(status, dopaStatus, dopaFlag, z, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateDopaData) {
            ValidateDopaData validateDopaData = (ValidateDopaData) obj;
            return Intrinsics.areEqual(this.status, validateDopaData.status) && Intrinsics.areEqual(this.dopaStatus, validateDopaData.dopaStatus) && Intrinsics.areEqual(this.dopaFlag, validateDopaData.dopaFlag) && this.isDopaByPass == validateDopaData.isDopaByPass && Intrinsics.areEqual(this.verificationDopa, validateDopaData.verificationDopa);
        }
        return false;
    }

    @NotNull
    public final String getDopaFlag() {
        return this.dopaFlag;
    }

    @NotNull
    public final String getDopaStatus() {
        return this.dopaStatus;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getVerificationDopa() {
        return this.verificationDopa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.status.hashCode() * 31) + this.dopaStatus.hashCode()) * 31) + this.dopaFlag.hashCode()) * 31;
        boolean z = this.isDopaByPass;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.verificationDopa;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isDopaByPass() {
        return this.isDopaByPass;
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.dopaStatus;
        String str3 = this.dopaFlag;
        boolean z = this.isDopaByPass;
        String str4 = this.verificationDopa;
        return "ValidateDopaData(status=" + str + ", dopaStatus=" + str2 + ", dopaFlag=" + str3 + ", isDopaByPass=" + z + ", verificationDopa=" + str4 + ")";
    }

    public ValidateDopaData(@NotNull String status, @NotNull String dopaStatus, @NotNull String dopaFlag, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(dopaStatus, "dopaStatus");
        Intrinsics.checkNotNullParameter(dopaFlag, "dopaFlag");
        this.status = status;
        this.dopaStatus = dopaStatus;
        this.dopaFlag = dopaFlag;
        this.isDopaByPass = z;
        this.verificationDopa = str;
    }

    public /* synthetic */ ValidateDopaData(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str4);
    }
}