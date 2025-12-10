package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznl;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Hy2 */
/* loaded from: classes3.dex */
public final class Hy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Hy2 f2530a = new Hy2();

    /* renamed from: b */
    public static final FieldDescriptor f2531b;

    /* renamed from: c */
    public static final FieldDescriptor f2532c;

    /* renamed from: d */
    public static final FieldDescriptor f2533d;

    /* renamed from: e */
    public static final FieldDescriptor f2534e;

    /* renamed from: f */
    public static final FieldDescriptor f2535f;

    /* renamed from: g */
    public static final FieldDescriptor f2536g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("cameraSource");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f2531b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f2532c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("requestedPreviewHeight");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f2533d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("requestedPreviewWidth");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f2534e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("actualPreviewHeight");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f2535f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("actualPreviewWidth");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f2536g = builder6.withProperty(zzfcVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznl zznlVar = (zznl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}