package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.CharCompanionObject;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class ArrayBasedCharEscaper extends CharEscaper {

    /* renamed from: b */
    public final char[][] f53740b;

    /* renamed from: c */
    public final int f53741c;

    /* renamed from: d */
    public final char f53742d;

    /* renamed from: e */
    public final char f53743e;

    public ArrayBasedCharEscaper(Map<Character, String> map, char c, char c2) {
        this(ArrayBasedEscaperMap.create(map), c, c2);
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f53741c && this.f53740b[charAt] != null) || charAt > this.f53743e || charAt < this.f53742d) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    @CheckForNull
    public abstract char[] escapeUnsafe(char c);

    public ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c, char c2) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] m40167b = arrayBasedEscaperMap.m40167b();
        this.f53740b = m40167b;
        this.f53741c = m40167b.length;
        if (c2 < c) {
            c2 = 0;
            c = CharCompanionObject.MAX_VALUE;
        }
        this.f53742d = c;
        this.f53743e = c2;
    }

    @Override // com.google.common.escape.CharEscaper
    @CheckForNull
    public final char[] escape(char c) {
        char[] cArr;
        if (c >= this.f53741c || (cArr = this.f53740b[c]) == null) {
            if (c < this.f53742d || c > this.f53743e) {
                return escapeUnsafe(c);
            }
            return null;
        }
        return cArr;
    }
}