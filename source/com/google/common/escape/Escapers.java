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
    public static final Escaper f53745a = new C7995a();

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Map f53746a;

        /* renamed from: b */
        public char f53747b;

        /* renamed from: c */
        public char f53748c;

        /* renamed from: d */
        public String f53749d;

        /* renamed from: com.google.common.escape.Escapers$Builder$a */
        /* loaded from: classes4.dex */
        public class C7994a extends ArrayBasedCharEscaper {

            /* renamed from: f */
            public final char[] f53750f;

            public C7994a(Map map, char c, char c2) {
                super(map, c, c2);
                char[] cArr;
                if (Builder.this.f53749d != null) {
                    cArr = Builder.this.f53749d.toCharArray();
                } else {
                    cArr = null;
                }
                this.f53750f = cArr;
            }

            @Override // com.google.common.escape.ArrayBasedCharEscaper
            public char[] escapeUnsafe(char c) {
                return this.f53750f;
            }
        }

        public /* synthetic */ Builder(C7995a c7995a) {
            this();
        }

        @CanIgnoreReturnValue
        public Builder addEscape(char c, String str) {
            Preconditions.checkNotNull(str);
            this.f53746a.put(Character.valueOf(c), str);
            return this;
        }

        public Escaper build() {
            return new C7994a(this.f53746a, this.f53747b, this.f53748c);
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c, char c2) {
            this.f53747b = c;
            this.f53748c = c2;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String str) {
            this.f53749d = str;
            return this;
        }

        public Builder() {
            this.f53746a = new HashMap();
            this.f53747b = (char) 0;
            this.f53748c = CharCompanionObject.MAX_VALUE;
            this.f53749d = null;
        }
    }

    /* renamed from: com.google.common.escape.Escapers$a */
    /* loaded from: classes4.dex */
    public class C7995a extends CharEscaper {
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
    public static String m40174a(char[] cArr) {
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
        return m40174a(charEscaper.escape(c));
    }

    public static Escaper nullEscaper() {
        return f53745a;
    }

    @CheckForNull
    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i) {
        return m40174a(unicodeEscaper.escape(i));
    }
}
