package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: aD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18966aD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18966aD2 f8271a = new C18966aD2();

    /* renamed from: b */
    public static final FieldDescriptor f8272b;

    /* renamed from: c */
    public static final FieldDescriptor f8273c;

    /* renamed from: d */
    public static final FieldDescriptor f8274d;

    /* renamed from: e */
    public static final FieldDescriptor f8275e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("category");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f8272b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationConfidence");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f8273c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("trackingId");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f8274d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f8275e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpu zzpuVar = (zzpu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
