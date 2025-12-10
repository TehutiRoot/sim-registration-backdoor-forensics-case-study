package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: nt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21320nt2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21320nt2 f72495a = new C21320nt2();

    /* renamed from: b */
    public static final FieldDescriptor f72496b;

    /* renamed from: c */
    public static final FieldDescriptor f72497c;

    /* renamed from: d */
    public static final FieldDescriptor f72498d;

    /* renamed from: e */
    public static final FieldDescriptor f72499e;

    /* renamed from: f */
    public static final FieldDescriptor f72500f;

    /* renamed from: g */
    public static final FieldDescriptor f72501g;

    /* renamed from: h */
    public static final FieldDescriptor f72502h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f72496b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f72497c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f72498d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f72499e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelNamespace");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f72500f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("delegateFilter");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f72501g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("httpResponseCode");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f72502h = builder7.withProperty(zzfcVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzfn zzfnVar = (zzfn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
