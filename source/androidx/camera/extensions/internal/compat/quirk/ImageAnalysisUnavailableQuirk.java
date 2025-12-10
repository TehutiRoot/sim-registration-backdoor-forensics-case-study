package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ImageAnalysisUnavailableQuirk implements Quirk {

    /* renamed from: b */
    public static final Set f11529b = new HashSet(Arrays.asList(Pair.create("samsung", "dm3q"), Pair.create("samsung", "q2q"), Pair.create("samsung", "a52sxq"), Pair.create("samsung", "b0q")));

    /* renamed from: a */
    public final Set f11530a;

    public ImageAnalysisUnavailableQuirk() {
        HashSet hashSet = new HashSet();
        this.f11530a = hashSet;
        String str = Build.BRAND;
        if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("dm3q")) {
            hashSet.addAll(Arrays.asList(Pair.create("1", 1), Pair.create("1", 4), Pair.create(ExifInterface.GPS_MEASUREMENT_3D, 1), Pair.create(ExifInterface.GPS_MEASUREMENT_3D, 4)));
        } else if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("q2q")) {
            hashSet.addAll(Arrays.asList(Pair.create("0", 1), Pair.create("0", 4)));
        } else if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("a52sxq")) {
            hashSet.addAll(Arrays.asList(Pair.create("0", 1), Pair.create("0", 4)));
        } else if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("b0q")) {
            hashSet.addAll(Arrays.asList(Pair.create(ExifInterface.GPS_MEASUREMENT_3D, 1), Pair.create(ExifInterface.GPS_MEASUREMENT_3D, 4)));
        }
    }

    /* renamed from: a */
    public static boolean m62592a() {
        Set set = f11529b;
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return set.contains(Pair.create(str.toLowerCase(locale), Build.DEVICE.toLowerCase(locale)));
    }

    public boolean isUnavailable(@NonNull String str, int i) {
        return this.f11530a.contains(Pair.create(str, Integer.valueOf(i)));
    }
}
