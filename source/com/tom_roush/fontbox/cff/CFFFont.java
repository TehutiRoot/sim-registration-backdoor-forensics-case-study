package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.fontbox.cff.CFFParser;
import com.tom_roush.fontbox.util.BoundingBox;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CFFFont implements FontBoxFont {

    /* renamed from: a */
    public CFFParser.ByteSource f59255a;
    protected byte[][] charStrings;
    protected CFFCharset charset;
    protected String fontName;
    protected byte[][] globalSubrIndex;
    protected final Map<String, Object> topDict = new LinkedHashMap();

    /* renamed from: a */
    public void m33131a(CFFCharset cFFCharset) {
        this.charset = cFFCharset;
    }

    public void addValueToTopDict(String str, Object obj) {
        if (obj != null) {
            this.topDict.put(str, obj);
        }
    }

    /* renamed from: b */
    public final void m33130b(CFFParser.ByteSource byteSource) {
        this.f59255a = byteSource;
    }

    /* renamed from: c */
    public void m33129c(byte[][] bArr) {
        this.globalSubrIndex = bArr;
    }

    /* renamed from: d */
    public void m33128d(String str) {
        this.fontName = str;
    }

    public final List<byte[]> getCharStringBytes() {
        return Arrays.asList(this.charStrings);
    }

    public CFFCharset getCharset() {
        return this.charset;
    }

    public byte[] getData() throws IOException {
        return this.f59255a.getBytes();
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public BoundingBox getFontBBox() {
        return new BoundingBox((List) this.topDict.get(AFMParser.FONT_BBOX));
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public abstract List<Number> getFontMatrix();

    public List<byte[]> getGlobalSubrIndex() {
        return Arrays.asList(this.globalSubrIndex);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public String getName() {
        return this.fontName;
    }

    public int getNumCharStrings() {
        return this.charStrings.length;
    }

    public Map<String, Object> getTopDict() {
        return this.topDict;
    }

    public abstract Type2CharString getType2CharString(int i) throws IOException;

    public String toString() {
        return getClass().getSimpleName() + "[name=" + this.fontName + ", topDict=" + this.topDict + ", charset=" + this.charset + ", charStrings=" + Arrays.deepToString(this.charStrings) + "]";
    }
}
