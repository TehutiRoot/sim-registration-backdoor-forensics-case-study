package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zznw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: vv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22702vv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22702vv2 f107841a = new C22702vv2();

    /* renamed from: b */
    public static final FieldDescriptor f107842b;

    /* renamed from: c */
    public static final FieldDescriptor f107843c;

    /* renamed from: d */
    public static final FieldDescriptor f107844d;

    /* renamed from: e */
    public static final FieldDescriptor f107845e;

    /* renamed from: f */
    public static final FieldDescriptor f107846f;

    /* renamed from: g */
    public static final FieldDescriptor f107847g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxMs");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        f107842b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("minMs");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        f107843c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("avgMs");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        f107844d = builder3.withProperty(zzctVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("firstQuartileMs");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        f107845e = builder4.withProperty(zzctVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("medianMs");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        f107846f = builder5.withProperty(zzctVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("thirdQuartileMs");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        f107847g = builder6.withProperty(zzctVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznw zznwVar = (zznw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f107842b, zznwVar.zzc());
        objectEncoderContext.add(f107843c, zznwVar.zze());
        objectEncoderContext.add(f107844d, zznwVar.zza());
        objectEncoderContext.add(f107845e, zznwVar.zzb());
        objectEncoderContext.add(f107846f, zznwVar.zzd());
        objectEncoderContext.add(f107847g, zznwVar.zzf());
    }
}
