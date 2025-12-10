package io.fotoapparat.exception.camera;

import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\u0005\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m29142d2 = {"Lio/fotoapparat/exception/camera/InvalidConfigurationException;", "Lio/fotoapparat/exception/camera/CameraException;", "value", "", "klass", "Ljava/lang/Class;", "Lio/fotoapparat/parameter/Parameter;", "supportedParameters", "", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/util/Collection;)V", "", "supportedRange", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Object;Ljava/lang/Class;Lkotlin/ranges/ClosedRange;)V", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class InvalidConfigurationException extends CameraException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InvalidConfigurationException(@org.jetbrains.annotations.NotNull java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.Class<? extends io.fotoapparat.parameter.Parameter> r3, @org.jetbrains.annotations.NotNull java.util.Collection<? extends io.fotoapparat.parameter.Parameter> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "supportedParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " configuration selector selected value "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = ". However it's not in the supported set of values. Supported parameters: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = r0.toString()
            r3 = 0
            r4 = 2
            r1.<init>(r2, r3, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.exception.camera.InvalidConfigurationException.<init>(java.lang.Object, java.lang.Class, java.util.Collection):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InvalidConfigurationException(@org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.NotNull java.lang.Class<? extends java.lang.Comparable<?>> r4, @org.jetbrains.annotations.NotNull kotlin.ranges.ClosedRange<?> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "supportedRange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r4 = r4.getSimpleName()
            java.lang.Comparable r0 = r5.getStart()
            java.lang.Comparable r5 = r5.getEndInclusive()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " configuration selector selected value "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = ". However it's not in the supported set of values. Supported parameters from: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " to "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4 = 0
            r5 = 2
            r2.<init>(r3, r4, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.exception.camera.InvalidConfigurationException.<init>(java.lang.Object, java.lang.Class, kotlin.ranges.ClosedRange):void");
    }
}