package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: lo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20961lo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20961lo2 f71722a = new C20961lo2();

    /* renamed from: b */
    public static final FieldDescriptor f71723b;

    /* renamed from: c */
    public static final FieldDescriptor f71724c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxResults");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f71723b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("modelType");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f71724c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjb zzjbVar = (zzjb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
