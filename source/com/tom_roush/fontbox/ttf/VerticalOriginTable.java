package com.tom_roush.fontbox.ttf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class VerticalOriginTable extends TTFTable {
    public static final String TAG = "VORG";

    /* renamed from: e */
    public float f59627e;

    /* renamed from: f */
    public int f59628f;

    /* renamed from: g */
    public Map f59629g;

    public VerticalOriginTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59627e = abstractC22790wQ1.m854j();
        this.f59628f = abstractC22790wQ1.mo851m();
        int mo844t = abstractC22790wQ1.mo844t();
        this.f59629g = new ConcurrentHashMap(mo844t);
        for (int i = 0; i < mo844t; i++) {
            this.f59629g.put(Integer.valueOf(abstractC22790wQ1.mo844t()), Integer.valueOf(abstractC22790wQ1.mo851m()));
        }
        this.initialized = true;
    }

    public int getOriginY(int i) {
        if (this.f59629g.containsKey(Integer.valueOf(i))) {
            return ((Integer) this.f59629g.get(Integer.valueOf(i))).intValue();
        }
        return this.f59628f;
    }

    public float getVersion() {
        return this.f59627e;
    }
}
