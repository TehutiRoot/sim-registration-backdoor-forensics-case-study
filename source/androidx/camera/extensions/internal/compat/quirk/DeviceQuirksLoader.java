package androidx.camera.extensions.internal.compat.quirk;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    /* renamed from: a */
    public static List m62600a() {
        ArrayList arrayList = new ArrayList();
        if (ExtensionDisabledQuirk.m62596d()) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (CrashWhenOnDisableTooSoon.m62601a()) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (GetAvailableKeysNeedsOnInit.m62593a()) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        if (ImageAnalysisUnavailableQuirk.m62592a()) {
            arrayList.add(new ImageAnalysisUnavailableQuirk());
        }
        if (ExtraSupportedSurfaceCombinationsQuirk.m62595a()) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        return arrayList;
    }
}
