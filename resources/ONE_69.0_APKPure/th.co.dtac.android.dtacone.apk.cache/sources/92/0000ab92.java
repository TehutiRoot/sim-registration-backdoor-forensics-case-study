package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

@GwtCompatible
/* loaded from: classes4.dex */
public final class ArrayBasedEscaperMap {

    /* renamed from: b */
    public static final char[][] f53744b = (char[][]) Array.newInstance(Character.TYPE, 0, 0);

    /* renamed from: a */
    public final char[][] f53745a;

    public ArrayBasedEscaperMap(char[][] cArr) {
        this.f53745a = cArr;
    }

    /* renamed from: a */
    public static char[][] m40168a(Map map) {
        Preconditions.checkNotNull(map);
        if (map.isEmpty()) {
            return f53744b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1];
        for (Character ch2 : map.keySet()) {
            cArr[ch2.charValue()] = ((String) map.get(ch2)).toCharArray();
        }
        return cArr;
    }

    public static ArrayBasedEscaperMap create(Map<Character, String> map) {
        return new ArrayBasedEscaperMap(m40168a(map));
    }

    /* renamed from: b */
    public char[][] m40167b() {
        return this.f53745a;
    }
}