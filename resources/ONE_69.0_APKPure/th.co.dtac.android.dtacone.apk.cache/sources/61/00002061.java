package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ImageAnalysisUnavailableQuirk implements Quirk {

    /* renamed from: b */
    public static final Set f11617b = new HashSet(Arrays.asList(Pair.create("samsung", "dm3q"), Pair.create("samsung", "q2q"), Pair.create("samsung", "a52sxq"), Pair.create("samsung", "b0q")));

    /* renamed from: a */
    public final Set f11618a;

    public ImageAnalysisUnavailableQuirk() {
        HashSet hashSet = new HashSet();
        this.f11618a = hashSet;
        String str = Build.BRAND;
        if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("dm3q")) {
            hashSet.addAll(Arrays.asList(Pair.create("1", 1), Pair.create("1", 4), Pair.create("3", 1), Pair.create("3", 4)));
        } else if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("q2q")) {
            hashSet.addAll(Arrays.asList(Pair.create("0", 1), Pair.create("0", 4)));
        } else if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("a52sxq")) {
            hashSet.addAll(Arrays.asList(Pair.create("0", 1), Pair.create("0", 4)));
        } else if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("b0q")) {
            hashSet.addAll(Arrays.asList(Pair.create("3", 1), Pair.create("3", 4)));
        }
    }

    /* renamed from: a */
    public static boolean m62540a() {
        Set set = f11617b;
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return set.contains(Pair.create(str.toLowerCase(locale), Build.DEVICE.toLowerCase(locale)));
    }

    public boolean isUnavailable(@NonNull String str, int i) {
        return this.f11618a.contains(Pair.create(str, Integer.valueOf(i)));
    }
}