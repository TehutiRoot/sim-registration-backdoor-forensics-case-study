package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: Of */
/* loaded from: classes6.dex */
public abstract class AbstractC1016Of {

    /* renamed from: a */
    public static final InterfaceC1018b f4497a = m67102b();

    /* renamed from: Of$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC1018b {
        /* renamed from: a */
        void mo67100a(ByteBuffer byteBuffer);
    }

    /* renamed from: Of$c */
    /* loaded from: classes6.dex */
    public static final class C1019c implements InterfaceC1018b {

        /* renamed from: a */
        public final Method f4498a;

        /* renamed from: b */
        public final Method f4499b;

        @Override // p000.AbstractC1016Of.InterfaceC1018b
        /* renamed from: a */
        public void mo67100a(ByteBuffer byteBuffer) {
            Object invoke = this.f4498a.invoke(byteBuffer, null);
            if (invoke != null) {
                this.f4499b.invoke(invoke, null);
            }
        }

        public C1019c() {
            this.f4499b = Class.forName("sun.misc.Cleaner").getMethod("clean", null);
            this.f4498a = Class.forName("sun.nio.ch.DirectBuffer").getMethod("cleaner", null);
        }
    }

    /* renamed from: Of$d */
    /* loaded from: classes6.dex */
    public static final class C1020d implements InterfaceC1018b {

        /* renamed from: a */
        public final Object f4500a;

        /* renamed from: b */
        public final Method f4501b;

        @Override // p000.AbstractC1016Of.InterfaceC1018b
        /* renamed from: a */
        public void mo67100a(ByteBuffer byteBuffer) {
            this.f4501b.invoke(this.f4500a, byteBuffer);
        }

        public C1020d() {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            this.f4500a = declaredField.get(null);
            this.f4501b = cls.getMethod("invokeCleaner", ByteBuffer.class);
        }
    }

    /* renamed from: a */
    public static void m67103a(ByteBuffer byteBuffer) {
        try {
            f4497a.mo67100a(byteBuffer);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to clean direct buffer.", e);
        }
    }

    /* renamed from: b */
    public static InterfaceC1018b m67102b() {
        try {
            return new C1019c();
        } catch (Exception e) {
            try {
                return new C1020d();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to initialize a Cleaner.", e);
            }
        }
    }

    /* renamed from: c */
    public static boolean m67101c() {
        if (f4497a != null) {
            return true;
        }
        return false;
    }
}