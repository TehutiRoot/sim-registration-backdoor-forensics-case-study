package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: Of */
/* loaded from: classes6.dex */
public abstract class AbstractC1028Of {

    /* renamed from: a */
    public static final InterfaceC1030b f4450a = m67016b();

    /* renamed from: Of$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC1030b {
        /* renamed from: a */
        void mo67014a(ByteBuffer byteBuffer);
    }

    /* renamed from: Of$c */
    /* loaded from: classes6.dex */
    public static final class C1031c implements InterfaceC1030b {

        /* renamed from: a */
        public final Method f4451a;

        /* renamed from: b */
        public final Method f4452b;

        @Override // p000.AbstractC1028Of.InterfaceC1030b
        /* renamed from: a */
        public void mo67014a(ByteBuffer byteBuffer) {
            Object invoke = this.f4451a.invoke(byteBuffer, null);
            if (invoke != null) {
                this.f4452b.invoke(invoke, null);
            }
        }

        public C1031c() {
            this.f4452b = Class.forName("sun.misc.Cleaner").getMethod("clean", null);
            this.f4451a = Class.forName("sun.nio.ch.DirectBuffer").getMethod("cleaner", null);
        }
    }

    /* renamed from: Of$d */
    /* loaded from: classes6.dex */
    public static final class C1032d implements InterfaceC1030b {

        /* renamed from: a */
        public final Object f4453a;

        /* renamed from: b */
        public final Method f4454b;

        @Override // p000.AbstractC1028Of.InterfaceC1030b
        /* renamed from: a */
        public void mo67014a(ByteBuffer byteBuffer) {
            this.f4454b.invoke(this.f4453a, byteBuffer);
        }

        public C1032d() {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            this.f4453a = declaredField.get(null);
            this.f4454b = cls.getMethod("invokeCleaner", ByteBuffer.class);
        }
    }

    /* renamed from: a */
    public static void m67017a(ByteBuffer byteBuffer) {
        try {
            f4450a.mo67014a(byteBuffer);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to clean direct buffer.", e);
        }
    }

    /* renamed from: b */
    public static InterfaceC1030b m67016b() {
        try {
            return new C1031c();
        } catch (Exception e) {
            try {
                return new C1032d();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to initialize a Cleaner.", e);
            }
        }
    }

    /* renamed from: c */
    public static boolean m67015c() {
        if (f4450a != null) {
            return true;
        }
        return false;
    }
}
