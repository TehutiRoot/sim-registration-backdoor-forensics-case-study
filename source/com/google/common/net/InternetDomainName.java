package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.List;
import javax.annotation.CheckForNull;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

@Immutable
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class InternetDomainName {

    /* renamed from: e */
    public static final CharMatcher f54038e = CharMatcher.anyOf(".。．｡");

    /* renamed from: f */
    public static final Splitter f54039f = Splitter.m41291on('.');

    /* renamed from: g */
    public static final Joiner f54040g = Joiner.m41323on('.');

    /* renamed from: h */
    public static final CharMatcher f54041h;

    /* renamed from: i */
    public static final CharMatcher f54042i;

    /* renamed from: j */
    public static final CharMatcher f54043j;

    /* renamed from: k */
    public static final CharMatcher f54044k;

    /* renamed from: a */
    public final String f54045a;

    /* renamed from: b */
    public final ImmutableList f54046b;

    /* renamed from: c */
    public int f54047c = -2;

    /* renamed from: d */
    public int f54048d = -2;

    static {
        CharMatcher anyOf = CharMatcher.anyOf("-_");
        f54041h = anyOf;
        CharMatcher inRange = CharMatcher.inRange('0', '9');
        f54042i = inRange;
        CharMatcher mo41337or = CharMatcher.inRange('a', 'z').mo41337or(CharMatcher.inRange('A', Matrix.MATRIX_TYPE_ZERO));
        f54043j = mo41337or;
        f54044k = inRange.mo41337or(mo41337or).mo41337or(anyOf);
    }

    public InternetDomainName(String str) {
        String lowerCase = Ascii.toLowerCase(f54038e.replaceFrom((CharSequence) str, '.'));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        Preconditions.checkArgument(lowerCase.length() <= 253, "Domain name too long: '%s':", lowerCase);
        this.f54045a = lowerCase;
        ImmutableList copyOf = ImmutableList.copyOf(f54039f.split(lowerCase));
        this.f54046b = copyOf;
        Preconditions.checkArgument(copyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        Preconditions.checkArgument(m39898g(copyOf), "Not a valid domain name: '%s'", lowerCase);
    }

    /* renamed from: c */
    public static boolean m39902c(Optional optional, Optional optional2) {
        if (optional.isPresent()) {
            return optional.equals(optional2);
        }
        return optional2.isPresent();
    }

    /* renamed from: f */
    public static boolean m39899f(String str, boolean z) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!f54044k.matchesAllOf(CharMatcher.ascii().retainFrom(str))) {
                return false;
            }
            CharMatcher charMatcher = f54041h;
            if (!charMatcher.matches(str.charAt(0)) && !charMatcher.matches(str.charAt(str.length() - 1))) {
                if (z && f54042i.matches(str.charAt(0))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public static InternetDomainName from(String str) {
        return new InternetDomainName((String) Preconditions.checkNotNull(str));
    }

    /* renamed from: g */
    public static boolean m39898g(List list) {
        int size = list.size() - 1;
        if (!m39899f((String) list.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!m39899f((String) list.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(String str) {
        try {
            from(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final InternetDomainName m39904a(int i) {
        ImmutableList immutableList = this.f54046b;
        ImmutableList subList = immutableList.subList(i, immutableList.size());
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((String) this.f54046b.get(i3)).length();
        }
        return new InternetDomainName(this.f54045a.substring(i2), subList);
    }

    /* renamed from: b */
    public final int m39903b(Optional optional) {
        int size = this.f54046b.size();
        for (int i = 0; i < size; i++) {
            String join = f54040g.join(this.f54046b.subList(i, size));
            if (i > 0 && m39902c(optional, Optional.fromNullable(PublicSuffixPatterns.UNDER.get(join)))) {
                return i - 1;
            }
            if (m39902c(optional, Optional.fromNullable(PublicSuffixPatterns.EXACT.get(join)))) {
                return i;
            }
            if (PublicSuffixPatterns.EXCLUDED.containsKey(join)) {
                return i + 1;
            }
        }
        return -1;
    }

    public InternetDomainName child(String str) {
        return from(((String) Preconditions.checkNotNull(str)) + "." + this.f54045a);
    }

    /* renamed from: d */
    public final int m39901d() {
        int i = this.f54047c;
        if (i == -2) {
            int m39903b = m39903b(Optional.absent());
            this.f54047c = m39903b;
            return m39903b;
        }
        return i;
    }

    /* renamed from: e */
    public final int m39900e() {
        int i = this.f54048d;
        if (i == -2) {
            int m39903b = m39903b(Optional.m41313of(PublicSuffixType.REGISTRY));
            this.f54048d = m39903b;
            return m39903b;
        }
        return i;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            return this.f54045a.equals(((InternetDomainName) obj).f54045a);
        }
        return false;
    }

    public boolean hasParent() {
        if (this.f54046b.size() > 1) {
            return true;
        }
        return false;
    }

    public boolean hasPublicSuffix() {
        if (m39901d() != -1) {
            return true;
        }
        return false;
    }

    public boolean hasRegistrySuffix() {
        if (m39900e() != -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f54045a.hashCode();
    }

    public boolean isPublicSuffix() {
        if (m39901d() == 0) {
            return true;
        }
        return false;
    }

    public boolean isRegistrySuffix() {
        if (m39900e() == 0) {
            return true;
        }
        return false;
    }

    public boolean isTopDomainUnderRegistrySuffix() {
        if (m39900e() == 1) {
            return true;
        }
        return false;
    }

    public boolean isTopPrivateDomain() {
        if (m39901d() == 1) {
            return true;
        }
        return false;
    }

    public boolean isUnderPublicSuffix() {
        if (m39901d() > 0) {
            return true;
        }
        return false;
    }

    public boolean isUnderRegistrySuffix() {
        if (m39900e() > 0) {
            return true;
        }
        return false;
    }

    public InternetDomainName parent() {
        Preconditions.checkState(hasParent(), "Domain '%s' has no parent", this.f54045a);
        return m39904a(1);
    }

    public ImmutableList<String> parts() {
        return this.f54046b;
    }

    @CheckForNull
    public InternetDomainName publicSuffix() {
        if (hasPublicSuffix()) {
            return m39904a(m39901d());
        }
        return null;
    }

    @CheckForNull
    public InternetDomainName registrySuffix() {
        if (hasRegistrySuffix()) {
            return m39904a(m39900e());
        }
        return null;
    }

    public String toString() {
        return this.f54045a;
    }

    public InternetDomainName topDomainUnderRegistrySuffix() {
        if (isTopDomainUnderRegistrySuffix()) {
            return this;
        }
        Preconditions.checkState(isUnderRegistrySuffix(), "Not under a registry suffix: %s", this.f54045a);
        return m39904a(m39900e() - 1);
    }

    public InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.f54045a);
        return m39904a(m39901d() - 1);
    }

    public InternetDomainName(String str, ImmutableList immutableList) {
        Preconditions.checkArgument(!immutableList.isEmpty(), "Cannot create an InternetDomainName with zero parts.");
        this.f54045a = str;
        this.f54046b = immutableList;
    }
}
