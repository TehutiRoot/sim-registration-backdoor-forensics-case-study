package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ir2 */
/* loaded from: classes3.dex */
public final class Ir2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ir2 f2821a = new Ir2();

    /* renamed from: b */
    public static final FieldDescriptor f2822b;

    /* renamed from: c */
    public static final FieldDescriptor f2823c;

    /* renamed from: d */
    public static final FieldDescriptor f2824d;

    /* renamed from: e */
    public static final FieldDescriptor f2825e;

    /* renamed from: f */
    public static final FieldDescriptor f2826f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f2822b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("smartReplies");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f2823c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("resultStatus");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f2824d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("suggestionsCount");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f2825e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("blacklistErrorCode");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f2826f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkp zzkpVar = (zzkp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}