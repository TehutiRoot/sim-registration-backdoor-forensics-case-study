package org.apache.commons.codec.language.p027bm;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.codec.Resources;
import org.apache.commons.codec.language.p027bm.Languages;
import org.apache.commons.codec.language.p027bm.Rule;

/* renamed from: org.apache.commons.codec.language.bm.Rule */
/* loaded from: classes6.dex */
public class Rule {
    public static final String ALL = "ALL";
    public static final RPattern ALL_STRINGS_RMATCHER = new RPattern() { // from class: jA1
        @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
        public final boolean isMatch(CharSequence charSequence) {
            return Rule.m25461j(charSequence);
        }
    };

    /* renamed from: e */
    public static final int f73198e = 8;

    /* renamed from: f */
    public static final Map f73199f = new EnumMap(NameType.class);

    /* renamed from: a */
    public final RPattern f73200a;

    /* renamed from: b */
    public final String f73201b;

    /* renamed from: c */
    public final PhonemeExpr f73202c;

    /* renamed from: d */
    public final RPattern f73203d;

    /* renamed from: org.apache.commons.codec.language.bm.Rule$PhonemeExpr */
    /* loaded from: classes6.dex */
    public interface PhonemeExpr {
        Iterable<Phoneme> getPhonemes();

        int size();
    }

    /* renamed from: org.apache.commons.codec.language.bm.Rule$PhonemeList */
    /* loaded from: classes6.dex */
    public static final class PhonemeList implements PhonemeExpr {

        /* renamed from: a */
        public final List f73206a;

        public PhonemeList(List<Phoneme> list) {
            this.f73206a = list;
        }

        @Override // org.apache.commons.codec.language.p027bm.Rule.PhonemeExpr
        public int size() {
            return this.f73206a.size();
        }

        @Override // org.apache.commons.codec.language.p027bm.Rule.PhonemeExpr
        public List<Phoneme> getPhonemes() {
            return this.f73206a;
        }
    }

    /* renamed from: org.apache.commons.codec.language.bm.Rule$RPattern */
    /* loaded from: classes6.dex */
    public interface RPattern {
        boolean isMatch(CharSequence charSequence);
    }

    /* renamed from: org.apache.commons.codec.language.bm.Rule$a */
    /* loaded from: classes6.dex */
    public class C12503a extends Rule {

        /* renamed from: g */
        public final int f73207g;

        /* renamed from: h */
        public final String f73208h;

        /* renamed from: i */
        public final /* synthetic */ int f73209i;

        /* renamed from: j */
        public final /* synthetic */ String f73210j;

        /* renamed from: k */
        public final /* synthetic */ String f73211k;

        /* renamed from: l */
        public final /* synthetic */ String f73212l;

        /* renamed from: m */
        public final /* synthetic */ String f73213m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12503a(String str, String str2, String str3, PhonemeExpr phonemeExpr, int i, String str4, String str5, String str6, String str7) {
            super(str, str2, str3, phonemeExpr);
            this.f73209i = i;
            this.f73210j = str4;
            this.f73211k = str5;
            this.f73212l = str6;
            this.f73213m = str7;
            this.f73207g = i;
            this.f73208h = str4;
        }

        public String toString() {
            return "Rule{line=" + this.f73207g + ", loc='" + this.f73208h + CoreConstants.SINGLE_QUOTE_CHAR + ", pat='" + this.f73211k + CoreConstants.SINGLE_QUOTE_CHAR + ", lcon='" + this.f73212l + CoreConstants.SINGLE_QUOTE_CHAR + ", rcon='" + this.f73213m + CoreConstants.SINGLE_QUOTE_CHAR + '}';
        }
    }

    /* renamed from: org.apache.commons.codec.language.bm.Rule$b */
    /* loaded from: classes6.dex */
    public class C12504b implements RPattern {

        /* renamed from: a */
        public final Pattern f73214a;

        /* renamed from: b */
        public final /* synthetic */ String f73215b;

        public C12504b(String str) {
            this.f73215b = str;
            this.f73214a = Pattern.compile(str);
        }

        @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
        public boolean isMatch(CharSequence charSequence) {
            return this.f73214a.matcher(charSequence).find();
        }
    }

    static {
        NameType[] values;
        RuleType[] values2;
        for (final NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (final RuleType ruleType : RuleType.values()) {
                final HashMap hashMap = new HashMap();
                Languages.getInstance(nameType).getLanguages().forEach(new Consumer() { // from class: Yz1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Rule.m25468c(nameType, ruleType, hashMap, (String) obj);
                    }
                });
                if (!ruleType.equals(RuleType.RULES)) {
                    Scanner m25455p = m25455p(nameType, ruleType, "common");
                    try {
                        hashMap.put("common", m25474F(m25455p, m25457n(nameType, ruleType, "common")));
                        if (m25455p != null) {
                            m25455p.close();
                        }
                    } catch (Throwable th2) {
                        if (m25455p != null) {
                            try {
                                m25455p.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                enumMap.put((EnumMap) ruleType, (RuleType) Collections.unmodifiableMap(hashMap));
            }
            f73199f.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public Rule(String str, String str2, String str3, PhonemeExpr phonemeExpr) {
        this.f73201b = str;
        this.f73200a = m25473G(str2 + "$");
        this.f73203d = m25473G("^" + str3);
        this.f73202c = phonemeExpr;
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m25479A(String str, boolean z, CharSequence charSequence) {
        if (charSequence.length() != 1 || m25458m(str, charSequence.charAt(0)) != z) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m25478B(CharSequence charSequence) {
        return true;
    }

    /* renamed from: C */
    public static /* synthetic */ void m25477C(NameType nameType, RuleType ruleType, Map map, String str) {
        try {
            Scanner m25455p = m25455p(nameType, ruleType, str);
            map.put(str, m25474F(m25455p, m25457n(nameType, ruleType, str)));
            if (m25455p != null) {
                m25455p.close();
            }
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Problem processing " + m25457n(nameType, ruleType, str), e);
        }
    }

    /* renamed from: D */
    public static Phoneme m25476D(String str) {
        int indexOf = str.indexOf("[");
        if (indexOf >= 0) {
            if (str.endsWith("]")) {
                return new Phoneme(str.substring(0, indexOf), Languages.LanguageSet.from(new HashSet(Arrays.asList(str.substring(indexOf + 1, str.length() - 1).split("[+]")))));
            }
            throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
        }
        return new Phoneme(str, Languages.ANY_LANGUAGE);
    }

    /* renamed from: E */
    public static PhonemeExpr m25475E(String str) {
        if (str.startsWith("(")) {
            if (str.endsWith(")")) {
                ArrayList arrayList = new ArrayList();
                String substring = str.substring(1, str.length() - 1);
                for (String str2 : substring.split("[|]")) {
                    arrayList.add(m25476D(str2));
                }
                if (substring.startsWith("|") || substring.endsWith("|")) {
                    arrayList.add(new Phoneme("", Languages.ANY_LANGUAGE));
                }
                return new PhonemeList(arrayList);
            }
            throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
        }
        return m25476D(str);
    }

    /* renamed from: F */
    public static Map m25474F(Scanner scanner, String str) {
        String str2;
        String str3;
        Object computeIfAbsent;
        HashMap hashMap = new HashMap();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (scanner.hasNextLine()) {
            int i3 = i2 + 1;
            String nextLine = scanner.nextLine();
            if (z) {
                if (nextLine.endsWith("*/")) {
                    z = false;
                    i2 = i3;
                    i = 0;
                }
                i2 = i3;
                i = 0;
            } else {
                if (nextLine.startsWith("/*")) {
                    z = true;
                } else {
                    int indexOf = nextLine.indexOf("//");
                    if (indexOf >= 0) {
                        str2 = nextLine.substring(i, indexOf);
                    } else {
                        str2 = nextLine;
                    }
                    String trim = str2.trim();
                    if (trim.isEmpty()) {
                        i2 = i3;
                    } else if (trim.startsWith("#include")) {
                        String trim2 = trim.substring(f73198e).trim();
                        if (!trim2.contains(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)) {
                            Scanner m25456o = m25456o(trim2);
                            try {
                                hashMap.putAll(m25474F(m25456o, str + "->" + trim2));
                                if (m25456o != null) {
                                    m25456o.close();
                                }
                            } catch (Throwable th2) {
                                if (m25456o != null) {
                                    try {
                                        m25456o.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        } else {
                            throw new IllegalArgumentException("Malformed import statement '" + nextLine + "' in " + str);
                        }
                    } else {
                        String[] split = trim.split("\\s+");
                        if (split.length == 4) {
                            try {
                                String m25471I = m25471I(split[i]);
                                String m25471I2 = m25471I(split[1]);
                                String m25471I3 = m25471I(split[2]);
                                str3 = "' in ";
                                try {
                                    C12503a c12503a = new C12503a(m25471I, m25471I2, m25471I3, m25475E(m25471I(split[3])), i3, str, m25471I, m25471I2, m25471I3);
                                    computeIfAbsent = hashMap.computeIfAbsent(c12503a.f73201b.substring(0, 1), new Function() { // from class: aA1
                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return Rule.m25463h((String) obj);
                                        }
                                    });
                                    ((List) computeIfAbsent).add(c12503a);
                                } catch (IllegalArgumentException e) {
                                    e = e;
                                    throw new IllegalStateException("Problem parsing line '" + i3 + str3 + str, e);
                                }
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                str3 = "' in ";
                            }
                        } else {
                            throw new IllegalArgumentException("Malformed rule statement split into " + split.length + " parts: " + nextLine + " in " + str);
                        }
                    }
                }
                i2 = i3;
                i = 0;
            }
        }
        return hashMap;
    }

    /* renamed from: G */
    public static RPattern m25473G(String str) {
        boolean startsWith = str.startsWith("^");
        boolean endsWith = str.endsWith("$");
        int length = str.length();
        if (endsWith) {
            length--;
        }
        final String substring = str.substring(startsWith ? 1 : 0, length);
        if (!substring.contains("[")) {
            if (startsWith && endsWith) {
                if (substring.isEmpty()) {
                    return new RPattern() { // from class: cA1
                        @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
                        public final boolean isMatch(CharSequence charSequence) {
                            return Rule.m25467d(charSequence);
                        }
                    };
                }
                return new RPattern() { // from class: dA1
                    @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
                    public final boolean isMatch(CharSequence charSequence) {
                        return Rule.m25464g(substring, charSequence);
                    }
                };
            } else if ((startsWith || endsWith) && substring.isEmpty()) {
                return ALL_STRINGS_RMATCHER;
            } else {
                if (startsWith) {
                    return new RPattern() { // from class: eA1
                        @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
                        public final boolean isMatch(CharSequence charSequence) {
                            return Rule.m25462i(substring, charSequence);
                        }
                    };
                }
                if (endsWith) {
                    return new RPattern() { // from class: fA1
                        @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
                        public final boolean isMatch(CharSequence charSequence) {
                            return Rule.m25460k(substring, charSequence);
                        }
                    };
                }
            }
        } else {
            boolean startsWith2 = substring.startsWith("[");
            boolean endsWith2 = substring.endsWith("]");
            if (startsWith2 && endsWith2) {
                final String substring2 = substring.substring(1, substring.length() - 1);
                if (!substring2.contains("[")) {
                    boolean startsWith3 = substring2.startsWith("^");
                    if (startsWith3) {
                        substring2 = substring2.substring(1);
                    }
                    final boolean z = !startsWith3;
                    if (startsWith && endsWith) {
                        return new RPattern() { // from class: gA1
                            @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                return Rule.m25470a(substring2, z, charSequence);
                            }
                        };
                    }
                    if (startsWith) {
                        return new RPattern() { // from class: hA1
                            @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                return Rule.m25466e(substring2, z, charSequence);
                            }
                        };
                    }
                    if (endsWith) {
                        return new RPattern() { // from class: iA1
                            @Override // org.apache.commons.codec.language.p027bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                return Rule.m25465f(substring2, z, charSequence);
                            }
                        };
                    }
                }
            }
        }
        return new C12504b(str);
    }

    /* renamed from: H */
    public static boolean m25472H(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i = 0; i < charSequence2.length(); i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public static String m25471I(String str) {
        if (str.startsWith(OperatorName.SHOW_TEXT_LINE_AND_SPACE)) {
            str = str.substring(1);
        }
        if (str.endsWith(OperatorName.SHOW_TEXT_LINE_AND_SPACE)) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25470a(String str, boolean z, CharSequence charSequence) {
        return m25479A(str, z, charSequence);
    }

    /* renamed from: b */
    public static /* synthetic */ void m25469b(List list, List list2) {
        list.addAll(list2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m25468c(NameType nameType, RuleType ruleType, Map map, String str) {
        m25477C(nameType, ruleType, map, str);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m25467d(CharSequence charSequence) {
        return m25448w(charSequence);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m25466e(String str, boolean z, CharSequence charSequence) {
        return m25450u(str, z, charSequence);
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m25465f(String str, boolean z, CharSequence charSequence) {
        return m25449v(str, z, charSequence);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m25464g(String str, CharSequence charSequence) {
        return charSequence.equals(str);
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        Map<String, List<Rule>> instanceMap = getInstanceMap(nameType, ruleType, languageSet);
        final ArrayList arrayList = new ArrayList();
        instanceMap.values().forEach(new Consumer() { // from class: bA1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Rule.m25469b(arrayList, (List) obj);
            }
        });
        return arrayList;
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        return languageSet.isSingleton() ? getInstanceMap(nameType, ruleType, languageSet.getAny()) : getInstanceMap(nameType, ruleType, Languages.ANY);
    }

    /* renamed from: h */
    public static /* synthetic */ List m25463h(String str) {
        return m25451t(str);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m25462i(String str, CharSequence charSequence) {
        return m25472H(charSequence, str);
    }

    /* renamed from: j */
    public static /* synthetic */ boolean m25461j(CharSequence charSequence) {
        return m25478B(charSequence);
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m25460k(String str, CharSequence charSequence) {
        return m25454q(charSequence, str);
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m25459l(char c, int i) {
        return m25453r(c, i);
    }

    /* renamed from: m */
    public static boolean m25458m(CharSequence charSequence, final char c) {
        IntStream chars;
        boolean anyMatch;
        chars = charSequence.chars();
        anyMatch = chars.anyMatch(new IntPredicate() { // from class: Zz1
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return Rule.m25459l(c, i);
            }
        });
        return anyMatch;
    }

    /* renamed from: n */
    public static String m25457n(NameType nameType, RuleType ruleType, String str) {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", nameType.getName(), ruleType.getName(), str);
    }

    /* renamed from: o */
    public static Scanner m25456o(String str) {
        return new Scanner(Resources.getInputStream(String.format("org/apache/commons/codec/language/bm/%s.txt", str)), AbstractC17384Bx1.f571a);
    }

    /* renamed from: p */
    public static Scanner m25455p(NameType nameType, RuleType ruleType, String str) {
        return new Scanner(Resources.getInputStream(m25457n(nameType, ruleType, str)), AbstractC17384Bx1.f571a);
    }

    /* renamed from: q */
    public static boolean m25454q(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        int length2 = charSequence.length();
        if (length > length2) {
            return false;
        }
        int i = length2 - 1;
        for (int i2 = length - 1; i2 >= 0; i2--) {
            if (charSequence.charAt(i) != charSequence2.charAt(i2)) {
                return false;
            }
            i--;
        }
        return true;
    }

    /* renamed from: r */
    public static /* synthetic */ boolean m25453r(char c, int i) {
        return i == c;
    }

    /* renamed from: t */
    public static /* synthetic */ List m25451t(String str) {
        return new ArrayList();
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m25450u(String str, boolean z, CharSequence charSequence) {
        if (charSequence.length() <= 0 || m25458m(str, charSequence.charAt(0)) != z) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m25449v(String str, boolean z, CharSequence charSequence) {
        if (charSequence.length() > 0 && m25458m(str, charSequence.charAt(charSequence.length() - 1)) == z) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m25448w(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public RPattern getLContext() {
        return this.f73200a;
    }

    public String getPattern() {
        return this.f73201b;
    }

    public PhonemeExpr getPhoneme() {
        return this.f73202c;
    }

    public RPattern getRContext() {
        return this.f73203d;
    }

    public boolean patternAndContextMatches(CharSequence charSequence, int i) {
        if (i >= 0) {
            int length = this.f73201b.length() + i;
            if (length > charSequence.length() || !charSequence.subSequence(i, length).equals(this.f73201b) || !this.f73203d.isMatch(charSequence.subSequence(length, charSequence.length()))) {
                return false;
            }
            return this.f73200a.isMatch(charSequence.subSequence(0, i));
        }
        throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
    }

    /* renamed from: org.apache.commons.codec.language.bm.Rule$Phoneme */
    /* loaded from: classes6.dex */
    public static final class Phoneme implements PhonemeExpr {
        public static final Comparator<Phoneme> COMPARATOR = new Comparator() { // from class: kA1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Rule.Phoneme.m25444a((Rule.Phoneme) obj, (Rule.Phoneme) obj2);
            }
        };

        /* renamed from: a */
        public final StringBuilder f73204a;

        /* renamed from: b */
        public final Languages.LanguageSet f73205b;

        public Phoneme(CharSequence charSequence, Languages.LanguageSet languageSet) {
            this.f73204a = new StringBuilder(charSequence);
            this.f73205b = languageSet;
        }

        /* renamed from: a */
        public static /* synthetic */ int m25444a(Phoneme phoneme, Phoneme phoneme2) {
            return m25443b(phoneme, phoneme2);
        }

        /* renamed from: b */
        public static /* synthetic */ int m25443b(Phoneme phoneme, Phoneme phoneme2) {
            int length = phoneme.f73204a.length();
            int length2 = phoneme2.f73204a.length();
            for (int i = 0; i < length; i++) {
                if (i >= length2) {
                    return 1;
                }
                int charAt = phoneme.f73204a.charAt(i) - phoneme2.f73204a.charAt(i);
                if (charAt != 0) {
                    return charAt;
                }
            }
            if (length >= length2) {
                return 0;
            }
            return -1;
        }

        public Phoneme append(CharSequence charSequence) {
            this.f73204a.append(charSequence);
            return this;
        }

        public Languages.LanguageSet getLanguages() {
            return this.f73205b;
        }

        public CharSequence getPhonemeText() {
            return this.f73204a;
        }

        @Override // org.apache.commons.codec.language.p027bm.Rule.PhonemeExpr
        public Iterable<Phoneme> getPhonemes() {
            return Collections.singleton(this);
        }

        @Deprecated
        public Phoneme join(Phoneme phoneme) {
            return new Phoneme(this.f73204a.toString() + phoneme.f73204a.toString(), this.f73205b.restrictTo(phoneme.f73205b));
        }

        public Phoneme mergeWithLanguage(Languages.LanguageSet languageSet) {
            return new Phoneme(this.f73204a.toString(), this.f73205b.merge(languageSet));
        }

        @Override // org.apache.commons.codec.language.p027bm.Rule.PhonemeExpr
        public int size() {
            return 1;
        }

        public String toString() {
            return this.f73204a.toString() + "[" + this.f73205b + "]";
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2) {
            this(phoneme.f73204a, phoneme.f73205b);
            this.f73204a.append((CharSequence) phoneme2.f73204a);
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2, Languages.LanguageSet languageSet) {
            this(phoneme.f73204a, languageSet);
            this.f73204a.append((CharSequence) phoneme2.f73204a);
        }
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, String str) {
        Map<String, List<Rule>> map = (Map) ((Map) ((Map) f73199f.get(nameType)).get(ruleType)).get(str);
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", nameType.getName(), ruleType.getName(), str));
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, String str) {
        return getInstance(nameType, ruleType, Languages.LanguageSet.from(new HashSet(Arrays.asList(str))));
    }
}
