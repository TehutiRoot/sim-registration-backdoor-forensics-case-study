package p000;

import java.nio.Buffer;

/* renamed from: Fg0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17599Fg0 {
    /* renamed from: a */
    public static void m68379a(Buffer buffer) {
        buffer.clear();
    }

    /* renamed from: b */
    public static void m68378b(Buffer buffer) {
        buffer.flip();
    }

    /* renamed from: c */
    public static void m68377c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    /* renamed from: d */
    public static void m68376d(Buffer buffer, int i) {
        buffer.position(i);
    }
}
