package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceConfig;
import com.zxy.tiny.core.CompressKit;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements Quirk {

    /* renamed from: a */
    public static final Map f10526a;

    /* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2405a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10527a;

        static {
            int[] iArr = new int[SurfaceConfig.ConfigType.values().length];
            f10527a = iArr;
            try {
                iArr[SurfaceConfig.ConfigType.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10527a[SurfaceConfig.ConfigType.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10527a[SurfaceConfig.ConfigType.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f10526a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    /* renamed from: a */
    public static boolean m63620a() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            Map map = f10526a;
            String str = Build.MODEL;
            Locale locale = Locale.US;
            if (map.containsKey(str.toUpperCase(locale))) {
                Range range = (Range) map.get(str.toUpperCase(locale));
                if (range == null) {
                    return true;
                }
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m63619b() {
        return m63620a();
    }

    @Nullable
    public Size getVerifiedResolution(@NonNull SurfaceConfig.ConfigType configType) {
        if (!m63620a()) {
            return null;
        }
        int i = C2405a.f10527a[configType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new Size(3264, 1836);
            }
            return new Size(CompressKit.DEFAULT_MAX_COMPRESS_SIZE, 720);
        }
        return new Size(1920, 1080);
    }
}
