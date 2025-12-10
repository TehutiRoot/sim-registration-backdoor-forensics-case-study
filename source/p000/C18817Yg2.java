package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Yg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18817Yg2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18817Yg2 f7819a = new C18817Yg2();

    /* renamed from: b */
    public static final FieldDescriptor f7820b;

    /* renamed from: c */
    public static final FieldDescriptor f7821c;

    /* renamed from: d */
    public static final FieldDescriptor f7822d;

    /* renamed from: e */
    public static final FieldDescriptor f7823e;

    /* renamed from: f */
    public static final FieldDescriptor f7824f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7820b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7821c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelInitializationMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f7822d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("confidenceThreshold");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f7823e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f7824f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbr zzbrVar = (zzbr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
