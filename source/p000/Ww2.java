package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ww2 */
/* loaded from: classes3.dex */
public final class Ww2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ww2 f7331a = new Ww2();

    /* renamed from: b */
    public static final FieldDescriptor f7332b;

    /* renamed from: c */
    public static final FieldDescriptor f7333c;

    /* renamed from: d */
    public static final FieldDescriptor f7334d;

    /* renamed from: e */
    public static final FieldDescriptor f7335e;

    /* renamed from: f */
    public static final FieldDescriptor f7336f;

    /* renamed from: g */
    public static final FieldDescriptor f7337g;

    /* renamed from: h */
    public static final FieldDescriptor f7338h;

    /* renamed from: i */
    public static final FieldDescriptor f7339i;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f7332b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f7333c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputLength");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f7334d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputLength");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f7335e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("loadDictionaryErrorCode");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f7336f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("translateResultStatusCode");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f7337g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f7338h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("downloadHttpResponseCode");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        f7339i = builder8.withProperty(zzcqVar8.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmo zzmoVar = (zzmo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
