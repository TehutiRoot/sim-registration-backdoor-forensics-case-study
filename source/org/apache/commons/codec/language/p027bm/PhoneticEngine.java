package org.apache.commons.codec.language.p027bm;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.codec.language.p027bm.Languages;
import org.apache.commons.codec.language.p027bm.PhoneticEngine;
import org.apache.commons.codec.language.p027bm.Rule;
import org.apache.http.message.TokenParser;

/* renamed from: org.apache.commons.codec.language.bm.PhoneticEngine */
/* loaded from: classes6.dex */
public class PhoneticEngine {

    /* renamed from: f */
    public static final Map f73184f;

    /* renamed from: a */
    public final Lang f73185a;

    /* renamed from: b */
    public final NameType f73186b;

    /* renamed from: c */
    public final RuleType f73187c;

    /* renamed from: d */
    public final boolean f73188d;

    /* renamed from: e */
    public final int f73189e;

    /* renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12500a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73190a;

        static {
            int[] iArr = new int[NameType.values().length];
            f73190a = iArr;
            try {
                iArr[NameType.SEPHARDIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73190a[NameType.ASHKENAZI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73190a[NameType.GENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$b */
    /* loaded from: classes6.dex */
    public static final class C12501b {

        /* renamed from: a */
        public final Set f73191a;

        public /* synthetic */ C12501b(Set set, C12500a c12500a) {
            this(set);
        }

        /* renamed from: a */
        public static /* synthetic */ void m25490a(CharSequence charSequence, Rule.Phoneme phoneme) {
            phoneme.append(charSequence);
        }

        /* renamed from: d */
        public static C12501b m25487d(Languages.LanguageSet languageSet) {
            return new C12501b(new Rule.Phoneme("", languageSet));
        }

        /* renamed from: b */
        public void m25489b(final CharSequence charSequence) {
            this.f73191a.forEach(new Consumer() { // from class: lk1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PhoneticEngine.C12501b.m25490a(charSequence, (Rule.Phoneme) obj);
                }
            });
        }

        /* renamed from: c */
        public void m25488c(Rule.PhonemeExpr phonemeExpr, int i) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Math.min(this.f73191a.size() * phonemeExpr.size(), i));
            loop0: for (Rule.Phoneme phoneme : this.f73191a) {
                for (Rule.Phoneme phoneme2 : phonemeExpr.getPhonemes()) {
                    Languages.LanguageSet restrictTo = phoneme.getLanguages().restrictTo(phoneme2.getLanguages());
                    if (!restrictTo.isEmpty()) {
                        Rule.Phoneme phoneme3 = new Rule.Phoneme(phoneme, phoneme2, restrictTo);
                        if (linkedHashSet.size() < i) {
                            linkedHashSet.add(phoneme3);
                            if (linkedHashSet.size() >= i) {
                                break loop0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            this.f73191a.clear();
            this.f73191a.addAll(linkedHashSet);
        }

        /* renamed from: e */
        public Set m25486e() {
            return this.f73191a;
        }

        /* renamed from: g */
        public String m25484g() {
            Stream stream;
            Stream map;
            Collector joining;
            Object collect;
            stream = this.f73191a.stream();
            map = stream.map(new Function() { // from class: kk1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((Rule.Phoneme) obj).getPhonemeText();
                }
            });
            joining = Collectors.joining("|");
            collect = map.collect(joining);
            return (String) collect;
        }

        public C12501b(Rule.Phoneme phoneme) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.f73191a = linkedHashSet;
            linkedHashSet.add(phoneme);
        }

        public C12501b(Set set) {
            this.f73191a = set;
        }
    }

    /* renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$c */
    /* loaded from: classes6.dex */
    public static final class C12502c {

        /* renamed from: a */
        public final Map f73192a;

        /* renamed from: b */
        public final CharSequence f73193b;

        /* renamed from: c */
        public final C12501b f73194c;

        /* renamed from: d */
        public int f73195d;

        /* renamed from: e */
        public final int f73196e;

        /* renamed from: f */
        public boolean f73197f;

        public C12502c(Map map, CharSequence charSequence, C12501b c12501b, int i, int i2) {
            Objects.requireNonNull(map, "finalRules");
            this.f73192a = map;
            this.f73194c = c12501b;
            this.f73193b = charSequence;
            this.f73195d = i;
            this.f73196e = i2;
        }

        /* renamed from: a */
        public int m25483a() {
            return this.f73195d;
        }

        /* renamed from: b */
        public C12501b m25482b() {
            return this.f73194c;
        }

        /* renamed from: c */
        public C12502c m25481c() {
            int i;
            this.f73197f = false;
            Map map = this.f73192a;
            CharSequence charSequence = this.f73193b;
            int i2 = this.f73195d;
            List list = (List) map.get(charSequence.subSequence(i2, i2 + 1));
            int i3 = 1;
            if (list != null) {
                Iterator it = list.iterator();
                i = 1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Rule rule = (Rule) it.next();
                    int length = rule.getPattern().length();
                    if (rule.patternAndContextMatches(this.f73193b, this.f73195d)) {
                        this.f73194c.m25488c(rule.getPhoneme(), this.f73196e);
                        this.f73197f = true;
                        i = length;
                        break;
                    }
                    i = length;
                }
            } else {
                i = 1;
            }
            if (this.f73197f) {
                i3 = i;
            }
            this.f73195d += i3;
            return this;
        }

        /* renamed from: d */
        public boolean m25480d() {
            return this.f73197f;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(NameType.class);
        f73184f = enumMap;
        enumMap.put((EnumMap) NameType.ASHKENAZI, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        enumMap.put((EnumMap) NameType.SEPHARDIC, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        enumMap.put((EnumMap) NameType.GENERIC, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }

    public PhoneticEngine(NameType nameType, RuleType ruleType, boolean z) {
        this(nameType, ruleType, z, 20);
    }

    /* renamed from: a */
    public static /* synthetic */ void m25500a(List list, String str) {
        m25492i(list, str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m25499b(PhoneticEngine phoneticEngine, StringBuilder sb, String str) {
        phoneticEngine.m25491j(sb, str);
    }

    /* renamed from: c */
    public static /* synthetic */ void m25498c(Map map, Rule.Phoneme phoneme) {
        m25494g(map, phoneme);
    }

    /* renamed from: d */
    public static /* synthetic */ void m25497d(PhoneticEngine phoneticEngine, Map map, Map map2, Rule.Phoneme phoneme) {
        phoneticEngine.m25493h(map, map2, phoneme);
    }

    /* renamed from: f */
    public static String m25495f(List list, String str) {
        Stream stream;
        Collector joining;
        Object collect;
        stream = list.stream();
        joining = Collectors.joining(str);
        collect = stream.collect(joining);
        return (String) collect;
    }

    /* renamed from: g */
    public static /* synthetic */ void m25494g(Map map, Rule.Phoneme phoneme) {
        if (map.containsKey(phoneme)) {
            Rule.Phoneme mergeWithLanguage = ((Rule.Phoneme) map.remove(phoneme)).mergeWithLanguage(phoneme.getLanguages());
            map.put(mergeWithLanguage, mergeWithLanguage);
            return;
        }
        map.put(phoneme, phoneme);
    }

    /* renamed from: i */
    public static /* synthetic */ void m25492i(List list, String str) {
        String[] split = str.split(OperatorName.SHOW_TEXT_LINE, -1);
        list.add(split[split.length - 1]);
    }

    /* renamed from: e */
    public final C12501b m25496e(C12501b c12501b, final Map map) {
        Objects.requireNonNull(map, "finalRules");
        if (map.isEmpty()) {
            return c12501b;
        }
        final TreeMap treeMap = new TreeMap(Rule.Phoneme.COMPARATOR);
        c12501b.m25486e().forEach(new Consumer() { // from class: ik1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PhoneticEngine.m25497d(PhoneticEngine.this, map, treeMap, (Rule.Phoneme) obj);
            }
        });
        return new C12501b(treeMap.keySet(), null);
    }

    public String encode(String str) {
        return encode(str, this.f73185a.guessLanguages(str));
    }

    public Lang getLang() {
        return this.f73185a;
    }

    public int getMaxPhonemes() {
        return this.f73189e;
    }

    public NameType getNameType() {
        return this.f73186b;
    }

    public RuleType getRuleType() {
        return this.f73187c;
    }

    /* renamed from: h */
    public final /* synthetic */ void m25493h(Map map, final Map map2, Rule.Phoneme phoneme) {
        C12501b m25487d = C12501b.m25487d(phoneme.getLanguages());
        String charSequence = phoneme.getPhonemeText().toString();
        C12501b c12501b = m25487d;
        int i = 0;
        while (i < charSequence.length()) {
            C12502c m25481c = new C12502c(map, charSequence, c12501b, i, this.f73189e).m25481c();
            boolean m25480d = m25481c.m25480d();
            c12501b = m25481c.m25482b();
            if (!m25480d) {
                c12501b.m25489b(charSequence.subSequence(i, i + 1));
            }
            i = m25481c.m25483a();
        }
        c12501b.m25486e().forEach(new Consumer() { // from class: jk1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PhoneticEngine.m25498c(map2, (Rule.Phoneme) obj);
            }
        });
    }

    public boolean isConcat() {
        return this.f73188d;
    }

    /* renamed from: j */
    public final /* synthetic */ void m25491j(StringBuilder sb, String str) {
        sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append(encode(str));
    }

    public PhoneticEngine(NameType nameType, RuleType ruleType, boolean z, int i) {
        RuleType ruleType2 = RuleType.RULES;
        if (ruleType != ruleType2) {
            this.f73186b = nameType;
            this.f73187c = ruleType;
            this.f73188d = z;
            this.f73185a = Lang.instance(nameType);
            this.f73189e = i;
            return;
        }
        throw new IllegalArgumentException("ruleType must not be " + ruleType2);
    }

    public String encode(String str, Languages.LanguageSet languageSet) {
        String substring;
        String substring2;
        Map<String, List<Rule>> instanceMap = Rule.getInstanceMap(this.f73186b, RuleType.RULES, languageSet);
        Map<String, List<Rule>> instanceMap2 = Rule.getInstanceMap(this.f73186b, this.f73187c, "common");
        Map<String, List<Rule>> instanceMap3 = Rule.getInstanceMap(this.f73186b, this.f73187c, languageSet);
        String trim = str.toLowerCase(Locale.ENGLISH).replace('-', TokenParser.f74560SP).trim();
        if (this.f73186b == NameType.GENERIC) {
            if (trim.startsWith("d'")) {
                String str2 = "d" + trim.substring(2);
                return "(" + encode(substring2) + ")-(" + encode(str2) + ")";
            }
            for (String str3 : (Set) f73184f.get(this.f73186b)) {
                if (trim.startsWith(str3 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)) {
                    String str4 = str3 + trim.substring(str3.length() + 1);
                    return "(" + encode(substring) + ")-(" + encode(str4) + ")";
                }
            }
        }
        List asList = Arrays.asList(trim.split("\\s+"));
        final ArrayList arrayList = new ArrayList();
        int i = C12500a.f73190a[this.f73186b.ordinal()];
        if (i == 1) {
            asList.forEach(new Consumer() { // from class: gk1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PhoneticEngine.m25500a(arrayList, (String) obj);
                }
            });
            arrayList.removeAll((Collection) f73184f.get(this.f73186b));
        } else if (i == 2) {
            arrayList.addAll(asList);
            arrayList.removeAll((Collection) f73184f.get(this.f73186b));
        } else if (i == 3) {
            arrayList.addAll(asList);
        } else {
            throw new IllegalStateException("Unreachable case: " + this.f73186b);
        }
        if (this.f73188d) {
            trim = m25495f(arrayList, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        } else if (arrayList.size() == 1) {
            trim = (String) asList.iterator().next();
        } else if (!arrayList.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            arrayList.forEach(new Consumer() { // from class: hk1
                {
                    PhoneticEngine.this = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PhoneticEngine.m25499b(PhoneticEngine.this, sb, (String) obj);
                }
            });
            return sb.substring(1);
        }
        C12501b m25487d = C12501b.m25487d(languageSet);
        int i2 = 0;
        while (i2 < trim.length()) {
            C12502c m25481c = new C12502c(instanceMap, trim, m25487d, i2, this.f73189e).m25481c();
            i2 = m25481c.m25483a();
            m25487d = m25481c.m25482b();
        }
        return m25496e(m25496e(m25487d, instanceMap2), instanceMap3).m25484g();
    }
}
