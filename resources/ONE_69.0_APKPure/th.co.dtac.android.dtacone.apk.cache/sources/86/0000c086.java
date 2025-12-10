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
    public LinkedHashMap f59430e;

    /* renamed from: f */
    public C9868e[] f59431f;

    /* renamed from: g */
    public C9873j[] f59432g;

    /* renamed from: h */
    public final Map f59433h;

    /* renamed from: i */
    public final Map f59434i;

    /* renamed from: j */
    public String f59435j;

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$a */
    /* loaded from: classes5.dex */
    public class C9864a implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ List f59436a;

        public C9864a(List list) {
            this.f59436a = list;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C9868e c9868e, C9868e c9868e2) {
            int indexOf = this.f59436a.indexOf(c9868e.f59441a);
            int indexOf2 = this.f59436a.indexOf(c9868e2.f59441a);
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
    public static abstract class AbstractC9865b {

        /* renamed from: a */
        public int f59438a;

        /* renamed from: a */
        public abstract int mo32902a(int i);
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$c */
    /* loaded from: classes5.dex */
    public static class C9866c extends AbstractC9865b {

        /* renamed from: b */
        public int[] f59439b;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.AbstractC9865b
        /* renamed from: a */
        public int mo32902a(int i) {
            return Arrays.binarySearch(this.f59439b, i);
        }

        public String toString() {
            return String.format("CoverageTableFormat1[coverageFormat=%d,glyphArray=%s]", Integer.valueOf(this.f59438a), Arrays.toString(this.f59439b));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$d */
    /* loaded from: classes5.dex */
    public static class C9867d extends AbstractC9865b {

        /* renamed from: b */
        public C9876m[] f59440b;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.AbstractC9865b
        /* renamed from: a */
        public int mo32902a(int i) {
            C9876m[] c9876mArr;
            for (C9876m c9876m : this.f59440b) {
                int i2 = c9876m.f59456a;
                if (i2 <= i && i <= c9876m.f59457b) {
                    return (c9876m.f59458c + i) - i2;
                }
            }
            return -1;
        }

        public String toString() {
            return String.format("CoverageTableFormat2[coverageFormat=%d]", Integer.valueOf(this.f59438a));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$e */
    /* loaded from: classes5.dex */
    public static class C9868e {

        /* renamed from: a */
        public String f59441a;

        /* renamed from: b */
        public C9869f f59442b;

        public String toString() {
            return String.format("FeatureRecord[featureTag=%s]", this.f59441a);
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$f */
    /* loaded from: classes5.dex */
    public static class C9869f {

        /* renamed from: a */
        public int[] f59443a;

        public String toString() {
            return String.format("FeatureTable[lookupListIndiciesCount=%d]", Integer.valueOf(this.f59443a.length));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$g */
    /* loaded from: classes5.dex */
    public static class C9870g {

        /* renamed from: a */
        public String f59444a;

        /* renamed from: b */
        public C9871h f59445b;

        public String toString() {
            return String.format("LangSysRecord[langSysTag=%s]", this.f59444a);
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$h */
    /* loaded from: classes5.dex */
    public static class C9871h {

        /* renamed from: a */
        public int f59446a;

        /* renamed from: b */
        public int[] f59447b;

        public String toString() {
            return String.format("LangSysTable[requiredFeatureIndex=%d]", Integer.valueOf(this.f59446a));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$i */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC9872i {

        /* renamed from: a */
        public int f59448a;

        /* renamed from: b */
        public AbstractC9865b f59449b;

        /* renamed from: a */
        public abstract int mo32901a(int i, int i2);
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$j */
    /* loaded from: classes5.dex */
    public static class C9873j {

        /* renamed from: a */
        public int f59450a;

        /* renamed from: b */
        public int f59451b;

        /* renamed from: c */
        public int f59452c;

        /* renamed from: d */
        public AbstractC9872i[] f59453d;

        public String toString() {
            return String.format("LookupTable[lookupType=%d,lookupFlag=%d,markFilteringSet=%d]", Integer.valueOf(this.f59450a), Integer.valueOf(this.f59451b), Integer.valueOf(this.f59452c));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$k */
    /* loaded from: classes5.dex */
    public static class C9874k extends AbstractC9872i {

        /* renamed from: c */
        public short f59454c;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.AbstractC9872i
        /* renamed from: a */
        public int mo32901a(int i, int i2) {
            if (i2 >= 0) {
                return i + this.f59454c;
            }
            return i;
        }

        public String toString() {
            return String.format("LookupTypeSingleSubstFormat1[substFormat=%d,deltaGlyphID=%d]", Integer.valueOf(this.f59448a), Short.valueOf(this.f59454c));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$l */
    /* loaded from: classes5.dex */
    public static class C9875l extends AbstractC9872i {

        /* renamed from: c */
        public int[] f59455c;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.AbstractC9872i
        /* renamed from: a */
        public int mo32901a(int i, int i2) {
            if (i2 >= 0) {
                return this.f59455c[i2];
            }
            return i;
        }

        public String toString() {
            return String.format("LookupTypeSingleSubstFormat2[substFormat=%d,substituteGlyphIDs=%s]", Integer.valueOf(this.f59448a), Arrays.toString(this.f59455c));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$m */
    /* loaded from: classes5.dex */
    public static class C9876m {

        /* renamed from: a */
        public int f59456a;

        /* renamed from: b */
        public int f59457b;

        /* renamed from: c */
        public int f59458c;

        public String toString() {
            return String.format("RangeRecord[startGlyphID=%d,endGlyphID=%d,startCoverageIndex=%d]", Integer.valueOf(this.f59456a), Integer.valueOf(this.f59457b), Integer.valueOf(this.f59458c));
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$n */
    /* loaded from: classes5.dex */
    public static class C9877n {

        /* renamed from: a */
        public String f59459a;

        /* renamed from: b */
        public C9878o f59460b;

        public String toString() {
            return String.format("ScriptRecord[scriptTag=%s]", this.f59459a);
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable$o */
    /* loaded from: classes5.dex */
    public static class C9878o {

        /* renamed from: a */
        public C9871h f59461a;

        /* renamed from: b */
        public LinkedHashMap f59462b;

        public String toString() {
            boolean z;
            if (this.f59461a != null) {
                z = true;
            } else {
                z = false;
            }
            return String.format("ScriptTable[hasDefault=%s,langSysRecordsCount=%d]", Boolean.valueOf(z), Integer.valueOf(this.f59462b.size()));
        }
    }

    public GlyphSubstitutionTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.f59433h = new HashMap();
        this.f59434i = new HashMap();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        long mo22693b = abstractC22342tR1.mo22693b();
        abstractC22342tR1.mo22679t();
        int mo22679t = abstractC22342tR1.mo22679t();
        int mo22679t2 = abstractC22342tR1.mo22679t();
        int mo22679t3 = abstractC22342tR1.mo22679t();
        int mo22679t4 = abstractC22342tR1.mo22679t();
        if (mo22679t == 1) {
            abstractC22342tR1.m22680s();
        }
        this.f59430e = m32907s(abstractC22342tR1, mo22679t2 + mo22693b);
        this.f59431f = m32914l(abstractC22342tR1, mo22679t3 + mo22693b);
        this.f59432g = m32911o(abstractC22342tR1, mo22693b + mo22679t4);
    }

    /* renamed from: f */
    public final int m32920f(C9868e c9868e, int i) {
        for (int i2 : c9868e.f59442b.f59443a) {
            C9873j c9873j = this.f59432g[i2];
            if (c9873j.f59450a != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping GSUB feature '");
                sb.append(c9868e.f59441a);
                sb.append("' because it requires unsupported lookup table type ");
                sb.append(c9873j.f59450a);
            } else {
                i = m32918h(c9873j, i);
            }
        }
        return i;
    }

    /* renamed from: g */
    public final boolean m32919g(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C9868e) it.next()).f59441a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int getSubstitution(int i, String[] strArr, List<String> list) {
        if (i == -1) {
            return -1;
        }
        Integer num = (Integer) this.f59433h.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        int i2 = i;
        for (C9868e c9868e : m32917i(m32916j(m32904v(strArr)), list)) {
            i2 = m32920f(c9868e, i2);
        }
        this.f59433h.put(Integer.valueOf(i), Integer.valueOf(i2));
        this.f59434i.put(Integer.valueOf(i2), Integer.valueOf(i));
        return i2;
    }

    public int getUnsubstitution(int i) {
        Integer num = (Integer) this.f59434i.get(Integer.valueOf(i));
        if (num == null) {
            Log.w("PdfBox-Android", "Trying to un-substitute a never-before-seen gid: " + i);
            return i;
        }
        return num.intValue();
    }

    /* renamed from: h */
    public final int m32918h(C9873j c9873j, int i) {
        AbstractC9872i[] abstractC9872iArr;
        for (AbstractC9872i abstractC9872i : c9873j.f59453d) {
            int mo32902a = abstractC9872i.f59449b.mo32902a(i);
            if (mo32902a >= 0) {
                return abstractC9872i.mo32901a(i, mo32902a);
            }
        }
        return i;
    }

    /* renamed from: i */
    public final List m32917i(Collection collection, List list) {
        int[] iArr;
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C9871h c9871h = (C9871h) it.next();
            int i = c9871h.f59446a;
            if (i != 65535) {
                C9868e[] c9868eArr = this.f59431f;
                if (i < c9868eArr.length) {
                    arrayList.add(c9868eArr[i]);
                }
            }
            for (int i2 : c9871h.f59447b) {
                C9868e[] c9868eArr2 = this.f59431f;
                if (i2 < c9868eArr2.length && (list == null || list.contains(c9868eArr2[i2].f59441a))) {
                    arrayList.add(this.f59431f[i2]);
                }
            }
        }
        if (m32919g(arrayList, "vrt2")) {
            m32905u(arrayList, "vert");
        }
        if (list != null && arrayList.size() > 1) {
            Collections.sort(arrayList, new C9864a(list));
        }
        return arrayList;
    }

    /* renamed from: j */
    public final Collection m32916j(String str) {
        List emptyList = Collections.emptyList();
        C9878o c9878o = (C9878o) this.f59430e.get(str);
        if (c9878o != null) {
            if (c9878o.f59461a == null) {
                return c9878o.f59462b.values();
            }
            ArrayList arrayList = new ArrayList(c9878o.f59462b.values());
            arrayList.add(c9878o.f59461a);
            return arrayList;
        }
        return emptyList;
    }

    /* renamed from: k */
    public AbstractC9865b m32915k(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        int mo22679t = abstractC22342tR1.mo22679t();
        int i = 0;
        if (mo22679t != 1) {
            if (mo22679t == 2) {
                C9867d c9867d = new C9867d();
                c9867d.f59438a = mo22679t;
                int mo22679t2 = abstractC22342tR1.mo22679t();
                c9867d.f59440b = new C9876m[mo22679t2];
                while (i < mo22679t2) {
                    c9867d.f59440b[i] = m32908r(abstractC22342tR1);
                    i++;
                }
                return c9867d;
            }
            throw new IOException("Unknown coverage format: " + mo22679t);
        }
        C9866c c9866c = new C9866c();
        c9866c.f59438a = mo22679t;
        int mo22679t3 = abstractC22342tR1.mo22679t();
        c9866c.f59439b = new int[mo22679t3];
        while (i < mo22679t3) {
            c9866c.f59439b[i] = abstractC22342tR1.mo22679t();
            i++;
        }
        return c9866c;
    }

    /* renamed from: l */
    public C9868e[] m32914l(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        int mo22679t = abstractC22342tR1.mo22679t();
        C9868e[] c9868eArr = new C9868e[mo22679t];
        int[] iArr = new int[mo22679t];
        String str = "";
        for (int i = 0; i < mo22679t; i++) {
            C9868e c9868e = new C9868e();
            String m22685n = abstractC22342tR1.m22685n(4);
            c9868e.f59441a = m22685n;
            if (i > 0 && m22685n.compareTo(str) < 0) {
                if (c9868e.f59441a.matches("\\w{4}") && str.matches("\\w{4}")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FeatureRecord array not alphabetically sorted by FeatureTag: ");
                    sb.append(c9868e.f59441a);
                    sb.append(" < ");
                    sb.append(str);
                } else {
                    Log.w("PdfBox-Android", "FeatureRecord array not alphabetically sorted by FeatureTag: " + c9868e.f59441a + " < " + str);
                    return new C9868e[0];
                }
            }
            iArr[i] = abstractC22342tR1.mo22679t();
            c9868eArr[i] = c9868e;
            str = c9868e.f59441a;
        }
        for (int i2 = 0; i2 < mo22679t; i2++) {
            c9868eArr[i2].f59442b = m32913m(abstractC22342tR1, iArr[i2] + j);
        }
        return c9868eArr;
    }

    /* renamed from: m */
    public C9869f m32913m(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        C9869f c9869f = new C9869f();
        abstractC22342tR1.mo22679t();
        int mo22679t = abstractC22342tR1.mo22679t();
        c9869f.f59443a = new int[mo22679t];
        for (int i = 0; i < mo22679t; i++) {
            c9869f.f59443a[i] = abstractC22342tR1.mo22679t();
        }
        return c9869f;
    }

    /* renamed from: n */
    public C9871h m32912n(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        C9871h c9871h = new C9871h();
        abstractC22342tR1.mo22679t();
        c9871h.f59446a = abstractC22342tR1.mo22679t();
        int mo22679t = abstractC22342tR1.mo22679t();
        c9871h.f59447b = new int[mo22679t];
        for (int i = 0; i < mo22679t; i++) {
            c9871h.f59447b[i] = abstractC22342tR1.mo22679t();
        }
        return c9871h;
    }

    /* renamed from: o */
    public C9873j[] m32911o(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        int mo22679t = abstractC22342tR1.mo22679t();
        int[] iArr = new int[mo22679t];
        for (int i = 0; i < mo22679t; i++) {
            iArr[i] = abstractC22342tR1.mo22679t();
        }
        C9873j[] c9873jArr = new C9873j[mo22679t];
        for (int i2 = 0; i2 < mo22679t; i2++) {
            c9873jArr[i2] = m32909q(abstractC22342tR1, iArr[i2] + j);
        }
        return c9873jArr;
    }

    /* renamed from: p */
    public AbstractC9872i m32910p(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        int mo22679t = abstractC22342tR1.mo22679t();
        if (mo22679t != 1) {
            if (mo22679t == 2) {
                C9875l c9875l = new C9875l();
                c9875l.f59448a = mo22679t;
                int mo22679t2 = abstractC22342tR1.mo22679t();
                int mo22679t3 = abstractC22342tR1.mo22679t();
                c9875l.f59455c = new int[mo22679t3];
                for (int i = 0; i < mo22679t3; i++) {
                    c9875l.f59455c[i] = abstractC22342tR1.mo22679t();
                }
                c9875l.f59449b = m32915k(abstractC22342tR1, j + mo22679t2);
                return c9875l;
            }
            throw new IOException("Unknown substFormat: " + mo22679t);
        }
        C9874k c9874k = new C9874k();
        c9874k.f59448a = mo22679t;
        int mo22679t4 = abstractC22342tR1.mo22679t();
        c9874k.f59454c = abstractC22342tR1.mo22686m();
        c9874k.f59449b = m32915k(abstractC22342tR1, j + mo22679t4);
        return c9874k;
    }

    /* renamed from: q */
    public C9873j m32909q(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        C9873j c9873j = new C9873j();
        c9873j.f59450a = abstractC22342tR1.mo22679t();
        c9873j.f59451b = abstractC22342tR1.mo22679t();
        int mo22679t = abstractC22342tR1.mo22679t();
        int[] iArr = new int[mo22679t];
        for (int i = 0; i < mo22679t; i++) {
            iArr[i] = abstractC22342tR1.mo22679t();
        }
        if ((c9873j.f59451b & 16) != 0) {
            c9873j.f59452c = abstractC22342tR1.mo22679t();
        }
        c9873j.f59453d = new AbstractC9872i[mo22679t];
        if (c9873j.f59450a != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Type ");
            sb.append(c9873j.f59450a);
            sb.append(" GSUB lookup table is not supported and will be ignored");
        } else {
            for (int i2 = 0; i2 < mo22679t; i2++) {
                c9873j.f59453d[i2] = m32910p(abstractC22342tR1, iArr[i2] + j);
            }
        }
        return c9873j;
    }

    /* renamed from: r */
    public C9876m m32908r(AbstractC22342tR1 abstractC22342tR1) {
        C9876m c9876m = new C9876m();
        c9876m.f59456a = abstractC22342tR1.mo22679t();
        c9876m.f59457b = abstractC22342tR1.mo22679t();
        c9876m.f59458c = abstractC22342tR1.mo22679t();
        return c9876m;
    }

    /* renamed from: s */
    public LinkedHashMap m32907s(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        int mo22679t = abstractC22342tR1.mo22679t();
        C9877n[] c9877nArr = new C9877n[mo22679t];
        int[] iArr = new int[mo22679t];
        for (int i = 0; i < mo22679t; i++) {
            C9877n c9877n = new C9877n();
            c9877n.f59459a = abstractC22342tR1.m22685n(4);
            iArr[i] = abstractC22342tR1.mo22679t();
            c9877nArr[i] = c9877n;
        }
        for (int i2 = 0; i2 < mo22679t; i2++) {
            c9877nArr[i2].f59460b = m32906t(abstractC22342tR1, iArr[i2] + j);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mo22679t);
        for (int i3 = 0; i3 < mo22679t; i3++) {
            C9877n c9877n2 = c9877nArr[i3];
            linkedHashMap.put(c9877n2.f59459a, c9877n2.f59460b);
        }
        return linkedHashMap;
    }

    /* renamed from: t */
    public C9878o m32906t(AbstractC22342tR1 abstractC22342tR1, long j) {
        abstractC22342tR1.seek(j);
        C9878o c9878o = new C9878o();
        int mo22679t = abstractC22342tR1.mo22679t();
        int mo22679t2 = abstractC22342tR1.mo22679t();
        C9870g[] c9870gArr = new C9870g[mo22679t2];
        int[] iArr = new int[mo22679t2];
        String str = "";
        for (int i = 0; i < mo22679t2; i++) {
            C9870g c9870g = new C9870g();
            String m22685n = abstractC22342tR1.m22685n(4);
            c9870g.f59444a = m22685n;
            if (i > 0 && m22685n.compareTo(str) <= 0) {
                throw new IOException("LangSysRecords not alphabetically sorted by LangSys tag: " + c9870g.f59444a + " <= " + str);
            }
            iArr[i] = abstractC22342tR1.mo22679t();
            c9870gArr[i] = c9870g;
            str = c9870g.f59444a;
        }
        if (mo22679t != 0) {
            c9878o.f59461a = m32912n(abstractC22342tR1, mo22679t + j);
        }
        for (int i2 = 0; i2 < mo22679t2; i2++) {
            c9870gArr[i2].f59445b = m32912n(abstractC22342tR1, iArr[i2] + j);
        }
        c9878o.f59462b = new LinkedHashMap(mo22679t2);
        for (int i3 = 0; i3 < mo22679t2; i3++) {
            C9870g c9870g2 = c9870gArr[i3];
            c9878o.f59462b.put(c9870g2.f59444a, c9870g2.f59445b);
        }
        return c9878o;
    }

    /* renamed from: u */
    public final void m32905u(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C9868e) it.next()).f59441a.equals(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: v */
    public final String m32904v(String[] strArr) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if (OpenTypeScript.INHERITED.equals(str) || (OpenTypeScript.TAG_DEFAULT.equals(str) && !this.f59430e.containsKey(str))) {
                if (this.f59435j == null) {
                    this.f59435j = (String) this.f59430e.keySet().iterator().next();
                }
                return this.f59435j;
            }
        }
        for (String str2 : strArr) {
            if (this.f59430e.containsKey(str2)) {
                this.f59435j = str2;
                return str2;
            }
        }
        return strArr[0];
    }
}