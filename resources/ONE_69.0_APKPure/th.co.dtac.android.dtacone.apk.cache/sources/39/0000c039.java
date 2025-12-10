package com.tom_roush.fontbox.cff;

import android.graphics.Path;
import com.tom_roush.fontbox.type1.Type1CharStringReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class CFFCIDFont extends CFFFont {

    /* renamed from: b */
    public String f59246b;

    /* renamed from: c */
    public String f59247c;

    /* renamed from: d */
    public int f59248d;

    /* renamed from: g */
    public FDSelect f59251g;

    /* renamed from: e */
    public List f59249e = new LinkedList();

    /* renamed from: f */
    public List f59250f = new LinkedList();

    /* renamed from: h */
    public final Map f59252h = new ConcurrentHashMap();

    /* renamed from: i */
    public final C9836b f59253i = new C9836b();

    /* renamed from: com.tom_roush.fontbox.cff.CFFCIDFont$b */
    /* loaded from: classes5.dex */
    public class C9836b implements Type1CharStringReader {
        public C9836b() {
        }

        @Override // com.tom_roush.fontbox.type1.Type1CharStringReader
        public Type1CharString getType1CharString(String str) {
            return CFFCIDFont.this.getType2CharString(0);
        }
    }

    /* renamed from: e */
    public final int m33136e(int i) {
        int fDIndex = this.f59251g.getFDIndex(i);
        if (fDIndex == -1) {
            return 1000;
        }
        Map map = (Map) this.f59250f.get(fDIndex);
        if (!map.containsKey("defaultWidthX")) {
            return 1000;
        }
        return ((Number) map.get("defaultWidthX")).intValue();
    }

    /* renamed from: f */
    public final byte[][] m33135f(int i) {
        int fDIndex = this.f59251g.getFDIndex(i);
        if (fDIndex == -1) {
            return null;
        }
        return (byte[][]) ((Map) this.f59250f.get(fDIndex)).get("Subrs");
    }

    /* renamed from: g */
    public final int m33134g(int i) {
        int fDIndex = this.f59251g.getFDIndex(i);
        if (fDIndex == -1) {
            return 0;
        }
        Map map = (Map) this.f59250f.get(fDIndex);
        if (!map.containsKey("nominalWidthX")) {
            return 0;
        }
        return ((Number) map.get("nominalWidthX")).intValue();
    }

    public FDSelect getFdSelect() {
        return this.f59251g;
    }

    public List<Map<String, Object>> getFontDicts() {
        return this.f59249e;
    }

    @Override // com.tom_roush.fontbox.cff.CFFFont, com.tom_roush.fontbox.FontBoxFont
    public List<Number> getFontMatrix() {
        return (List) this.topDict.get("FontMatrix");
    }

    public String getOrdering() {
        return this.f59247c;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) throws IOException {
        return getType2CharString(m33133h(str)).getPath();
    }

    public List<Map<String, Object>> getPrivDicts() {
        return this.f59250f;
    }

    public String getRegistry() {
        return this.f59246b;
    }

    public int getSupplement() {
        return this.f59248d;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public float getWidth(String str) throws IOException {
        return getType2CharString(m33133h(str)).getWidth();
    }

    /* renamed from: h */
    public final int m33133h(String str) {
        if (str.startsWith("\\")) {
            return Integer.parseInt(str.substring(1));
        }
        throw new IllegalArgumentException("Invalid selector");
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public boolean hasGlyph(String str) throws IOException {
        if (m33133h(str) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m33132i(FDSelect fDSelect) {
        this.f59251g = fDSelect;
    }

    /* renamed from: j */
    public void m33131j(List list) {
        this.f59249e = list;
    }

    /* renamed from: k */
    public void m33130k(String str) {
        this.f59247c = str;
    }

    /* renamed from: l */
    public void m33129l(List list) {
        this.f59250f = list;
    }

    /* renamed from: m */
    public void m33128m(String str) {
        this.f59246b = str;
    }

    /* renamed from: n */
    public void m33127n(int i) {
        this.f59248d = i;
    }

    @Override // com.tom_roush.fontbox.cff.CFFFont
    public CIDKeyedType2CharString getType2CharString(int i) throws IOException {
        CIDKeyedType2CharString cIDKeyedType2CharString = (CIDKeyedType2CharString) this.f59252h.get(Integer.valueOf(i));
        if (cIDKeyedType2CharString == null) {
            int gIDForCID = this.charset.getGIDForCID(i);
            byte[][] bArr = this.charStrings;
            byte[] bArr2 = bArr[gIDForCID];
            if (bArr2 == null) {
                bArr2 = bArr[0];
            }
            CIDKeyedType2CharString cIDKeyedType2CharString2 = new CIDKeyedType2CharString(this.f59253i, this.fontName, i, gIDForCID, new Type2CharStringParser(this.fontName, i).parse(bArr2, this.globalSubrIndex, m33135f(gIDForCID)), m33136e(gIDForCID), m33134g(gIDForCID));
            this.f59252h.put(Integer.valueOf(i), cIDKeyedType2CharString2);
            return cIDKeyedType2CharString2;
        }
        return cIDKeyedType2CharString;
    }
}