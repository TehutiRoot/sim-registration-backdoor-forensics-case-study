package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Mo2 */
/* loaded from: classes3.dex */
public final class Mo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Mo2 f3898a = new Mo2();

    /* renamed from: b */
    public static final FieldDescriptor f3899b;

    /* renamed from: c */
    public static final FieldDescriptor f3900c;

    /* renamed from: d */
    public static final FieldDescriptor f3901d;

    /* renamed from: e */
    public static final FieldDescriptor f3902e;

    /* renamed from: f */
    public static final FieldDescriptor f3903f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3899b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCodes");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3900c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f3901d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f3902e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f3903f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjw zzjwVar = (zzjw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
