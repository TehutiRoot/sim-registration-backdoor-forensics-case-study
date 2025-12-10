package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class CameraCharacteristicsCompat {

    /* renamed from: b */
    public final CameraCharacteristicsCompatImpl f10463b;

    /* renamed from: c */
    public final String f10464c;

    /* renamed from: a */
    public final Map f10462a = new HashMap();

    /* renamed from: d */
    public StreamConfigurationMapCompat f10465d = null;

    /* loaded from: classes.dex */
    public interface CameraCharacteristicsCompatImpl {
        @Nullable
        <T> T get(@NonNull CameraCharacteristics.Key<T> key);

        @NonNull
        Set<String> getPhysicalCameraIds();

        @NonNull
        CameraCharacteristics unwrap();
    }

    public CameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10463b = new C11553jj(cameraCharacteristics);
        } else {
            this.f10463b = new C2383b(cameraCharacteristics);
        }
        this.f10464c = str;
    }

    @NonNull
    @VisibleForTesting
    public static CameraCharacteristicsCompat toCameraCharacteristicsCompat(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        return new CameraCharacteristicsCompat(cameraCharacteristics, str);
    }

    /* renamed from: a */
    public final boolean m63695a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return true;
        }
        return false;
    }

    @Nullable
    public <T> T get(@NonNull CameraCharacteristics.Key<T> key) {
        if (m63695a(key)) {
            return (T) this.f10463b.get(key);
        }
        synchronized (this) {
            try {
                T t = (T) this.f10462a.get(key);
                if (t != null) {
                    return t;
                }
                T t2 = (T) this.f10463b.get(key);
                if (t2 != null) {
                    this.f10462a.put(key, t2);
                }
                return t2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public Set<String> getPhysicalCameraIds() {
        return this.f10463b.getPhysicalCameraIds();
    }

    @NonNull
    public StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        if (this.f10465d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    this.f10465d = StreamConfigurationMapCompat.m63679a(streamConfigurationMap, new OutputSizesCorrector(this.f10464c));
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.f10465d;
    }

    @NonNull
    public CameraCharacteristics toCameraCharacteristics() {
        return this.f10463b.unwrap();
    }
}
