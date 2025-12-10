package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: sj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22150sj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22150sj2 f79864a = new C22150sj2();

    /* renamed from: b */
    public static final FieldDescriptor f79865b;

    /* renamed from: c */
    public static final FieldDescriptor f79866c;

    /* renamed from: d */
    public static final FieldDescriptor f79867d;

    /* renamed from: e */
    public static final FieldDescriptor f79868e;

    /* renamed from: f */
    public static final FieldDescriptor f79869f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f79865b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f79866c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f79867d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f79868e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isNnApiEnabled");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f79869f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhy zzhyVar = (zzhy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
