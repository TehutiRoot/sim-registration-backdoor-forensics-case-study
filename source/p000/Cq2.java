package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Cq2 */
/* loaded from: classes3.dex */
public final class Cq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Cq2 f842a = new Cq2();

    /* renamed from: b */
    public static final FieldDescriptor f843b;

    /* renamed from: c */
    public static final FieldDescriptor f844c;

    /* renamed from: d */
    public static final FieldDescriptor f845d;

    /* renamed from: e */
    public static final FieldDescriptor f846e;

    /* renamed from: f */
    public static final FieldDescriptor f847f;

    /* renamed from: g */
    public static final FieldDescriptor f848g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("landmarkMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f843b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationMode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f844c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("performanceMode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f845d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("contourMode");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f846e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isTrackingEnabled");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f847f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f848g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkd zzkdVar = (zzkd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f843b, zzkdVar.zzc());
        objectEncoderContext.add(f844c, zzkdVar.zza());
        objectEncoderContext.add(f845d, zzkdVar.zzd());
        objectEncoderContext.add(f846e, zzkdVar.zzb());
        objectEncoderContext.add(f847f, zzkdVar.zze());
        objectEncoderContext.add(f848g, zzkdVar.zzf());
    }
}
