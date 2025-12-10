package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: hH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20188hH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20188hH2 f62460a = new C20188hH2();

    /* renamed from: b */
    public static final FieldDescriptor f62461b;

    /* renamed from: c */
    public static final FieldDescriptor f62462c;

    /* renamed from: d */
    public static final FieldDescriptor f62463d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f62461b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("stages");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f62462c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("runMiniBenchmark");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f62463d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsx zzsxVar = (zzsx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
