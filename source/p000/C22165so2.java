package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: so2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22165so2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22165so2 f79897a = new C22165so2();

    /* renamed from: b */
    public static final FieldDescriptor f79898b;

    /* renamed from: c */
    public static final FieldDescriptor f79899c;

    /* renamed from: d */
    public static final FieldDescriptor f79900d;

    /* renamed from: e */
    public static final FieldDescriptor f79901e;

    /* renamed from: f */
    public static final FieldDescriptor f79902f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f79898b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f79899c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("captionCount");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(4);
        f79900d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("highestScore");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(5);
        f79901e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageType");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(6);
        f79902f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjs zzjsVar = (zzjs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
