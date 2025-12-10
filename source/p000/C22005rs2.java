package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: rs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22005rs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22005rs2 f77446a = new C22005rs2();

    /* renamed from: b */
    public static final FieldDescriptor f77447b;

    /* renamed from: c */
    public static final FieldDescriptor f77448c;

    /* renamed from: d */
    public static final FieldDescriptor f77449d;

    /* renamed from: e */
    public static final FieldDescriptor f77450e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("isChargingRequired");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f77447b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isWifiRequired");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f77448c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isDeviceIdleRequired");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f77449d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("canDownloadInBackground");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f77450e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkz zzkzVar = (zzkz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
