package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class OutputSizesCorrector {

    /* renamed from: a */
    public final String f10643a;

    /* renamed from: b */
    public final ExtraSupportedOutputSizeQuirk f10644b = (ExtraSupportedOutputSizeQuirk) DeviceQuirks.get(ExtraSupportedOutputSizeQuirk.class);

    /* renamed from: c */
    public final ExcludedSupportedSizesContainer f10645c;

    public OutputSizesCorrector(@NonNull String str) {
        this.f10643a = str;
        this.f10645c = new ExcludedSupportedSizesContainer(str);
    }

    /* renamed from: a */
    public final void m63523a(List list, Class cls) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f10644b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(cls);
        if (extraSupportedResolutions.length > 0) {
            list.addAll(Arrays.asList(extraSupportedResolutions));
        }
    }

    @NonNull
    public Size[] applyQuirks(@NonNull Size[] sizeArr, int i) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        m63522b(arrayList, i);
        m63520d(arrayList, i);
        if (arrayList.isEmpty()) {
            Logger.m63171w("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    /* renamed from: b */
    public final void m63522b(List list, int i) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f10644b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(i);
        if (extraSupportedResolutions.length > 0) {
            list.addAll(Arrays.asList(extraSupportedResolutions));
        }
    }

    /* renamed from: c */
    public final void m63521c(List list, Class cls) {
        List<Size> list2 = this.f10645c.get(cls);
        if (list2.isEmpty()) {
            return;
        }
        list.removeAll(list2);
    }

    /* renamed from: d */
    public final void m63520d(List list, int i) {
        List<Size> list2 = this.f10645c.get(i);
        if (list2.isEmpty()) {
            return;
        }
        list.removeAll(list2);
    }

    @NonNull
    public <T> Size[] applyQuirks(@NonNull Size[] sizeArr, @NonNull Class<T> cls) {
        List arrayList = new ArrayList(Arrays.asList(sizeArr));
        m63523a(arrayList, cls);
        m63521c(arrayList, cls);
        if (arrayList.isEmpty()) {
            Logger.m63171w("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}