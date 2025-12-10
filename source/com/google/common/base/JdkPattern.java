package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@GwtIncompatible
/* loaded from: classes4.dex */
final class JdkPattern extends AbstractC11495iu implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    /* renamed from: com.google.common.base.JdkPattern$a */
    /* loaded from: classes4.dex */
    public static final class C7426a extends AbstractC10336gu {

        /* renamed from: a */
        public final Matcher f52747a;

        public C7426a(Matcher matcher) {
            this.f52747a = (Matcher) Preconditions.checkNotNull(matcher);
        }

        @Override // p000.AbstractC10336gu
        /* renamed from: a */
        public int mo30953a() {
            return this.f52747a.end();
        }

        @Override // p000.AbstractC10336gu
        /* renamed from: b */
        public boolean mo30952b() {
            return this.f52747a.find();
        }

        @Override // p000.AbstractC10336gu
        /* renamed from: c */
        public boolean mo30951c(int i) {
            return this.f52747a.find(i);
        }

        @Override // p000.AbstractC10336gu
        /* renamed from: d */
        public boolean mo30950d() {
            return this.f52747a.matches();
        }

        @Override // p000.AbstractC10336gu
        /* renamed from: e */
        public int mo30949e() {
            return this.f52747a.start();
        }
    }

    public JdkPattern(Pattern pattern) {
        this.pattern = (Pattern) Preconditions.checkNotNull(pattern);
    }

    @Override // p000.AbstractC11495iu
    public int flags() {
        return this.pattern.flags();
    }

    @Override // p000.AbstractC11495iu
    public AbstractC10336gu matcher(CharSequence charSequence) {
        return new C7426a(this.pattern.matcher(charSequence));
    }

    @Override // p000.AbstractC11495iu
    public String pattern() {
        return this.pattern.pattern();
    }

    public String toString() {
        return this.pattern.toString();
    }
}
