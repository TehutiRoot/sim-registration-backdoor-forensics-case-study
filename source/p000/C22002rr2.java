package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: rr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22002rr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22002rr2 f77431a = new C22002rr2();

    /* renamed from: b */
    public static final FieldDescriptor f77432b;

    /* renamed from: c */
    public static final FieldDescriptor f77433c;

    /* renamed from: d */
    public static final FieldDescriptor f77434d;

    /* renamed from: e */
    public static final FieldDescriptor f77435e;

    /* renamed from: f */
    public static final FieldDescriptor f77436f;

    /* renamed from: g */
    public static final FieldDescriptor f77437g;

    /* renamed from: h */
    public static final FieldDescriptor f77438h;

    /* renamed from: i */
    public static final FieldDescriptor f77439i;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f77432b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f77433c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputLength");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f77434d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputLength");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f77435e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("loadDictionaryErrorCode");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f77436f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("translateResultStatusCode");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f77437g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f77438h = builder7.withProperty(zzaeVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("downloadHttpResponseCode");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        f77439i = builder8.withProperty(zzaeVar8.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkt zzktVar = (zzkt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
