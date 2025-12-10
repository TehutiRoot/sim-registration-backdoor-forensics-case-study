package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Lq2 */
/* loaded from: classes3.dex */
public final class Lq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Lq2 f3603a = new Lq2();

    /* renamed from: b */
    public static final FieldDescriptor f3604b;

    /* renamed from: c */
    public static final FieldDescriptor f3605c;

    /* renamed from: d */
    public static final FieldDescriptor f3606d;

    /* renamed from: e */
    public static final FieldDescriptor f3607e;

    /* renamed from: f */
    public static final FieldDescriptor f3608f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3604b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("smartReplies");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3605c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("resultStatus");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f3606d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("suggestionsCount");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f3607e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("blacklistErrorCode");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f3608f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkp zzkpVar = (zzkp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
