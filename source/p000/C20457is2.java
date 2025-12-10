package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zznl;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: is2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20457is2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20457is2 f67083a = new C20457is2();

    /* renamed from: b */
    public static final FieldDescriptor f67084b;

    /* renamed from: c */
    public static final FieldDescriptor f67085c;

    /* renamed from: d */
    public static final FieldDescriptor f67086d;

    /* renamed from: e */
    public static final FieldDescriptor f67087e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelInfo");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f67084b = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("initialDownloadConditions");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f67085c = builder2.withProperty(zzayVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("updateDownloadConditions");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        f67086d = builder3.withProperty(zzayVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isModelUpdateEnabled");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        f67087e = builder4.withProperty(zzayVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f67084b, ((zznl) obj).zza());
        objectEncoderContext.add(f67085c, (Object) null);
        objectEncoderContext.add(f67086d, (Object) null);
        objectEncoderContext.add(f67087e, (Object) null);
    }
}
