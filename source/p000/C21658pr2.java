package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzmp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: pr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21658pr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21658pr2 f76786a = new C21658pr2();

    /* renamed from: b */
    public static final FieldDescriptor f76787b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("api");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f76787b = builder.withProperty(zzayVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(f76787b, ((zzmp) obj).zza());
    }
}
