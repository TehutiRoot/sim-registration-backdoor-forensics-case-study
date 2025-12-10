package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: dm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19579dm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19579dm2 f61284a = new C19579dm2();

    /* renamed from: b */
    public static final FieldDescriptor f61285b;

    /* renamed from: c */
    public static final FieldDescriptor f61286c;

    /* renamed from: d */
    public static final FieldDescriptor f61287d;

    /* renamed from: e */
    public static final FieldDescriptor f61288e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("isChargingRequired");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f61285b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isWifiRequired");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f61286c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isDeviceIdleRequired");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f61287d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("canDownloadInBackground");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f61288e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjb zzjbVar = (zzjb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
