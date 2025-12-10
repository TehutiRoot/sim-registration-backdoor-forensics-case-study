package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: uH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22424uH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22424uH2 f107330a = new C22424uH2();

    /* renamed from: b */
    public static final FieldDescriptor f107331b;

    /* renamed from: c */
    public static final FieldDescriptor f107332c;

    /* renamed from: d */
    public static final FieldDescriptor f107333d;

    /* renamed from: e */
    public static final FieldDescriptor f107334e;

    /* renamed from: f */
    public static final FieldDescriptor f107335f;

    /* renamed from: g */
    public static final FieldDescriptor f107336g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("appName");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f107331b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("sessionId");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f107332c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("startZoomLevel");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f107333d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("endZoomLevel");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f107334e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f107335f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("predictedArea");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f107336g = builder6.withProperty(zzfcVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsg zzsgVar = (zzsg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f107331b, zzsgVar.zze());
        objectEncoderContext.add(f107332c, zzsgVar.zzf());
        objectEncoderContext.add(f107333d, zzsgVar.zzc());
        objectEncoderContext.add(f107334e, zzsgVar.zzb());
        objectEncoderContext.add(f107335f, zzsgVar.zzd());
        objectEncoderContext.add(f107336g, zzsgVar.zza());
    }
}
