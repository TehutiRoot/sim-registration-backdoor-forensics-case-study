package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
/* loaded from: classes4.dex */
public final class JdkPattern extends AbstractC11483iu implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    /* renamed from: com.google.common.base.JdkPattern$a */
    /* loaded from: classes4.dex */
    public static final class C7415a extends AbstractC10322gu {

        /* renamed from: a */
        public final Matcher f52759a;

        public C7415a(Matcher matcher) {
            this.f52759a = (Matcher) Preconditions.checkNotNull(matcher);
        }

        @Override // p000.AbstractC10322gu
        /* renamed from: a */
        public int mo31318a() {
            return this.f52759a.end();
        }

        @Override // p000.AbstractC10322gu
        /* renamed from: b */
        public boolean mo31317b() {
            return this.f52759a.find();
        }

        @Override // p000.AbstractC10322gu
        /* renamed from: c */
        public boolean mo31316c(int i) {
            return this.f52759a.find(i);
        }

        @Override // p000.AbstractC10322gu
        /* renamed from: d */
        public boolean mo31315d() {
            return this.f52759a.matches();
        }

        @Override // p000.AbstractC10322gu
        /* renamed from: e */
        public int mo31314e() {
            return this.f52759a.start();
        }
    }

    public JdkPattern(Pattern pattern) {
        this.pattern = (Pattern) Preconditions.checkNotNull(pattern);
    }

    @Override // p000.AbstractC11483iu
    public int flags() {
        return this.pattern.flags();
    }

    @Override // p000.AbstractC11483iu
    public AbstractC10322gu matcher(CharSequence charSequence) {
        return new C7415a(this.pattern.matcher(charSequence));
    }

    @Override // p000.AbstractC11483iu
    public String pattern() {
        return this.pattern.pattern();
    }

    public String toString() {
        return this.pattern.toString();
    }
}