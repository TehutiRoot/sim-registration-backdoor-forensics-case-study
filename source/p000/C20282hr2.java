package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: hr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20282hr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20282hr2 f62616a = new C20282hr2();

    /* renamed from: b */
    public static final FieldDescriptor f62617b;

    /* renamed from: c */
    public static final FieldDescriptor f62618c;

    /* renamed from: d */
    public static final FieldDescriptor f62619d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        f62617b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        f62618c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        f62619d = builder3.withProperty(zzctVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzeu zzeuVar = (zzeu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f62617b, zzeuVar.zza());
        objectEncoderContext.add(f62618c, zzeuVar.zzc());
        objectEncoderContext.add(f62619d, zzeuVar.zzb());
    }
}
