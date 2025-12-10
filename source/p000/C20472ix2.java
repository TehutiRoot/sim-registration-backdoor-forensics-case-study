package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznf;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ix2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20472ix2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20472ix2 f67126a = new C20472ix2();

    /* renamed from: b */
    public static final FieldDescriptor f67127b;

    /* renamed from: c */
    public static final FieldDescriptor f67128c;

    /* renamed from: d */
    public static final FieldDescriptor f67129d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f67127b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("stages");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f67128c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("runMiniBenchmark");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f67129d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznf zznfVar = (zznf) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
