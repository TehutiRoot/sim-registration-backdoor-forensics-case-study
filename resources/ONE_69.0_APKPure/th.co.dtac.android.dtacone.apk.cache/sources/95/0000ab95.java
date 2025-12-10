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
    public int f53753b = -1;

    /* renamed from: a */
    public final Map f53752a = new HashMap();

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscape(char c, String str) {
        this.f53752a.put(Character.valueOf(c), (String) Preconditions.checkNotNull(str));
        if (c > this.f53753b) {
            this.f53753b = c;
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
        char[][] cArr = new char[this.f53753b + 1];
        for (Map.Entry entry : this.f53752a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
        return cArr;
    }

    public Escaper toEscaper() {
        return new C7982a(toArray());
    }

    /* renamed from: com.google.common.escape.CharEscaperBuilder$a */
    /* loaded from: classes4.dex */
    public static class C7982a extends CharEscaper {

        /* renamed from: b */
        public final char[][] f53754b;

        /* renamed from: c */
        public final int f53755c;

        public C7982a(char[][] cArr) {
            this.f53754b = cArr;
            this.f53755c = cArr.length;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char[][] cArr = this.f53754b;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return escapeSlow(str, i);
                }
            }
            return str;
        }

        @Override // com.google.common.escape.CharEscaper
        public char[] escape(char c) {
            if (c < this.f53755c) {
                return this.f53754b[c];
            }
            return null;
        }
    }
}