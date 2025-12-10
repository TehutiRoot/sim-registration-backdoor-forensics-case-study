package p000;

import android.util.Size;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: zx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23395zx1 {
    /* renamed from: a */
    public static List m0a(List list, Size size, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            List list2 = (List) ((UseCaseConfig) it.next()).retrieveOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, null);
            if (list2 != null) {
                return list2;
            }
        }
        return list;
    }
}
