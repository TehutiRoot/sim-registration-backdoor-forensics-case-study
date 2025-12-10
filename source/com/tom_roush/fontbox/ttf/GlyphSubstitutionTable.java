package com.tom_roush.fontbox.ttf;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class GlyphSubstitutionTable extends TTFTable {
    public static final String TAG = "GSUB";

    /* renamed from: e */
    public LinkedHashMap f59418e;

    /* renamed from: f */
    public C9879e[] f59419f;

    /* renamed from: g */
    public C9884j[] f59420g;

    /* renamed from: h */
    public final Map f59421h;

    /* renamed from: i */
    public final Map f59422i;

    /* renamed from: j */
    public String f59423j;

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$a */
    /* loaded from: classes5.dex */
    public class C9875a implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ List f59424a;

        public C9875a(List list) {
            this.f59424a = list;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C9879e c9879e, C9879e c9879e2) {
            int indexOf = this.f59424a.indexOf(c9879e.f59429a);
            int indexOf2 = this.f59424a.indexOf(c9879e2.f59429a);
            if (indexOf < indexOf2) {
                return -1;
            }
            if (indexOf == indexOf2) {
                return 0;
            }
            return 1;
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC9876b {

        /* renamed from: a */
        public int f59426a;

        /* renamed from: a */
        public abstract int mo32910a(int i);
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$c */
    /* loaded from: classes5.dex */
    public static class C9877c extends AbstractC9876b {

        /* renamed from: b */
        public int[] f59427b;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.AbstractC9876b
        /* renamed from: a */
        public int mo32910a(int i) {
            return Arrays.binarySearch(this.f59427b, i);
        }

        public String toString() {
            return String.format("CoverageTableFormat1[coverageFormat=%d,glyphArray=%s]", Integer.valueOf(this.f59426a), Arrays.toString(this.f59427b));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$d */
    /* loaded from: classes5.dex */
    public static class C9878d extends AbstractC9876b {

        /* renamed from: b */
        public C9887m[] f59428b;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.AbstractC9876b
        /* renamed from: a */
        public int mo32910a(int i) {
            C9887m[] c9887mArr;
            for (C9887m c9887m : this.f59428b) {
                int i2 = c9887m.f59444a;
                if (i2 <= i && i <= c9887m.f59445b) {
                    return (c9887m.f59446c + i) - i2;
                }
            }
            return -1;
        }

        public String toString() {
            return String.format("CoverageTableFormat2[coverageFormat=%d]", Integer.valueOf(this.f59426a));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$e */
    /* loaded from: classes5.dex */
    public static class C9879e {

        /* renamed from: a */
        public String f59429a;

        /* renamed from: b */
        public C9880f f59430b;

        public String toString() {
            return String.format("FeatureRecord[featureTag=%s]", this.f59429a);
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$f */
    /* loaded from: classes5.dex */
    public static class C9880f {

        /* renamed from: a */
        public int[] f59431a;

        public String toString() {
            return String.format("FeatureTable[lookupListIndiciesCount=%d]", Integer.valueOf(this.f59431a.length));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$g */
    /* loaded from: classes5.dex */
    public static class C9881g {

        /* renamed from: a */
        public String f59432a;

        /* renamed from: b */
        public C9882h f59433b;

        public String toString() {
            return String.format("LangSysRecord[langSysTag=%s]", this.f59432a);
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$h */
    /* loaded from: classes5.dex */
    public static class C9882h {

        /* renamed from: a */
        public int f59434a;

        /* renamed from: b */
        public int[] f59435b;

        public String toString() {
            return String.format("LangSysTable[requiredFeatureIndex=%d]", Integer.valueOf(this.f59434a));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$i */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC9883i {

        /* renamed from: a */
        public int f59436a;

        /* renamed from: b */
        public AbstractC9876b f59437b;

        /* renamed from: a */
        public abstract int mo32909a(int i, int i2);
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$j */
    /* loaded from: classes5.dex */
    public static class C9884j {

        /* renamed from: a */
        public int f59438a;

        /* renamed from: b */
        public int f59439b;

        /* renamed from: c */
        public int f59440c;

        /* renamed from: d */
        public AbstractC9883i[] f59441d;

        public String toString() {
            return String.format("LookupTable[lookupType=%d,lookupFlag=%d,markFilteringSet=%d]", Integer.valueOf(this.f59438a), Integer.valueOf(this.f59439b), Integer.valueOf(this.f59440c));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$k */
    /* loaded from: classes5.dex */
    public static class C9885k extends AbstractC9883i {

        /* renamed from: c */
        public short f59442c;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.AbstractC9883i
        /* renamed from: a */
        public int mo32909a(int i, int i2) {
            if (i2 >= 0) {
                return i + this.f59442c;
            }
            return i;
        }

        public String toString() {
            return String.format("LookupTypeSingleSubstFormat1[substFormat=%d,deltaGlyphID=%d]", Integer.valueOf(this.f59436a), Short.valueOf(this.f59442c));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$l */
    /* loaded from: classes5.dex */
    public static class C9886l extends AbstractC9883i {

        /* renamed from: c */
        public int[] f59443c;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.AbstractC9883i
        /* renamed from: a */
        public int mo32909a(int i, int i2) {
            if (i2 >= 0) {
                return this.f59443c[i2];
            }
            return i;
        }

        public String toString() {
            return String.format("LookupTypeSingleSubstFormat2[substFormat=%d,substituteGlyphIDs=%s]", Integer.valueOf(this.f59436a), Arrays.toString(this.f59443c));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$m */
    /* loaded from: classes5.dex */
    public static class C9887m {

        /* renamed from: a */
        public int f59444a;

        /* renamed from: b */
        public int f59445b;

        /* renamed from: c */
        public int f59446c;

        public String toString() {
            return String.format("RangeRecord[startGlyphID=%d,endGlyphID=%d,startCoverageIndex=%d]", Integer.valueOf(this.f59444a), Integer.valueOf(this.f59445b), Integer.valueOf(this.f59446c));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$n */
    /* loaded from: classes5.dex */
    public static class C9888n {

        /* renamed from: a */
        public String f59447a;

        /* renamed from: b */
        public C9889o f59448b;

        public String toString() {
            return String.format("ScriptRecord[scriptTag=%s]", this.f59447a);
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$o */
    /* loaded from: classes5.dex */
    public static class C9889o {

        /* renamed from: a */
        public C9882h f59449a;

        /* renamed from: b */
        public LinkedHashMap f59450b;

        public String toString() {
            boolean z;
            if (this.f59449a != null) {
                z = true;
            } else {
                z = false;
            }
            return String.format("ScriptTable[hasDefault=%s,langSysRecordsCount=%d]", Boolean.valueOf(z), Integer.valueOf(this.f59450b.size()));
        }
    }

    public GlyphSubstitutionTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.f59421h = new HashMap();
        this.f59422i = new HashMap();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        long mo858b = abstractC22790wQ1.mo858b();
        abstractC22790wQ1.mo844t();
        int mo844t = abstractC22790wQ1.mo844t();
        int mo844t2 = abstractC22790wQ1.mo844t();
        int mo844t3 = abstractC22790wQ1.mo844t();
        int mo844t4 = abstractC22790wQ1.mo844t();
        if (mo844t == 1) {
            abstractC22790wQ1.m845s();
        }
        this.f59418e = m32915s(abstractC22790wQ1, mo844t2 + mo858b);
        this.f59419f = m32922l(abstractC22790wQ1, mo844t3 + mo858b);
        this.f59420g = m32919o(abstractC22790wQ1, mo858b + mo844t4);
    }

    /* renamed from: f */
    public final int m32928f(C9879e c9879e, int i) {
        for (int i2 : c9879e.f59430b.f59431a) {
            C9884j c9884j = this.f59420g[i2];
            if (c9884j.f59438a != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping GSUB feature '");
                sb.append(c9879e.f59429a);
                sb.append("' because it requires unsupported lookup table type ");
                sb.append(c9884j.f59438a);
            } else {
                i = m32926h(c9884j, i);
            }
        }
        return i;
    }

    /* renamed from: g */
    public final boolean m32927g(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C9879e) it.next()).f59429a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int getSubstitution(int i, String[] strArr, List<String> list) {
        if (i == -1) {
            return -1;
        }
        Integer num = (Integer) this.f59421h.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        int i2 = i;
        for (C9879e c9879e : m32925i(m32924j(m32912v(strArr)), list)) {
            i2 = m32928f(c9879e, i2);
        }
        this.f59421h.put(Integer.valueOf(i), Integer.valueOf(i2));
        this.f59422i.put(Integer.valueOf(i2), Integer.valueOf(i));
        return i2;
    }

    public int getUnsubstitution(int i) {
        Integer num = (Integer) this.f59422i.get(Integer.valueOf(i));
        if (num == null) {
            Log.w("PdfBox-Android", "Trying to un-substitute a never-before-seen gid: " + i);
            return i;
        }
        return num.intValue();
    }

    /* renamed from: h */
    public final int m32926h(C9884j c9884j, int i) {
        AbstractC9883i[] abstractC9883iArr;
        for (AbstractC9883i abstractC9883i : c9884j.f59441d) {
            int mo32910a = abstractC9883i.f59437b.mo32910a(i);
            if (mo32910a >= 0) {
                return abstractC9883i.mo32909a(i, mo32910a);
            }
        }
        return i;
    }

    /* renamed from: i */
    public final List m32925i(Collection collection, List list) {
        int[] iArr;
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C9882h c9882h = (C9882h) it.next();
            int i = c9882h.f59434a;
            if (i != 65535) {
                C9879e[] c9879eArr = this.f59419f;
                if (i < c9879eArr.length) {
                    arrayList.add(c9879eArr[i]);
                }
            }
            for (int i2 : c9882h.f59435b) {
                C9879e[] c9879eArr2 = this.f59419f;
                if (i2 < c9879eArr2.length && (list == null || list.contains(c9879eArr2[i2].f59429a))) {
                    arrayList.add(this.f59419f[i2]);
                }
            }
        }
        if (m32927g(arrayList, "vrt2")) {
            m32913u(arrayList, "vert");
        }
        if (list != null && arrayList.size() > 1) {
            Collections.sort(arrayList, new C9875a(list));
        }
        return arrayList;
    }

    /* renamed from: j */
    public final Collection m32924j(String str) {
        List emptyList = Collections.emptyList();
        C9889o c9889o = (C9889o) this.f59418e.get(str);
        if (c9889o != null) {
            if (c9889o.f59449a == null) {
                return c9889o.f59450b.values();
            }
            ArrayList arrayList = new ArrayList(c9889o.f59450b.values());
            arrayList.add(c9889o.f59449a);
            return arrayList;
        }
        return emptyList;
    }

    /* renamed from: k */
    public AbstractC9876b m32923k(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        int mo844t = abstractC22790wQ1.mo844t();
        int i = 0;
        if (mo844t != 1) {
            if (mo844t == 2) {
                C9878d c9878d = new C9878d();
                c9878d.f59426a = mo844t;
                int mo844t2 = abstractC22790wQ1.mo844t();
                c9878d.f59428b = new C9887m[mo844t2];
                while (i < mo844t2) {
                    c9878d.f59428b[i] = m32916r(abstractC22790wQ1);
                    i++;
                }
                return c9878d;
            }
            throw new IOException("Unknown coverage format: " + mo844t);
        }
        C9877c c9877c = new C9877c();
        c9877c.f59426a = mo844t;
        int mo844t3 = abstractC22790wQ1.mo844t();
        c9877c.f59427b = new int[mo844t3];
        while (i < mo844t3) {
            c9877c.f59427b[i] = abstractC22790wQ1.mo844t();
            i++;
        }
        return c9877c;
    }

    /* renamed from: l */
    public C9879e[] m32922l(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        int mo844t = abstractC22790wQ1.mo844t();
        C9879e[] c9879eArr = new C9879e[mo844t];
        int[] iArr = new int[mo844t];
        String str = "";
        for (int i = 0; i < mo844t; i++) {
            C9879e c9879e = new C9879e();
            String m850n = abstractC22790wQ1.m850n(4);
            c9879e.f59429a = m850n;
            if (i > 0 && m850n.compareTo(str) < 0) {
                if (c9879e.f59429a.matches("\\w{4}") && str.matches("\\w{4}")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FeatureRecord array not alphabetically sorted by FeatureTag: ");
                    sb.append(c9879e.f59429a);
                    sb.append(" < ");
                    sb.append(str);
                } else {
                    Log.w("PdfBox-Android", "FeatureRecord array not alphabetically sorted by FeatureTag: " + c9879e.f59429a + " < " + str);
                    return new C9879e[0];
                }
            }
            iArr[i] = abstractC22790wQ1.mo844t();
            c9879eArr[i] = c9879e;
            str = c9879e.f59429a;
        }
        for (int i2 = 0; i2 < mo844t; i2++) {
            c9879eArr[i2].f59430b = m32921m(abstractC22790wQ1, iArr[i2] + j);
        }
        return c9879eArr;
    }

    /* renamed from: m */
    public C9880f m32921m(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        C9880f c9880f = new C9880f();
        abstractC22790wQ1.mo844t();
        int mo844t = abstractC22790wQ1.mo844t();
        c9880f.f59431a = new int[mo844t];
        for (int i = 0; i < mo844t; i++) {
            c9880f.f59431a[i] = abstractC22790wQ1.mo844t();
        }
        return c9880f;
    }

    /* renamed from: n */
    public C9882h m32920n(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        C9882h c9882h = new C9882h();
        abstractC22790wQ1.mo844t();
        c9882h.f59434a = abstractC22790wQ1.mo844t();
        int mo844t = abstractC22790wQ1.mo844t();
        c9882h.f59435b = new int[mo844t];
        for (int i = 0; i < mo844t; i++) {
            c9882h.f59435b[i] = abstractC22790wQ1.mo844t();
        }
        return c9882h;
    }

    /* renamed from: o */
    public C9884j[] m32919o(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        int mo844t = abstractC22790wQ1.mo844t();
        int[] iArr = new int[mo844t];
        for (int i = 0; i < mo844t; i++) {
            iArr[i] = abstractC22790wQ1.mo844t();
        }
        C9884j[] c9884jArr = new C9884j[mo844t];
        for (int i2 = 0; i2 < mo844t; i2++) {
            c9884jArr[i2] = m32917q(abstractC22790wQ1, iArr[i2] + j);
        }
        return c9884jArr;
    }

    /* renamed from: p */
    public AbstractC9883i m32918p(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        int mo844t = abstractC22790wQ1.mo844t();
        if (mo844t != 1) {
            if (mo844t == 2) {
                C9886l c9886l = new C9886l();
                c9886l.f59436a = mo844t;
                int mo844t2 = abstractC22790wQ1.mo844t();
                int mo844t3 = abstractC22790wQ1.mo844t();
                c9886l.f59443c = new int[mo844t3];
                for (int i = 0; i < mo844t3; i++) {
                    c9886l.f59443c[i] = abstractC22790wQ1.mo844t();
                }
                c9886l.f59437b = m32923k(abstractC22790wQ1, j + mo844t2);
                return c9886l;
            }
            throw new IOException("Unknown substFormat: " + mo844t);
        }
        C9885k c9885k = new C9885k();
        c9885k.f59436a = mo844t;
        int mo844t4 = abstractC22790wQ1.mo844t();
        c9885k.f59442c = abstractC22790wQ1.mo851m();
        c9885k.f59437b = m32923k(abstractC22790wQ1, j + mo844t4);
        return c9885k;
    }

    /* renamed from: q */
    public C9884j m32917q(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        C9884j c9884j = new C9884j();
        c9884j.f59438a = abstractC22790wQ1.mo844t();
        c9884j.f59439b = abstractC22790wQ1.mo844t();
        int mo844t = abstractC22790wQ1.mo844t();
        int[] iArr = new int[mo844t];
        for (int i = 0; i < mo844t; i++) {
            iArr[i] = abstractC22790wQ1.mo844t();
        }
        if ((c9884j.f59439b & 16) != 0) {
            c9884j.f59440c = abstractC22790wQ1.mo844t();
        }
        c9884j.f59441d = new AbstractC9883i[mo844t];
        if (c9884j.f59438a != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Type ");
            sb.append(c9884j.f59438a);
            sb.append(" GSUB lookup table is not supported and will be ignored");
        } else {
            for (int i2 = 0; i2 < mo844t; i2++) {
                c9884j.f59441d[i2] = m32918p(abstractC22790wQ1, iArr[i2] + j);
            }
        }
        return c9884j;
    }

    /* renamed from: r */
    public C9887m m32916r(AbstractC22790wQ1 abstractC22790wQ1) {
        C9887m c9887m = new C9887m();
        c9887m.f59444a = abstractC22790wQ1.mo844t();
        c9887m.f59445b = abstractC22790wQ1.mo844t();
        c9887m.f59446c = abstractC22790wQ1.mo844t();
        return c9887m;
    }

    /* renamed from: s */
    public LinkedHashMap m32915s(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        int mo844t = abstractC22790wQ1.mo844t();
        C9888n[] c9888nArr = new C9888n[mo844t];
        int[] iArr = new int[mo844t];
        for (int i = 0; i < mo844t; i++) {
            C9888n c9888n = new C9888n();
            c9888n.f59447a = abstractC22790wQ1.m850n(4);
            iArr[i] = abstractC22790wQ1.mo844t();
            c9888nArr[i] = c9888n;
        }
        for (int i2 = 0; i2 < mo844t; i2++) {
            c9888nArr[i2].f59448b = m32914t(abstractC22790wQ1, iArr[i2] + j);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mo844t);
        for (int i3 = 0; i3 < mo844t; i3++) {
            C9888n c9888n2 = c9888nArr[i3];
            linkedHashMap.put(c9888n2.f59447a, c9888n2.f59448b);
        }
        return linkedHashMap;
    }

    /* renamed from: t */
    public C9889o m32914t(AbstractC22790wQ1 abstractC22790wQ1, long j) {
        abstractC22790wQ1.seek(j);
        C9889o c9889o = new C9889o();
        int mo844t = abstractC22790wQ1.mo844t();
        int mo844t2 = abstractC22790wQ1.mo844t();
        C9881g[] c9881gArr = new C9881g[mo844t2];
        int[] iArr = new int[mo844t2];
        String str = "";
        for (int i = 0; i < mo844t2; i++) {
            C9881g c9881g = new C9881g();
            String m850n = abstractC22790wQ1.m850n(4);
            c9881g.f59432a = m850n;
            if (i > 0 && m850n.compareTo(str) <= 0) {
                throw new IOException("LangSysRecords not alphabetically sorted by LangSys tag: " + c9881g.f59432a + " <= " + str);
            }
            iArr[i] = abstractC22790wQ1.mo844t();
            c9881gArr[i] = c9881g;
            str = c9881g.f59432a;
        }
        if (mo844t != 0) {
            c9889o.f59449a = m32920n(abstractC22790wQ1, mo844t + j);
        }
        for (int i2 = 0; i2 < mo844t2; i2++) {
            c9881gArr[i2].f59433b = m32920n(abstractC22790wQ1, iArr[i2] + j);
        }
        c9889o.f59450b = new LinkedHashMap(mo844t2);
        for (int i3 = 0; i3 < mo844t2; i3++) {
            C9881g c9881g2 = c9881gArr[i3];
            c9889o.f59450b.put(c9881g2.f59432a, c9881g2.f59433b);
        }
        return c9889o;
    }

    /* renamed from: u */
    public final void m32913u(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C9879e) it.next()).f59429a.equals(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: v */
    public final String m32912v(String[] strArr) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if (OpenTypeScript.INHERITED.equals(str) || (OpenTypeScript.TAG_DEFAULT.equals(str) && !this.f59418e.containsKey(str))) {
                if (this.f59423j == null) {
                    this.f59423j = (String) this.f59418e.keySet().iterator().next();
                }
                return this.f59423j;
            }
        }
        for (String str2 : strArr) {
            if (this.f59418e.containsKey(str2)) {
                this.f59423j = str2;
                return str2;
            }
        }
        return strArr[0];
    }
}
