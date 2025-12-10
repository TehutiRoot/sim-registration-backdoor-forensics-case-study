package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import com.zxy.tiny.core.CompressKit;
import org.joda.time.DateTimeConstants;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements Quirk {
    /* renamed from: b */
    public static boolean m63568b() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m63567c() {
        return m63568b();
    }

    /* renamed from: a */
    public final Size[] m63569a() {
        return new Size[]{new Size(1920, 1080), new Size(DateTimeConstants.MINUTES_PER_DAY, 1080), new Size(CompressKit.DEFAULT_MAX_COMPRESS_SIZE, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)};
    }

    @NonNull
    public Size[] getExtraSupportedResolutions(int i) {
        if (i == 34 && m63568b()) {
            return m63569a();
        }
        return new Size[0];
    }

    @NonNull
    public <T> Size[] getExtraSupportedResolutions(@NonNull Class<T> cls) {
        if (StreamConfigurationMap.isOutputSupportedFor(cls) && m63568b()) {
            return m63569a();
        }
        return new Size[0];
    }
}