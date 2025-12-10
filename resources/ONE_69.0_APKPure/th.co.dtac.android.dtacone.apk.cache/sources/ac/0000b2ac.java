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
    public static final class C8628a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8628a f56473a = new C8628a();

        /* renamed from: b */
        public static final FieldDescriptor f56474b = FieldDescriptor.m38754of("rolloutId");

        /* renamed from: c */
        public static final FieldDescriptor f56475c = FieldDescriptor.m38754of(RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID);

        /* renamed from: d */
        public static final FieldDescriptor f56476d = FieldDescriptor.m38754of("parameterKey");

        /* renamed from: e */
        public static final FieldDescriptor f56477e = FieldDescriptor.m38754of("parameterValue");

        /* renamed from: f */
        public static final FieldDescriptor f56478f = FieldDescriptor.m38754of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56474b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f56475c, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f56476d, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f56477e, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f56478f, rolloutAssignment.getTemplateVersion());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C8628a c8628a = C8628a.f56473a;
        encoderConfig.registerEncoder(RolloutAssignment.class, c8628a);
        encoderConfig.registerEncoder(C8629a.class, c8628a);
    }
}