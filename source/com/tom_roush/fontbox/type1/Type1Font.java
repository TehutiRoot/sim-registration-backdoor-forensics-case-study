package com.tom_roush.fontbox.type1;

import android.graphics.Path;
import com.tom_roush.fontbox.EncodedFont;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.cff.Type1CharString;
import com.tom_roush.fontbox.cff.Type1CharStringParser;
import com.tom_roush.fontbox.encoding.Encoding;
import com.tom_roush.fontbox.pfb.PfbParser;
import com.tom_roush.fontbox.util.BoundingBox;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class Type1Font implements Type1CharStringReader, EncodedFont, FontBoxFont {

    /* renamed from: D */
    public boolean f59648D;

    /* renamed from: E */
    public int f59649E;

    /* renamed from: I */
    public final byte[] f59653I;

    /* renamed from: J */
    public final byte[] f59654J;

    /* renamed from: c */
    public int f59657c;

    /* renamed from: d */
    public int f59658d;

    /* renamed from: g */
    public int f59661g;

    /* renamed from: h */
    public float f59662h;

    /* renamed from: o */
    public float f59669o;

    /* renamed from: p */
    public boolean f59670p;

    /* renamed from: q */
    public float f59671q;

    /* renamed from: r */
    public float f59672r;

    /* renamed from: w */
    public float f59677w;

    /* renamed from: x */
    public int f59678x;

    /* renamed from: y */
    public int f59679y;

    /* renamed from: a */
    public String f59655a = "";

    /* renamed from: b */
    public Encoding f59656b = null;

    /* renamed from: e */
    public List f59659e = new ArrayList();

    /* renamed from: f */
    public List f59660f = new ArrayList();

    /* renamed from: i */
    public String f59663i = "";

    /* renamed from: j */
    public String f59664j = "";

    /* renamed from: k */
    public String f59665k = "";

    /* renamed from: l */
    public String f59666l = "";

    /* renamed from: m */
    public String f59667m = "";

    /* renamed from: n */
    public String f59668n = "";

    /* renamed from: s */
    public List f59673s = new ArrayList();

    /* renamed from: t */
    public List f59674t = new ArrayList();

    /* renamed from: u */
    public List f59675u = new ArrayList();

    /* renamed from: v */
    public List f59676v = new ArrayList();

    /* renamed from: z */
    public List f59680z = new ArrayList();

    /* renamed from: A */
    public List f59645A = new ArrayList();

    /* renamed from: B */
    public List f59646B = new ArrayList();

    /* renamed from: C */
    public List f59647C = new ArrayList();

    /* renamed from: F */
    public final List f59650F = new ArrayList();

    /* renamed from: G */
    public final Map f59651G = new LinkedHashMap();

    /* renamed from: H */
    public final Map f59652H = new ConcurrentHashMap();

    public Type1Font(byte[] bArr, byte[] bArr2) {
        this.f59653I = bArr;
        this.f59654J = bArr2;
    }

    public static Type1Font createWithPFB(InputStream inputStream) throws IOException {
        PfbParser pfbParser = new PfbParser(inputStream);
        return new C9895b().m32828e(pfbParser.getSegment1(), pfbParser.getSegment2());
    }

    public static Type1Font createWithSegments(byte[] bArr, byte[] bArr2) throws IOException {
        return new C9895b().m32828e(bArr, bArr2);
    }

    public byte[] getASCIISegment() {
        return this.f59653I;
    }

    public byte[] getBinarySegment() {
        return this.f59654J;
    }

    public int getBlueFuzz() {
        return this.f59679y;
    }

    public float getBlueScale() {
        return this.f59677w;
    }

    public int getBlueShift() {
        return this.f59678x;
    }

    public List<Number> getBlueValues() {
        return Collections.unmodifiableList(this.f59673s);
    }

    public Map<String, byte[]> getCharStringsDict() {
        return Collections.unmodifiableMap(this.f59651G);
    }

    @Override // com.tom_roush.fontbox.EncodedFont
    public Encoding getEncoding() {
        return this.f59656b;
    }

    public List<Number> getFamilyBlues() {
        return Collections.unmodifiableList(this.f59675u);
    }

    public String getFamilyName() {
        return this.f59667m;
    }

    public List<Number> getFamilyOtherBlues() {
        return Collections.unmodifiableList(this.f59676v);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public BoundingBox getFontBBox() {
        return new BoundingBox(this.f59660f);
    }

    public String getFontID() {
        return this.f59663i;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public List<Number> getFontMatrix() {
        return Collections.unmodifiableList(this.f59659e);
    }

    public String getFontName() {
        return this.f59655a;
    }

    public int getFontType() {
        return this.f59658d;
    }

    public String getFullName() {
        return this.f59666l;
    }

    public float getItalicAngle() {
        return this.f59669o;
    }

    public int getLanguageGroup() {
        return this.f59649E;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public String getName() {
        return this.f59655a;
    }

    public String getNotice() {
        return this.f59665k;
    }

    public List<Number> getOtherBlues() {
        return Collections.unmodifiableList(this.f59674t);
    }

    public int getPaintType() {
        return this.f59657c;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) throws IOException {
        return getType1CharString(str).getPath();
    }

    public List<Number> getStdHW() {
        return Collections.unmodifiableList(this.f59680z);
    }

    public List<Number> getStdVW() {
        return Collections.unmodifiableList(this.f59645A);
    }

    public List<Number> getStemSnapH() {
        return Collections.unmodifiableList(this.f59646B);
    }

    public List<Number> getStemSnapV() {
        return Collections.unmodifiableList(this.f59647C);
    }

    public float getStrokeWidth() {
        return this.f59662h;
    }

    public List<byte[]> getSubrsArray() {
        return Collections.unmodifiableList(this.f59650F);
    }

    @Override // com.tom_roush.fontbox.type1.Type1CharStringReader
    public Type1CharString getType1CharString(String str) throws IOException {
        Type1CharString type1CharString = (Type1CharString) this.f59652H.get(str);
        if (type1CharString == null) {
            byte[] bArr = (byte[]) this.f59651G.get(str);
            if (bArr == null) {
                bArr = (byte[]) this.f59651G.get(".notdef");
            }
            Type1CharString type1CharString2 = new Type1CharString(this, this.f59655a, str, new Type1CharStringParser(this.f59655a, str).parse(bArr, this.f59650F));
            this.f59652H.put(str, type1CharString2);
            return type1CharString2;
        }
        return type1CharString;
    }

    public float getUnderlinePosition() {
        return this.f59671q;
    }

    public float getUnderlineThickness() {
        return this.f59672r;
    }

    public int getUniqueID() {
        return this.f59661g;
    }

    public String getVersion() {
        return this.f59664j;
    }

    public String getWeight() {
        return this.f59668n;
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public float getWidth(String str) throws IOException {
        return getType1CharString(str).getWidth();
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public boolean hasGlyph(String str) {
        if (this.f59651G.get(str) != null) {
            return true;
        }
        return false;
    }

    public boolean isFixedPitch() {
        return this.f59670p;
    }

    public boolean isForceBold() {
        return this.f59648D;
    }

    public String toString() {
        return Type1Font.class.getName() + "[fontName=" + this.f59655a + ", fullName=" + this.f59666l + ", encoding=" + this.f59656b + ", charStringsDict=" + this.f59651G + "]";
    }

    public static Type1Font createWithPFB(byte[] bArr) throws IOException {
        PfbParser pfbParser = new PfbParser(bArr);
        return new C9895b().m32828e(pfbParser.getSegment1(), pfbParser.getSegment2());
    }
}
