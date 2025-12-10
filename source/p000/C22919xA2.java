package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzon;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22919xA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22919xA2 f108257a = new C22919xA2();

    /* renamed from: b */
    public static final FieldDescriptor f108258b;

    /* renamed from: c */
    public static final FieldDescriptor f108259c;

    /* renamed from: d */
    public static final FieldDescriptor f108260d;

    /* renamed from: e */
    public static final FieldDescriptor f108261e;

    /* renamed from: f */
    public static final FieldDescriptor f108262f;

    /* renamed from: g */
    public static final FieldDescriptor f108263g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("landmarkMode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f108258b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationMode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f108259c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("performanceMode");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f108260d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("contourMode");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f108261e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isTrackingEnabled");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f108262f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f108263g = builder6.withProperty(zzfcVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzon zzonVar = (zzon) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
