package com.tom_roush.fontbox.cff;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes5.dex */
public final class CFFOperator {

    /* renamed from: c */
    public static Map f59270c = new LinkedHashMap(52);

    /* renamed from: d */
    public static Map f59271d = new LinkedHashMap(52);

    /* renamed from: a */
    public Key f59272a = null;

    /* renamed from: b */
    public String f59273b = null;

    /* loaded from: classes5.dex */
    public static class Key {

        /* renamed from: a */
        public int[] f59274a;

        public Key(int i) {
            this(new int[]{i});
        }

        /* renamed from: a */
        public final void m33116a(int[] iArr) {
            this.f59274a = iArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return Arrays.equals(getValue(), ((Key) obj).getValue());
            }
            return false;
        }

        public int[] getValue() {
            return this.f59274a;
        }

        public int hashCode() {
            return Arrays.hashCode(getValue());
        }

        public String toString() {
            return Arrays.toString(getValue());
        }

        public Key(int i, int i2) {
            this(new int[]{i, i2});
        }

        public Key(int[] iArr) {
            this.f59274a = null;
            m33116a(iArr);
        }
    }

    static {
        m33119a(new Key(0), ClientCookie.VERSION_ATTR);
        m33119a(new Key(1), AFMParser.NOTICE);
        m33119a(new Key(12, 0), ExifInterface.TAG_COPYRIGHT);
        m33119a(new Key(2), AFMParser.FULL_NAME);
        m33119a(new Key(3), AFMParser.FAMILY_NAME);
        m33119a(new Key(4), AFMParser.WEIGHT);
        m33119a(new Key(12, 1), "isFixedPitch");
        m33119a(new Key(12, 2), AFMParser.ITALIC_ANGLE);
        m33119a(new Key(12, 3), AFMParser.UNDERLINE_POSITION);
        m33119a(new Key(12, 4), AFMParser.UNDERLINE_THICKNESS);
        m33119a(new Key(12, 5), "PaintType");
        m33119a(new Key(12, 6), "CharstringType");
        m33119a(new Key(12, 7), "FontMatrix");
        m33119a(new Key(13), "UniqueID");
        m33119a(new Key(5), AFMParser.FONT_BBOX);
        m33119a(new Key(12, 8), "StrokeWidth");
        m33119a(new Key(14), "XUID");
        m33119a(new Key(15), "charset");
        m33119a(new Key(16), "Encoding");
        m33119a(new Key(17), "CharStrings");
        m33119a(new Key(18), StandardStructureTypes.PRIVATE);
        m33119a(new Key(12, 20), "SyntheticBase");
        m33119a(new Key(12, 21), "PostScript");
        m33119a(new Key(12, 22), "BaseFontName");
        m33119a(new Key(12, 23), "BaseFontBlend");
        m33119a(new Key(12, 30), "ROS");
        m33119a(new Key(12, 31), "CIDFontVersion");
        m33119a(new Key(12, 32), "CIDFontRevision");
        m33119a(new Key(12, 33), "CIDFontType");
        m33119a(new Key(12, 34), "CIDCount");
        m33119a(new Key(12, 35), "UIDBase");
        m33119a(new Key(12, 36), "FDArray");
        m33119a(new Key(12, 37), "FDSelect");
        m33119a(new Key(12, 38), AFMParser.FONT_NAME);
        m33119a(new Key(6), "BlueValues");
        m33119a(new Key(7), "OtherBlues");
        m33119a(new Key(8), "FamilyBlues");
        m33119a(new Key(9), "FamilyOtherBlues");
        m33119a(new Key(12, 9), "BlueScale");
        m33119a(new Key(12, 10), "BlueShift");
        m33119a(new Key(12, 11), "BlueFuzz");
        m33119a(new Key(10), AFMParser.STD_HW);
        m33119a(new Key(11), AFMParser.STD_VW);
        m33119a(new Key(12, 12), "StemSnapH");
        m33119a(new Key(12, 13), "StemSnapV");
        m33119a(new Key(12, 14), "ForceBold");
        m33119a(new Key(12, 15), "LanguageGroup");
        m33119a(new Key(12, 16), "ExpansionFactor");
        m33119a(new Key(12, 17), "initialRandomSeed");
        m33119a(new Key(19), "Subrs");
        m33119a(new Key(20), "defaultWidthX");
        m33119a(new Key(21), "nominalWidthX");
    }

    public CFFOperator(Key key, String str) {
        m33118b(key);
        m33117c(str);
    }

    /* renamed from: a */
    public static void m33119a(Key key, String str) {
        CFFOperator cFFOperator = new CFFOperator(key, str);
        f59270c.put(key, cFFOperator);
        f59271d.put(str, cFFOperator);
    }

    public static CFFOperator getOperator(Key key) {
        return (CFFOperator) f59270c.get(key);
    }

    /* renamed from: b */
    public final void m33118b(Key key) {
        this.f59272a = key;
    }

    /* renamed from: c */
    public final void m33117c(String str) {
        this.f59273b = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CFFOperator) {
            return getKey().equals(((CFFOperator) obj).getKey());
        }
        return false;
    }

    public Key getKey() {
        return this.f59272a;
    }

    public String getName() {
        return this.f59273b;
    }

    public int hashCode() {
        return getKey().hashCode();
    }

    public String toString() {
        return getName();
    }

    public static CFFOperator getOperator(String str) {
        return (CFFOperator) f59271d.get(str);
    }
}