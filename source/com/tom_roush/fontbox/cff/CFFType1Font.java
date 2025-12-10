package com.tom_roush.fontbox.cff;

import android.graphics.Path;
import com.tom_roush.fontbox.EncodedFont;
import com.tom_roush.fontbox.type1.Type1CharStringReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class CFFType1Font extends CFFFont implements EncodedFont {

    /* renamed from: c */
    public CFFEncoding f59303c;

    /* renamed from: b */
    public final Map f59302b = new LinkedHashMap();

    /* renamed from: d */
    public final Map f59304d = new ConcurrentHashMap();

    /* renamed from: e */
    public final C9866b f59305e = new C9866b();

    /* renamed from: com.tom_roush.fontbox.cff.CFFType1Font$b */
    /* loaded from: classes5.dex */
    public class C9866b implements Type1CharStringReader {
        public C9866b() {
        }

        @Override // com.tom_roush.fontbox.type1.Type1CharStringReader
        public Type1CharString getType1CharString(String str) {
            return CFFType1Font.this.getType1CharString(str);
        }
    }

    /* renamed from: e */
    public void m33033e(String str, Object obj) {
        if (obj != null) {
            this.f59302b.put(str, obj);
        }
    }

    /* renamed from: f */
    public final int m33032f() {
        Number number = (Number) m33029i("defaultWidthX");
        if (number == null) {
            return 1000;
        }
        return number.intValue();
    }

    /* renamed from: g */
    public final byte[][] m33031g() {
        return (byte[][]) this.f59302b.get("Subrs");
    }

    @Override // com.tom_roush.fontbox.cff.CFFFont, com.tom_roush.fontbox.FontBoxFont
    public List<Number> getFontMatrix() {
        return (List) this.topDict.get("FontMatrix");
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) throws IOException {
        return getType1CharString(str).getPath();
    }

    public Map<String, Object> getPrivateDict() {
        return this.f59302b;
    }

    public Type1CharString getType1CharString(String str) throws IOException {
        return m33028j(nameToGID(str), str);
    }

    @Override // com.tom_roush.fontbox.cff.CFFFont
    public Type2CharString getType2CharString(int i) throws IOException {
        return m33028j(i, "GID+" + i);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public float getWidth(String str) throws IOException {
        return getType1CharString(str).getWidth();
    }

    /* renamed from: h */
    public final int m33030h() {
        Number number = (Number) m33029i("nominalWidthX");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public boolean hasGlyph(String str) {
        if (this.charset.m33134a(this.charset.m33133b(str)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final Object m33029i(String str) {
        Object obj = this.topDict.get(str);
        if (obj != null) {
            return obj;
        }
        return this.f59302b.get(str);
    }

    /* renamed from: j */
    public final Type2CharString m33028j(int i, String str) {
        byte[] bArr;
        Type2CharString type2CharString = (Type2CharString) this.f59304d.get(Integer.valueOf(i));
        if (type2CharString == null) {
            byte[][] bArr2 = this.charStrings;
            if (i < bArr2.length) {
                bArr = bArr2[i];
            } else {
                bArr = null;
            }
            if (bArr == null) {
                bArr = bArr2[0];
            }
            Type2CharString type2CharString2 = new Type2CharString(this.f59305e, this.fontName, str, i, new Type2CharStringParser(this.fontName, str).parse(bArr, this.globalSubrIndex, m33031g()), m33032f(), m33030h());
            this.f59304d.put(Integer.valueOf(i), type2CharString2);
            return type2CharString2;
        }
        return type2CharString;
    }

    /* renamed from: k */
    public void m33027k(CFFEncoding cFFEncoding) {
        this.f59303c = cFFEncoding;
    }

    public int nameToGID(String str) {
        return this.charset.m33134a(this.charset.m33133b(str));
    }

    @Override // com.tom_roush.fontbox.EncodedFont
    public CFFEncoding getEncoding() {
        return this.f59303c;
    }
}
