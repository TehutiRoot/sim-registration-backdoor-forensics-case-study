package p000;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.Quality;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: vp1 */
/* loaded from: classes.dex */
public class C22683vp1 {

    /* renamed from: b */
    public static final Map f107804b;

    /* renamed from: c */
    public static final Map f107805c;

    /* renamed from: a */
    public final Map f107806a = new HashMap();

    /* renamed from: vp1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC16922a {
        /* renamed from: c */
        public static AbstractC16922a m986c(Quality quality, int i) {
            return new C1077P8(quality, i);
        }

        /* renamed from: a */
        public abstract int mo988a();

        /* renamed from: b */
        public abstract Quality mo987b();
    }

    static {
        HashMap hashMap = new HashMap();
        f107804b = hashMap;
        hashMap.put(Quality.UHD, Range.create(2160, 4319));
        hashMap.put(Quality.FHD, Range.create(1080, 1439));
        hashMap.put(Quality.f11631HD, Range.create(720, 1079));
        hashMap.put(Quality.f11632SD, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        f107805c = hashMap2;
        hashMap2.put(0, AspectRatioUtil.ASPECT_RATIO_4_3);
        hashMap2.put(1, AspectRatioUtil.ASPECT_RATIO_16_9);
    }

    public C22683vp1(List list, Map map) {
        for (Quality quality : f107804b.keySet()) {
            this.f107806a.put(AbstractC16922a.m986c(quality, -1), new ArrayList());
            for (Integer num : f107805c.keySet()) {
                this.f107806a.put(AbstractC16922a.m986c(quality, num.intValue()), new ArrayList());
            }
        }
        m996b(map);
        m995c(list);
        m989i(map);
    }

    /* renamed from: a */
    public static /* synthetic */ int m997a(int i, Size size, Size size2) {
        return m990h(i, size, size2);
    }

    /* renamed from: d */
    public static Integer m994d(Size size) {
        for (Map.Entry entry : f107805c.entrySet()) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, (Rational) entry.getValue(), SizeUtil.RESOLUTION_QVGA)) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: e */
    public static Quality m993e(Size size) {
        for (Map.Entry entry : f107804b.entrySet()) {
            if (((Range) entry.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                return (Quality) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ int m990h(int i, Size size, Size size2) {
        return Math.abs(SizeUtil.getArea(size) - i) - Math.abs(SizeUtil.getArea(size2) - i);
    }

    /* renamed from: b */
    public final void m996b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            List m992f = m992f((Quality) entry.getKey(), -1);
            Objects.requireNonNull(m992f);
            m992f.add((Size) entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m995c(List list) {
        Integer m994d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Quality m993e = m993e(size);
            if (m993e != null && (m994d = m994d(size)) != null) {
                List m992f = m992f(m993e, m994d.intValue());
                Objects.requireNonNull(m992f);
                m992f.add(size);
            }
        }
    }

    /* renamed from: f */
    public final List m992f(Quality quality, int i) {
        return (List) this.f107806a.get(AbstractC16922a.m986c(quality, i));
    }

    /* renamed from: g */
    public List m991g(Quality quality, int i) {
        ArrayList arrayList;
        List m992f = m992f(quality, i);
        if (m992f != null) {
            arrayList = new ArrayList(m992f);
        } else {
            arrayList = new ArrayList(0);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void m989i(Map map) {
        for (Map.Entry entry : this.f107806a.entrySet()) {
            Size size = (Size) map.get(((AbstractC16922a) entry.getKey()).mo987b());
            if (size != null) {
                final int area = SizeUtil.getArea(size);
                Collections.sort((List) entry.getValue(), new Comparator() { // from class: up1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C22683vp1.m997a(area, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }
}
