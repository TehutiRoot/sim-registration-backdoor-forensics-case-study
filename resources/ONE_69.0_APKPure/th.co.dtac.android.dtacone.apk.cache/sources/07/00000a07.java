package p000;

import com.google.android.gms.vision.text.TextBlock;
import java.util.Comparator;
import java.util.Map;

/* renamed from: Ka2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17936Ka2 implements Comparator {
    public C17936Ka2(TextBlock textBlock) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}