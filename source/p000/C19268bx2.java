package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: bx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19268bx2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19268bx2 f39292a = new C19268bx2();

    /* renamed from: b */
    public static final FieldDescriptor f39293b;

    /* renamed from: c */
    public static final FieldDescriptor f39294c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorSpace");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f39293b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f39294c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmp zzmpVar = (zzmp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
