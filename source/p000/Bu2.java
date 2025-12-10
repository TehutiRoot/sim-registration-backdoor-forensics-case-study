package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Bu2 */
/* loaded from: classes3.dex */
public final class Bu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Bu2 f556a = new Bu2();

    /* renamed from: b */
    public static final FieldDescriptor f557b;

    /* renamed from: c */
    public static final FieldDescriptor f558c;

    /* renamed from: d */
    public static final FieldDescriptor f559d;

    /* renamed from: e */
    public static final FieldDescriptor f560e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f557b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f558c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("identifyLanguageResult");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f559d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("identifyPossibleLanguagesResult");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f560e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlw zzlwVar = (zzlw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
