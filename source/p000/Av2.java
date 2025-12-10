package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Av2 */
/* loaded from: classes3.dex */
public final class Av2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Av2 f233a = new Av2();

    /* renamed from: b */
    public static final FieldDescriptor f234b;

    /* renamed from: c */
    public static final FieldDescriptor f235c;

    /* renamed from: d */
    public static final FieldDescriptor f236d;

    /* renamed from: e */
    public static final FieldDescriptor f237e;

    /* renamed from: f */
    public static final FieldDescriptor f238f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f234b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("personDetectionMode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f235c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("landmarkDetectionMode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f236d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("preferredHardwareConfigs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f237e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("runConfig");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f238f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmc zzmcVar = (zzmc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
