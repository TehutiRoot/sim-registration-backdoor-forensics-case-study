package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import androidx.camera.core.Logger;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public class StreamConfigurationMapCompat {

    /* renamed from: a */
    public final InterfaceC2380a f10475a;

    /* renamed from: b */
    public final OutputSizesCorrector f10476b;

    /* renamed from: c */
    public final Map f10477c = new HashMap();

    /* renamed from: d */
    public final Map f10478d = new HashMap();

    /* renamed from: e */
    public final Map f10479e = new HashMap();

    /* renamed from: androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2380a {
        /* renamed from: a */
        Size[] mo278a(int i);

        /* renamed from: b */
        Size[] mo63668b(Class cls);

        /* renamed from: c */
        Size[] mo63667c(int i);

        StreamConfigurationMap unwrap();
    }

    public StreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f10475a = new C23126yM1(streamConfigurationMap);
        } else {
            this.f10475a = new C2390g(streamConfigurationMap);
        }
        this.f10476b = outputSizesCorrector;
    }

    /* renamed from: a */
    public static StreamConfigurationMapCompat m63679a(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        return new StreamConfigurationMapCompat(streamConfigurationMap, outputSizesCorrector);
    }

    @Nullable
    public Size[] getHighResolutionOutputSizes(int i) {
        if (this.f10478d.containsKey(Integer.valueOf(i))) {
            if (((Size[]) this.f10478d.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f10478d.get(Integer.valueOf(i))).clone();
        }
        Size[] mo63667c = this.f10475a.mo63667c(i);
        if (mo63667c != null && mo63667c.length > 0) {
            mo63667c = this.f10476b.applyQuirks(mo63667c, i);
        }
        this.f10478d.put(Integer.valueOf(i), mo63667c);
        if (mo63667c == null) {
            return null;
        }
        return (Size[]) mo63667c.clone();
    }

    @Nullable
    public Size[] getOutputSizes(int i) {
        if (this.f10477c.containsKey(Integer.valueOf(i))) {
            if (((Size[]) this.f10477c.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f10477c.get(Integer.valueOf(i))).clone();
        }
        Size[] mo278a = this.f10475a.mo278a(i);
        if (mo278a != null && mo278a.length != 0) {
            Size[] applyQuirks = this.f10476b.applyQuirks(mo278a, i);
            this.f10477c.put(Integer.valueOf(i), applyQuirks);
            return (Size[]) applyQuirks.clone();
        }
        Logger.m63223w("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
        return mo278a;
    }

    @NonNull
    public StreamConfigurationMap toStreamConfigurationMap() {
        return this.f10475a.unwrap();
    }

    @Nullable
    public <T> Size[] getOutputSizes(@NonNull Class<T> cls) {
        if (this.f10479e.containsKey(cls)) {
            if (((Size[]) this.f10479e.get(cls)) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f10479e.get(cls)).clone();
        }
        Size[] mo63668b = this.f10475a.mo63668b(cls);
        if (mo63668b != null && mo63668b.length != 0) {
            Size[] applyQuirks = this.f10476b.applyQuirks(mo63668b, cls);
            this.f10479e.put(cls, applyQuirks);
            return (Size[]) applyQuirks.clone();
        }
        Logger.m63223w("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for class " + cls);
        return mo63668b;
    }
}
