package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements Quirk {

    /* renamed from: a */
    public static final SurfaceCombination f10528a = m63615a();

    /* renamed from: b */
    public static final SurfaceCombination f10529b = m63614b();

    /* renamed from: c */
    public static final SurfaceCombination f10530c = m63613c();

    /* renamed from: d */
    public static final Set f10531d = new HashSet(Arrays.asList("SM-A515F", "SM-A515U", "SM-A515U1", "SM-A515W", "SM-S515DL", "SC-54A", "SCG07", "SM-A5160", "SM-A516B", "SM-A516N", "SM-A516U", "SM-A516U1", "SM-A516V", "SM-A715F", "SM-A715W", "SM-A7160", "SM-A716B", "SM-A716U", "SM-A716U1", "SM-A716V", "SM-A8050", "SM-A805F", "SM-A805N", "SCV44", "SM-F9000", "SM-F900F", "SM-F900U", "SM-F900U1", "SM-F900W", "SM-F907B", "SM-F907N", "SM-N970F", "SM-N9700", "SM-N970U", "SM-N970U1", "SM-N970W", "SM-N971N", "SM-N770F", "SC-01M", "SCV45", "SM-N9750", "SM-N975C", "SM-N975U", "SM-N975U1", "SM-N975W", "SM-N975F", "SM-N976B", "SM-N976N", "SM-N9760", "SM-N976Q", "SM-N976V", "SM-N976U", "SM-N9810", "SM-N981N", "SM-N981U", "SM-N981U1", "SM-N981W", "SM-N981B", "SC-53A", "SCG06", "SM-N9860", "SM-N986N", "SM-N986U", "SM-N986U1", "SM-N986W", "SM-N986B", "SC-03L", "SCV41", "SM-G973F", "SM-G973N", "SM-G9730", "SM-G9738", "SM-G973C", "SM-G973U", "SM-G973U1", "SM-G973W", "SM-G977B", "SM-G977N", "SM-G977P", "SM-G977T", "SM-G977U", "SM-G770F", "SM-G770U1", "SC-04L", "SCV42", "SM-G975F", "SM-G975N", "SM-G9750", "SM-G9758", "SM-G975U", "SM-G975U1", "SM-G975W", "SC-05L", "SM-G970F", "SM-G970N", "SM-G9700", "SM-G9708", "SM-G970U", "SM-G970U1", "SM-G970W", "SC-51A", "SC51Aa", "SCG01", "SM-G9810", "SM-G981N", "SM-G981U", "SM-G981U1", "SM-G981V", "SM-G981W", "SM-G981B", "SCG03", "SM-G9880", "SM-G988N", "SM-G988Q", "SM-G988U", "SM-G988U1", "SM-G988W", "SM-G988B", "SC-52A", "SCG02", "SM-G9860", "SM-G986N", "SM-G986U", "SM-G986U1", "SM-G986W", "SM-G986B", "SCV47", "SM-F7000", "SM-F700F", "SM-F700N", "SM-F700U", "SM-F700U1", "SM-F700W", "SCG04", "SM-F7070", "SM-F707B", "SM-F707N", "SM-F707U", "SM-F707U1", "SM-F707W", "SM-F9160", "SM-F916B", "SM-F916N", "SM-F916Q", "SM-F916U", "SM-F916U1", "SM-F916W"));

    /* renamed from: e */
    public static final Set f10532e = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO"));

    /* renamed from: a */
    public static SurfaceCombination m63615a() {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.VGA));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.MAXIMUM));
        return surfaceCombination;
    }

    /* renamed from: b */
    public static SurfaceCombination m63614b() {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.VGA));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.MAXIMUM));
        return surfaceCombination;
    }

    /* renamed from: c */
    public static SurfaceCombination m63613c() {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, SurfaceConfig.ConfigSize.VGA));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, configSize));
        return surfaceCombination;
    }

    /* renamed from: f */
    public static boolean m63610f() {
        String str = Build.DEVICE;
        if (!"heroqltevzw".equalsIgnoreCase(str) && !"heroqltetmo".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m63609g() {
        if (!m63610f() && !m63608h() && !m63607i()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m63608h() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f10531d.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: i */
    public static boolean m63607i() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f10532e.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: d */
    public final List m63612d(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            arrayList.add(f10528a);
            arrayList.add(f10529b);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List m63611e(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f10528a);
        }
        return arrayList;
    }

    @NonNull
    public List<SurfaceCombination> getExtraSupportedSurfaceCombinations(@NonNull String str, int i) {
        if (m63610f()) {
            return m63611e(str);
        }
        if (m63608h()) {
            return m63612d(i);
        }
        if (m63607i()) {
            return Collections.singletonList(f10530c);
        }
        return Collections.emptyList();
    }
}
