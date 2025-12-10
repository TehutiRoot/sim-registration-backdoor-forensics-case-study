package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Zr2 */
/* loaded from: classes3.dex */
public final class Zr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Zr2 f8160a = new Zr2();

    /* renamed from: b */
    public static final FieldDescriptor f8161b;

    /* renamed from: c */
    public static final FieldDescriptor f8162c;

    /* renamed from: d */
    public static final FieldDescriptor f8163d;

    /* renamed from: e */
    public static final FieldDescriptor f8164e;

    /* renamed from: f */
    public static final FieldDescriptor f8165f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f8161b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f8162c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f8163d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f8164e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("httpResponseCode");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f8165f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkv zzkvVar = (zzkv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
