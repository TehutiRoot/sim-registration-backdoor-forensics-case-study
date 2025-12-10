package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsy;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: kH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20704kH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20704kH2 f67866a = new C20704kH2();

    /* renamed from: b */
    public static final FieldDescriptor f67867b;

    /* renamed from: c */
    public static final FieldDescriptor f67868c;

    /* renamed from: d */
    public static final FieldDescriptor f67869d;

    /* renamed from: e */
    public static final FieldDescriptor f67870e;

    /* renamed from: f */
    public static final FieldDescriptor f67871f;

    /* renamed from: g */
    public static final FieldDescriptor f67872g;

    /* renamed from: h */
    public static final FieldDescriptor f67873h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("pipelineNamespace");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f67867b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("name");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f67868c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("clientLibraryName");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f67869d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientLibraryVersion");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f67870e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("minClientLibraryVersion");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f67871f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("maxClientLibraryVersion");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f67872g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("sourceProduct");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f67873h = builder7.withProperty(zzfcVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsy zzsyVar = (zzsy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
