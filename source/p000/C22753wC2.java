package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: wC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22753wC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22753wC2 f107937a = new C22753wC2();

    /* renamed from: b */
    public static final FieldDescriptor f107938b;

    /* renamed from: c */
    public static final FieldDescriptor f107939c;

    /* renamed from: d */
    public static final FieldDescriptor f107940d;

    /* renamed from: e */
    public static final FieldDescriptor f107941e;

    /* renamed from: f */
    public static final FieldDescriptor f107942f;

    /* renamed from: g */
    public static final FieldDescriptor f107943g;

    /* renamed from: h */
    public static final FieldDescriptor f107944h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f107938b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("roughDownloadDurationMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f107939c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f107940d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("exactDownloadDurationMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f107941e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("downloadStatus");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f107942f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("downloadFailureStatus");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f107943g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("mddDownloadErrorCodes");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f107944h = builder7.withProperty(zzfcVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpo zzpoVar = (zzpo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
