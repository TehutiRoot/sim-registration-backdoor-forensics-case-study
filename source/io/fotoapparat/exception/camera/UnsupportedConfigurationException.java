package io.fotoapparat.exception.camera;

import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\b\u0016\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, m28850d2 = {"Lio/fotoapparat/exception/camera/UnsupportedConfigurationException;", "Lio/fotoapparat/exception/camera/CameraException;", "klass", "Ljava/lang/Class;", "Lio/fotoapparat/parameter/Parameter;", "supportedParameters", "", "(Ljava/lang/Class;Ljava/util/Collection;)V", "configurationName", "", "supportedRange", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/String;Lkotlin/ranges/ClosedRange;)V", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class UnsupportedConfigurationException extends CameraException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UnsupportedConfigurationException(@org.jetbrains.annotations.NotNull java.lang.Class<? extends io.fotoapparat.parameter.Parameter> r2, @org.jetbrains.annotations.NotNull java.util.Collection<? extends io.fotoapparat.parameter.Parameter> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "supportedParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " configuration selector couldn't select a value. Supported parameters: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r3 = 0
            r0 = 2
            r1.<init>(r2, r3, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.exception.camera.UnsupportedConfigurationException.<init>(java.lang.Class, java.util.Collection):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UnsupportedConfigurationException(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.ranges.ClosedRange<?> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "configurationName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "supportedRange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Comparable r0 = r4.getStart()
            java.lang.Comparable r4 = r4.getEndInclusive()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " configuration selector couldn't select a value. Supported parameters from: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " to "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4 = 0
            r0 = 2
            r2.<init>(r3, r4, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.exception.camera.UnsupportedConfigurationException.<init>(java.lang.String, kotlin.ranges.ClosedRange):void");
    }
}
