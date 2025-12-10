package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: fI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19847fI2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19847fI2 f61779a = new C19847fI2();

    /* renamed from: b */
    public static final FieldDescriptor f61780b;

    /* renamed from: c */
    public static final FieldDescriptor f61781c;

    /* renamed from: d */
    public static final FieldDescriptor f61782d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("numSamples");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f61780b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f61781c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("metricResults");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f61782d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zztc zztcVar = (zztc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
