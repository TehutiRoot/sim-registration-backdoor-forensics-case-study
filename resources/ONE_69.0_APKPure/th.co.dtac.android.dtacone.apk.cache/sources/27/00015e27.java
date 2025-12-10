package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: uI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22493uI2 {

    /* renamed from: a */
    public final Unsafe f107690a;

    public AbstractC22493uI2(Unsafe unsafe) {
        this.f107690a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo1221a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo1220b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo1219c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo1218d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo1217e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo1216f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo1215g(Object obj, long j);

    /* renamed from: h */
    public final int m1214h(Class cls) {
        return this.f107690a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m1213i(Class cls) {
        return this.f107690a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m1212j(Object obj, long j) {
        return this.f107690a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m1211k(Object obj, long j) {
        return this.f107690a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m1210l(Field field) {
        return this.f107690a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m1209m(Object obj, long j) {
        return this.f107690a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m1208n(Object obj, long j, int i) {
        this.f107690a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m1207o(Object obj, long j, long j2) {
        this.f107690a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m1206p(Object obj, long j, Object obj2) {
        this.f107690a.putObject(obj, j, obj2);
    }
}