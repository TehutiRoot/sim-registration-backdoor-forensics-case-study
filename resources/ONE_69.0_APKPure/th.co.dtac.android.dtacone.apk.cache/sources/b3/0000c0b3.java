package com.tom_roush.fontbox.ttf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class VerticalOriginTable extends TTFTable {
    public static final String TAG = "VORG";

    /* renamed from: e */
    public float f59639e;

    /* renamed from: f */
    public int f59640f;

    /* renamed from: g */
    public Map f59641g;

    public VerticalOriginTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        this.f59639e = abstractC22342tR1.m22689j();
        this.f59640f = abstractC22342tR1.mo22686m();
        int mo22679t = abstractC22342tR1.mo22679t();
        this.f59641g = new ConcurrentHashMap(mo22679t);
        for (int i = 0; i < mo22679t; i++) {
            this.f59641g.put(Integer.valueOf(abstractC22342tR1.mo22679t()), Integer.valueOf(abstractC22342tR1.mo22686m()));
        }
        this.initialized = true;
    }

    public int getOriginY(int i) {
        if (this.f59641g.containsKey(Integer.valueOf(i))) {
            return ((Integer) this.f59641g.get(Integer.valueOf(i))).intValue();
        }
        return this.f59640f;
    }

    public float getVersion() {
        return this.f59639e;
    }
}