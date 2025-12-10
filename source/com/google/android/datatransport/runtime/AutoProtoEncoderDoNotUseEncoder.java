package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;

/* loaded from: classes3.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$a */
    /* loaded from: classes3.dex */
    public static final class C6255a implements ObjectEncoder {

        /* renamed from: a */
        public static final C6255a f44006a = new C6255a();

        /* renamed from: b */
        public static final FieldDescriptor f44007b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44008c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d */
        public static final FieldDescriptor f44009d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e */
        public static final FieldDescriptor f44010e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44007b, clientMetrics.getWindowInternal());
            objectEncoderContext.add(f44008c, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(f44009d, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(f44010e, clientMetrics.getAppNamespace());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$b */
    /* loaded from: classes3.dex */
    public static final class C6256b implements ObjectEncoder {

        /* renamed from: a */
        public static final C6256b f44011a = new C6256b();

        /* renamed from: b */
        public static final FieldDescriptor f44012b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44012b, globalMetrics.getStorageMetricsInternal());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$c */
    /* loaded from: classes3.dex */
    public static final class C6257c implements ObjectEncoder {

        /* renamed from: a */
        public static final C6257c f44013a = new C6257c();

        /* renamed from: b */
        public static final FieldDescriptor f44014b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44015c = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44014b, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(f44015c, logEventDropped.getReason());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$d */
    /* loaded from: classes3.dex */
    public static final class C6258d implements ObjectEncoder {

        /* renamed from: a */
        public static final C6258d f44016a = new C6258d();

        /* renamed from: b */
        public static final FieldDescriptor f44017b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44018c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44017b, logSourceMetrics.getLogSource());
            objectEncoderContext.add(f44018c, logSourceMetrics.getLogEventDroppedList());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$e */
    /* loaded from: classes3.dex */
    public static final class C6259e implements ObjectEncoder {

        /* renamed from: a */
        public static final C6259e f44019a = new C6259e();

        /* renamed from: b */
        public static final FieldDescriptor f44020b = FieldDescriptor.m38762of("clientMetrics");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44020b, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$f */
    /* loaded from: classes3.dex */
    public static final class C6260f implements ObjectEncoder {

        /* renamed from: a */
        public static final C6260f f44021a = new C6260f();

        /* renamed from: b */
        public static final FieldDescriptor f44022b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44023c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44022b, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(f44023c, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$g */
    /* loaded from: classes3.dex */
    public static final class C6261g implements ObjectEncoder {

        /* renamed from: a */
        public static final C6261g f44024a = new C6261g();

        /* renamed from: b */
        public static final FieldDescriptor f44025b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44026c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44025b, timeWindow.getStartMs());
            objectEncoderContext.add(f44026c, timeWindow.getEndMs());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, C6259e.f44019a);
        encoderConfig.registerEncoder(ClientMetrics.class, C6255a.f44006a);
        encoderConfig.registerEncoder(TimeWindow.class, C6261g.f44024a);
        encoderConfig.registerEncoder(LogSourceMetrics.class, C6258d.f44016a);
        encoderConfig.registerEncoder(LogEventDropped.class, C6257c.f44013a);
        encoderConfig.registerEncoder(GlobalMetrics.class, C6256b.f44011a);
        encoderConfig.registerEncoder(StorageMetrics.class, C6260f.f44021a);
    }
}
