package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzig;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: vk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22669vk2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22669vk2 f107772a = new C22669vk2();

    /* renamed from: b */
    public static final FieldDescriptor f107773b;

    /* renamed from: c */
    public static final FieldDescriptor f107774c;

    /* renamed from: d */
    public static final FieldDescriptor f107775d;

    /* renamed from: e */
    public static final FieldDescriptor f107776e;

    /* renamed from: f */
    public static final FieldDescriptor f107777f;

    /* renamed from: g */
    public static final FieldDescriptor f107778g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("landmarkMode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f107773b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationMode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f107774c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("performanceMode");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f107775d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("contourMode");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f107776e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isTrackingEnabled");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f107777f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f107778g = builder6.withProperty(zzaeVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzig zzigVar = (zzig) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
