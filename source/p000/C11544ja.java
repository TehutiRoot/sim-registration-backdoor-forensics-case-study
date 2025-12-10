package p000;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ja */
/* loaded from: classes5.dex */
public final class C11544ja {

    /* renamed from: a */
    public final Map f67303a = new HashMap();

    /* renamed from: a */
    public Integer m29198a(int i) {
        return (Integer) this.f67303a.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public int[] m29197b() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry entry : this.f67303a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i) {
                i = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return PDF417Common.toIntArray(arrayList);
    }

    /* renamed from: c */
    public void m29196c(int i) {
        Integer num = (Integer) this.f67303a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f67303a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
