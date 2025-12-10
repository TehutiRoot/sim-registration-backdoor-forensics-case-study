package org.apache.commons.codec.language.p027bm;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.codec.Resources;
import org.apache.commons.codec.language.p027bm.Languages;

/* renamed from: org.apache.commons.codec.language.bm.Languages */
/* loaded from: classes6.dex */
public class Languages {
    public static final String ANY = "any";

    /* renamed from: a */
    public final Set f73182a;

    /* renamed from: b */
    public static final Map f73181b = new EnumMap(NameType.class);
    public static final LanguageSet NO_LANGUAGES = new C12498a();
    public static final LanguageSet ANY_LANGUAGE = new C12499b();

    /* renamed from: org.apache.commons.codec.language.bm.Languages$LanguageSet */
    /* loaded from: classes6.dex */
    public static abstract class LanguageSet {
        public static LanguageSet from(Set<String> set) {
            if (set.isEmpty()) {
                return Languages.NO_LANGUAGES;
            }
            return new SomeLanguages(set, null);
        }

        public abstract boolean contains(String str);

        public abstract String getAny();

        public abstract boolean isEmpty();

        public abstract boolean isSingleton();

        public abstract LanguageSet merge(LanguageSet languageSet);

        public abstract LanguageSet restrictTo(LanguageSet languageSet);
    }

    /* renamed from: org.apache.commons.codec.language.bm.Languages$SomeLanguages */
    /* loaded from: classes6.dex */
    public static final class SomeLanguages extends LanguageSet {

        /* renamed from: a */
        public final Set f73183a;

        public /* synthetic */ SomeLanguages(Set set, C12498a c12498a) {
            this(set);
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m25502a(SomeLanguages someLanguages, String str) {
            return m25501b(someLanguages, str);
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m25501b(SomeLanguages someLanguages, String str) {
            return someLanguages.f73183a.contains(str);
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean contains(String str) {
            return this.f73183a.contains(str);
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public String getAny() {
            return (String) this.f73183a.iterator().next();
        }

        public Set<String> getLanguages() {
            return this.f73183a;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean isEmpty() {
            return this.f73183a.isEmpty();
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean isSingleton() {
            if (this.f73183a.size() == 1) {
                return true;
            }
            return false;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public LanguageSet merge(LanguageSet languageSet) {
            if (languageSet == Languages.NO_LANGUAGES) {
                return this;
            }
            if (languageSet == Languages.ANY_LANGUAGE) {
                return languageSet;
            }
            HashSet hashSet = new HashSet(this.f73183a);
            hashSet.addAll(((SomeLanguages) languageSet).f73183a);
            return LanguageSet.from(hashSet);
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public LanguageSet restrictTo(LanguageSet languageSet) {
            Stream stream;
            Stream filter;
            Collector set;
            Object collect;
            if (languageSet == Languages.NO_LANGUAGES) {
                return languageSet;
            }
            if (languageSet != Languages.ANY_LANGUAGE) {
                stream = this.f73183a.stream();
                filter = stream.filter(new Predicate() { // from class: bi0
                    {
                        Languages.SomeLanguages.this = r1;
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return Languages.SomeLanguages.m25502a(Languages.SomeLanguages.this, (String) obj);
                    }
                });
                set = Collectors.toSet();
                collect = filter.collect(set);
                return LanguageSet.from((Set) collect);
            }
            return this;
        }

        public String toString() {
            return "Languages(" + this.f73183a.toString() + ")";
        }

        public SomeLanguages(Set set) {
            this.f73183a = Collections.unmodifiableSet(set);
        }
    }

    /* renamed from: org.apache.commons.codec.language.bm.Languages$a */
    /* loaded from: classes6.dex */
    public class C12498a extends LanguageSet {
        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean contains(String str) {
            return false;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public String getAny() {
            throw new NoSuchElementException("Can't fetch any language from the empty language set.");
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean isEmpty() {
            return true;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean isSingleton() {
            return false;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public LanguageSet merge(LanguageSet languageSet) {
            return languageSet;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public LanguageSet restrictTo(LanguageSet languageSet) {
            return this;
        }

        public String toString() {
            return "NO_LANGUAGES";
        }
    }

    /* renamed from: org.apache.commons.codec.language.bm.Languages$b */
    /* loaded from: classes6.dex */
    public class C12499b extends LanguageSet {
        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean contains(String str) {
            return true;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public String getAny() {
            throw new NoSuchElementException("Can't fetch any language from the any language set.");
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean isEmpty() {
            return false;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public boolean isSingleton() {
            return false;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public LanguageSet merge(LanguageSet languageSet) {
            return languageSet;
        }

        @Override // org.apache.commons.codec.language.p027bm.Languages.LanguageSet
        public LanguageSet restrictTo(LanguageSet languageSet) {
            return languageSet;
        }

        public String toString() {
            return "ANY_LANGUAGE";
        }
    }

    static {
        NameType[] values;
        for (NameType nameType : NameType.values()) {
            f73181b.put(nameType, getInstance(m25503a(nameType)));
        }
    }

    public Languages(Set set) {
        this.f73182a = set;
    }

    /* renamed from: a */
    public static String m25503a(NameType nameType) {
        return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", nameType.getName());
    }

    public static Languages getInstance(NameType nameType) {
        return (Languages) f73181b.get(nameType);
    }

    public Set<String> getLanguages() {
        return this.f73182a;
    }

    public static Languages getInstance(String str) {
        HashSet hashSet = new HashSet();
        Scanner scanner = new Scanner(Resources.getInputStream(str), AbstractC17384Bx1.f571a);
        while (true) {
            boolean z = false;
            while (scanner.hasNextLine()) {
                try {
                    String trim = scanner.nextLine().trim();
                    if (z) {
                        if (trim.endsWith("*/")) {
                            break;
                        }
                    } else if (trim.startsWith("/*")) {
                        z = true;
                    } else if (!trim.isEmpty()) {
                        hashSet.add(trim);
                    }
                } catch (Throwable th2) {
                    try {
                        scanner.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            Languages languages = new Languages(Collections.unmodifiableSet(hashSet));
            scanner.close();
            return languages;
        }
    }
}
