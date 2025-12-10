package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: um2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22503um2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22503um2 f107468a = new C22503um2();

    /* renamed from: b */
    public static final FieldDescriptor f107469b;

    /* renamed from: c */
    public static final FieldDescriptor f107470c;

    /* renamed from: d */
    public static final FieldDescriptor f107471d;

    /* renamed from: e */
    public static final FieldDescriptor f107472e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f107469b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f107470c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f107471d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f107472e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdu zzduVar = (zzdu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
