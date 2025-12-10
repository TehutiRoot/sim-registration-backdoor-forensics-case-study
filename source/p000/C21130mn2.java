package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzea;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: mn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21130mn2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21130mn2 f72032a = new C21130mn2();

    /* renamed from: b */
    public static final FieldDescriptor f72033b;

    /* renamed from: c */
    public static final FieldDescriptor f72034c;

    /* renamed from: d */
    public static final FieldDescriptor f72035d;

    /* renamed from: e */
    public static final FieldDescriptor f72036e;

    /* renamed from: f */
    public static final FieldDescriptor f72037f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f72033b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f72034c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f72035d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f72036e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("recognizerOptions");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f72037f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzea zzeaVar = (zzea) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
