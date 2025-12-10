package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.CharCompanionObject;

@GwtCompatible
/* loaded from: classes4.dex */
public final class Escapers {

    /* renamed from: a */
    public static final Escaper f53757a = new C7984a();

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Map f53758a;

        /* renamed from: b */
        public char f53759b;

        /* renamed from: c */
        public char f53760c;

        /* renamed from: d */
        public String f53761d;

        /* renamed from: com.google.common.escape.Escapers$Builder$a */
        /* loaded from: classes4.dex */
        public class C7983a extends ArrayBasedCharEscaper {

            /* renamed from: f */
            public final char[] f53762f;

            public C7983a(Map map, char c, char c2) {
                super(map, c, c2);
                char[] cArr;
                if (Builder.this.f53761d != null) {
                    cArr = Builder.this.f53761d.toCharArray();
                } else {
                    cArr = null;
                }
                this.f53762f = cArr;
            }

            @Override // com.google.common.escape.ArrayBasedCharEscaper
            public char[] escapeUnsafe(char c) {
                return this.f53762f;
            }
        }

        public /* synthetic */ Builder(C7984a c7984a) {
            this();
        }

        @CanIgnoreReturnValue
        public Builder addEscape(char c, String str) {
            Preconditions.checkNotNull(str);
            this.f53758a.put(Character.valueOf(c), str);
            return this;
        }

        public Escaper build() {
            return new C7983a(this.f53758a, this.f53759b, this.f53760c);
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c, char c2) {
            this.f53759b = c;
            this.f53760c = c2;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String str) {
            this.f53761d = str;
            return this;
        }

        public Builder() {
            this.f53758a = new HashMap();
            this.f53759b = (char) 0;
            this.f53760c = CharCompanionObject.MAX_VALUE;
            this.f53761d = null;
        }
    }

    /* renamed from: com.google.common.escape.Escapers$a */
    /* loaded from: classes4.dex */
    public class C7984a extends CharEscaper {
        @Override // com.google.common.escape.CharEscaper
        public char[] escape(char c) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            return (String) Preconditions.checkNotNull(str);
        }
    }

    /* renamed from: a */
    public static String m40165a(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    @CheckForNull
    public static String computeReplacement(CharEscaper charEscaper, char c) {
        return m40165a(charEscaper.escape(c));
    }

    public static Escaper nullEscaper() {
        return f53757a;
    }

    @CheckForNull
    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i) {
        return m40165a(unicodeEscaper.escape(i));
    }
}