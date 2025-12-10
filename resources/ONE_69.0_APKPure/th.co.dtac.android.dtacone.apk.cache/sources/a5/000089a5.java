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
    public static final class C6244a implements ObjectEncoder {

        /* renamed from: a */
        public static final C6244a f44018a = new C6244a();

        /* renamed from: b */
        public static final FieldDescriptor f44019b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44020c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d */
        public static final FieldDescriptor f44021d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e */
        public static final FieldDescriptor f44022e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44019b, clientMetrics.getWindowInternal());
            objectEncoderContext.add(f44020c, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(f44021d, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(f44022e, clientMetrics.getAppNamespace());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$b */
    /* loaded from: classes3.dex */
    public static final class C6245b implements ObjectEncoder {

        /* renamed from: a */
        public static final C6245b f44023a = new C6245b();

        /* renamed from: b */
        public static final FieldDescriptor f44024b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44024b, globalMetrics.getStorageMetricsInternal());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$c */
    /* loaded from: classes3.dex */
    public static final class C6246c implements ObjectEncoder {

        /* renamed from: a */
        public static final C6246c f44025a = new C6246c();

        /* renamed from: b */
        public static final FieldDescriptor f44026b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44027c = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44026b, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(f44027c, logEventDropped.getReason());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$d */
    /* loaded from: classes3.dex */
    public static final class C6247d implements ObjectEncoder {

        /* renamed from: a */
        public static final C6247d f44028a = new C6247d();

        /* renamed from: b */
        public static final FieldDescriptor f44029b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44030c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44029b, logSourceMetrics.getLogSource());
            objectEncoderContext.add(f44030c, logSourceMetrics.getLogEventDroppedList());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$e */
    /* loaded from: classes3.dex */
    public static final class C6248e implements ObjectEncoder {

        /* renamed from: a */
        public static final C6248e f44031a = new C6248e();

        /* renamed from: b */
        public static final FieldDescriptor f44032b = FieldDescriptor.m38754of("clientMetrics");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44032b, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$f */
    /* loaded from: classes3.dex */
    public static final class C6249f implements ObjectEncoder {

        /* renamed from: a */
        public static final C6249f f44033a = new C6249f();

        /* renamed from: b */
        public static final FieldDescriptor f44034b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44035c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44034b, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(f44035c, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$g */
    /* loaded from: classes3.dex */
    public static final class C6250g implements ObjectEncoder {

        /* renamed from: a */
        public static final C6250g f44036a = new C6250g();

        /* renamed from: b */
        public static final FieldDescriptor f44037b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f44038c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f44037b, timeWindow.getStartMs());
            objectEncoderContext.add(f44038c, timeWindow.getEndMs());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, C6248e.f44031a);
        encoderConfig.registerEncoder(ClientMetrics.class, C6244a.f44018a);
        encoderConfig.registerEncoder(TimeWindow.class, C6250g.f44036a);
        encoderConfig.registerEncoder(LogSourceMetrics.class, C6247d.f44028a);
        encoderConfig.registerEncoder(LogEventDropped.class, C6246c.f44025a);
        encoderConfig.registerEncoder(GlobalMetrics.class, C6245b.f44023a);
        encoderConfig.registerEncoder(StorageMetrics.class, C6249f.f44033a);
    }
}