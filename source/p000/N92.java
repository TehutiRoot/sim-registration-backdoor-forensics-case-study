package p000;

import com.google.android.gms.vision.text.TextBlock;
import java.util.Comparator;
import java.util.Map;

/* renamed from: N92 */
/* loaded from: classes4.dex */
public final class N92 implements Comparator {
    public N92(TextBlock textBlock) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}
