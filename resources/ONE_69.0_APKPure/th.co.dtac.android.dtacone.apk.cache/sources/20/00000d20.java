package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzmj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Nr2 */
/* loaded from: classes3.dex */
public final class Nr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Nr2 f4279a = new Nr2();

    /* renamed from: b */
    public static final FieldDescriptor f4280b;

    /* renamed from: c */
    public static final FieldDescriptor f4281c;

    /* renamed from: d */
    public static final FieldDescriptor f4282d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f4280b = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isDownloaded");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f4281c = builder2.withProperty(zzayVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        f4282d = builder3.withProperty(zzayVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmj zzmjVar = (zzmj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f4280b, zzmjVar.zza());
        objectEncoderContext.add(f4281c, zzmjVar.zzb());
        objectEncoderContext.add(f4282d, (Object) null);
    }
}