package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: lh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20940lh2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20940lh2 f71687a = new C20940lh2();

    /* renamed from: b */
    public static final FieldDescriptor f71688b;

    /* renamed from: c */
    public static final FieldDescriptor f71689c;

    /* renamed from: d */
    public static final FieldDescriptor f71690d;

    /* renamed from: e */
    public static final FieldDescriptor f71691e;

    /* renamed from: f */
    public static final FieldDescriptor f71692f;

    /* renamed from: g */
    public static final FieldDescriptor f71693g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("cameraSource");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f71688b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f71689c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("requestedPreviewHeight");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f71690d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("requestedPreviewWidth");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f71691e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("actualPreviewHeight");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f71692f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("actualPreviewWidth");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f71693g = builder6.withProperty(zzaeVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhg zzhgVar = (zzhg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
