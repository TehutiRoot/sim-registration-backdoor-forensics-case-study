package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: yr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23206yr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23206yr2 f108888a = new C23206yr2();

    /* renamed from: b */
    public static final FieldDescriptor f108889b;

    /* renamed from: c */
    public static final FieldDescriptor f108890c;

    /* renamed from: d */
    public static final FieldDescriptor f108891d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f108889b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isDownloaded");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f108890c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f108891d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkn zzknVar = (zzkn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
