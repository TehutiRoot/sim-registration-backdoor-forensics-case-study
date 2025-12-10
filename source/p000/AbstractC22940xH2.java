package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: xH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22940xH2 {

    /* renamed from: a */
    public final Unsafe f108305a;

    public AbstractC22940xH2(Unsafe unsafe) {
        this.f108305a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo581a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo580b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo579c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo578d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo577e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo576f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo575g(Object obj, long j);

    /* renamed from: h */
    public final int m574h(Class cls) {
        return this.f108305a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m573i(Class cls) {
        return this.f108305a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m572j(Object obj, long j) {
        return this.f108305a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m571k(Object obj, long j) {
        return this.f108305a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m570l(Field field) {
        return this.f108305a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m569m(Object obj, long j) {
        return this.f108305a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m568n(Object obj, long j, int i) {
        this.f108305a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m567o(Object obj, long j, long j2) {
        this.f108305a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m566p(Object obj, long j, Object obj2) {
        this.f108305a.putObject(obj, j, obj2);
    }
}
