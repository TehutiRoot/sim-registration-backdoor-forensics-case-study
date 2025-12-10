package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes4.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoRolloutAssignmentEncoder();

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder$a */
    /* loaded from: classes4.dex */
    public static final class C8370a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8370a f54889a = new C8370a();

        /* renamed from: b */
        public static final FieldDescriptor f54890b = FieldDescriptor.m38762of("rolloutId");

        /* renamed from: c */
        public static final FieldDescriptor f54891c = FieldDescriptor.m38762of("parameterKey");

        /* renamed from: d */
        public static final FieldDescriptor f54892d = FieldDescriptor.m38762of("parameterValue");

        /* renamed from: e */
        public static final FieldDescriptor f54893e = FieldDescriptor.m38762of(RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID);

        /* renamed from: f */
        public static final FieldDescriptor f54894f = FieldDescriptor.m38762of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54890b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f54891c, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f54892d, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f54893e, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f54894f, rolloutAssignment.getTemplateVersion());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C8370a c8370a = C8370a.f54889a;
        encoderConfig.registerEncoder(RolloutAssignment.class, c8370a);
        encoderConfig.registerEncoder(C1367T8.class, c8370a);
    }
}
