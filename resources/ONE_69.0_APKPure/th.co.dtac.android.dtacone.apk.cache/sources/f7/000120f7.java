package th.p047co.dtac.android.dtacone.model.updateprepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidAllowCamera;", "", "isAllow", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidAllowCamera */
/* loaded from: classes8.dex */
public final class UpdatePrepaidAllowCamera {
    public static final int $stable = 0;
    @SerializedName("allow")
    private final boolean isAllow;

    public UpdatePrepaidAllowCamera(boolean z) {
        this.isAllow = z;
    }

    public static /* synthetic */ UpdatePrepaidAllowCamera copy$default(UpdatePrepaidAllowCamera updatePrepaidAllowCamera, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updatePrepaidAllowCamera.isAllow;
        }
        return updatePrepaidAllowCamera.copy(z);
    }

    public final boolean component1() {
        return this.isAllow;
    }

    @NotNull
    public final UpdatePrepaidAllowCamera copy(boolean z) {
        return new UpdatePrepaidAllowCamera(z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdatePrepaidAllowCamera) && this.isAllow == ((UpdatePrepaidAllowCamera) obj).isAllow;
    }

    public int hashCode() {
        boolean z = this.isAllow;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isAllow() {
        return this.isAllow;
    }

    @NotNull
    public String toString() {
        boolean z = this.isAllow;
        return "UpdatePrepaidAllowCamera(isAllow=" + z + ")";
    }
}