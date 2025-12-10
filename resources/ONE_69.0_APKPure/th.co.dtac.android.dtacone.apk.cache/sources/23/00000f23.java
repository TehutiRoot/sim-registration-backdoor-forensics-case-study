package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Pu2 */
/* loaded from: classes3.dex */
public final class Pu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Pu2 f5051a = new Pu2();

    /* renamed from: b */
    public static final FieldDescriptor f5052b;

    /* renamed from: c */
    public static final FieldDescriptor f5053c;

    /* renamed from: d */
    public static final FieldDescriptor f5054d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f5052b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f5053c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f5054d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzfx zzfxVar = (zzfx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f5052b, zzfxVar.zza());
        objectEncoderContext.add(f5053c, zzfxVar.zzc());
        objectEncoderContext.add(f5054d, zzfxVar.zzb());
    }
}