package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsa;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: rH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21908rH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21908rH2 f77229a = new C21908rH2();

    /* renamed from: b */
    public static final FieldDescriptor f77230b;

    /* renamed from: c */
    public static final FieldDescriptor f77231c;

    /* renamed from: d */
    public static final FieldDescriptor f77232d;

    /* renamed from: e */
    public static final FieldDescriptor f77233e;

    /* renamed from: f */
    public static final FieldDescriptor f77234f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f77230b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f77231c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f77232d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f77233e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("httpResponseCode");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f77234f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsa zzsaVar = (zzsa) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
