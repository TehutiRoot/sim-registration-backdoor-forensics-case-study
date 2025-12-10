package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Score {

    /* renamed from: com.google.android.material.color.utilities.Score$a */
    /* loaded from: classes4.dex */
    public static class C6887a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return -((Double) entry.getValue()).compareTo((Double) entry2.getValue());
        }
    }

    /* renamed from: a */
    public static List m44930a(Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map2.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int intValue = num.intValue();
            double doubleValue = ((Double) map.get(num)).doubleValue();
            if (((Cam16) entry.getValue()).getChroma() >= 15.0d && ColorUtils.lstarFromArgb(intValue) >= 10.0d && doubleValue >= 0.01d) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        Iterator<Map.Entry<Integer, Integer>> it;
        double d;
        double d2 = 0.0d;
        while (map.entrySet().iterator().hasNext()) {
            d2 += it.next().getValue().intValue();
        }
        HashMap hashMap = new HashMap();
        double[] dArr = new double[361];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Cam16 fromInt = Cam16.fromInt(key.intValue());
            hashMap.put(key, fromInt);
            int round = (int) Math.round(fromInt.getHue());
            dArr[round] = dArr[round] + (entry.getValue().intValue() / d2);
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Integer num = (Integer) entry2.getKey();
            num.intValue();
            int round2 = (int) Math.round(((Cam16) entry2.getValue()).getHue());
            double d3 = 0.0d;
            for (int i = round2 - 15; i < round2 + 15; i++) {
                d3 += dArr[MathUtils.sanitizeDegreesInt(i)];
            }
            hashMap2.put(num, Double.valueOf(d3));
        }
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry3 : hashMap.entrySet()) {
            Integer num2 = (Integer) entry3.getKey();
            num2.intValue();
            Cam16 cam16 = (Cam16) entry3.getValue();
            double doubleValue = ((Double) hashMap2.get(num2)).doubleValue() * 100.0d * 0.7d;
            if (cam16.getChroma() < 48.0d) {
                d = 0.1d;
            } else {
                d = 0.3d;
            }
            hashMap3.put(num2, Double.valueOf(doubleValue + ((cam16.getChroma() - 48.0d) * d)));
        }
        List<Integer> m44930a = m44930a(hashMap2, hashMap);
        HashMap hashMap4 = new HashMap();
        for (Integer num3 : m44930a) {
            num3.intValue();
            hashMap4.put(num3, (Double) hashMap3.get(num3));
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(hashMap4.entrySet());
        Collections.sort(arrayList, new C6887a());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry4 : arrayList) {
            Integer num4 = (Integer) entry4.getKey();
            num4.intValue();
            Cam16 cam162 = (Cam16) hashMap.get(num4);
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (MathUtils.differenceDegrees(cam162.getHue(), ((Cam16) hashMap.get((Integer) it2.next())).getHue()) < 15.0d) {
                        break;
                    }
                } else {
                    arrayList2.add((Integer) entry4.getKey());
                    break;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(-12417548);
        }
        return arrayList2;
    }
}