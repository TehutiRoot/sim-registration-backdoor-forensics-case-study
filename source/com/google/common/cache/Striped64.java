package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

@GwtIncompatible
/* loaded from: classes4.dex */
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;
    @CheckForNull
    volatile transient C7533b[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* renamed from: com.google.common.cache.Striped64$a */
    /* loaded from: classes4.dex */
    public class C7532a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* renamed from: com.google.common.cache.Striped64$b */
    /* loaded from: classes4.dex */
    public static final class C7533b {

        /* renamed from: b */
        public static final Unsafe f52969b;

        /* renamed from: c */
        public static final long f52970c;

        /* renamed from: a */
        public volatile long f52971a;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                f52969b = unsafe;
                f52970c = unsafe.objectFieldOffset(C7533b.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C7533b(long j) {
            this.f52971a = j;
        }

        /* renamed from: a */
        public final boolean m41125a(long j, long j2) {
            return f52969b.compareAndSwapLong(this, f52970c, j, j2);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("base"));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new C7532a());
            }
        } catch (PrivilegedActionException e) {
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
    }

    public final boolean casBase(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j, j2);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    /* renamed from: fn */
    public abstract long mo41127fn(long j, long j2);

    public final void internalReset(long j) {
        C7533b[] c7533bArr = this.cells;
        this.base = j;
        if (c7533bArr != null) {
            for (C7533b c7533b : c7533bArr) {
                if (c7533b != null) {
                    c7533b.f52971a = j;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void retryUpdate(long r17, @javax.annotation.CheckForNull int[] r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.retryUpdate(long, int[], boolean):void");
    }
}
