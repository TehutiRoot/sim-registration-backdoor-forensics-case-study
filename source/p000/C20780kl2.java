package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzde;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: kl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20780kl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20780kl2 f68008a = new C20780kl2();

    /* renamed from: b */
    public static final FieldDescriptor f68009b;

    /* renamed from: c */
    public static final FieldDescriptor f68010c;

    /* renamed from: d */
    public static final FieldDescriptor f68011d;

    /* renamed from: e */
    public static final FieldDescriptor f68012e;

    /* renamed from: f */
    public static final FieldDescriptor f68013f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f68009b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f68010c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputsFormats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f68011d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputFormats");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f68012e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("options");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f68013f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzde zzdeVar = (zzde) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
