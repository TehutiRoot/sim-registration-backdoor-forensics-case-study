package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Oh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18217Oh2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18217Oh2 f4510a = new C18217Oh2();

    /* renamed from: b */
    public static final FieldDescriptor f4511b;

    /* renamed from: c */
    public static final FieldDescriptor f4512c;

    /* renamed from: d */
    public static final FieldDescriptor f4513d;

    /* renamed from: e */
    public static final FieldDescriptor f4514e;

    /* renamed from: f */
    public static final FieldDescriptor f4515f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f4511b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f4512c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f4513d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f4514e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("recognizerOptions");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f4515f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbo zzboVar = (zzbo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}