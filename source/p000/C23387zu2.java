package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzga;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: zu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23387zu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23387zu2 f109213a = new C23387zu2();

    /* renamed from: b */
    public static final FieldDescriptor f109214b;

    /* renamed from: c */
    public static final FieldDescriptor f109215c;

    /* renamed from: d */
    public static final FieldDescriptor f109216d;

    /* renamed from: e */
    public static final FieldDescriptor f109217e;

    /* renamed from: f */
    public static final FieldDescriptor f109218f;

    /* renamed from: g */
    public static final FieldDescriptor f109219g;

    /* renamed from: h */
    public static final FieldDescriptor f109220h;

    /* renamed from: i */
    public static final FieldDescriptor f109221i;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f109214b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f109215c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f109216d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("options");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f109217e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("documentPresenceConfidence");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f109218f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("documentCornerConfidence");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f109219g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("documentRotationSuggestionDegrees");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f109220h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("documentRotationSuggestionConfidence");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f109221i = builder8.withProperty(zzfcVar8.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzga zzgaVar = (zzga) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
