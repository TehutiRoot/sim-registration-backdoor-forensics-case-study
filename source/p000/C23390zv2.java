package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgl;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: zv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23390zv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23390zv2 f109229a = new C23390zv2();

    /* renamed from: b */
    public static final FieldDescriptor f109230b;

    /* renamed from: c */
    public static final FieldDescriptor f109231c;

    /* renamed from: d */
    public static final FieldDescriptor f109232d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f109230b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f109231c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f109232d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgl zzglVar = (zzgl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
