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
    public String f59234b;

    /* renamed from: c */
    public String f59235c;

    /* renamed from: d */
    public int f59236d;

    /* renamed from: g */
    public FDSelect f59239g;

    /* renamed from: e */
    public List f59237e = new LinkedList();

    /* renamed from: f */
    public List f59238f = new LinkedList();

    /* renamed from: h */
    public final Map f59240h = new ConcurrentHashMap();

    /* renamed from: i */
    public final C9847b f59241i = new C9847b();

    /* renamed from: com.tom_roush.fontbox.cff.CFFCIDFont$b */
    /* loaded from: classes5.dex */
    public class C9847b implements Type1CharStringReader {
        public C9847b() {
        }

        @Override // com.tom_roush.fontbox.type1.Type1CharStringReader
        public Type1CharString getType1CharString(String str) {
            return CFFCIDFont.this.getType2CharString(0);
        }
    }

    /* renamed from: e */
    public final int m33144e(int i) {
        int fDIndex = this.f59239g.getFDIndex(i);
        if (fDIndex == -1) {
            return 1000;
        }
        Map map = (Map) this.f59238f.get(fDIndex);
        if (!map.containsKey("defaultWidthX")) {
            return 1000;
        }
        return ((Number) map.get("defaultWidthX")).intValue();
    }

    /* renamed from: f */
    public final byte[][] m33143f(int i) {
        int fDIndex = this.f59239g.getFDIndex(i);
        if (fDIndex == -1) {
            return null;
        }
        return (byte[][]) ((Map) this.f59238f.get(fDIndex)).get("Subrs");
    }

    /* renamed from: g */
    public final int m33142g(int i) {
        int fDIndex = this.f59239g.getFDIndex(i);
        if (fDIndex == -1) {
            return 0;
        }
        Map map = (Map) this.f59238f.get(fDIndex);
        if (!map.containsKey("nominalWidthX")) {
            return 0;
        }
        return ((Number) map.get("nominalWidthX")).intValue();
    }

    public FDSelect getFdSelect() {
        return this.f59239g;
    }

    public List<Map<String, Object>> getFontDicts() {
        return this.f59237e;
    }

    @Override // com.tom_roush.fontbox.cff.CFFFont, com.tom_roush.fontbox.FontBoxFont
    public List<Number> getFontMatrix() {
        return (List) this.topDict.get("FontMatrix");
    }

    public String getOrdering() {
        return this.f59235c;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) throws IOException {
        return getType2CharString(m33141h(str)).getPath();
    }

    public List<Map<String, Object>> getPrivDicts() {
        return this.f59238f;
    }

    public String getRegistry() {
        return this.f59234b;
    }

    public int getSupplement() {
        return this.f59236d;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public float getWidth(String str) throws IOException {
        return getType2CharString(m33141h(str)).getWidth();
    }

    /* renamed from: h */
    public final int m33141h(String str) {
        if (str.startsWith("\\")) {
            return Integer.parseInt(str.substring(1));
        }
        throw new IllegalArgumentException("Invalid selector");
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public boolean hasGlyph(String str) throws IOException {
        if (m33141h(str) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m33140i(FDSelect fDSelect) {
        this.f59239g = fDSelect;
    }

    /* renamed from: j */
    public void m33139j(List list) {
        this.f59237e = list;
    }

    /* renamed from: k */
    public void m33138k(String str) {
        this.f59235c = str;
    }

    /* renamed from: l */
    public void m33137l(List list) {
        this.f59238f = list;
    }

    /* renamed from: m */
    public void m33136m(String str) {
        this.f59234b = str;
    }

    /* renamed from: n */
    public void m33135n(int i) {
        this.f59236d = i;
    }

    @Override // com.tom_roush.fontbox.cff.CFFFont
    public CIDKeyedType2CharString getType2CharString(int i) throws IOException {
        CIDKeyedType2CharString cIDKeyedType2CharString = (CIDKeyedType2CharString) this.f59240h.get(Integer.valueOf(i));
        if (cIDKeyedType2CharString == null) {
            int gIDForCID = this.charset.getGIDForCID(i);
            byte[][] bArr = this.charStrings;
            byte[] bArr2 = bArr[gIDForCID];
            if (bArr2 == null) {
                bArr2 = bArr[0];
            }
            CIDKeyedType2CharString cIDKeyedType2CharString2 = new CIDKeyedType2CharString(this.f59241i, this.fontName, i, gIDForCID, new Type2CharStringParser(this.fontName, i).parse(bArr2, this.globalSubrIndex, m33143f(gIDForCID)), m33144e(gIDForCID), m33142g(gIDForCID));
            this.f59240h.put(Integer.valueOf(i), cIDKeyedType2CharString2);
            return cIDKeyedType2CharString2;
        }
        return cIDKeyedType2CharString;
    }
}
