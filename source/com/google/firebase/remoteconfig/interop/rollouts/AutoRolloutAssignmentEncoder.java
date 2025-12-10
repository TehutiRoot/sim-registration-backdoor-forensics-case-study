package com.google.firebase.remoteconfig.interop.rollouts;

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

    /* renamed from: com.google.firebase.remoteconfig.interop.rollouts.AutoRolloutAssignmentEncoder$a */
    /* loaded from: classes4.dex */
    public static final class C8639a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8639a f56461a = new C8639a();

        /* renamed from: b */
        public static final FieldDescriptor f56462b = FieldDescriptor.m38762of("rolloutId");

        /* renamed from: c */
        public static final FieldDescriptor f56463c = FieldDescriptor.m38762of(RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID);

        /* renamed from: d */
        public static final FieldDescriptor f56464d = FieldDescriptor.m38762of("parameterKey");

        /* renamed from: e */
        public static final FieldDescriptor f56465e = FieldDescriptor.m38762of("parameterValue");

        /* renamed from: f */
        public static final FieldDescriptor f56466f = FieldDescriptor.m38762of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56462b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f56463c, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f56464d, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f56465e, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f56466f, rolloutAssignment.getTemplateVersion());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C8639a c8639a = C8639a.f56461a;
        encoderConfig.registerEncoder(RolloutAssignment.class, c8639a);
        encoderConfig.registerEncoder(C8640a.class, c8639a);
    }
}
