package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/SwitchOffModel;", "", "visibility", "", "message", "", "date", "(ILjava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getMessage", "getVisibility", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.SwitchOffModel */
/* loaded from: classes8.dex */
public final class SwitchOffModel {
    public static final int $stable = 0;
    @NotNull
    private final String date;
    @SerializedName("message")
    @NotNull
    private final String message;
    @SerializedName("visibility")
    private final int visibility;

    public SwitchOffModel(int i, @NotNull String message, @NotNull String date) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(date, "date");
        this.visibility = i;
        this.message = message;
        this.date = date;
    }

    public static /* synthetic */ SwitchOffModel copy$default(SwitchOffModel switchOffModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = switchOffModel.visibility;
        }
        if ((i2 & 2) != 0) {
            str = switchOffModel.message;
        }
        if ((i2 & 4) != 0) {
            str2 = switchOffModel.date;
        }
        return switchOffModel.copy(i, str, str2);
    }

    public final int component1() {
        return this.visibility;
    }

    @NotNull
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final String component3() {
        return this.date;
    }

    @NotNull
    public final SwitchOffModel copy(int i, @NotNull String message, @NotNull String date) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(date, "date");
        return new SwitchOffModel(i, message, date);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SwitchOffModel) {
            SwitchOffModel switchOffModel = (SwitchOffModel) obj;
            return this.visibility == switchOffModel.visibility && Intrinsics.areEqual(this.message, switchOffModel.message) && Intrinsics.areEqual(this.date, switchOffModel.date);
        }
        return false;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        return (((this.visibility * 31) + this.message.hashCode()) * 31) + this.date.hashCode();
    }

    @NotNull
    public String toString() {
        int i = this.visibility;
        String str = this.message;
        String str2 = this.date;
        return "SwitchOffModel(visibility=" + i + ", message=" + str + ", date=" + str2 + ")";
    }
}