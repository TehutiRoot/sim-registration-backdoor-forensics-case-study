package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: Rw2 */
/* loaded from: classes3.dex */
public final class Rw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Rw2 f5468a = new Rw2();

    /* renamed from: b */
    public static final FieldDescriptor f5469b;

    /* renamed from: c */
    public static final FieldDescriptor f5470c;

    /* renamed from: d */
    public static final FieldDescriptor f5471d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(3);
        f5469b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(4);
        f5470c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(5);
        f5471d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmn zzmnVar = (zzmn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
