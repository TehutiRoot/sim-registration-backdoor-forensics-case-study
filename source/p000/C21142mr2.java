package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: mr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21142mr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21142mr2 f72069a = new C21142mr2();

    /* renamed from: b */
    public static final FieldDescriptor f72070b;

    /* renamed from: c */
    public static final FieldDescriptor f72071c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("source");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f72070b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f72071c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznc zzncVar = (zznc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
