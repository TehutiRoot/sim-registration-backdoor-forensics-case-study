package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzas;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: bf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19214bf2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19214bf2 f39107a = new C19214bf2();

    /* renamed from: b */
    public static final FieldDescriptor f39108b;

    /* renamed from: c */
    public static final FieldDescriptor f39109c;

    /* renamed from: d */
    public static final FieldDescriptor f39110d;

    /* renamed from: e */
    public static final FieldDescriptor f39111e;

    /* renamed from: f */
    public static final FieldDescriptor f39112f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f39108b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f39109c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputsFormats");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f39110d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputFormats");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f39111e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("options");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f39112f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzas zzasVar = (zzas) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
