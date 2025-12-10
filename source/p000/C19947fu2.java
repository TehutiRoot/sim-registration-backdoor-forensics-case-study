package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: fu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19947fu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19947fu2 f61976a = new C19947fu2();

    /* renamed from: b */
    public static final FieldDescriptor f61977b;

    /* renamed from: c */
    public static final FieldDescriptor f61978c;

    /* renamed from: d */
    public static final FieldDescriptor f61979d;

    /* renamed from: e */
    public static final FieldDescriptor f61980e;

    /* renamed from: f */
    public static final FieldDescriptor f61981f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f61977b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f61978c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f61979d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f61980e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("highestConfidence");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f61981f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlq zzlqVar = (zzlq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
