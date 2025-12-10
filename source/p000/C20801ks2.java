package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzla;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ks2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20801ks2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20801ks2 f71470a = new C20801ks2();

    /* renamed from: b */
    public static final FieldDescriptor f71471b;

    /* renamed from: c */
    public static final FieldDescriptor f71472c;

    /* renamed from: d */
    public static final FieldDescriptor f71473d;

    /* renamed from: e */
    public static final FieldDescriptor f71474e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelInfo");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f71471b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("initialDownloadConditions");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f71472c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("updateDownloadConditions");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f71473d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isModelUpdateEnabled");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f71474e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
