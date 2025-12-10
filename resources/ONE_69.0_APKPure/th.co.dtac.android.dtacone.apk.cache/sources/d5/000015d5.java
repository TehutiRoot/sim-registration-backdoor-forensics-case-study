package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ws2 */
/* loaded from: classes3.dex */
public final class Ws2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ws2 f7408a = new Ws2();

    /* renamed from: b */
    public static final FieldDescriptor f7409b;

    /* renamed from: c */
    public static final FieldDescriptor f7410c;

    /* renamed from: d */
    public static final FieldDescriptor f7411d;

    /* renamed from: e */
    public static final FieldDescriptor f7412e;

    /* renamed from: f */
    public static final FieldDescriptor f7413f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7409b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7410c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f7411d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f7412e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("httpResponseCode");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f7413f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkv zzkvVar = (zzkv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}