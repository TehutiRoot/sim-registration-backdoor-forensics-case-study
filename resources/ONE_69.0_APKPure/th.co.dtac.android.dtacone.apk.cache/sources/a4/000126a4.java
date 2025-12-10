package th.p047co.dtac.android.dtacone.util;

import android.location.Location;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.LatLng;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/LocationDistance;", "", "()V", "distance", "", "oldPosition", "Lcom/google/android/gms/maps/model/LatLng;", "newPosition", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.LocationDistance */
/* loaded from: classes8.dex */
public final class LocationDistance {
    public static final int $stable = 0;
    @NotNull
    public static final LocationDistance INSTANCE = new LocationDistance();

    public final double distance(@NotNull LatLng oldPosition, @NotNull LatLng newPosition) {
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        float[] fArr = new float[1];
        Location.distanceBetween(oldPosition.latitude, oldPosition.longitude, newPosition.latitude, newPosition.longitude, fArr);
        return new BigDecimal(fArr[0]).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
}