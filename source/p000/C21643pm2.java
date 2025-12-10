package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: pm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21643pm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21643pm2 f76757a = new C21643pm2();

    /* renamed from: b */
    public static final FieldDescriptor f76758b;

    /* renamed from: c */
    public static final FieldDescriptor f76759c;

    /* renamed from: d */
    public static final FieldDescriptor f76760d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f76758b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f76759c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f76760d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdv zzdvVar = (zzdv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
