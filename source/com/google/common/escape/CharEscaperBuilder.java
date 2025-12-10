package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;

@GwtCompatible
/* loaded from: classes4.dex */
public final class CharEscaperBuilder {

    /* renamed from: b */
    public int f53741b = -1;

    /* renamed from: a */
    public final Map f53740a = new HashMap();

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscape(char c, String str) {
        this.f53740a.put(Character.valueOf(c), (String) Preconditions.checkNotNull(str));
        if (c > this.f53741b) {
            this.f53741b = c;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscapes(char[] cArr, String str) {
        Preconditions.checkNotNull(str);
        for (char c : cArr) {
            addEscape(c, str);
        }
        return this;
    }

    public char[][] toArray() {
        char[][] cArr = new char[this.f53741b + 1];
        for (Map.Entry entry : this.f53740a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
        return cArr;
    }

    public Escaper toEscaper() {
        return new C7993a(toArray());
    }

    /* renamed from: com.google.common.escape.CharEscaperBuilder$a */
    /* loaded from: classes4.dex */
    public static class C7993a extends CharEscaper {

        /* renamed from: b */
        public final char[][] f53742b;

        /* renamed from: c */
        public final int f53743c;

        public C7993a(char[][] cArr) {
            this.f53742b = cArr;
            this.f53743c = cArr.length;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char[][] cArr = this.f53742b;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return escapeSlow(str, i);
                }
            }
            return str;
        }

        @Override // com.google.common.escape.CharEscaper
        public char[] escape(char c) {
            if (c < this.f53743c) {
                return this.f53742b[c];
            }
            return null;
        }
    }
}
