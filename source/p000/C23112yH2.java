package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzse;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: yH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23112yH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23112yH2 f108673a = new C23112yH2();

    /* renamed from: b */
    public static final FieldDescriptor f108674b;

    /* renamed from: c */
    public static final FieldDescriptor f108675c;

    /* renamed from: d */
    public static final FieldDescriptor f108676d;

    /* renamed from: e */
    public static final FieldDescriptor f108677e;

    /* renamed from: f */
    public static final FieldDescriptor f108678f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("xMin");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f108674b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("yMin");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f108675c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("xMax");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f108676d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("yMax");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f108677e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("confidenceScore");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f108678f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzse zzseVar = (zzse) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f108674b, zzseVar.zzc());
        objectEncoderContext.add(f108675c, zzseVar.zze());
        objectEncoderContext.add(f108676d, zzseVar.zzb());
        objectEncoderContext.add(f108677e, zzseVar.zzd());
        objectEncoderContext.add(f108678f, zzseVar.zza());
    }
}
