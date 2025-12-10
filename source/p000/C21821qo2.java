package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzlo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: qo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21821qo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21821qo2 f77073a = new C21821qo2();

    /* renamed from: b */
    public static final FieldDescriptor f77074b;

    /* renamed from: c */
    public static final FieldDescriptor f77075c;

    /* renamed from: d */
    public static final FieldDescriptor f77076d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f77074b = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isSuccessful");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f77075c = builder2.withProperty(zzayVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        f77076d = builder3.withProperty(zzayVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlo zzloVar = (zzlo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f77074b, zzloVar.zza());
        objectEncoderContext.add(f77075c, zzloVar.zzb());
        objectEncoderContext.add(f77076d, (Object) null);
    }
}
