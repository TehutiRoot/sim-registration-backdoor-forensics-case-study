package org.apache.commons.codec.language;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.Resources;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.language.DaitchMokotoffSoundex;

/* loaded from: classes6.dex */
public class DaitchMokotoffSoundex implements StringEncoder {

    /* renamed from: b */
    public static final Map f73130b;

    /* renamed from: c */
    public static final Map f73131c;

    /* renamed from: a */
    public final boolean f73132a;

    /* renamed from: org.apache.commons.codec.language.DaitchMokotoffSoundex$b */
    /* loaded from: classes6.dex */
    public static final class C12494b {

        /* renamed from: a */
        public final StringBuilder f73133a;

        /* renamed from: b */
        public String f73134b;

        /* renamed from: c */
        public String f73135c;

        /* renamed from: a */
        public C12494b m25561a() {
            C12494b c12494b = new C12494b();
            c12494b.f73133a.append(toString());
            c12494b.f73135c = this.f73135c;
            return c12494b;
        }

        /* renamed from: b */
        public void m25560b() {
            while (this.f73133a.length() < 6) {
                this.f73133a.append('0');
                this.f73134b = null;
            }
        }

        /* renamed from: c */
        public void m25559c(String str, boolean z) {
            String str2 = this.f73135c;
            if ((str2 == null || !str2.endsWith(str) || z) && this.f73133a.length() < 6) {
                this.f73133a.append(str);
                if (this.f73133a.length() > 6) {
                    StringBuilder sb = this.f73133a;
                    sb.delete(6, sb.length());
                }
                this.f73134b = null;
            }
            this.f73135c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12494b)) {
                return false;
            }
            return toString().equals(((C12494b) obj).toString());
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String toString() {
            if (this.f73134b == null) {
                this.f73134b = this.f73133a.toString();
            }
            return this.f73134b;
        }

        public C12494b() {
            this.f73133a = new StringBuilder();
            this.f73135c = null;
            this.f73134b = null;
        }
    }

    /* renamed from: org.apache.commons.codec.language.DaitchMokotoffSoundex$c */
    /* loaded from: classes6.dex */
    public static final class C12495c {

        /* renamed from: a */
        public final String f73136a;

        /* renamed from: b */
        public final String[] f73137b;

        /* renamed from: c */
        public final String[] f73138c;

        /* renamed from: d */
        public final String[] f73139d;

        public C12495c(String str, String str2, String str3, String str4) {
            this.f73136a = str;
            this.f73137b = str2.split("\\|");
            this.f73138c = str3.split("\\|");
            this.f73139d = str4.split("\\|");
        }

        /* renamed from: b */
        public int m25557b() {
            return this.f73136a.length();
        }

        /* renamed from: c */
        public String[] m25556c(String str, boolean z) {
            if (z) {
                return this.f73137b;
            }
            int m25557b = m25557b();
            if (m25557b < str.length() && m25555d(str.charAt(m25557b))) {
                return this.f73138c;
            }
            return this.f73139d;
        }

        /* renamed from: d */
        public final boolean m25555d(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }

        /* renamed from: e */
        public boolean m25554e(String str) {
            return str.startsWith(this.f73136a);
        }

        public String toString() {
            return String.format("%s=(%s,%s,%s)", this.f73136a, Arrays.asList(this.f73137b), Arrays.asList(this.f73138c), Arrays.asList(this.f73139d));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f73130b = hashMap;
        HashMap hashMap2 = new HashMap();
        f73131c = hashMap2;
        Scanner scanner = new Scanner(Resources.getInputStream("org/apache/commons/codec/language/dmrules.txt"), CharEncoding.UTF_8);
        try {
            m25564h(scanner, "org/apache/commons/codec/language/dmrules.txt", hashMap, hashMap2);
            scanner.close();
            hashMap.forEach(new BiConsumer() { // from class: BD
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    DaitchMokotoffSoundex.m25570b((Character) obj, (List) obj2);
                }
            });
        } catch (Throwable th2) {
            try {
                scanner.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public DaitchMokotoffSoundex() {
        this(true);
    }

    /* renamed from: a */
    public static /* synthetic */ List m25571a(Character ch2) {
        return m25567e(ch2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m25570b(Character ch2, List list) {
        m25565g(ch2, list);
    }

    /* renamed from: c */
    public static /* synthetic */ int m25569c(C12495c c12495c, C12495c c12495c2) {
        return m25566f(c12495c, c12495c2);
    }

    /* renamed from: e */
    public static /* synthetic */ List m25567e(Character ch2) {
        return new ArrayList();
    }

    /* renamed from: f */
    public static /* synthetic */ int m25566f(C12495c c12495c, C12495c c12495c2) {
        return c12495c2.m25557b() - c12495c.m25557b();
    }

    /* renamed from: g */
    public static /* synthetic */ void m25565g(Character ch2, List list) {
        list.sort(new Comparator() { // from class: DD
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DaitchMokotoffSoundex.m25569c((DaitchMokotoffSoundex.C12495c) obj, (DaitchMokotoffSoundex.C12495c) obj2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0091, code lost:
        throw new java.lang.IllegalArgumentException("Malformed folding statement - patterns are not single characters: " + r4 + " in " + r12);
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m25564h(java.util.Scanner r11, java.lang.String r12, java.util.Map r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DaitchMokotoffSoundex.m25564h(java.util.Scanner, java.lang.String, java.util.Map, java.util.Map):void");
    }

    /* renamed from: j */
    public static String m25562j(String str) {
        if (str.startsWith(OperatorName.SHOW_TEXT_LINE_AND_SPACE)) {
            str = str.substring(1);
        }
        if (str.endsWith(OperatorName.SHOW_TEXT_LINE_AND_SPACE)) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: d */
    public final String m25568d(String str) {
        char[] charArray;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                char lowerCase = Character.toLowerCase(c);
                Character ch2 = (Character) f73131c.get(Character.valueOf(lowerCase));
                if (this.f73132a && ch2 != null) {
                    lowerCase = ch2.charValue();
                }
                sb.append(lowerCase);
            }
        }
        return sb.toString();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String");
    }

    /* renamed from: i */
    public final String[] m25563i(String str, boolean z) {
        String str2;
        int i;
        List emptyList;
        boolean z2;
        boolean z3;
        String str3;
        C12494b c12494b;
        boolean z4;
        if (str == null) {
            return null;
        }
        String m25568d = m25568d(str);
        LinkedHashSet<C12494b> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C12494b());
        int i2 = 0;
        char c = 0;
        while (i2 < m25568d.length()) {
            char charAt = m25568d.charAt(i2);
            if (!Character.isWhitespace(charAt)) {
                String substring = m25568d.substring(i2);
                List list = (List) f73130b.get(Character.valueOf(charAt));
                if (list != null) {
                    if (z) {
                        emptyList = new ArrayList();
                    } else {
                        emptyList = Collections.emptyList();
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C12495c c12495c = (C12495c) it.next();
                            if (c12495c.m25554e(substring)) {
                                if (z) {
                                    emptyList.clear();
                                }
                                if (c == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                String[] m25556c = c12495c.m25556c(substring, z2);
                                if (m25556c.length > 1 && z) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                for (C12494b c12494b2 : linkedHashSet) {
                                    int length = m25556c.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length) {
                                            String str4 = m25556c[i3];
                                            if (z3) {
                                                c12494b = c12494b2.m25561a();
                                            } else {
                                                c12494b = c12494b2;
                                            }
                                            str3 = m25568d;
                                            if ((c == 'm' && charAt == 'n') || (c == 'n' && charAt == 'm')) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            c12494b.m25559c(str4, z4);
                                            if (!z) {
                                                break;
                                            }
                                            emptyList.add(c12494b);
                                            i3++;
                                            m25568d = str3;
                                        } else {
                                            str3 = m25568d;
                                            break;
                                        }
                                    }
                                    m25568d = str3;
                                }
                                str2 = m25568d;
                                if (z) {
                                    linkedHashSet.clear();
                                    linkedHashSet.addAll(emptyList);
                                }
                                i = 1;
                                i2 += c12495c.m25557b() - 1;
                            }
                        } else {
                            str2 = m25568d;
                            i = 1;
                            break;
                        }
                    }
                    c = charAt;
                    i2 += i;
                    m25568d = str2;
                }
            }
            str2 = m25568d;
            i = 1;
            i2 += i;
            m25568d = str2;
        }
        String[] strArr = new String[linkedHashSet.size()];
        int i4 = 0;
        for (C12494b c12494b3 : linkedHashSet) {
            c12494b3.m25560b();
            strArr[i4] = c12494b3.toString();
            i4++;
        }
        return strArr;
    }

    public String soundex(String str) {
        String[] m25563i = m25563i(str, true);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str2 : m25563i) {
            sb.append(str2);
            i++;
            if (i < m25563i.length) {
                sb.append('|');
            }
        }
        return sb.toString();
    }

    public DaitchMokotoffSoundex(boolean z) {
        this.f73132a = z;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null) {
            return null;
        }
        return m25563i(str, false)[0];
    }
}
