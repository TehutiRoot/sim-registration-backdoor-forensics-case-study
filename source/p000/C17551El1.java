package p000;

import com.bumptech.glide.load.engine.prefill.PreFillType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: El1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17551El1 {

    /* renamed from: a */
    public final Map f1381a;

    /* renamed from: b */
    public final List f1382b;

    /* renamed from: c */
    public int f1383c;

    /* renamed from: d */
    public int f1384d;

    public C17551El1(Map map) {
        this.f1381a = map;
        this.f1382b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.f1383c += num.intValue();
        }
    }

    /* renamed from: a */
    public boolean m68467a() {
        if (this.f1383c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public PreFillType m68466b() {
        int size;
        PreFillType preFillType = (PreFillType) this.f1382b.get(this.f1384d);
        Integer num = (Integer) this.f1381a.get(preFillType);
        if (num.intValue() == 1) {
            this.f1381a.remove(preFillType);
            this.f1382b.remove(this.f1384d);
        } else {
            this.f1381a.put(preFillType, Integer.valueOf(num.intValue() - 1));
        }
        this.f1383c--;
        if (this.f1382b.isEmpty()) {
            size = 0;
        } else {
            size = (this.f1384d + 1) % this.f1382b.size();
        }
        this.f1384d = size;
        return preFillType;
    }
}
