package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Kl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17936Kl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17936Kl2 f3268a = new C17936Kl2();

    /* renamed from: b */
    public static final FieldDescriptor f3269b;

    /* renamed from: c */
    public static final FieldDescriptor f3270c;

    /* renamed from: d */
    public static final FieldDescriptor f3271d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3269b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3270c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f3271d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdp zzdpVar = (zzdp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f3269b, zzdpVar.zza());
        objectEncoderContext.add(f3270c, zzdpVar.zzc());
        objectEncoderContext.add(f3271d, zzdpVar.zzb());
    }
}
