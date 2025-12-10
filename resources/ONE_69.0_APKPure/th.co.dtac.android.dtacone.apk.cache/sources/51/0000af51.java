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
    public static final class C8359a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8359a f54901a = new C8359a();

        /* renamed from: b */
        public static final FieldDescriptor f54902b = FieldDescriptor.m38754of("rolloutId");

        /* renamed from: c */
        public static final FieldDescriptor f54903c = FieldDescriptor.m38754of("parameterKey");

        /* renamed from: d */
        public static final FieldDescriptor f54904d = FieldDescriptor.m38754of("parameterValue");

        /* renamed from: e */
        public static final FieldDescriptor f54905e = FieldDescriptor.m38754of(RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID);

        /* renamed from: f */
        public static final FieldDescriptor f54906f = FieldDescriptor.m38754of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54902b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f54903c, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f54904d, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f54905e, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f54906f, rolloutAssignment.getTemplateVersion());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C8359a c8359a = C8359a.f54901a;
        encoderConfig.registerEncoder(RolloutAssignment.class, c8359a);
        encoderConfig.registerEncoder(C1350T8.class, c8359a);
    }
}