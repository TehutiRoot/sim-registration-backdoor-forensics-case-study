package androidx.camera.video.internal.workaround;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    /* renamed from: a */
    public static double m61888a(double d) {
        return d >= 0.0d ? d : ((d * 10000.0d) - 1.0d) / 10000.0d;
    }

    @NonNull
    public static Pair<Double, Double> adjustGeoLocation(double d, double d2) {
        if (DeviceQuirks.get(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d = m61888a(d);
            d2 = m61888a(d2);
        }
        return Pair.create(Double.valueOf(d), Double.valueOf(d2));
    }
}