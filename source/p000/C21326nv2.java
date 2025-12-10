package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: nv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21326nv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21326nv2 f72514a = new C21326nv2();

    /* renamed from: b */
    public static final FieldDescriptor f72515b;

    /* renamed from: c */
    public static final FieldDescriptor f72516c;

    /* renamed from: d */
    public static final FieldDescriptor f72517d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f72515b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f72516c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f72517d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgj zzgjVar = (zzgj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
