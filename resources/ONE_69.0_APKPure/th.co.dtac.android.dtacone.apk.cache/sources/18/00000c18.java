package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zziz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Mm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18102Mm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18102Mm2 f3959a = new C18102Mm2();

    /* renamed from: b */
    public static final FieldDescriptor f3960b;

    /* renamed from: c */
    public static final FieldDescriptor f3961c;

    /* renamed from: d */
    public static final FieldDescriptor f3962d;

    /* renamed from: e */
    public static final FieldDescriptor f3963e;

    /* renamed from: f */
    public static final FieldDescriptor f3964f;

    /* renamed from: g */
    public static final FieldDescriptor f3965g;

    /* renamed from: h */
    public static final FieldDescriptor f3966h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3960b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("roughDownloadDurationMs");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3961c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f3962d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("exactDownloadDurationMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f3963e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("downloadStatus");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f3964f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("downloadFailureStatus");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f3965g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("mddDownloadErrorCodes");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f3966h = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziz zzizVar = (zziz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}