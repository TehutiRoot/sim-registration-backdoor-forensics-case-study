package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: zx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23396zx2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23396zx2 f109236a = new C23396zx2();

    /* renamed from: b */
    public static final FieldDescriptor f109237b;

    /* renamed from: c */
    public static final FieldDescriptor f109238c;

    /* renamed from: d */
    public static final FieldDescriptor f109239d;

    /* renamed from: e */
    public static final FieldDescriptor f109240e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f109237b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f109238c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("eventType");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f109239d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f109240e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznk zznkVar = (zznk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
