package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzru;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: NG2 */
/* loaded from: classes3.dex */
public final class NG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final NG2 f4055a = new NG2();

    /* renamed from: b */
    public static final FieldDescriptor f4056b;

    /* renamed from: c */
    public static final FieldDescriptor f4057c;

    /* renamed from: d */
    public static final FieldDescriptor f4058d;

    /* renamed from: e */
    public static final FieldDescriptor f4059e;

    /* renamed from: f */
    public static final FieldDescriptor f4060f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f4056b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("smartReplies");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f4057c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("resultStatus");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f4058d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("suggestionsCount");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f4059e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("blacklistErrorCode");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f4060f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzru zzruVar = (zzru) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
