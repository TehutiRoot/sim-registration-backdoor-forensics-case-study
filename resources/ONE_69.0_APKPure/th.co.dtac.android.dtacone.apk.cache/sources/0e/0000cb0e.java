package io.fotoapparat.view;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m29142d2 = {"Lio/fotoapparat/view/Preview;", "", "()V", "Surface", "Texture", "Lio/fotoapparat/view/Preview$Surface;", "Lio/fotoapparat/view/Preview$Texture;", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public abstract class Preview {

    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lio/fotoapparat/view/Preview$Surface;", "Lio/fotoapparat/view/Preview;", "Landroid/view/SurfaceHolder;", "surfaceHolder", "<init>", "(Landroid/view/SurfaceHolder;)V", "component1", "()Landroid/view/SurfaceHolder;", "copy", "(Landroid/view/SurfaceHolder;)Lio/fotoapparat/view/Preview$Surface;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/SurfaceHolder;", "getSurfaceHolder", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final class Surface extends Preview {

        /* renamed from: a */
        public final SurfaceHolder f63127a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Surface(@NotNull SurfaceHolder surfaceHolder) {
            super(null);
            Intrinsics.checkNotNullParameter(surfaceHolder, "surfaceHolder");
            this.f63127a = surfaceHolder;
        }

        public static /* synthetic */ Surface copy$default(Surface surface, SurfaceHolder surfaceHolder, int i, Object obj) {
            if ((i & 1) != 0) {
                surfaceHolder = surface.f63127a;
            }
            return surface.copy(surfaceHolder);
        }

        @NotNull
        public final SurfaceHolder component1() {
            return this.f63127a;
        }

        @NotNull
        public final Surface copy(@NotNull SurfaceHolder surfaceHolder) {
            Intrinsics.checkNotNullParameter(surfaceHolder, "surfaceHolder");
            return new Surface(surfaceHolder);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Surface) && Intrinsics.areEqual(this.f63127a, ((Surface) obj).f63127a);
        }

        @NotNull
        public final SurfaceHolder getSurfaceHolder() {
            return this.f63127a;
        }

        public int hashCode() {
            return this.f63127a.hashCode();
        }

        @NotNull
        public String toString() {
            SurfaceHolder surfaceHolder = this.f63127a;
            return "Surface(surfaceHolder=" + surfaceHolder + ")";
        }
    }

    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lio/fotoapparat/view/Preview$Texture;", "Lio/fotoapparat/view/Preview;", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "<init>", "(Landroid/graphics/SurfaceTexture;)V", "component1", "()Landroid/graphics/SurfaceTexture;", "copy", "(Landroid/graphics/SurfaceTexture;)Lio/fotoapparat/view/Preview$Texture;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final class Texture extends Preview {

        /* renamed from: a */
        public final SurfaceTexture f63128a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Texture(@NotNull SurfaceTexture surfaceTexture) {
            super(null);
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
            this.f63128a = surfaceTexture;
        }

        public static /* synthetic */ Texture copy$default(Texture texture, SurfaceTexture surfaceTexture, int i, Object obj) {
            if ((i & 1) != 0) {
                surfaceTexture = texture.f63128a;
            }
            return texture.copy(surfaceTexture);
        }

        @NotNull
        public final SurfaceTexture component1() {
            return this.f63128a;
        }

        @NotNull
        public final Texture copy(@NotNull SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
            return new Texture(surfaceTexture);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Texture) && Intrinsics.areEqual(this.f63128a, ((Texture) obj).f63128a);
        }

        @NotNull
        public final SurfaceTexture getSurfaceTexture() {
            return this.f63128a;
        }

        public int hashCode() {
            return this.f63128a.hashCode();
        }

        @NotNull
        public String toString() {
            SurfaceTexture surfaceTexture = this.f63128a;
            return "Texture(surfaceTexture=" + surfaceTexture + ")";
        }
    }

    public /* synthetic */ Preview(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Preview() {
    }
}