package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Vh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18672Vh2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18672Vh2 f7057a = new C18672Vh2();

    /* renamed from: b */
    public static final FieldDescriptor f7058b;

    /* renamed from: c */
    public static final FieldDescriptor f7059c;

    /* renamed from: d */
    public static final FieldDescriptor f7060d;

    /* renamed from: e */
    public static final FieldDescriptor f7061e;

    /* renamed from: f */
    public static final FieldDescriptor f7062f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7058b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7059c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelInitializationMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f7060d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("confidenceThreshold");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f7061e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f7062f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbr zzbrVar = (zzbr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}