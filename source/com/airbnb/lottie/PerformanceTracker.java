package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class PerformanceTracker {

    /* renamed from: a */
    public boolean f41003a = false;

    /* renamed from: b */
    public final Set f41004b = new ArraySet();

    /* renamed from: c */
    public final Map f41005c = new HashMap();

    /* renamed from: d */
    public final Comparator f41006d = new C5670a();

    /* loaded from: classes3.dex */
    public interface FrameListener {
        void onFrameRendered(float f);
    }

    /* renamed from: com.airbnb.lottie.PerformanceTracker$a */
    /* loaded from: classes3.dex */
    public class C5670a implements Comparator {
        public C5670a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Pair pair, Pair pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public void m50911a(boolean z) {
        this.f41003a = z;
    }

    public void addFrameListener(FrameListener frameListener) {
        this.f41004b.add(frameListener);
    }

    public void clearRenderTimes() {
        this.f41005c.clear();
    }

    public List<Pair<String, Float>> getSortedRenderTimes() {
        if (!this.f41003a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f41005c.size());
        for (Map.Entry entry : this.f41005c.entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), Float.valueOf(((MeanCalculator) entry.getValue()).getMean())));
        }
        Collections.sort(arrayList, this.f41006d);
        return arrayList;
    }

    public void logRenderTimes() {
        if (!this.f41003a) {
            return;
        }
        List<Pair<String, Float>> sortedRenderTimes = getSortedRenderTimes();
        for (int i = 0; i < sortedRenderTimes.size(); i++) {
            Pair<String, Float> pair = sortedRenderTimes.get(i);
            String.format("\t\t%30s:%.2f", pair.first, pair.second);
        }
    }

    public void recordRenderTime(String str, float f) {
        if (!this.f41003a) {
            return;
        }
        MeanCalculator meanCalculator = (MeanCalculator) this.f41005c.get(str);
        if (meanCalculator == null) {
            meanCalculator = new MeanCalculator();
            this.f41005c.put(str, meanCalculator);
        }
        meanCalculator.add(f);
        if (str.equals("__container")) {
            for (FrameListener frameListener : this.f41004b) {
                frameListener.onFrameRendered(f);
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.f41004b.remove(frameListener);
    }
}
