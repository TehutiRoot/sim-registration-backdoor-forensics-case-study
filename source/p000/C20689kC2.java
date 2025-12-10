package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: kC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20689kC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20689kC2 f67835a = new C20689kC2();

    /* renamed from: b */
    public static final FieldDescriptor f67836b;

    /* renamed from: c */
    public static final FieldDescriptor f67837c;

    /* renamed from: d */
    public static final FieldDescriptor f67838d;

    /* renamed from: e */
    public static final FieldDescriptor f67839e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("cameraId");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f67836b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("physicalCameraIds");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f67837c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("deviceModel");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f67838d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("enableMlDenoiser");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f67839e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpg zzpgVar = (zzpg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
