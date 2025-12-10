package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Tx2 */
/* loaded from: classes3.dex */
public final class Tx2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Tx2 f6458a = new Tx2();

    /* renamed from: b */
    public static final FieldDescriptor f6459b;

    /* renamed from: c */
    public static final FieldDescriptor f6460c;

    /* renamed from: d */
    public static final FieldDescriptor f6461d;

    /* renamed from: e */
    public static final FieldDescriptor f6462e;

    /* renamed from: f */
    public static final FieldDescriptor f6463f;

    /* renamed from: g */
    public static final FieldDescriptor f6464g;

    /* renamed from: h */
    public static final FieldDescriptor f6465h;

    /* renamed from: i */
    public static final FieldDescriptor f6466i;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f6459b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f6460c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputLength");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f6461d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputLength");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f6462e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("loadDictionaryErrorCode");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f6463f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("translateResultStatusCode");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f6464g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f6465h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("downloadHttpResponseCode");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        f6466i = builder8.withProperty(zzcqVar8.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmo zzmoVar = (zzmo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}