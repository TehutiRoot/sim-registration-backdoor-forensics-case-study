package org.apache.commons.codec.language.p027bm;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.apache.commons.codec.language.p027bm.Lang;
import org.apache.commons.codec.language.p027bm.Languages;

/* renamed from: org.apache.commons.codec.language.bm.Lang */
/* loaded from: classes6.dex */
public class Lang {

    /* renamed from: c */
    public static final Map f73175c = new EnumMap(NameType.class);

    /* renamed from: a */
    public final Languages f73176a;

    /* renamed from: b */
    public final List f73177b;

    /* renamed from: org.apache.commons.codec.language.bm.Lang$b */
    /* loaded from: classes6.dex */
    public static final class C12497b {

        /* renamed from: a */
        public final boolean f73178a;

        /* renamed from: b */
        public final Set f73179b;

        /* renamed from: c */
        public final Pattern f73180c;

        /* renamed from: c */
        public boolean m25504c(String str) {
            return this.f73180c.matcher(str).find();
        }

        public C12497b(Pattern pattern, Set set, boolean z) {
            this.f73180c = pattern;
            this.f73179b = set;
            this.f73178a = z;
        }
    }

    static {
        NameType[] values;
        for (NameType nameType : NameType.values()) {
            f73175c.put(nameType, loadFromResource(String.format("org/apache/commons/codec/language/bm/%s_lang.txt", nameType.getName()), Languages.getInstance(nameType)));
        }
    }

    public Lang(List list, Languages languages) {
        this.f73177b = Collections.unmodifiableList(list);
        this.f73176a = languages;
    }

    /* renamed from: a */
    public static /* synthetic */ void m25508a(String str, Set set, C12497b c12497b) {
        m25507b(str, set, c12497b);
    }

    /* renamed from: b */
    public static /* synthetic */ void m25507b(String str, Set set, C12497b c12497b) {
        if (c12497b.m25504c(str)) {
            if (c12497b.f73178a) {
                set.retainAll(c12497b.f73179b);
            } else {
                set.removeAll(c12497b.f73179b);
            }
        }
    }

    public static Lang instance(NameType nameType) {
        return (Lang) f73175c.get(nameType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00a5, code lost:
        throw new java.lang.IllegalArgumentException("Malformed line '" + r4 + "' in language resource '" + r9 + com.tom_roush.pdfbox.contentstream.operator.OperatorName.SHOW_TEXT_LINE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.commons.codec.language.p027bm.Lang loadFromResource(java.lang.String r9, org.apache.commons.codec.language.p027bm.Languages r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Scanner r1 = new java.util.Scanner
            java.io.InputStream r2 = org.apache.commons.codec.Resources.getInputStream(r9)
            java.lang.String r3 = p000.AbstractC17384Bx1.f571a
            r1.<init>(r2, r3)
            r2 = 0
        L11:
            r3 = 0
        L12:
            boolean r4 = r1.hasNextLine()     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto La6
            java.lang.String r4 = r1.nextLine()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L2a
        */
        //  java.lang.String r5 = "*/"
        /*
            boolean r4 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L12
            goto L11
        L27:
            r9 = move-exception
            goto Laf
        L2a:
            java.lang.String r5 = "/*"
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L27
            r6 = 1
            if (r5 == 0) goto L35
            r3 = 1
            goto L12
        L35:
            java.lang.String r5 = "//"
            int r5 = r4.indexOf(r5)     // Catch: java.lang.Throwable -> L27
            if (r5 < 0) goto L42
            java.lang.String r5 = r4.substring(r2, r5)     // Catch: java.lang.Throwable -> L27
            goto L43
        L42:
            r5 = r4
        L43:
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L27
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto L4e
            goto L12
        L4e:
            java.lang.String r7 = "\\s+"
            java.lang.String[] r5 = r5.split(r7)     // Catch: java.lang.Throwable -> L27
            int r7 = r5.length     // Catch: java.lang.Throwable -> L27
            r8 = 3
            if (r7 != r8) goto L82
            r4 = r5[r2]     // Catch: java.lang.Throwable -> L27
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> L27
            r6 = r5[r6]     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = "\\+"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> L27
            r7 = 2
            r5 = r5[r7]     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = "true"
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> L27
            org.apache.commons.codec.language.bm.Lang$b r7 = new org.apache.commons.codec.language.bm.Lang$b     // Catch: java.lang.Throwable -> L27
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L27
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> L27
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r6 = 0
            r7.<init>(r4, r8, r5)     // Catch: java.lang.Throwable -> L27
            r0.add(r7)     // Catch: java.lang.Throwable -> L27
            goto L12
        L82:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "Malformed line '"
            r0.append(r2)     // Catch: java.lang.Throwable -> L27
            r0.append(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "' in language resource '"
            r0.append(r2)     // Catch: java.lang.Throwable -> L27
            r0.append(r9)     // Catch: java.lang.Throwable -> L27
            java.lang.String r9 = "'"
            r0.append(r9)     // Catch: java.lang.Throwable -> L27
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L27
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L27
            throw r10     // Catch: java.lang.Throwable -> L27
        La6:
            r1.close()
            org.apache.commons.codec.language.bm.Lang r9 = new org.apache.commons.codec.language.bm.Lang
            r9.<init>(r0, r10)
            return r9
        Laf:
            r1.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r10 = move-exception
            r9.addSuppressed(r10)
        Lb7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.p027bm.Lang.loadFromResource(java.lang.String, org.apache.commons.codec.language.bm.Languages):org.apache.commons.codec.language.bm.Lang");
    }

    public String guessLanguage(String str) {
        Languages.LanguageSet guessLanguages = guessLanguages(str);
        if (guessLanguages.isSingleton()) {
            return guessLanguages.getAny();
        }
        return Languages.ANY;
    }

    public Languages.LanguageSet guessLanguages(String str) {
        final String lowerCase = str.toLowerCase(Locale.ENGLISH);
        final HashSet hashSet = new HashSet(this.f73176a.getLanguages());
        this.f73177b.forEach(new Consumer() { // from class: Th0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Lang.m25508a(lowerCase, hashSet, (Lang.C12497b) obj);
            }
        });
        Languages.LanguageSet from = Languages.LanguageSet.from(hashSet);
        if (from.equals(Languages.NO_LANGUAGES)) {
            return Languages.ANY_LANGUAGE;
        }
        return from;
    }
}
