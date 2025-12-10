package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcb {
    /* renamed from: a */
    public static Object m46707a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m46706b(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}