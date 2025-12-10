package p000;

import com.bumptech.glide.load.engine.prefill.PreFillType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Bm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17386Bm1 {

    /* renamed from: a */
    public final Map f498a;

    /* renamed from: b */
    public final List f499b;

    /* renamed from: c */
    public int f500c;

    /* renamed from: d */
    public int f501d;

    public C17386Bm1(Map map) {
        this.f498a = map;
        this.f499b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.f500c += num.intValue();
        }
    }

    /* renamed from: a */
    public boolean m69081a() {
        if (this.f500c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public PreFillType m69080b() {
        int size;
        PreFillType preFillType = (PreFillType) this.f499b.get(this.f501d);
        Integer num = (Integer) this.f498a.get(preFillType);
        if (num.intValue() == 1) {
            this.f498a.remove(preFillType);
            this.f499b.remove(this.f501d);
        } else {
            this.f498a.put(preFillType, Integer.valueOf(num.intValue() - 1));
        }
        this.f500c--;
        if (this.f499b.isEmpty()) {
            size = 0;
        } else {
            size = (this.f501d + 1) % this.f499b.size();
        }
        this.f501d = size;
        return preFillType;
    }
}