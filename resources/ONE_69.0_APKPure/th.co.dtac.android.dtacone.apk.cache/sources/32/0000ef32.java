package org.apache.commons.p028io;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.p028io.IOCase;

/* renamed from: org.apache.commons.io.IOCase */
/* loaded from: classes6.dex */
public enum IOCase {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", FileSystem.getCurrent().isCaseSensitive());
    
    private static final long serialVersionUID = -6343169151696340687L;
    private final String name;
    private final transient boolean sensitive;

    IOCase(String str, boolean z) {
        this.name = str;
        this.sensitive = z;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25527a(String str, IOCase iOCase) {
        return lambda$forName$0(str, iOCase);
    }

    /* renamed from: b */
    public static /* synthetic */ IllegalArgumentException m25526b(String str) {
        return lambda$forName$1(str);
    }

    public static IOCase forName(final String str) {
        Stream of;
        Stream filter;
        Optional findFirst;
        Object orElseThrow;
        of = Stream.of((Object[]) values());
        filter = of.filter(new Predicate() { // from class: O90
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return IOCase.m25527a(str, (IOCase) obj);
            }
        });
        findFirst = filter.findFirst();
        orElseThrow = findFirst.orElseThrow(new Supplier() { // from class: P90
            @Override // java.util.function.Supplier
            public final Object get() {
                return IOCase.m25526b(str);
            }
        });
        return (IOCase) orElseThrow;
    }

    public static boolean isCaseSensitive(IOCase iOCase) {
        return iOCase != null && iOCase.isCaseSensitive();
    }

    public static /* synthetic */ boolean lambda$forName$0(String str, IOCase iOCase) {
        return iOCase.getName().equals(str);
    }

    public static /* synthetic */ IllegalArgumentException lambda$forName$1(String str) {
        return new IllegalArgumentException("Illegal IOCase name: " + str);
    }

    private Object readResolve() {
        return forName(this.name);
    }

    public static IOCase value(IOCase iOCase, IOCase iOCase2) {
        return iOCase != null ? iOCase : iOCase2;
    }

    public int checkCompareTo(String str, String str2) {
        Objects.requireNonNull(str, "str1");
        Objects.requireNonNull(str2, "str2");
        if (this.sensitive) {
            return str.compareTo(str2);
        }
        return str.compareToIgnoreCase(str2);
    }

    public boolean checkEndsWith(String str, String str2) {
        if (str != null && str2 != null) {
            int length = str2.length();
            return str.regionMatches(!this.sensitive, str.length() - length, str2, 0, length);
        }
        return false;
    }

    public boolean checkEquals(String str, String str2) {
        if (str != str2 && (str == null || (!this.sensitive ? !str.equalsIgnoreCase(str2) : !str.equals(str2)))) {
            return false;
        }
        return true;
    }

    public int checkIndexOf(String str, int i, String str2) {
        int length;
        if (str != null && str2 != null && (length = str.length() - str2.length()) >= i) {
            while (i <= length) {
                if (checkRegionMatches(str, i, str2)) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        return -1;
    }

    public boolean checkRegionMatches(String str, int i, String str2) {
        if (str != null && str2 != null && str.regionMatches(!this.sensitive, i, str2, 0, str2.length())) {
            return true;
        }
        return false;
    }

    public boolean checkStartsWith(String str, String str2) {
        if (str != null && str2 != null && str.regionMatches(!this.sensitive, 0, str2, 0, str2.length())) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public boolean isCaseSensitive() {
        return this.sensitive;
    }
}