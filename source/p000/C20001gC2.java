package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpf;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: gC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20001gC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20001gC2 f62078a = new C20001gC2();

    /* renamed from: b */
    public static final FieldDescriptor f62079b;

    /* renamed from: c */
    public static final FieldDescriptor f62080c;

    /* renamed from: d */
    public static final FieldDescriptor f62081d;

    /* renamed from: e */
    public static final FieldDescriptor f62082e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f62079b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("latencyMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f62080c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("frameCount");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f62081d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f62082e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpf zzpfVar = (zzpf) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
