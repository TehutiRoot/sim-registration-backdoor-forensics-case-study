package io.opencensus.trace.propagation;

/* loaded from: classes5.dex */
public abstract class PropagationComponent {

    /* renamed from: a */
    public static final PropagationComponent f63784a = new C10737b();

    /* renamed from: io.opencensus.trace.propagation.PropagationComponent$b */
    /* loaded from: classes5.dex */
    public static final class C10737b extends PropagationComponent {
        public C10737b() {
        }

        @Override // io.opencensus.trace.propagation.PropagationComponent
        public TextFormat getB3Format() {
            return TextFormat.m30129a();
        }

        @Override // io.opencensus.trace.propagation.PropagationComponent
        public BinaryFormat getBinaryFormat() {
            return BinaryFormat.m30130a();
        }

        @Override // io.opencensus.trace.propagation.PropagationComponent
        public TextFormat getTraceContextFormat() {
            return TextFormat.m30129a();
        }
    }

    public static PropagationComponent getNoopPropagationComponent() {
        return f63784a;
    }

    public abstract TextFormat getB3Format();

    public abstract BinaryFormat getBinaryFormat();

    public abstract TextFormat getTraceContextFormat();
}
