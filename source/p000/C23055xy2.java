package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23055xy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23055xy2 f108584a = new C23055xy2();

    /* renamed from: b */
    public static final FieldDescriptor f108585b;

    /* renamed from: c */
    public static final FieldDescriptor f108586c;

    /* renamed from: d */
    public static final FieldDescriptor f108587d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f108585b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f108586c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f108587d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznr zznrVar = (zznr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
