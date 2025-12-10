package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23049xw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23049xw2 f108572a = new C23049xw2();

    /* renamed from: b */
    public static final FieldDescriptor f108573b;

    /* renamed from: c */
    public static final FieldDescriptor f108574c;

    /* renamed from: d */
    public static final FieldDescriptor f108575d;

    /* renamed from: e */
    public static final FieldDescriptor f108576e;

    /* renamed from: f */
    public static final FieldDescriptor f108577f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f108573b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("smartReplies");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f108574c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("resultStatus");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f108575d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("suggestionsCount");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f108576e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("blacklistErrorCode");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f108577f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmk zzmkVar = (zzmk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
