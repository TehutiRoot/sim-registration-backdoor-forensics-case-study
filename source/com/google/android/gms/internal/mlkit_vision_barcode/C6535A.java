package com.google.android.gms.internal.mlkit_vision_barcode;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.A */
/* loaded from: classes3.dex */
public final class C6535A extends AbstractC6560u {

    /* renamed from: a */
    public static final Unsafe f46510a;

    /* renamed from: b */
    public static final long f46511b;

    /* renamed from: c */
    public static final long f46512c;

    /* renamed from: d */
    public static final long f46513d;

    /* renamed from: e */
    public static final long f46514e;

    /* renamed from: f */
    public static final long f46515f;

    /* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.A$a */
    /* loaded from: classes3.dex */
    public class C6536a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() {
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

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C6536a());
            }
            try {
                f46512c = unsafe.objectFieldOffset(zzec.class.getDeclaredField(OperatorName.CURVE_TO));
                f46511b = unsafe.objectFieldOffset(zzec.class.getDeclaredField(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE));
                f46513d = unsafe.objectFieldOffset(zzec.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
                f46514e = unsafe.objectFieldOffset(C6537B.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
                f46515f = unsafe.objectFieldOffset(C6537B.class.getDeclaredField(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE));
                f46510a = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    public /* synthetic */ C6535A(zzeg zzegVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: a */
    public final C6562w mo47076a(zzec zzecVar, C6562w c6562w) {
        C6562w c6562w2;
        do {
            c6562w2 = zzecVar.f46584b;
            if (c6562w == c6562w2) {
                return c6562w2;
            }
        } while (!mo47072e(zzecVar, c6562w2, c6562w));
        return c6562w2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: b */
    public final C6537B mo47075b(zzec zzecVar, C6537B c6537b) {
        C6537B c6537b2;
        do {
            c6537b2 = zzecVar.f46585c;
            if (c6537b == c6537b2) {
                return c6537b2;
            }
        } while (!mo47070g(zzecVar, c6537b2, c6537b));
        return c6537b2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: c */
    public final void mo47074c(C6537B c6537b, C6537B c6537b2) {
        f46510a.putObject(c6537b, f46515f, c6537b2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: d */
    public final void mo47073d(C6537B c6537b, Thread thread) {
        f46510a.putObject(c6537b, f46514e, thread);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: e */
    public final boolean mo47072e(zzec zzecVar, C6562w c6562w, C6562w c6562w2) {
        return zzef.zza(f46510a, zzecVar, f46511b, c6562w, c6562w2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: f */
    public final boolean mo47071f(zzec zzecVar, Object obj, Object obj2) {
        return zzef.zza(f46510a, zzecVar, f46513d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6560u
    /* renamed from: g */
    public final boolean mo47070g(zzec zzecVar, C6537B c6537b, C6537B c6537b2) {
        return zzef.zza(f46510a, zzecVar, f46512c, c6537b, c6537b2);
    }
}
