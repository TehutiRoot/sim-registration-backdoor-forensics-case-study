package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzds;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: km2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20783km2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20783km2 f68024a = new C20783km2();

    /* renamed from: b */
    public static final FieldDescriptor f68025b;

    /* renamed from: c */
    public static final FieldDescriptor f68026c;

    /* renamed from: d */
    public static final FieldDescriptor f68027d;

    /* renamed from: e */
    public static final FieldDescriptor f68028e;

    /* renamed from: f */
    public static final FieldDescriptor f68029f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f68025b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f68026c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f68027d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f68028e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f68029f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzds zzdsVar = (zzds) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
