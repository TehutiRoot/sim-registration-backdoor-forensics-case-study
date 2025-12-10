package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzry;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: YH2 */
/* loaded from: classes3.dex */
public final class YH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final YH2 f7828a = new YH2();

    /* renamed from: b */
    public static final FieldDescriptor f7829b;

    /* renamed from: c */
    public static final FieldDescriptor f7830c;

    /* renamed from: d */
    public static final FieldDescriptor f7831d;

    /* renamed from: e */
    public static final FieldDescriptor f7832e;

    /* renamed from: f */
    public static final FieldDescriptor f7833f;

    /* renamed from: g */
    public static final FieldDescriptor f7834g;

    /* renamed from: h */
    public static final FieldDescriptor f7835h;

    /* renamed from: i */
    public static final FieldDescriptor f7836i;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7829b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7830c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputLength");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f7831d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputLength");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f7832e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("loadDictionaryErrorCode");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f7833f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("translateResultStatusCode");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f7834g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f7835h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("downloadHttpResponseCode");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f7836i = builder8.withProperty(zzfcVar8.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzry zzryVar = (zzry) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}