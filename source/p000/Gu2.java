package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlt;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: Gu2 */
/* loaded from: classes3.dex */
public final class Gu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Gu2 f2047a = new Gu2();

    /* renamed from: b */
    public static final FieldDescriptor f2048b;

    /* renamed from: c */
    public static final FieldDescriptor f2049c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f2048b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f2049c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlt zzltVar = (zzlt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
