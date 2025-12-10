package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: zD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23272zD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23272zD2 f109003a = new C23272zD2();

    /* renamed from: b */
    public static final FieldDescriptor f109004b;

    /* renamed from: c */
    public static final FieldDescriptor f109005c;

    /* renamed from: d */
    public static final FieldDescriptor f109006d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f109004b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f109005c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f109006d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqh zzqhVar = (zzqh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
