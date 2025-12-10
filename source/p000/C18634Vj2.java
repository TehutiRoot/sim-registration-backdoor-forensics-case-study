package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzie;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Vj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18634Vj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18634Vj2 f6800a = new C18634Vj2();

    /* renamed from: b */
    public static final FieldDescriptor f6801b;

    /* renamed from: c */
    public static final FieldDescriptor f6802c;

    /* renamed from: d */
    public static final FieldDescriptor f6803d;

    /* renamed from: e */
    public static final FieldDescriptor f6804e;

    /* renamed from: f */
    public static final FieldDescriptor f6805f;

    /* renamed from: g */
    public static final FieldDescriptor f6806g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f6801b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("minMs");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f6802c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("avgMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f6803d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("firstQuartileMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f6804e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("medianMs");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f6805f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("thirdQuartileMs");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f6806g = builder6.withProperty(zzaeVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzie zzieVar = (zzie) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
