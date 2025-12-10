package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: yy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23227yy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23227yy2 f108950a = new C23227yy2();

    /* renamed from: b */
    public static final FieldDescriptor f108951b;

    /* renamed from: c */
    public static final FieldDescriptor f108952c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("sourceLanguage");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f108951b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("targetLanguage");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f108952c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmz zzmzVar = (zzmz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
