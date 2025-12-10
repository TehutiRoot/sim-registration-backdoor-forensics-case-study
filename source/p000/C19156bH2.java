package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzry;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: bH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19156bH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19156bH2 f38994a = new C19156bH2();

    /* renamed from: b */
    public static final FieldDescriptor f38995b;

    /* renamed from: c */
    public static final FieldDescriptor f38996c;

    /* renamed from: d */
    public static final FieldDescriptor f38997d;

    /* renamed from: e */
    public static final FieldDescriptor f38998e;

    /* renamed from: f */
    public static final FieldDescriptor f38999f;

    /* renamed from: g */
    public static final FieldDescriptor f39000g;

    /* renamed from: h */
    public static final FieldDescriptor f39001h;

    /* renamed from: i */
    public static final FieldDescriptor f39002i;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f38995b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f38996c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputLength");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f38997d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputLength");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f38998e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("loadDictionaryErrorCode");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f38999f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("translateResultStatusCode");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f39000g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f39001h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("downloadHttpResponseCode");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f39002i = builder8.withProperty(zzfcVar8.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzry zzryVar = (zzry) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
