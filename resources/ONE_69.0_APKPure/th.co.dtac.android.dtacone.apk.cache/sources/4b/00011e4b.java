package th.p047co.dtac.android.dtacone.model.dtacAtHome;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/dtacAtHome/ValidateLocationRequest;", "", "lat", "", "long", "(DD)V", "getLat", "()D", "getLong", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.dtacAtHome.ValidateLocationRequest */
/* loaded from: classes8.dex */
public final class ValidateLocationRequest {
    public static final int $stable = 0;
    @SerializedName("lat")
    private final double lat;
    @SerializedName("long")

    /* renamed from: long  reason: not valid java name */
    private final double f109635long;

    public ValidateLocationRequest(double d, double d2) {
        this.lat = d;
        this.f109635long = d2;
    }

    public static /* synthetic */ ValidateLocationRequest copy$default(ValidateLocationRequest validateLocationRequest, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = validateLocationRequest.lat;
        }
        if ((i & 2) != 0) {
            d2 = validateLocationRequest.f109635long;
        }
        return validateLocationRequest.copy(d, d2);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.f109635long;
    }

    @NotNull
    public final ValidateLocationRequest copy(double d, double d2) {
        return new ValidateLocationRequest(d, d2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateLocationRequest) {
            ValidateLocationRequest validateLocationRequest = (ValidateLocationRequest) obj;
            return Double.compare(this.lat, validateLocationRequest.lat) == 0 && Double.compare(this.f109635long, validateLocationRequest.f109635long) == 0;
        }
        return false;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLong() {
        return this.f109635long;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.lat) * 31) + Double.doubleToLongBits(this.f109635long);
    }

    @NotNull
    public String toString() {
        double d = this.lat;
        double d2 = this.f109635long;
        return "ValidateLocationRequest(lat=" + d + ", long=" + d2 + ")";
    }
}