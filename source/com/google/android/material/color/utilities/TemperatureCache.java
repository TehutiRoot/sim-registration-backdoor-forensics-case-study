package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TemperatureCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class TemperatureCache {

    /* renamed from: a */
    public final Hct f49689a;

    /* renamed from: b */
    public Hct f49690b;

    /* renamed from: c */
    public List f49691c;

    /* renamed from: d */
    public List f49692d;

    /* renamed from: e */
    public Map f49693e;

    public TemperatureCache(Hct hct) {
        this.f49689a = hct;
    }

    /* renamed from: a */
    public static /* synthetic */ Double m44952a(TemperatureCache temperatureCache, Hct hct) {
        return temperatureCache.m44945h(hct);
    }

    /* renamed from: g */
    public static boolean m44946g(double d, double d2, double d3) {
        return d2 < d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    public static double rawTemperature(Hct hct) {
        double[] labFromArgb = ColorUtils.labFromArgb(hct.toInt());
        return ((Math.pow(Math.hypot(labFromArgb[1], labFromArgb[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(labFromArgb[2], labFromArgb[1]))) - 50.0d)))) - 0.5d;
    }

    /* renamed from: b */
    public final Hct m44951b() {
        return (Hct) m44949d().get(0);
    }

    /* renamed from: c */
    public final List m44950c() {
        List list = this.f49692d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            arrayList.add(Hct.from(d, this.f49689a.getChroma(), this.f49689a.getTone()));
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        this.f49692d = unmodifiableList;
        return unmodifiableList;
    }

    /* renamed from: d */
    public final List m44949d() {
        Comparator comparing;
        List list = this.f49691c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(m44950c());
        arrayList.add(this.f49689a);
        comparing = Comparator.comparing(new Function() { // from class: xR1
            {
                TemperatureCache.this = this;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TemperatureCache.m44952a(TemperatureCache.this, (Hct) obj);
            }
        }, new Comparator() { // from class: yR1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        });
        Collections.sort(arrayList, comparing);
        this.f49691c = arrayList;
        return arrayList;
    }

    /* renamed from: e */
    public final Map m44948e() {
        Map map = this.f49693e;
        if (map != null) {
            return map;
        }
        ArrayList<Hct> arrayList = new ArrayList(m44950c());
        arrayList.add(this.f49689a);
        HashMap hashMap = new HashMap();
        for (Hct hct : arrayList) {
            hashMap.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.f49693e = hashMap;
        return hashMap;
    }

    /* renamed from: f */
    public final Hct m44947f() {
        return (Hct) m44949d().get(m44949d().size() - 1);
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public Hct getComplement() {
        double d;
        Hct hct = this.f49690b;
        if (hct != null) {
            return hct;
        }
        double hue = m44951b().getHue();
        double doubleValue = ((Double) m44948e().get(m44951b())).doubleValue();
        double hue2 = m44947f().getHue();
        double doubleValue2 = ((Double) m44948e().get(m44947f())).doubleValue() - doubleValue;
        boolean m44946g = m44946g(this.f49689a.getHue(), hue, hue2);
        if (m44946g) {
            d = hue2;
        } else {
            d = hue;
        }
        if (!m44946g) {
            hue = hue2;
        }
        Hct hct2 = (Hct) m44950c().get((int) Math.round(this.f49689a.getHue()));
        double relativeTemperature = 1.0d - getRelativeTemperature(this.f49689a);
        double d2 = 1000.0d;
        for (double d3 = 0.0d; d3 <= 360.0d; d3 += 1.0d) {
            double sanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble(d + (1.0d * d3));
            if (m44946g(sanitizeDegreesDouble, d, hue)) {
                Hct hct3 = (Hct) m44950c().get((int) Math.round(sanitizeDegreesDouble));
                double abs = Math.abs(relativeTemperature - ((((Double) m44948e().get(hct3)).doubleValue() - doubleValue) / doubleValue2));
                if (abs < d2) {
                    hct2 = hct3;
                    d2 = abs;
                }
            }
        }
        this.f49690b = hct2;
        return hct2;
    }

    public double getRelativeTemperature(Hct hct) {
        double doubleValue = ((Double) m44948e().get(m44947f())).doubleValue() - ((Double) m44948e().get(m44951b())).doubleValue();
        double doubleValue2 = ((Double) m44948e().get(hct)).doubleValue() - ((Double) m44948e().get(m44951b())).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    /* renamed from: h */
    public final /* synthetic */ Double m44945h(Hct hct) {
        return (Double) m44948e().get(hct);
    }

    public List<Hct> getAnalogousColors(int i, int i2) {
        int round = (int) Math.round(this.f49689a.getHue());
        Hct hct = (Hct) m44950c().get(round);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double d = 0.0d;
        double d2 = 0.0d;
        int i3 = 0;
        while (i3 < 360) {
            double relativeTemperature2 = getRelativeTemperature((Hct) m44950c().get(MathUtils.sanitizeDegreesInt(round + i3)));
            d2 += Math.abs(relativeTemperature2 - relativeTemperature);
            i3++;
            relativeTemperature = relativeTemperature2;
        }
        double d3 = d2 / i2;
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i4 = 1;
        while (true) {
            if (arrayList.size() >= i2) {
                break;
            }
            Hct hct2 = (Hct) m44950c().get(MathUtils.sanitizeDegreesInt(round + i4));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            d += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z = d >= ((double) arrayList.size()) * d3;
            int i5 = 1;
            while (z && arrayList.size() < i2) {
                arrayList.add(hct2);
                z = d >= ((double) (arrayList.size() + i5)) * d3;
                i5++;
            }
            i4++;
            if (i4 > 360) {
                while (arrayList.size() < i2) {
                    arrayList.add(hct2);
                }
            } else {
                relativeTemperature3 = relativeTemperature4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f49689a);
        int floor = (int) Math.floor((i - 1.0d) / 2.0d);
        for (int i6 = 1; i6 < floor + 1; i6++) {
            int i7 = 0 - i6;
            while (i7 < 0) {
                i7 += arrayList.size();
            }
            if (i7 >= arrayList.size()) {
                i7 %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(i7));
        }
        int i8 = i - floor;
        for (int i9 = 1; i9 < i8; i9++) {
            int i10 = i9;
            while (i10 < 0) {
                i10 += arrayList.size();
            }
            if (i10 >= arrayList.size()) {
                i10 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(i10));
        }
        return arrayList2;
    }
}
