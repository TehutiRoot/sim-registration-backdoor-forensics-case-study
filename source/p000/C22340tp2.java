package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: tp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22340tp2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22340tp2 f107219a = new C22340tp2();

    /* renamed from: b */
    public static final FieldDescriptor f107220b;

    /* renamed from: c */
    public static final FieldDescriptor f107221c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f107220b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f107221c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjn zzjnVar = (zzjn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
