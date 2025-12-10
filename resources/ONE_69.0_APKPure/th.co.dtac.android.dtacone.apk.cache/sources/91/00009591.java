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
public final class C6524A extends AbstractC6549u {

    /* renamed from: a */
    public static final Unsafe f46522a;

    /* renamed from: b */
    public static final long f46523b;

    /* renamed from: c */
    public static final long f46524c;

    /* renamed from: d */
    public static final long f46525d;

    /* renamed from: e */
    public static final long f46526e;

    /* renamed from: f */
    public static final long f46527f;

    /* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.A$a */
    /* loaded from: classes3.dex */
    public class C6525a implements PrivilegedExceptionAction {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new C6525a());
            }
            try {
                f46524c = unsafe.objectFieldOffset(zzec.class.getDeclaredField(OperatorName.CURVE_TO));
                f46523b = unsafe.objectFieldOffset(zzec.class.getDeclaredField(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE));
                f46525d = unsafe.objectFieldOffset(zzec.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
                f46526e = unsafe.objectFieldOffset(C6526B.class.getDeclaredField(PDPageLabelRange.STYLE_LETTERS_LOWER));
                f46527f = unsafe.objectFieldOffset(C6526B.class.getDeclaredField(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE));
                f46522a = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    public /* synthetic */ C6524A(zzeg zzegVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: a */
    public final C6551w mo47085a(zzec zzecVar, C6551w c6551w) {
        C6551w c6551w2;
        do {
            c6551w2 = zzecVar.f46596b;
            if (c6551w == c6551w2) {
                return c6551w2;
            }
        } while (!mo47081e(zzecVar, c6551w2, c6551w));
        return c6551w2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: b */
    public final C6526B mo47084b(zzec zzecVar, C6526B c6526b) {
        C6526B c6526b2;
        do {
            c6526b2 = zzecVar.f46597c;
            if (c6526b == c6526b2) {
                return c6526b2;
            }
        } while (!mo47079g(zzecVar, c6526b2, c6526b));
        return c6526b2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: c */
    public final void mo47083c(C6526B c6526b, C6526B c6526b2) {
        f46522a.putObject(c6526b, f46527f, c6526b2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: d */
    public final void mo47082d(C6526B c6526b, Thread thread) {
        f46522a.putObject(c6526b, f46526e, thread);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: e */
    public final boolean mo47081e(zzec zzecVar, C6551w c6551w, C6551w c6551w2) {
        return zzef.zza(f46522a, zzecVar, f46523b, c6551w, c6551w2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: f */
    public final boolean mo47080f(zzec zzecVar, Object obj, Object obj2) {
        return zzef.zza(f46522a, zzecVar, f46525d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.AbstractC6549u
    /* renamed from: g */
    public final boolean mo47079g(zzec zzecVar, C6526B c6526b, C6526B c6526b2) {
        return zzef.zza(f46522a, zzecVar, f46524c, c6526b, c6526b2);
    }
}