package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjs;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: hq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20279hq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20279hq2 f62609a = new C20279hq2();

    /* renamed from: b */
    public static final FieldDescriptor f62610b;

    /* renamed from: c */
    public static final FieldDescriptor f62611c;

    /* renamed from: d */
    public static final FieldDescriptor f62612d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f62610b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isSuccessful");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f62611c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f62612d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjs zzjsVar = (zzjs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
