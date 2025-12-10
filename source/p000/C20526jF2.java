package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: jF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20526jF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20526jF2 f67219a = new C20526jF2();

    /* renamed from: b */
    public static final FieldDescriptor f67220b;

    /* renamed from: c */
    public static final FieldDescriptor f67221c;

    /* renamed from: d */
    public static final FieldDescriptor f67222d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxLabels");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f67220b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("confidenceThreshold");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f67221c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("customLocalModelOptions");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f67222d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrc zzrcVar = (zzrc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
