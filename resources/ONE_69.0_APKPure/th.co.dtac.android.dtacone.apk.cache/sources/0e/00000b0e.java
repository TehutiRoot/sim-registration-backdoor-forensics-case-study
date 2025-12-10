package p000;

import java.nio.Buffer;

/* renamed from: Lg0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18017Lg0 {
    /* renamed from: a */
    public static void m67532a(Buffer buffer) {
        buffer.clear();
    }

    /* renamed from: b */
    public static void m67531b(Buffer buffer) {
        buffer.flip();
    }

    /* renamed from: c */
    public static void m67530c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    /* renamed from: d */
    public static void m67529d(Buffer buffer, int i) {
        buffer.position(i);
    }
}