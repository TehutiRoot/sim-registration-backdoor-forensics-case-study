package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ez2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19790ez2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19790ez2 f61680a = new C19790ez2();

    /* renamed from: b */
    public static final FieldDescriptor f61681b;

    /* renamed from: c */
    public static final FieldDescriptor f61682c;

    /* renamed from: d */
    public static final FieldDescriptor f61683d;

    /* renamed from: e */
    public static final FieldDescriptor f61684e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("callingSource");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f61681b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("supportedFormats");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f61682c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f61683d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f61684e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznx zznxVar = (zznx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
