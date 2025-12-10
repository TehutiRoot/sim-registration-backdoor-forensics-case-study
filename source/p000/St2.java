package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: St2 */
/* loaded from: classes3.dex */
public final class St2 implements ObjectEncoder {

    /* renamed from: a */
    public static final St2 f5853a = new St2();

    /* renamed from: b */
    public static final FieldDescriptor f5854b;

    /* renamed from: c */
    public static final FieldDescriptor f5855c;

    /* renamed from: d */
    public static final FieldDescriptor f5856d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f5854b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f5855c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f5856d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzfx zzfxVar = (zzfx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f5854b, zzfxVar.zza());
        objectEncoderContext.add(f5855c, zzfxVar.zzc());
        objectEncoderContext.add(f5856d, zzfxVar.zzb());
    }
}
