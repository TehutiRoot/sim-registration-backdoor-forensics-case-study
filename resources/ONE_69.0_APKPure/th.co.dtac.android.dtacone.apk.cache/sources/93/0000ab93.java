package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.CharCompanionObject;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {

    /* renamed from: b */
    public final char[][] f53746b;

    /* renamed from: c */
    public final int f53747c;

    /* renamed from: d */
    public final int f53748d;

    /* renamed from: e */
    public final int f53749e;

    /* renamed from: f */
    public final char f53750f;

    /* renamed from: g */
    public final char f53751g;

    public ArrayBasedUnicodeEscaper(Map<Character, String> map, int i, int i2, String str) {
        this(ArrayBasedEscaperMap.create(map), i, i2, str);
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f53747c && this.f53746b[charAt] != null) || charAt > this.f53751g || charAt < this.f53750f) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    @CheckForNull
    public abstract char[] escapeUnsafe(int i);

    @Override // com.google.common.escape.UnicodeEscaper
    public final int nextEscapeIndex(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if ((charAt < this.f53747c && this.f53746b[charAt] != null) || charAt > this.f53751g || charAt < this.f53750f) {
                break;
            }
            i++;
        }
        return i;
    }

    public ArrayBasedUnicodeEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, int i, int i2, String str) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] m40167b = arrayBasedEscaperMap.m40167b();
        this.f53746b = m40167b;
        this.f53747c = m40167b.length;
        if (i2 < i) {
            i2 = -1;
            i = Integer.MAX_VALUE;
        }
        this.f53748d = i;
        this.f53749e = i2;
        if (i >= 55296) {
            this.f53750f = CharCompanionObject.MAX_VALUE;
            this.f53751g = (char) 0;
            return;
        }
        this.f53750f = (char) i;
        this.f53751g = (char) Math.min(i2, 55295);
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @CheckForNull
    public final char[] escape(int i) {
        char[] cArr;
        if (i >= this.f53747c || (cArr = this.f53746b[i]) == null) {
            if (i < this.f53748d || i > this.f53749e) {
                return escapeUnsafe(i);
            }
            return null;
        }
        return cArr;
    }
}